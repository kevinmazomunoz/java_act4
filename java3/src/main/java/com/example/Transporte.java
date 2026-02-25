package com.example;

public class Transporte {

    private String idTransporte;
    private double combustible;
    private double capacidadCarga;

    public Transporte(String idTransporte, double combustible, double capacidadCarga) {

        this.idTransporte = idTransporte;
        setCombustible(combustible);     
        setCapacidadCarga(capacidadCarga);
    }

    public String getIdTransporte() {
        return idTransporte;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double nivel) {

        if (nivel < 0) {
            this.combustible = 0;
        }
        else if (nivel > 100) {
            this.combustible = 100;
        }
        else {
            this.combustible = nivel;
        }
    }

    public void setCapacidadCarga(double carga) {

        if (carga < 0) {
            System.out.println("Error: capacidad negativa");
        }
        else {
            this.capacidadCarga = carga;
        }
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void viajar(int distancia) {

        double gasto = distancia / 10.0;

        combustible = combustible - gasto;

        if (combustible < 0) {
            combustible = 0;
        }

        System.out.println("El transporte viajo " + distancia + " km");
        System.out.println("Combustible restante: " + combustible);
    }
}