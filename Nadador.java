package com.example;

public class Nadador implements Atleta {
    private String nombre;

    public Nadador(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int realizarCompetencia() {
        // Simula la natación y devuelve un puntaje aleatorio
        return (int) (Math.random() * 100);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Atleta: " + nombre + ", Deporte: Natación");
    }
}

