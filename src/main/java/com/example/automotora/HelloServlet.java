package com.example.automotora;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // Obtener el parámetro de la acción
        String action = request.getParameter("action");

        // Verificar la acción y realizar la operación correspondiente
        if ("agregarAuto".equals(action)) {
            // Lógica para agregar un auto
            message = "Se ha agregado un auto";
        } else if ("eliminarAuto".equals(action)) {
            // Lógica para eliminar un auto
            message = "Se ha eliminado un auto";
        }

        // Redirigir a otra página después de realizar la acción
        response.sendRedirect("otra-pagina.jsp");

        // No es necesario imprimir nada directamente aquí, ya que se redirige a otra página
    }

    public void destroy() {
    }
}
