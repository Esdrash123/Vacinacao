<%-- 
    Document   : AlterarRaca
    Created on : 05/07/2017, 14:01:17
    Author     : esdra
--%>

<%@page import="ifpe.edu.br.entidades.Raca"%>
<%@page import="ifpe.edu.br.fachada.Fachada"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<h1>Alterar Raça</h1>
<%
    int indice = Integer.parseInt(request.getParameter("indice"));
    List<Raca> cl = (List<Raca>) Fachada.getInstance().recuperarTodasRacas();
    session.getAttribute("raca");

    Raca c = cl.get(indice);
    Fachada.getInstance().alterar(c);
%>


<a href="ApresentaCliente.jsp">voltar</a><br>
<form method="post" action="AlteraClienteServlet">
    <table>
        <tr><td>ID:</td><td><%= c.getId()%><input type="hidden" name="id" value="<%= c.getId()%>"/></td></tr>
        <tr><td>Nome:</td><td><input type="text" name="nome" value="<%= c.getNome()%>"/></td></tr>
        <tr><td>Descricao:</td><td><input type="text" name="descricao" value="<%= c.getDescricao()%>"/></td></tr>
        <tr><td>Caracteristica:</td><td><input type="text" name="caracteristica" value="<%= c.getCaracteristica()%>"/></td></tr>
        <td><input type="submit" value="Alterar"/></td><tr>
    </table>
</form>


</body>
</html>
