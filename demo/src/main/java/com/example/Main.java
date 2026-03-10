package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("===== SISTEMA DE BIBLIOTECA =====");

            // OBJETO 1: constructor con parámetros
            System.out.println("\n-- Libro 1 --");
            Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 5, 2);
            libro1.imprimir();

            // OBJETO 2: constructor por defecto, datos por consola
            System.out.println("\n-- Libro 2 (ingrese los datos) --");
            Libro libro2 = new Libro();
            System.out.print("Título: ");
            libro2.setTitulo(sc.nextLine());
            System.out.print("Autor: ");
            libro2.setAutor(sc.nextLine());
            System.out.print("Número de ejemplares: ");
            libro2.setNumEjemplares(sc.nextInt());
            System.out.print("Ejemplares prestados: ");
            libro2.setNumEjemplaresPrestados(sc.nextInt());
            sc.nextLine(); // limpiar buffer
            System.out.println();
            libro2.imprimir();

            // OBJETO 3: LibroTextoUNIAC
            System.out.println("\n-- Libro Texto UNIAC --");
            LibroTextoUNIAC libroTextoUNIAC = new LibroTextoUNIAC(
                "Fundamentos de Programación",
                "Luis Joyanes Aguilar",
                10, 3,
                "Programación II",
                "Facultad de Ingeniería de Sistemas"
            );
            libroTextoUNIAC.imprimir();

            // OBJETO 4: Novela
            System.out.println("\n-- Novela --");
            Novela novela = new Novela("El nombre de la rosa", "Umberto Eco", 4, 1, "Policiaca");
            novela.imprimir();

            // PRUEBA préstamo y devolución
            System.out.println("\n===== PRUEBA PRÉSTAMO Y DEVOLUCIÓN =====");

            boolean resultado = libro1.prestamo();
            System.out.println("Préstamo libro1: " + resultado);

            resultado = libro1.devolucion();
            System.out.println("Devolución libro1: " + resultado);

            libro1.prestamo();
            libro1.prestamo();
            libro1.prestamo();
            resultado = libro1.prestamo();
            System.out.println("Préstamo sin disponibles: " + resultado);

            novela.devolucion();
            resultado = novela.devolucion();
            System.out.println("Devolución sin prestados: " + resultado);
        }
    }
}

