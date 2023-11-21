package com.example.automotora.modelo;

public class Auto {
    private String marca;
    private String patente;
    private int anio;

    // Constructor
    public Auto(String marca, String patente, int anio) {
        this.marca = marca;
        this.patente = patente;
        this.anio = anio;
    }

    public Auto(String patente, String patente1, String s, String s1) {
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
        return anio;
    }

    public void setAño(int año) {
        this.anio = año;
    }

    // Puedes agregar otros métodos según las necesidades de tu aplicación

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", patente='" + patente + '\'' +
                ", año=" + anio +
                '}';
    }

    public boolean EliminarAuto() {
        return false;
    }
}
