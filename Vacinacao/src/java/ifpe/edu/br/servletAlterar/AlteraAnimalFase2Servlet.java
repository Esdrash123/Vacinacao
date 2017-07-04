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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AlteraAnimalFase1Servlet", urlPatterns = {"/AlteraAnimalFase1Servlet"})
public class AlteraAnimalFase2Servlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String nome = request.getParameter("nome");
        int id = Integer.parseInt(request.getParameter("id"));
        String caracteristicaIndividuais = request.getParameter("caracteristicaIndividuais");
        Date nascimento = formato.parse(request.getParameter("nascimento"));
        double peso = Integer.parseInt(request.getParameter("peso"));

        BuilderAnimal bAnimal = new BuilderAnimal(id, nome, nascimento, peso, caracteristicaIndividuais);
        bAnimal.setNome(nome);
        bAnimal.setId(id);
        bAnimal.setCaracteristicaIndividuais(caracteristicaIndividuais);
        bAnimal.setPeso(peso);
        bAnimal.setNascimento(nascimento);

        Animal animal = bAnimal.BuilderAnimal();

        Fachada.getInstance().alterar(animal);

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AlteraAnimalFase2Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>O personagem " + animal.getNome() + " foi alterado com sucesso!!!!</h1>");
            out.println("<a href='ApresentaAnimailServlet'>apresentar animail</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
