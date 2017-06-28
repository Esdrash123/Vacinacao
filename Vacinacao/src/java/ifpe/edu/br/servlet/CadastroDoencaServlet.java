/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.servlet;

import ifpe.edu.br.fachada.Fachada;
import ifpe.edu.br.entidades.Doenca;
import ifpe.edu.br.builder.BuilderDoenca;
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


/**
 *
 * @author paulo
 */
@WebServlet(name = "CadastroDoencaServlet", urlPatterns = {"/CadastroDoencaServlet"})
public class CadastroDoencaServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {

        int id = Integer.parseInt(request.getParameter("id"));
        String nome = request.getParameter("nome");
        String descricao = request.getParameter("descricao");

        BuilderDoenca bDoenca = new BuilderDoenca(id, nome, descricao);
        bDoenca.setId(id);
        bDoenca.setNome(nome);
        bDoenca.setDescricao(descricao);

        Doenca doenca = bDoenca.BuilderDoenca();

        Fachada.getInstance().inserir(doenca);

        request.setAttribute("msg", "Doença Cadastrado com sucesso!");
        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);

    }
}

 


