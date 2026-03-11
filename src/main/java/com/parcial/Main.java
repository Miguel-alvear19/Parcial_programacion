package com.parcial;

public class Main {
    public static void main(String[] args) {

        libro libro1 = new libro("El Quijote", "Miguel de Cervantes", 5, 0);
        libro1.prestamo();
        libro1.prestamo();
        libro1.devolucion();
        libro1.imprimir();

        libro libro2 = new libro();
        libro2.setTitulo("Mamba Mentality");
        libro2.setAutor("Kobe Bryant");
        libro2.setNumero_ejemplares(3);
        libro2.setNumero_ejemplares_prestados(0);

        libroTextoUniajc libroTextoUniajc1 = new libroTextoUniajc("Codigo Limpio", "Robert C. Martin", 2, 0, "Programacion", "Ingenieria");
        libroTextoUniajc1.imprimir();

        novela novela1 = new novela("Cien años de soledad", "Gabriel García Márquez", 4, 0, "Realismo");
        novela1.imprimir();
    }
}