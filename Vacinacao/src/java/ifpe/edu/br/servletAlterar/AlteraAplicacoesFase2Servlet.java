/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.servletAlterar;

import ifpe.edu.br.builder.BuilderAnimal;
import ifpe.edu.br.fachada.Fachada;
import ifpe.edu.br.entidades.Aplicacoes;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import ifpe.edu.br.builder.BuilderAplicacoes;
import ifpe.edu.br.entidades.Animal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AlteraAplicacoesFase2Servlet", urlPatterns = {"/AlteraAplicacoesFase2Servlet"})
public class AlteraAplicacoesFase2Servlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String nome = request.getParameter("nome");
        int id = Integer.parseInt(request.getParameter("id"));
        String caracteristicaIndividuais = request.getParameter("caracteristicaIndividuais");
        Date data = formato.parse(request.getParameter("data"));
        Date dataProxima = formato.parse(request.getParameter("dataProxima"));
        int hora = Integer.parseInt(request.getParameter("hora"));
        String descricao = request.getParameter("descricao");

        BuilderAplicacoes bAplicacoes = new BuilderAplicacoes(id, data, dataProxima, hora, descricao);
        bAplicacoes.setData(data);
        bAplicacoes.setDataProxima(dataProxima);
        bAplicacoes.setHora(hora);
        bAplicacoes.setDescricao(descricao);
        bAplicacoes.setId(id);
        Aplicacoes aplicacoes = bAplicacoes.BuilderAplicacoes();

        Fachada.getInstance().alterar(aplicacoes);

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AlteraAnimalFase2Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>O personagem " + aplicacoes.getId() + " foi alterado com sucesso!!!!</h1>");
            out.println("<a href='ApresentaAplicacoesServlet'>apresentar Aplipacoes</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
