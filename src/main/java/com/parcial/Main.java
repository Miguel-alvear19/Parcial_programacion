package com.parcial;

public class Main {
    public static void main(String[] args) {

        libro libro1 = new libro("El Quijote", "Miguel de Cervantes", 5, 0);
        libro1.prestamo();
        libro1.prestamo();
        libro1.prestamo();
        libro1.prestamo();
        libro1.prestamo();
        libro1.prestamo();

        
        libro1.imprimir();



        
    }
}