package Polimorfismo;


public class Gato extends Animal{

    protected String color;

    public Gato(String nombre, String color){
        super(nombre);
        this.color = color;
    }


    protected void maullarycomer(){
        System.out.println(super.nombre + " está comiendo y maullando...");
    }

    @Override
    protected void hacerSonido(){
        System.out.println(super.nombre + " dice: Miau");
    }

}