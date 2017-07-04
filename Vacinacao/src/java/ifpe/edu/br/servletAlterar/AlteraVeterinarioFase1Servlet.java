/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.servletAlterar;
import ifpe.edu.br.fachada.Fachada;
import ifpe.edu.br.entidades.Veterinario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import ifpe.edu.br.builder.BuilderVeterinario;
import ifpe.edu.br.entidades.Raca;
import ifpe.edu.br.entidades.Vacina;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "AlteraVeterinarioFase1Servlet", urlPatterns = {"/AlteraVeterinarioFase1Servlet"})
public class AlteraVeterinarioFase1Servlet extends HttpServlet{
     public class AlteraRacaFase1Servlet extends HttpServlet{
     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
    String nome = request.getParameter("nome");
        Veterinario veterinario = Fachada.getInstance().recuperarVeterinario(nome);
         response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
   
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AlteraVeterinarioFase1Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Alterar Veterinario</h1>");
            out.println("<form method='post' action='AlteraVeterinarioFase1Servlet'>");
            out.println("Id:"+veterinario.getId()+"<input type=\"hidden\" name=\"nome\" value='"+veterinario.getId()+"'/><br/>\n" +
"           Nome:<input type=\"text\" name=\"idade\" value='"+veterinario.getNome()+"'/><br/>\n" +
"            Endereco:<input type=\"text\" name=\"armas\" value='"+veterinario.getEndereco()+"'/><br/>\n" +
        "            Telefone:<input type=\"text\" name=\"armas\" value='"+veterinario.getTelefone()+"'/><br/>\n" +
      
"            <input type=\"submit\" value=\"alterar\"/>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
}
