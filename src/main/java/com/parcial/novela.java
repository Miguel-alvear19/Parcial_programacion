package com.parcial;

public class novela extends libro {

    public String genero;

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


    
}
