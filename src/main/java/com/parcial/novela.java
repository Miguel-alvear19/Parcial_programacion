package com.parcial;

public class novela extends libro {

    public String genero = "Historica" + "Romantica" + "Ciencia ficcion" + "Realismo" + "Aventuras" + "policiaca";

    public novela(String titulo, String autor, int numero_ejemplares, int numero_ejemplares_prestados, String genero) {
        super(titulo, autor, numero_ejemplares, numero_ejemplares_prestados);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void imprimir() {
        System.out.println("\n" +"Atributos de novela:");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de ejemplares: " + numero_ejemplares);
        System.out.println("Genero: " + genero);
    }

}
