<%--
  Created by IntelliJ IDEA.
  User: Fellipe Souto
  Date: 12/11/2019
  Time: 19:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <link rel='stylesheet' href='/webjars/bootstrap/css/bootstrap.min.css'>
        <title>Welcome</title>
    </head>
    <body>
        <c:set var="bindingResult" value="${requestScope['org.springframework.validation.BindingResult.autorForm']}"/>
        <div class="container">
            <h1>Área do autor - Formulário de Cadastro</h1>
            <form action="/admin/autor/form" method="post">
                <div class="form-group">
                    <label for="nome">Nome</label>
                    <input type="text" name="nome" id="nome" value="${form.nome}" class="form-control">
                    <c:forEach var="error" items="${bindingResult.getFieldErrors('nome')}">
                        <span class="text-danger">${error.defaultMessage}</span>
                    </c:forEach>
                </div>
                <div class="form-group">
                    <label for="email">Email</label>
                    <input type="text" name="email" id="email" value="${form.email}" class="form-control">
                    <c:forEach var="error" items="${bindingResult.getFieldErrors('email')}">
                        <span class="text-danger">${error.defaultMessage}</span>
                    </c:forEach>
                </div>
                <input type="submit" class="btn btn-primary" value="Gravar">
            </form>
        </div>
    </body>
</html>