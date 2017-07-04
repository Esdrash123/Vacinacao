/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.servletAlterar;
import ifpe.edu.br.fachada.Fachada;
import ifpe.edu.br.entidades.Animal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import ifpe.edu.br.builder.BuilderAnimal;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AlteraAnimalFase1Servlet", urlPatterns = {"/AlteraAnimalFase1Servlet"})
public class AlteraAnimalFase1Servlet extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nome = request.getParameter("nome");
        
        Animal animal = Fachada.getInstance().recuperarAminais(nome);
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AlteraAnimalFase1Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Alterar Animal</h1>");
            out.println("<form method='post' action='AlteraPersonagemFase2Servlet'>");
            out.println("Nome:"+animal.getNome()+"<input type=\"hidden\" name=\"nome\" value='"+animal.getNome()+"'/><br/>\n" +
"            Idade:<input type=\"text\" name=\"idade\" value='"+animal.getId()+"'/><br/>\n" +
"            Habilidade:<input type=\"text\" name=\"habilidade\" value='"+animal.getPeso()+"'/><br/>\n" +
"            Ideologia:<input type=\"text\" name=\"ideologia\" value='"+animal.getNascimento()+"'/><br/>\n" +
"            Armas:<input type=\"text\" name=\"armas\" value='"+animal.getCaracteristicaIndividuais()+"'/><br/>\n" +
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

        
        
