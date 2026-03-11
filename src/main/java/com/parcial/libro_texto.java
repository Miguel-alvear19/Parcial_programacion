package com.parcial;

public class libro_texto extends libro {

    public String curso;

    public libro_texto(String titulo, String autor, int numero_ejemplares, int numero_ejemplares_prestados,
            String curso) {
        super(titulo, autor, numero_ejemplares, numero_ejemplares_prestados);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void imprimir() {
        System.out.println("\n" +"Atributos de libro de texto:");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de ejemplares: " + numero_ejemplares);
        System.out.println("Curso: " + curso);
    }

}
