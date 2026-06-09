package Abstraccion;

public class Perro extends Animal {

    String raza;

    public Perro(String nombre, String raza){
        super(nombre);
        this.raza = raza;
    }

    @Override
    protected void comer(){
        System.out.println(super.nombre + " está comiendo...");
    }

    @Override
    void hacerSonido(){
        System.out.println("Guau");
    }

}
