package ifpe.edu.br.servletRemocao;

import java.util.*;
import ifpe.edu.br.entidades.Aplicacoes;
import ifpe.edu.br.builder.BuilderAplicacoes;
import ifpe.edu.br.fachada.Fachada;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author MEU
 */
@WebServlet(name = "RemoveAplicacoesServlet", urlPatterns = {"/RemoveAplicacoesServlet"})
public class RemoveAplicacoesServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {

        String descricao = request.getParameter("descricao");
        int id = Integer.parseInt(request.getParameter("id"));

        BuilderAplicacoes bAplicacoes = new BuilderAplicacoes();
        bAplicacoes.setDescricao(descricao);
        bAplicacoes.setId(id);

        Aplicacoes aplicacoes = bAplicacoes.BuilderAplicacoes();

        Fachada.getInstance().deletar(aplicacoes);

        request.setAttribute("msg", "AplicaÇÕes removida com sucesso!");
        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(RemoveAplicacoesServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(RemoveAplicacoesServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
