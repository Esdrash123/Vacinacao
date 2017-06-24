/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.servlet;

import ifpe.edu.br.fachada.Fachada;
import ifpe.edu.br.entidades.Animal;
import ifpe.edu.br.builder.BuilderAnimal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 *
 * @author paulo
 */
@WebServlet(name = "AnimalServlet", urlPatterns = {"/AnimalServlet"})
public class ServletAnimal extends HttpServlet {
    /** 
    private int codigo;
    private String Nome;
    private String CNPJ;
    private String OAB;
    private String Telefone;
    private String Endereco;
    */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String Nome = request.getParameter("Nome");
        int id = Integer.parseInt(request.getParameter("id"));
        String caracteristicaIndividuais = request.getParameter("caracteristicaIndividuais");
        Date nascimento = request.getParameter("nascimento");
        double peso = request.getParameter("peso");
      
        
        BuilderAnimal bAnimal = new BuilderAnimal();
        bAnimal.setId(id);
        bAnimal.setNome(Nome);
        bAnimal.setCaracteristicaIndividuais(caracteristicaIndividuais);
        bAnimal.setNascimento(nascimento);
        bAnimal.setPeso(peso);
     
         
        Animal animal = bAnimal.BuilderAnimal();
        
        Fachada.getInstance().inserir(animal);

        request.setAttribute("msg","Animal Cadastrado com sucesso!");
        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    
}

    private Object getServletContext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

