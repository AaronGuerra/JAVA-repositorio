package Abstraccion;

public class Avion implements Volador{


    @Override
    public void vuela(){
        System.out.println("Vuela con motores");
    }

    @Override
    public void transportar(){
        System.out.println("Transporta Personas");
    }
}
