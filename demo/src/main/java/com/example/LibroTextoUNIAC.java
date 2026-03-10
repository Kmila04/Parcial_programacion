package com.example;

public class LibroTextoUNIAC extends LibroTexto {

    private String facultad;

    public LibroTextoUNIAC() {
        super();
        facultad = "";
    }

    public LibroTextoUNIAC(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados, String curso, String facultad) {
        super(titulo, autor, numEjemplares, numEjemplaresPrestados, curso);
        this.facultad = facultad;
    }

    public String getFacultad() { return facultad; }
    public void setFacultad(String facultad) { this.facultad = facultad; }

    @Override   
    public void imprimir() {
        super.imprimir();
        System.out.println("Facultad: " + facultad);
    }
}
