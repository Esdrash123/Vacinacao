/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.servlet;

import java.util.Date;
import ifpe.edu.br.entidades.Aplicacoes;
import ifpe.edu.br.builder.BuilderAplicacoes;
import ifpe.edu.br.fachada.Fachada;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
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
 * @author paulo
 */
@WebServlet(name = "CadastroAplicacoesServlet", urlPatterns = {"/CadastroAplicacoesServlet"})
public class CadastroAplicacoesServlet extends HttpServlet {

    /**
     * private int codigo; private String Nome; private String CNPJ; private
     * String OAB; private String Telefone; private String Endereco;
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String descricao = request.getParameter("descricao");
        int id = Integer.parseInt(request.getParameter("id"));
        int hora = Integer.parseInt(request.getParameter("hora"));
        Date data = formato.parse(request.getParameter("data"));
        Date dataProxima = formato.parse(request.getParameter("dataProxima"));

        BuilderAplicacoes bAplicacoes = new BuilderAplicacoes();
        bAplicacoes.setId(id);
        bAplicacoes.setDescricao(descricao);
        bAplicacoes.setHora(hora);
        bAplicacoes.setData(data);
        bAplicacoes.setDataProxima(dataProxima);

        Aplicacoes aplicacoes = bAplicacoes.BuilderAplicacoes();

        Fachada.getInstance().inserir(aplicacoes);

        request.setAttribute("msg", "Aplicacoes Cadastrado com sucesso!");
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
            Logger.getLogger(CadastroAplicacoesServlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(CadastroAplicacoesServlet.class.getName()).log(Level.SEVERE, null, ex);
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
