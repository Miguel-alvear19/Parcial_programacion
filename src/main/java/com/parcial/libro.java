package com.parcial;

public class libro {
    
public String titulo;
public String autor;
public int numero_ejemplares = 0;
public int numero_ejemplares_prestados = 0;

public libro() {
}

public libro(String titulo, String autor, int numero_ejemplares, int numero_ejemplares_prestados) {
    this.titulo = titulo;
    this.autor = autor;
    this.numero_ejemplares = numero_ejemplares;
    this.numero_ejemplares_prestados = numero_ejemplares_prestados;
}

public String getTitulo() {
    return titulo;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public String getAutor() {
    return autor;
}

public void setAutor(String autor) {
    this.autor = autor;
}

public int getNumero_ejemplares() {
    return numero_ejemplares;
}

public void setNumero_ejemplares(int numero_ejemplares) {
    this.numero_ejemplares = numero_ejemplares;
}

public int getNumero_ejemplares_prestados() {
    return numero_ejemplares_prestados;
}

public void setNumero_ejemplares_prestados(int numero_ejemplares_prestados) {
    this.numero_ejemplares_prestados = numero_ejemplares_prestados;
}

public boolean prestamo() {
    if (numero_ejemplares > numero_ejemplares_prestados) {
        numero_ejemplares_prestados++;
        System.out.println("Prestamo realizado con exito");
        return true;
    } else {
        System.out.println("No hay ejemplares disponibles para prestar");
        return false;
    }
}

public boolean devolucion() {
    if (numero_ejemplares_prestados > 0) {
        numero_ejemplares_prestados--;
        System.out.println("Devolucion realizada con exito");
        return true;
    } else {
        System.out.println("No hay ejemplares prestados para devolver");
        return false;
    }
}


public void imprimir() {
    System.out.println("Titulo: " + titulo);
    System.out.println("Autor: " + autor);
    System.out.println("Numero de ejemplares: " + numero_ejemplares);
    System.out.println("Numero de ejemplares prestados: " + numero_ejemplares_prestados);}

}
