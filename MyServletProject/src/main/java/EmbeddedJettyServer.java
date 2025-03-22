package com.example;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class EmbeddedJettyServer {

    public static void main(String[] args) throws Exception {

        // Create a new Jetty server listening on port 8080
        Server server = new Server(8080);

        // Create a context handler to define the servlets and their mappings
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        
        // Set the context path (root path "/")
        context.setContextPath("/");

        // Add the GreetingServlet to the context, and map it to the URL "/greet"
        context.addServlet(new ServletHolder(GreetingServlet.class), "/greet");

        // Set the server handler to the context (i.e., tell Jetty to use this context)
        server.setHandler(context);

        // Start the server
        server.start();
        System.out.println("Jetty server started at http://localhost:8080");

        // Keep the server running until it is manually stopped
        server.join();
    }
}
