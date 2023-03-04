<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mis cuentas</title>
    </head>
    <body>
        <h1>Bienvenido ${user.nombre}</h1>
        <a href="?action=create">Crear cuenta</a>
        <a href="?action=delete">Elimnar cuentas</a>
        <table>
            <tr>
                <th>Nombre</th>
                <th>Balance</th>
                <th>Acciones</th>
            </tr>
            <c:forEach items="${user.cuentasView}" var="cuenta">
                <tr>
                    <td>${cuenta.nombre}</td>
                    <td>${cuenta.valorTotal}</td>
                    <td>
                        <a href="?action=update&id=${cuenta.id}">Actualizar</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>