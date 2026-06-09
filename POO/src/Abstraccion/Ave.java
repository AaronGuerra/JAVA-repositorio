package Abstraccion;

public class Ave extends Animal implements Volador{

    String tamanio;

    public Ave(String nombre, String tamanio){
        super(nombre);
        this.tamanio = tamanio;
    }

    @Override
    void hacerSonido(){
        System.out.println("Pio-pío");
    }

    @Override
    public void vuela(){
        System.out.println("Volando con alas");
    }

    @Override
    public void transportar() {
        System.out.println("Comida y ramitas");
    }







}
