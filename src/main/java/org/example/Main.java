package org.example;

import clases.Jugador;
import clases.Tecnico;

public class Main {
    public static void main(String[] args) {
        Jugador objetoJugador= new Jugador();

        Tecnico objetoTecnico= new Tecnico();
        objetoTecnico.saludar();
        objetoJugador.saludar();
    }
}