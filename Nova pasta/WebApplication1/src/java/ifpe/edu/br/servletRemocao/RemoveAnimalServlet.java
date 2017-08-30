package ifpe.edu.br.servletRemocao;

import ifpe.edu.br.fachada.Fachada;
import ifpe.edu.br.entidades.Animal;
import ifpe.edu.br.builder.BuilderAnimal;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
@WebServlet(name = "RemoveAnimalServlet", urlPatterns = {"/RemoveAnimalServlet"})
public class RemoveAnimalServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
        
        String Nome = request.getParameter("Nome");
        int id = Integer.parseInt(request.getParameter("id"));
        String caracteristicaIndividuais = request.getParameter("caracteristicaIndividuais");
       
  

        BuilderAnimal bAnimal = new BuilderAnimal();
        bAnimal.setId(id);
        bAnimal.setNome(Nome);
        bAnimal.setCaracteristicaIndividuais(caracteristicaIndividuais);
      
        Animal animal = bAnimal.BuilderAnimal();

        Fachada.getInstance().deletar(animal);

        request.setAttribute("msg", "Animal Removido com sucesso!");
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
            Logger.getLogger(RemoveAnimalServlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(RemoveAnimalServlet.class.getName()).log(Level.SEVERE, null, ex);
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
