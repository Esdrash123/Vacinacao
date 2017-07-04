/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.servletAlterar;
import ifpe.edu.br.builder.BuilderAplicacoes;
import ifpe.edu.br.builder.BuilderDoenca;
import ifpe.edu.br.entidades.Aplicacoes;
import ifpe.edu.br.fachada.Fachada;
import ifpe.edu.br.entidades.Doenca;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AlteraAplicacoesFase2Servlet", urlPatterns = {"/AlteraAplicacoesFase2Servlet"})
public class AlteraDoencaFase2Servlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nome = request.getParameter("nome");
        int id = Integer.parseInt(request.getParameter("id"));
 String descricao = request.getParameter("descricao");

     BuilderDoenca bDoenca = new BuilderDoenca(id, nome, descricao);
   bDoenca.setNome(nome);
         bDoenca.setDescricao(descricao);
         bDoenca.setId(id);
         Doenca doenca = bDoenca.BuilderDoenca();
         Fachada.getInstance().alterar(doenca);
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AlteraDoencaFase2Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>O personagem "+doenca.getId()+" foi alterado com sucesso!!!!</h1>");
            out.println("<a href='ApresentaDoencaServlet'>apresentar Doenca</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
