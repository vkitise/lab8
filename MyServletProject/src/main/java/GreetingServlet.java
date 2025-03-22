package com.example;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class GreetingServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userName = request.getParameter("userName");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Greeting Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>Hello " + userName + "!</h1>");
        out.println("<h2>How are you?</h2>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
