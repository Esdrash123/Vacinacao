/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.servletAlterar;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import ifpe.edu.br.fachada.Fachada;
import ifpe.edu.br.entidades.Aplicacoes;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import ifpe.edu.br.builder.BuilderAplicacoes;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AlteraAplicacoesFase1Servlet", urlPatterns = {"/AlteraAplicacoesFase1Servlet"})
public class AlteraAplicacoesFase1Servlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
    String nome = request.getParameter("nome");
        
        Aplicacoes aplicacoes = Fachada.getInstance().recuperarAplicacoes(nome);
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AlteraAplicacoesFase1Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Alterar Aplicacoes</h1>");
            out.println("<form method='post' action='AlteraPersonagemFase2Servlet'>");
            out.println("Nome:"+aplicacoes.getId()+"<input type=\"hidden\" name=\"nome\" value='"+aplicacoes.getId()+"'/><br/>\n" +
"           Idade:<input type=\"text\" name=\"idade\" value='"+aplicacoes.getData()+"'/><br/>\n" +
"            Habilidade:<input type=\"text\" name=\"habilidade\" value='"+aplicacoes.getDataProxima()+"'/><br/>\n" +
"            Ideologia:<input type=\"text\" name=\"ideologia\" value='"+aplicacoes.getHora()+"'/><br/>\n" +
"            Armas:<input type=\"text\" name=\"armas\" value='"+aplicacoes.getDescricao()+"'/><br/>\n" +
"            <input type=\"submit\" value=\"alterar\"/>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
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
        processRequest(request, response);
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
        processRequest(request, response);
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
