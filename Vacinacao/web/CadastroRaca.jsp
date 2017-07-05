<%-- 
    Document   : Cadastroraca
    Created on : 05/07/2017, 12:36:42
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
        <h1>Cadastro de Raça</h1>
        <form method="post" action="CadastroRacaServlet"><br/>
            Id:<input type="text" name="id"/><br/>
            Descrição:<input type="text" name="descricao"/><br/>
            Nome:<input type="text" name="nome"/><br/>
            Caracteristica<input type="text" name="caracteristica"/><br/>
            <input type="submit" value="cadastrar"/>
        </form>
    </body>
</html>
