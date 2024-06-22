package org.example.desafiojeejavaserverpages.servlets;

import java.io.IOException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "ParImparServlet", value = "/ParImparServlet")
public class ParImparServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ParImparServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String numParam = request.getParameter("num");
        int num = Integer.parseInt(numParam);
        String result = (num % 2 == 0) ? "par" : "impar";

        response.setContentType("text/html");
        response.getWriter().append("<html><body>");
        response.getWriter().append("<h1>El número ").append(numParam).append(" es ").append(result).append("</h1>");
        response.getWriter().append("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request, response);
    }
}