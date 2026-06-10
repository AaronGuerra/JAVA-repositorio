package model;

public class Entrada {
    private Cliente cliente;
    private Funcion funcion;
    private int numeroAsiento;

    // Constructor
    public Entrada(Cliente cliente, Funcion funcion, int numeroAsiento) {
        this.cliente = cliente;
        this.funcion = funcion;
        this.numeroAsiento = numeroAsiento;
    }

    // Getters
    public Cliente getCliente() {
        return cliente;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    // Método para mostrar resumen de la entrada
    public String mostrarResumen() {
        return "Entrada de cine:" +
                "\nCliente: " + cliente.getNombre() +
                " (Edad: " + cliente.getEdad() + ")" +
                "\nPelícula: " + funcion.getPelicula().getTitulo() +
                "\nHorario: " + funcion.getHorario() +
                "\nAsiento Nº: " + numeroAsiento +
                "\n-------------------------------------------------";
    }


}
