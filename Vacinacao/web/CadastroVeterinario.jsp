<%-- 
    Document   : CadastroVeterinario
    Created on : 05/07/2017, 12:42:09
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
        <h1>Cadastro de Apicações</h1>
        <form method="post" action="CadastroAplicacoesServlet"><br/>
            Id:<input type="text" name="id"/><br/>
            nome:<input type="text" name="nome"/><br/>
            Crv<input type="text" name="crv"/><br/>
            endereco<input type="text" name="endereco"/><br/>
            telefone<input type="text" name="telefone"/><br/>
            <input type="submit" value="cadastrar"/>
        </form>
    </body>
</html>