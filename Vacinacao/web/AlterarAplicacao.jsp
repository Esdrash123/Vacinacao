<%-- 
    Document   : AlterarAplicacao
    Created on : 05/07/2017, 13:52:23
    Author     : esdra
--%>


<%@page import="ifpe.edu.br.entidades.Aplicacoes"%>
<%@page import="java.util.List"%>
<%@page import="ifpe.edu.br.fachada.Fachada"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<h1>Alterar Aplicação</h1>
<%
    int indice = Integer.parseInt(request.getParameter("indice"));
    List<Aplicacoes> cl = (List<Aplicacoes>) Fachada.getInstance().recuperarTodasAplicacoes();
    session.getAttribute("aplicacoes");

    Aplicacoes c = cl.get(indice);
    Fachada.getInstance().alterar(c);
%>


<a href="ApresentaCliente.jsp">voltar</a><br>
<form method="post" action="AlteraClienteServlet">
    <table>
        <tr><td>ID:</td><td><%= c.getId()%><input type="hidden" name="id" value="<%= c.getId()%>"/></td></tr>
        <tr><td>Data:</td><td><input type="text" name="data" value="<%= c.getData()%>"/></td></tr>
        <tr><td>DataProxima:</td><td><input type="text" name="dataProxima" value="<%= c.getDataProxima()%>"/></td></tr>
        <tr><td>Hora:</td><td><input type="text" name="hora" value="<%= c.getHora()%>"/></td></tr>
        <tr><td>descricao</td><td><input type="text" name="descricao" value="<%= c.getDescricao()%>"/></td></tr>
        <td><input type="submit" value="Alterar"/></td><tr>
    </table>
</form>


</body>
</html>
