package Introduccion;

public class Persona {
    //Atributos
    String nombre;
    int edad;
    String correo;

    //Constructor
    public Persona(String nombre, int edad, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    //Métodos
    public void presentarse(){
        System.out.println("Hola, soy " + this.nombre);
    }

    public void infoPersona(){
        System.out.printf("""
               nombre: %s
               edad: %d
               correo: %s
               """, this.nombre, this.edad, this.correo);
    }





}
