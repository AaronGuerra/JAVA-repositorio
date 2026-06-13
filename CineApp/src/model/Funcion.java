package model;

import java.util.ArrayList;
import java.util.List;

public class Funcion {
    private Pelicula pelicula;
    private String horario;
    private int capacidad;
    private int asientosDisponibles;
    private List<Entrada> entradasVendidas;
    private boolean[] mapaAsientos; // Control real de duplicados de asientos

    public Funcion(Pelicula pelicula, String horario, int capacidad) {
        this.pelicula = pelicula;
        this.horario = horario;
        this.capacidad = capacidad;
        this.asientosDisponibles = capacidad;
        this.entradasVendidas = new ArrayList<>();
        this.mapaAsientos = new boolean[capacidad];
    }

    public Pelicula getPelicula() { return pelicula; }
    public String getHorario() { return horario; }
    public int getAsientosDisponibles() { return asientosDisponibles; }

    public boolean verificarAsientoDisponible(int numeroAsiento) {
        if (numeroAsiento < 1 || numeroAsiento > capacidad) return false;
        return !mapaAsientos[numeroAsiento - 1]; // true si está libre
    }

    public boolean validarAccesoCliente(Cliente cliente) {
        return pelicula.puedeVer(cliente.getEdad());
    }

    public void registrarVentaAsiento(Entrada entrada) {
        int indice = entrada.getNumeroAsiento() - 1;
        this.mapaAsientos[indice] = true;
        this.entradasVendidas.add(entrada);
        this.asientosDisponibles--;
    }
}