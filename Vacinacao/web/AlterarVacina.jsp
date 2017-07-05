<%-- 
    Document   : AlterarVacina
    Created on : 05/07/2017, 14:05:06
    Author     : esdra
--%>

<%@page import="ifpe.edu.br.entidades.Vacina"%>
<%@page import="java.util.List"%>
<%@page import="ifpe.edu.br.fachada.Fachada"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<h1>Alterar Vacina</h1>
<%
    int indice = Integer.parseInt(request.getParameter("indice"));
    List<Vacina> cl = (List<Vacina>) Fachada.getInstance().recuperarTodasVacinas();
    session.getAttribute("vacina");

    Vacina c = cl.get(indice);
    Fachada.getInstance().alterar(c);
%>


<a href="ApresentaCliente.jsp">voltar</a><br>
<form method="post" action="AlteraClienteServlet">
    <table>
        <tr><td>ID:</td><td><%= c.getId()%><input type="hidden" name="id" value="<%= c.getId()%>"/></td></tr>
        <tr><td>Nome:</td><td><input type="text" name="nome" value="<%= c.getNome()%>"/></td></tr>
        <tr><td>Descricao:</td><td><input type="text" name="descricao" value="<%= c.getDescricao()%>"/></td></tr>
        <tr><td>Composicao:</td><td><input type="text" name="composicao" value="<%= c.getComposicao()%>"/></td></tr>
        <tr><td>TempoEntreAplicacoes:</td><td><input type="text" name="tempoEntreAplicacoes" value="<%= c.getTempoEntreAplicacoes()%>"/></td></tr>
        <tr><td>Valor:</td><td><input type="text" name="valor" value="<%= c.getValor()%>"/></td></tr>
        <tr><td>QuantidadeAplicacao:</td><td><input type="text" name="quantidadeAplicacao" value="<%= c.getQuantidadeAplicacao()%>"/></td></tr>
        <td><input type="submit" value="Alterar"/></td><tr>
    </table>
</form>


</body>
</html>
