package model;

public class EntradaEstudiante extends Entrada {
    public EntradaEstudiante(Cliente cliente, Funcion funcion, int numeroAsiento) {
        super(cliente, funcion, numeroAsiento);
    }

    @Override
    public double calcularPrecio() {
        return precioBase * 0.70; // Descuento del 30% polimórfico
    }
}