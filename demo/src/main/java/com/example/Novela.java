package com.example;

public class Novela extends Libro {

    private String tipo;

    public Novela() {
        super();
        tipo = "";
    }

    public Novela(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados, String tipo) {
        super(titulo, autor, numEjemplares, numEjemplaresPrestados);
        this.tipo = tipo;
    }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    @Override   // 
    public void imprimir() {
        super.imprimir();
        System.out.println("Tipo de novela: " + tipo);
    }
}
