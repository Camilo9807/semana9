package com.example;

public class Main {
    public static void main(String[] args) {
        
        Torneo torneo = new Torneo();
        
        // Crear instancias de los atletas
        Atleta corredor = new Corredor("Camilo");
        Atleta nadador = new Nadador("Diego");
        Atleta saltador = new Saltador("Giovanny");
        
        
        torneo.organizarCompetencia(corredor);
        torneo.organizarCompetencia(nadador);
        torneo.organizarCompetencia(saltador);
    }
}

