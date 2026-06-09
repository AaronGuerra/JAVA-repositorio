package Herencia;

import java.net.ProtocolException;

public class Animal {
    // Atributo
    protected String nombre;

    public Animal(String nombre){
        this.nombre = nombre;
    }

    protected void comer(){
        System.out.println("Está comiendo...");
    }
}
