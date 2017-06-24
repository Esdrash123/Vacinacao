/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpe.edu.br.servlet;

import ifpe.edu.br.fachada.Fachada;
import ifpe.edu.br.entidades.Aplicacoes;
import ifpe.edu.br.builder.BuilderAplicacoes;
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
@WebServlet(name = "AplicacoesServlet", urlPatterns = {"/AplicacoesServlet"})
public class ServletAplicacoes extends HttpServlet {
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
       
   

        
        String descricao = request.getParameter("descricao");
        int id = Integer.parseInt(request.getParameter("id"));
        int hora = Integer.parseInt(request.getParameter("hira"));
        Date data = request.getParameter("data");
                Date dataProxima = request.getParameter("dataProxima");

      
        
        BuilderAplicacoes bAplicacoes = new BuilderAplicacoes();
        bAplicacoes.setId(id);
        bAplicacoes.setDescricao(descricao);
        bAplicacoes.setHora(hora);
        bAplicacoes.setData(data);
  
     
         
        Aplicacoes aplicacoes = bAplicacoes.BuilderAplicacoes();
        
        Fachada.getInstance().inserir(aplicacoes);

        request.setAttribute("msg","Aplicacoes Cadastrado com sucesso!");
        getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    
}

    private Object getServletContext() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


