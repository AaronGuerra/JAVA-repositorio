package model;

public class Entrada {
    private Cliente cliente;
    private Funcion funcion;
    private int numeroAsiento;
    protected double precioBase = 5000.0;

    public Entrada(Cliente cliente, Funcion funcion, int numeroAsiento) {
        this.cliente = cliente;
        this.funcion = funcion;
        this.numeroAsiento = numeroAsiento;
    }

    public double calcularPrecio() { return precioBase; }

    public String mostrarResumen() {
        return String.format("ASIENTO: %d | Película: %s | Horario: %s | Precio: $%.2f",
                numeroAsiento, funcion.getPelicula().getTitulo(), funcion.getHorario(), calcularPrecio());
    }
}