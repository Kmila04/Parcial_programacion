package com.example;

public class Libro {

    private String titulo;
    private String autor;
    private int numEjemplares;
    private int numEjemplaresPrestados;

    public Libro() {
        titulo = "";
        autor = "";
        numEjemplares = 0;
        numEjemplaresPrestados = 0;
    }

    public Libro(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getNumEjemplares() { return numEjemplares; }
    public int getNumEjemplaresPrestados() { return numEjemplaresPrestados; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAutor(String autor) { this.autor = autor; }
    public void setNumEjemplares(int numEjemplares) { this.numEjemplares = numEjemplares; }
    public void setNumEjemplaresPrestados(int n) { this.numEjemplaresPrestados = n; }

    public boolean prestamo() {
        int disponibles = numEjemplares - numEjemplaresPrestados;
        if (disponibles > 0) {
            numEjemplaresPrestados = numEjemplaresPrestados + 1;
            return true;
        } else {
            return false;
        }
    }

    public boolean devolucion() {
        if (numEjemplaresPrestados > 0) {
            numEjemplaresPrestados = numEjemplaresPrestados - 1;
            return true;
        } else {
            return false;
        }
    }

    public void imprimir() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de ejemplares: " + numEjemplares);
        System.out.println("Ejemplares prestados: " + numEjemplaresPrestados);
        System.out.println("Disponibles: " + (numEjemplares - numEjemplaresPrestados));
    }
}