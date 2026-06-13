package model;

public class Pelicula {
    private String titulo;
    private int duracion;
    private int edadMinima;

    public Pelicula(String titulo, int duracion, int edadMinima) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
    }

    public String getTitulo() { return titulo; }
    public int getEdadMinima() { return edadMinima; }

    public boolean puedeVer(int edadCliente) {
        return edadCliente >= this.edadMinima;
    }

    public String obtenerInformacion() {
        String clasificacion = (edadMinima == 0) ? "Todo Público" : "+" + edadMinima;
        return String.format("Película: %s | Duración: %d min | Clasificación: %s", titulo, duracion, clasificacion);
    }
}