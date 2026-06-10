package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {
    private List<Pelicula> entradas;

    // Constructor
    public Cliente(String nombre, int edad) {
        super(nombre, edad);
        this.entradas = new ArrayList<>();
    }

    // Método para intentar comprar una entrada
    public boolean comprarEntrada(Pelicula pelicula) {
        if (pelicula.puedeVer(this.edad)) {
            entradas.add(pelicula);
            System.out.println(nombre + " compró entrada para: " + pelicula.getTitulo());
            return true;
        } else {
            System.out.println(nombre + " NO puede comprar entrada para: " + pelicula.getTitulo() + " (restricción de edad)");
            return false;
        }
    }

    // Getter de entradas
    public List<Pelicula> getEntradas() {
        return entradas;
    }
}

