/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.servletAlterar;

import ifpe.edu.br.fachada.Fachada;
import ifpe.edu.br.entidades.Vacina;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import ifpe.edu.br.builder.BuilderVacina;
import ifpe.edu.br.entidades.Raca;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "AlteraVacinaFase1Servlet", urlPatterns = {"/AlteraVacinaFase1Servlet"})
  
public class AlteraVacinaFase1Servlet extends HttpServlet{
    public class AlteraRacaFase1Servlet extends HttpServlet{
     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
    String nome = request.getParameter("nome");
        Vacina vacina = Fachada.getInstance().recuperarVacina(nome);
         response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
   
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AlteraVacinaaFase1Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Alterar Vacina</h1>");
            out.println("<form method='post' action='AlteraPersonagemFase2Servlet'>");
            out.println("Id:"+vacina.getId()+"<input type=\"hidden\" name=\"nome\" value='"+vacina.getId()+"'/><br/>\n" +
"           Nome:<input type=\"text\" name=\"idade\" value='"+vacina.getNome()+"'/><br/>\n" +
"            Descricao:<input type=\"text\" name=\"armas\" value='"+vacina.getDescricao()+"'/><br/>\n" +
        "            Descricao:<input type=\"text\" name=\"armas\" value='"+vacina.getTempoEntreAplicacoes()+"'/><br/>\n" +
       "            Descricao:<input type=\"text\" name=\"armas\" value='"+vacina.getValor()+"'/><br/>\n" +
                "            Descricao:<input type=\"text\" name=\"armas\" value='"+vacina.getQuantidadeAplicacao()+"'/><br/>\n" +
                "            Caracteristica:<input type=\"text\" name=\"armas\" value='"+vacina.getComposicao()+"'/><br/>\n" +
"            <input type=\"submit\" value=\"alterar\"/>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
}
