package com.parcial;

public class libroTextoUniajc extends libro_texto {

    public String facultad;

    public libroTextoUniajc(String titulo, String autor, int numero_ejemplares, int numero_ejemplares_prestados,
            String curso, String facultad) {
        super(titulo, autor, numero_ejemplares, numero_ejemplares_prestados, curso);
        this.facultad = facultad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public void imprimir() {
        System.out.println("\n" +"Atributos de libro de texto UNIAJC:");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de ejemplares: " + numero_ejemplares);
        System.out.println("Curso: " + curso);
        System.out.println("Facultad: " + facultad);
    }

}
