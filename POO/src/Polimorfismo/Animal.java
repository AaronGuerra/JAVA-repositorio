package Polimorfismo;

public class Animal {
    // Atributo
    protected String nombre;

    public Animal(String nombre){
        this.nombre = nombre;
    }

    protected void comer(){
        System.out.println("Está comiendo...");
    }

    protected void hacerSonido(){
        System.out.println("Este animal hace un sonido.");
    }
}