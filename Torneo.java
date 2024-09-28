package com.example;

public class Torneo {
    public void organizarCompetencia(Atleta atleta) {
        atleta.mostrarInformacion();
        int puntaje = atleta.realizarCompetencia();
        System.out.println("Puntaje: " + puntaje);
        System.out.println("---------------------");
    }
}

