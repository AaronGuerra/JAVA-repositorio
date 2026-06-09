package Example;

import Herencia.Animal;

public class Pajaro extends Animal {

    String tamanio;

    public Pajaro(String nombre, String tamanio){
        super(nombre);
        this.tamanio = tamanio;

    }

    void volar(){
        System.out.println("Está volando el " + super.nombre);
    }





}
