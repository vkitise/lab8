package com.example;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;


public class GreetingServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get the user's name from the request parameter
        String userName = request.getParameter("userName");

        // Set the content type of the response
        response.setContentType("text/html");

        // Get the print writer to write the response
        PrintWriter out = response.getWriter();

        // Write the HTML response
        out.println("<html>");
        out.println("<head><title>Greeting Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>Hello " + userName + "!</h1>");
        out.println("<h2>How are you?</h2>");
        out.println("</body>");
        out.println("</html>");

        // Close the print writer
        out.close();
    }
}
