<%-- 
    Document   : AlterarVeterinario
    Created on : 05/07/2017, 14:09:12
    Author     : esdra
--%>

<%@page import="java.util.List"%>
<%@page import="ifpe.edu.br.fachada.Fachada"%>
<%@page import="ifpe.edu.br.entidades.Veterinario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<h1>Alterar Vacina</h1>
<%
    int indice = Integer.parseInt(request.getParameter("indice"));
    List<Veterinario> cl = (List<Veterinario>) Fachada.getInstance().recuperarTodosVeterinarios();
    session.getAttribute("raca");

    Veterinario c = cl.get(indice);
    Fachada.getInstance().alterar(c);
%>


<a href="ApresentaCliente.jsp">voltar</a><br>
<form method="post" action="AlteraClienteServlet">
    <table>
        <tr><td>ID:</td><td><%= c.getId()%><input type="hidden" name="id" value="<%= c.getId()%>"/></td></tr>
        <tr><td>Nome:</td><td><input type="text" name="nome" value="<%= c.getNome()%>"/></td></tr>
        <tr><td>Crv:</td><td><input type="text" name="crv" value="<%= c.getCrv()%>"/></td></tr>
        <tr><td>Endereco:</td><td><input type="text" name="endereco" value="<%= c.getEndereco()%>"/></td></tr>
        <tr><td>Telefone:</td><td><input type="text" name="telefone" value="<%= c.getTelefone()%>"/></td></tr>
        <td><input type="submit" value="Alterar"/></td><tr>
    </table>
</form>


</body>
</html>
