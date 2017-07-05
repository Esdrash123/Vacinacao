<%-- 
    Document   : CadastroDoenca
    Created on : 05/07/2017, 12:37:48
    Author     : esdra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Cadastro de Doenças</h1>
        <form method="post" action="CadastroDoencaServlet"><br/>
            Id:<input type="text" name="id"/><br/>
            Descrição:<input type="text" name="descricao"/><br/>
            Nome:<input type="text" name="nome"/><br/>
            <input type="submit" value="cadastrar"/>
        </form>
    </body>
</html>
