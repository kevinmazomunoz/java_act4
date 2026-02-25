package com.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        CamionDeReparto camion = new CamionDeReparto("CAM01", 80, 500, true);
        BuqueCarga buque = new BuqueCarga("BUQ01", 100, 2000, 50);

        camion.setCombustible(-20);

        System.out.println("Combustible actual del camión: " + camion.getCombustible());

        ArrayList<Transporte> flota = new ArrayList<>();

        flota.add(camion);
        flota.add(buque);

        for (Transporte t : flota) {
            t.viajar(100);
        }
        
        buque.atracarEnPuerto();
        buque.mostrarDatos();
    }
}