<%-- 
    Document   : AlterarDoenca
    Created on : 05/07/2017, 13:58:26
    Author     : esdra
--%>

<%@page import="java.util.List"%>
<%@page import="ifpe.edu.br.entidades.Doenca"%>
<%@page import="ifpe.edu.br.fachada.Fachada"%>
<%@page import="ifpe.edu.br.fachada.Fachada"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<h1>Alterar Doença</h1>
<%
    int indice = Integer.parseInt(request.getParameter("indice"));
    List<Doenca> cl = (List<Doenca>) Fachada.getInstance().recuperarTodasDoencas();
    session.getAttribute("oecas");

    Doenca c = cl.get(indice);
    Fachada.getInstance().alterar(c);
%>


<a href="ApresentaCliente.jsp">voltar</a><br>
<form method="post" action="AlteraClienteServlet">
    <table>
        <tr><td>ID:</td><td><%= c.getId()%><input type="hidden" name="id" value="<%= c.getId()%>"/></td></tr>
        <tr><td>Nome:</td><td><input type="text" name="nome" value="<%= c.getNome()%>"/></td></tr>
        <tr><td>Descricao:</td><td><input type="text" name="descricao" value="<%= c.getDescricao()%>"/></td></tr>
        <td><input type="submit" value="Alterar"/></td><tr>
    </table>
</form>


</body>
</html>
