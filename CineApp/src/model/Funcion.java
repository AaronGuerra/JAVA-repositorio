package model;

import java.util.ArrayList;
import java.util.List;

public class Funcion {
    private Pelicula pelicula;
    private String horario; // Ejemplo: "20:00"
    private int capacidad;
    private int asientosDisponibles;
    private List<Cliente> entradasVendidas;

    // Constructor
    public Funcion(Pelicula pelicula, String horario, int capacidad) {
        this.pelicula = pelicula;
        this.horario = horario;
        this.capacidad = capacidad;
        this.asientosDisponibles = capacidad;
        this.entradasVendidas = new ArrayList<>();
    }

    // Getters
    public Pelicula getPelicula() { return pelicula; }
    public String getHorario() { return horario; }
    public int getCapacidad() { return capacidad; }
    public int getAsientosDisponibles() { return asientosDisponibles; }
    public List<Cliente> getEntradasVendidas() { return entradasVendidas; }

    // Método para vender entrada
    public boolean venderEntrada(Cliente cliente) {
        if (asientosDisponibles > 0 && pelicula.puedeVer(cliente.edad)) {
            entradasVendidas.add(cliente);
            asientosDisponibles--;
            System.out.println("Entrada vendida a " + cliente.getNombre() + " para la película " + pelicula.getTitulo());
            return true;
        } else {
            System.out.println("No se pudo vender entrada a " + cliente.getNombre() + " (sin asientos o restricción de edad).");
            return false;
        }
    }

    // Mostrar información de la función
    public String showInfo() {
        return "Película: " + pelicula.getTitulo() +
                "\nHorario: " + horario +
                "\nCapacidad total: " + capacidad +
                "\nAsientos disponibles: " + asientosDisponibles +
                "\nEntradas vendidas: " + entradasVendidas.size() +
                "\n-------------------------------------------------";
    }
}
