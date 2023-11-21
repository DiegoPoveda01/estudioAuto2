package com.example.estudioauto2.controller;

import com.example.estudioauto2.modelo.Auto;
import com.example.estudioauto2.modelo.data.DBGenerator;
import com.example.estudioauto2.modelo.data.dao.AutoDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jooq.DSLContext;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "registroAutoServlet", value = "/registroUsuario")
public class RegistroAutoServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        try {
            DBGenerator.iniciarBD("AutosBD");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //La respuesta que le vamos a devolver, va a ser la dirección del archivo JSP registroUsuario.jsp
        RequestDispatcher respuesta = req.getRequestDispatcher("/registroUsuario.jsp");
        //envía la respuesta
        respuesta.forward(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException  {
        RequestDispatcher respuesta = req.getRequestDispatcher("/registroErroneo.jsp");
        if(req.getParameter("año").length()!=0 && req.getParameter("marca").length()!=0  &&
                req.getParameter("patente").length()!=0){
            String marca = req.getParameter("marca");
            String patente = req.getParameter("patente");
            int año = Integer.parseInt(req.getParameter("año"));
            Auto auto = new Auto(marca, patente, año);
            try {
                if(agregarAuto(auto)){
                    req.setAttribute("auto",auto);
                    respuesta = req.getRequestDispatcher("/registroExitoso.jsp");
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        respuesta.forward(req,resp);
    }
    private boolean agregarAuto(Auto auto) throws ClassNotFoundException {
        DSLContext query= DBGenerator.conectarBD("AutosBD");
        List<Auto> autos = AutoDAO.obtenerAuto(query,"patente",auto.getPatente());
        if(autos.size()!=0){
            return false;
        }
        else{
            AutoDAO.agregarAuto(query,auto);
            return true;
        }
    }
}
