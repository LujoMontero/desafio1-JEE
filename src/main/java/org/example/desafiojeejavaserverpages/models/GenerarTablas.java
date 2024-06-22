package org.example.desafiojeejavaserverpages.models;

public class GenerarTablas {

    public static class TableGenerator {

        public String generateTable() {
            StringBuilder table = new StringBuilder();

            for (int i = 1; i <= 10; i++) {
                table.append("<tr>");
                table.append("<th scope=\"row\">").append(i).append("</th>");
                table.append("<td>Numero Mes ").append(i).append("</td>");
                table.append("<td><a href=\"FactorialServlet?num=").append(i).append("\">Factorial de ").append(i).append("</a></td>");
                table.append("<td><a href=\"ParImparServlet?num=").append(i).append("\">¿Es par o Impar el numero ").append(i).append("?</a></td>");
                table.append("</tr>");
            }
            return table.toString();
        }
    }
}