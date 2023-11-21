package com.example.automotora.modelo;

public class auto {
    private String marca;
    private String patente;
    private int año;

    // Constructor
    public auto(String marca, String patente, int año) {
        this.marca = marca;
        this.patente = patente;
        this.año = año;
    }

    // Métodos getter y setter para marca
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Métodos getter y setter para patente
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    // Métodos getter y setter para año
    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    // Puedes agregar otros métodos según las necesidades de tu aplicación

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", patente='" + patente + '\'' +
                ", año=" + año +
                '}';
    }
}
