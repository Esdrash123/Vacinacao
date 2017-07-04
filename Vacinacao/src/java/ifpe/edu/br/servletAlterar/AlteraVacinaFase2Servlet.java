/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.servletAlterar;

import ifpe.edu.br.builder.BuilderRaca;
import ifpe.edu.br.builder.BuilderVacina;
import ifpe.edu.br.entidades.Raca;

import ifpe.edu.br.entidades.Vacina;

import ifpe.edu.br.fachada.Fachada;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AlteraVacinaFase2Servlet", urlPatterns = {"/AlteraVacinaFase2Servlet"})
public class AlteraVacinaFase2Servlet extends HttpServlet {

    public class AlteraDoencaFase2Servlet extends HttpServlet {

        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {

            String nome = request.getParameter("nome");
            int id = Integer.parseInt(request.getParameter("id"));
            String descricao = request.getParameter("descricao");
            String composicao = request.getParameter("composicao");
            String tempoEntreAplicacoes = request.getParameter("tempoEntreAplicacoes");
            double valor = Integer.parseInt(request.getParameter("valor"));
            int quantidadeAplicacao = Integer.parseInt(request.getParameter("quantidadeAplicacao "));

            BuilderVacina bVacina = new BuilderVacina(id, nome, descricao, composicao, tempoEntreAplicacoes, valor, quantidadeAplicacao);
            bVacina.setNome(nome);
            bVacina.setDescricao(descricao);
            bVacina.setComposicao(composicao);
            bVacina.setId(id);
            bVacina.setTempoEntreAplicacoes(tempoEntreAplicacoes);
            bVacina.setValor(valor);
            bVacina.setQuantidadeAplicacao(quantidadeAplicacao);

            Vacina vacina = bVacina.BuilderVacina();
            Fachada.getInstance().alterar(vacina);
            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet AlteraVacinaFase2Servlet</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>O personagem " + vacina.getNome() + " foi alterado com sucesso!!!!</h1>");
                out.println("<a href='ApresentaVacinaServlet'>apresentar Vacina</a>");
                out.println("</body>");
                out.println("</html>");
            }
        }
    }
}
