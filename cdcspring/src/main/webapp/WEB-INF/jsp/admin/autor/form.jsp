<%--
  Created by IntelliJ IDEA.
  User: Fellipe Souto
  Date: 12/11/2019
  Time: 19:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <link rel='stylesheet' href='/webjars/bootstrap/css/bootstrap.min.css'>
        <title>Welcome</title>
    </head>
    <body>
        <div class="container">
            <h1>Área do autor - Formulário de Cadastro</h1>
            <form action="/admin/autor/form" method="post">
                <div class="form-group">
                    <label for="nome">Nome</label>
                    <input type="text" name="nome" id="nome" class="form-control">
                </div>
                <div class="form-group">
                    <label for="email">Email</label>
                    <input type="text" name="email" id="email" class="form-control">
                </div>
                <input type="submit" class="btn btn-primary" value="Gravar">
            </form>
        </div>
    </body>
</html>