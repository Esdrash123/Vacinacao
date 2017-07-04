/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.servletAlterar;

import ifpe.edu.br.fachada.Fachada;
import ifpe.edu.br.entidades.Raca;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import ifpe.edu.br.builder.BuilderRaca;
import ifpe.edu.br.entidades.Doenca;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "AlteraDoencaFase1Servlet", urlPatterns = {"/AlteraDoencaFase1Servlet"})
public class AlteraRacaFase1Servlet extends HttpServlet{
     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
    String nome = request.getParameter("nome");
        Raca raca = Fachada.getInstance().recuperarRaca(nome);
          response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
   
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AlteraRacaFase1Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Alterar Raca</h1>");
            out.println("<form method='post' action='AlteraPersonagemFase2Servlet'>");
            out.println("Id:"+raca.getId()+"<input type=\"hidden\" name=\"nome\" value='"+raca.getId()+"'/><br/>\n" +
"           Nome:<input type=\"text\" name=\"idade\" value='"+raca.getNome()+"'/><br/>\n" +
"            Descricao:<input type=\"text\" name=\"armas\" value='"+raca.getDescricao()+"'/><br/>\n" +
        "            Caracteristica:<input type=\"text\" name=\"armas\" value='"+raca.getCaracteristica()+"'/><br/>\n" +
"            <input type=\"submit\" value=\"alterar\"/>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
