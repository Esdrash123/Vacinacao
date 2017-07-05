<%-- 
    Document   : CadastroAnimal
    Created on : 05/07/2017, 12:36:11
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
        <h1>Cadastro de Animais</h1>
        <form method="post" action="CadastroAnimalServlet"><br/>
            Id:<input type="text" name="id"/><br/>
            Nome:<input type="text" name="nome"/><br/>
            Nascimento:<input type="text" name="nascimento"/><br/>
            Peso:<input type="text" name="Peso"/><br/>
            caracteristicaIndividuais<input type="text" name="caracteristicaIndividuais"/><br/>
            <input type="submit" value="cadastrar"/>
        </form>
    </body>
</html>
