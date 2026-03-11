package com.parcial;

public class libroTextoUniajc extends libro_texto {

    public String facultad;

    public libroTextoUniajc(String titulo, String autor, int numero_ejemplares, int numero_ejemplares_prestados, String curso, String facultad) {
        super(titulo, autor, numero_ejemplares, numero_ejemplares_prestados, curso);
        this.facultad = facultad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    


    
}
