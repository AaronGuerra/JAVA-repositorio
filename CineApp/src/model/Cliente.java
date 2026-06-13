package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {
    private List<Entrada> entradas;

    public Cliente(String nombre, int edad) {
        super(nombre, edad);
        this.entradas = new ArrayList<>();
    }

    public void agregarEntrada(Entrada entrada) {
        this.entradas.add(entrada);
    }

    public List<Entrada> getEntradas() { return entradas; }
}