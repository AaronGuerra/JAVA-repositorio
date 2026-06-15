package model;

public abstract class Mascota {
    protected String nombre; // 'protected' para que Perro y Gato los usen directamente
    protected int edad;

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void hacerSonido();

    public void mostrarInfo() {
        System.out.println(nombre + " | Edad: " + edad + " años");
    }

    // Getters necesarios para que otros paquetes (como service) puedan leer los datos de forma limpia
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}