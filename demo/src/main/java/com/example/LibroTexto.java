package com.example;

public class LibroTexto extends Libro {

    private String curso;

    public LibroTexto() {
        super();
        curso = "";
    }

    public LibroTexto(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados, String curso) {
        super(titulo, autor, numEjemplares, numEjemplaresPrestados);
        this.curso = curso;
    }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    @Override   
    public void imprimir() {
        super.imprimir();
        System.out.println("Curso: " + curso);
    }
}
