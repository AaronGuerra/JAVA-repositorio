package Abstraccion;

public class Gato extends Animal {

    String color;

    public Gato(String nombre, String color){
        super(nombre);
        this.color = color;
    }

    protected void maullarycomer(){
        System.out.println(super.nombre + " está comiendo y maullando...");
    }

    @Override
    void hacerSonido(){
        System.out.println("Miau");
    }

}
