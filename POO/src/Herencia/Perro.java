package Herencia;

public class Perro extends Animal{

    String raza;

    public Perro(String nombre, String raza){
        super(nombre);
        this.raza = raza;
    }

    void ladrar(){
        System.out.println("Está ladrando " + super.nombre);
    }

}
