package org.example.desafiojeejavaserverpages.servlets;

import java.io.IOException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.example.desafiojeejavaserverpages.util.GeneralUtilities;

@WebServlet(name = "FactorialServlet", value = "/FactorialServlet")
public class FactorialServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public FactorialServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String numParam = request.getParameter("num");
        int num = Integer.parseInt(numParam);
        GeneralUtilities util = new GeneralUtilities();
        int result = util.factFibonacci(num);

        response.setContentType("text/html");
        response.getWriter().append("<html><body>");
        response.getWriter().append("<h1>Factorial de ").append(numParam).append(" es ").append(String.valueOf(result)).append("</h1>");
        response.getWriter().append("</body></html>");
    }

    private int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doGet(request, response);
    }
}