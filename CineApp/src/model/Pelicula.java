package model;



public class Pelicula {
    private String titulo;
    private int duracion; // En minutos
    private String categoria;
    private boolean restriccion; // true = solo mayores de edad

    // Constructor principal
    public Pelicula(String titulo, int duracion, String categoria, boolean restriccion) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.categoria = categoria;
        this.restriccion = restriccion;
    }

    // Constructor simple
    public Pelicula(String titulo, int duracion) {
        this(titulo, duracion, "Sin categoría", false);
    }

    // Getters
    public String getTitulo() { return titulo; }
    public int getDuracion() { return duracion; }
    public String getCategoria() { return categoria; }
    public boolean isRestriccion() { return restriccion; }

    // Setters
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setDuracion(int duracion) { this.duracion = duracion; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public void setRestriccion(boolean restriccion) { this.restriccion = restriccion; }

    // Método para mostrar información
    public String showInfo() {
        return "Título: " + titulo +
                "\nDuración: " + duracion + " minutos" +
                "\nCategoría: " + categoria +
                "\nRestricción: " + (restriccion ? "Solo mayores de edad" : "Apta para todo público") +
                "\n-------------------------------------------------";
    }

    // Método para verificar si una persona puede ver la película
    public boolean puedeVer(int edad) {
        if (restriccion) {
            return edad >= 18; // Solo mayores de edad
        }
        return true; // Apta para todo público
    }
}

