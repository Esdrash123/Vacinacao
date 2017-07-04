/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.servletAlterar;

import ifpe.edu.br.builder.BuilderVacina;
import ifpe.edu.br.builder.BuilderVeterinario;
import ifpe.edu.br.entidades.Vacina;
import ifpe.edu.br.entidades.Veterinario;
import ifpe.edu.br.fachada.Fachada;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AlteraVeterinarioFase2Servlet", urlPatterns = {"/AlteraVeterinarioFase2Servlet"})
public class AlteraVeterinarioFase2Servlet extends HttpServlet{
     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
  
        String nome = request.getParameter("nome");
        int id = Integer.parseInt(request.getParameter("id"));
 String crv = request.getParameter("crv");
  String endereco = request.getParameter("endereco");
    String telefone = request.getParameter("telefone");
  
     BuilderVeterinario bVeterinario = new BuilderVeterinario(  id, nome, crv, endereco, telefone);
   bVeterinario.setNome(nome);
         bVeterinario.setCrv(crv);
         bVeterinario.setEndereco(endereco);
          bVeterinario.setId(id);
          bVeterinario.setTelefone(telefone);
        
            
             Veterinario veterinario = bVeterinario.BuilderVeterinario();
             Fachada.getInstance().alterar(veterinario);
         response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AlteraVeterinarioFase2Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>O veterinario "+veterinario.getNome()+" foi alterado com sucesso!!!!</h1>");
            out.println("<a href='ApresentaVeterinarioServlet'>apresentar veterinario</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    }

