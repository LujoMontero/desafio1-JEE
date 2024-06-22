<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="org.example.desafiojeejavaserverpages.models.GenerarTablas.TableGenerator" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Desafío - JEE y Java Server Pages (I)</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
          rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<section class="container">
    <h1 class="text-center">Desafío JEE - Academia Desafío Latam</h1>
    <table class="table">
        <thead>
        <tr class="table-dark">
            <th scope="col">#</th>
            <th scope="col">Numero</th>
            <th scope="col">Calcular Factorial</th>
            <th scope="col">¿Es Par o Impar?</th>
        </tr>
        </thead>
        <tbody>
        <%
            TableGenerator tableGenerator = new TableGenerator();
            String table = tableGenerator.generateTable();
            out.print(table);
        %>
        </tbody>
    </table>
</section>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>
</html>