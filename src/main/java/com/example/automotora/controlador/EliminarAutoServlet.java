package com.example.automotora.controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.example.automotora.modelo.Auto;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;

@WebServlet(name = "EliminarAutoServlet", value = "/eliminarAuto")
public class EliminarAutoServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        String patente = request.getParameter("patente");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("buscarAuto");
        Auto auto = new Auto(patente, "", "", ""); // Asegúrate de tener un constructor que acepte la patente y otros atributos necesarios
        if (auto.EliminarAuto()) {
            request.setAttribute("status", "Se ha eliminado correctamente el auto");
        } else {
            request.setAttribute("status", "No se pudo realizar la acción");
        }
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
