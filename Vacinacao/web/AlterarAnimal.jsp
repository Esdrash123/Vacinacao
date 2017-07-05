<%-- 
    Document   : AlterarAnimal
    Created on : 05/07/2017, 13:47:53
    Author     : esdra
--%>

<%@page import="ifpe.edu.br.fachada.Fachada"%>
<%@page import="java.util.List"%>
<%@page import="ifpe.edu.br.entidades.Animal"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<h1>Alterar Animal</h1>
<%
    int indice = Integer.parseInt(request.getParameter("indice"));
    List<Animal> cl = (List<Animal>) Fachada.getInstance().recuperarTodosAnimais();
    session.getAttribute("clientes");

    Animal c = cl.get(indice);
    Fachada.getInstance().alterar(c);
%>


<a href="ApresentaCliente.jsp">voltar</a><br>
<form method="post" action="AlteraClienteServlet">
    <table>
        <tr><td>ID:</td><td><%= c.getId()%><input type="hidden" name="id" value="<%= c.getId()%>"/></td></tr>
        <tr><td>Nome:</td><td><input type="text" name="nome" value="<%= c.getNome()%>"/></td></tr>
        <tr><td>Nascimento:</td><td><input type="text" name="nascimento:" value="<%= c.getNascimento()%>"/></td></tr>
        <tr><td>Peso:</td><td><input type="text" name="peso" value="<%= c.getPeso()%>"/></td></tr>
        <tr><td>caracteristicaIndividuais:</td><td><input type="text" name="caracteristicaIndividuais:" value="<%= c.getCaracteristicaIndividuais()%>"/></td></tr>
        <td><input type="submit" value="Alterar"/></td><tr>
    </table>
</form>


</body>
</html>
