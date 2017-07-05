<%-- 
    Document   : CadastroVacina
    Created on : 05/07/2017, 12:39:24
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
            Descrição:<input type="text" name="descricao"/><br/>
            nome:<input type="text" name="nome"/><br/>
            Composicao<input type="text" name="composicao"/><br/>
            TempoEntreAplicacoes<input type="text" name="tempoEntreAplicacoes"/><br/>
            Valor<input type="text" name="valor"/><br/>
            quantidadeAplicacao<input type="text" name="quantidadeAplicacao"/><br/>
            <input type="submit" value="cadastrar"/>
        </form>
    </body>
</html>