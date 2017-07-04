/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.servletAlterar;
import ifpe.edu.br.builder.BuilderDoenca;
import ifpe.edu.br.builder.BuilderRaca;
import ifpe.edu.br.entidades.Doenca;
import ifpe.edu.br.entidades.Raca;
import ifpe.edu.br.fachada.Fachada;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AlteraRacaFase2Servlet", urlPatterns = {"/AlteraRacaFase2Servlet"})
public class AlteraRacaFase2Servlet extends HttpServlet{
    public class AlteraDoencaFase2Servlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nome = request.getParameter("nome");
        int id = Integer.parseInt(request.getParameter("id"));
 String descricao = request.getParameter("descricao");
  String caracteristica = request.getParameter("caracteristica");

     BuilderRaca bRaca = new BuilderRaca(id, nome, descricao, caracteristica);
   bRaca.setNome(nome);
         bRaca.setDescricao(descricao);
         bRaca.setCaracteristica(caracteristica);
          bRaca.setId(id);
         Raca raca = bRaca.BuilderRaca();
         Fachada.getInstance().alterar(raca);
         response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AlteraRacaFase2Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>O personagem "+raca.getId()+" foi alterado com sucesso!!!!</h1>");
            out.println("<a href='ApresentaRacaServlet'>apresentar Raca</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    }
}
