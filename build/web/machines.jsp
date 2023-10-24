<%-- 
    Document   : machines
    Created on : 24 oct. 2023, 17:51:48
    Author     : ouard
--%>
<%@page import="entities.Machine"%>
<%@page import="service.MachineService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <style type="text/css">
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            text-align: center;
            margin: 0;
            padding: 0;
        }

        form {
            max-width: 400px;
            margin: 20px auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        fieldset {
            border: 1px solid #ccc;
            padding: 10px;
            border-radius: 5px;
            background-color: #f9f9f9;
        }

        legend {
            font-weight: bold;
            font-size: 1.2em;
        }

        table {
            width: 100%;
            border-collapse: collapse;
        }

        th, td {
            padding: 10px;
            text-align: center;
        }

        th {
            background-color: #007bff;
            color: #fff;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        input[type="text"] {
            width: 100%;
            padding: 10px;
            margin: 5px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        input[type="submit"],
        input[type="reset"] {
            background-color: #007bff;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        input[type="reset"] {
            margin-left: 10px;
        }

        a {
            text-decoration: none;
            color: #007bff;
        }
    </style>
</head>
<body>
    <form action="MachineController" method="GET">
        <fieldset>
            <legend>Information Machine</legend>
            <table>
                <tr>
                    <td>Referance :</td>
                    <td><input type="text" name="ref" value="" /></td>
                </tr>
                <tr>
                    <td>Marque :</td>
                    <td><input type="text" name="marque" value="" /></td>
                </tr>
                <tr>
                    <td>Prix :</td>
                    <td><input type="text" name="prix" value="" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Ajouter" /><input type="reset" value="Annuler" /></td>
                </tr>
            </table>
        </fieldset>
    </form>
    <fieldset>
        <legend>Liste des machines</legend>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Referance</th>
                    <th>Marque</th>
                    <th>Prix</th>
                    <th>Modifier</th>
                    <th>Supprimer</th>
                </tr>
            </thead>
            <tbody>
                <%
                    MachineService ms = new MachineService();
                    for (Machine m : ms.findAll()) {
                %>
                <tr>
                    <td><%= m.getId() %></td>
                    <td><%= m.getRef() %></td>
                    <td><%= m.getMarque() %></td>
                    <td><%= m.getPrix() %></td>
                    <td><a href="MachineController?op=delete&id=<%= m.getId() %>">Supprimer</a></td>
                    <td><a href="MachineController">Modifier</a></td>
                </tr>
                <% } %>
            </tbody>
        </table>
    </fieldset>
</body>
</html>