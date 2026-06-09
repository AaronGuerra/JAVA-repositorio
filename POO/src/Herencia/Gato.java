package Herencia;

public class Gato extends Animal{

    String color;

    public Gato(String nombre, String color){
        super(nombre);
        this.color = color;
    }

    void maullar(){
        System.out.println("Está maullando " + super.nombre);
    }

    void maullarycomer(){
        maullar();
        System.out.println(" y ");
        super.comer();
    }

}
