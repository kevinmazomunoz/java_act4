package com.example;

public class BuqueCarga extends Transporte {

    private int cantidadContenedores;

    public BuqueCarga(String id, double combustible, double capacidad, int cantidadContenedores) {
        super(id, combustible, capacidad);
        this.cantidadContenedores = cantidadContenedores;
    }

    public void atracarEnPuerto() {
        System.out.println("Buque " + getIdTransporte() + " listo para descarga.");
    }

    public void mostrarDatos() {

        System.out.println("===== DATOS DEL BUQUE =====");
        System.out.println("ID: " + getIdTransporte());
        System.out.println("Combustible: " + getCombustible());
        System.out.println("Capacidad: " + getCapacidadCarga());
        System.out.println("Contenedores: " + cantidadContenedores);

        double costo = cantidadContenedores * 50;

        System.out.println("Costo de viaje USD: " + costo);
    }
}