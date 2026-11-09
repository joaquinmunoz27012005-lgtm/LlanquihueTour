package app;

import model.Direccion;
import model.Guia;
import model.Persona;

public class Main {
    public static void main(String[] args) {
        System.out.println("   SISTEMA DE GESTION - LLANQUIHUE TOUR   ");

        Direccion dirCliente = new Direccion("Baquedano 123", "Llanquihue", "Region de Los Lagos");
        Direccion dirGuia = new Direccion("Vicente Perez Rosales 456", "Puerto Varas", "Region de Los Lagos");

        Persona cliente = new Persona("15321456-7", "Carlos Mendoza", 34, dirCliente);

        Guia guia = new Guia("18654321-9", "Andrea Mansilla", 28, dirGuia, "Espanol/Ingles", 5);

        System.out.println(" REGISTRO DE CLIENTE ");
        System.out.println(cliente);

        System.out.println("REGISTRO DE GUIA TURISTICO ");
        System.out.println(guia);

        System.out.println(" EJECUCION COMPLETADA CON EXITO");
    }
}