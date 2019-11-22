<%--
  Created by IntelliJ IDEA.
  User: Fellipe Souto
  Date: 13/11/2019
  Time: 20:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel='stylesheet' href='/webjars/bootstrap/css/bootstrap.min.css'>
    <title>Lista de autores</title>
</head>
<body>
<div class="container">
    <h3>Lista de autores</h3>
    <table class="table table-hover">
        <thead class="thead-dark">
            <th class="col">Nome</th>
            <th class="col">Email</th>
            <th class="col">Gerenciar</th>
        </thead>
        <tbody>
        <c:forEach var="autor" items="${autores}">
            <tr>
                <td>${autor.nome}</td>
                <td>${autor.email}</td>
                <td><a href="/admin/autor/${autor.id}/edit">Editar</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
