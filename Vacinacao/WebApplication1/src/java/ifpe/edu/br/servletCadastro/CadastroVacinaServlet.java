/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.servletCadastro;

import ifpe.edu.br.builder.BuilderVacina;
import ifpe.edu.br.entidades.Vacina;
import ifpe.edu.br.fachada.Fachada;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author esdra
 */
@WebServlet(name = "CadastroVacinaServlet", urlPatterns = {"/CadastroVacinaServlet"})
public class CadastroVacinaServlet extends HttpServlet {

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
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("id"));
        String nome = request.getParameter("nome");
        String descricao = request.getParameter("descricao");
        String composicao = request.getParameter("composicao");
        String tempoEntreAplicacoes = request.getParameter("tempoEntreAplicacoes");
        double valor = Double.parseDouble(request.getParameter("valor"));
        int quantidadeAplicacao = Integer.parseInt(request.getParameter("quantidadeAplicaca"));
        
        BuilderVacina bVacina = new BuilderVacina();
        bVacina.setId(id);
        bVacina.setComposicao(composicao);
        bVacina.setNome(nome);
        bVacina.setDescricao(descricao);
        bVacina.setQuantidadeAplicacao(quantidadeAplicacao);
        bVacina.setTempoEntreAplicacoes(tempoEntreAplicacoes);
        bVacina.setValor(valor);
        
        Vacina vacina = bVacina.BuilderVacina();
        
        Fachada.getInstance().inserir(vacina);
        
        request.setAttribute("msg", "Vacina Cadastrado com sucesso!");
        getServletContext().getRequestDispatcher("/index.html").forward(request, response);
        
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
