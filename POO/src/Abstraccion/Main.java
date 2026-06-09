package Abstraccion;


public class Main {
    public static void main(String[] args) {

        var gatito = new Gato("Gringo", "naranja y blanco");
        var perrito = new Perro("Rex", "Pastor Alemán");
        System.out.println("Nombre: " + gatito.nombre);
        System.out.println("Color: " + gatito.color);
        gatito.maullarycomer();


        System.out.println("----------------------------------------------------------------------");
        System.out.println("Nombre: " + perrito.nombre);
        System.out.println("Raza: " + perrito.raza);
        perrito.comer();
        perrito.hacerSonido();

        System.out.println("----------------------------------------------------------------------");
        var pajarito = new Ave("Piolín", "Pequeño");
        pajarito.vuela();
        pajarito.transportar();
        pajarito.hacerSonido();

        System.out.println("----------------------------------------------------------------------");
        var avion1 = new Avion();
        avion1.vuela();
        avion1.transportar();

        System.out.println("----------------------------------------------------------------------");
        Volador pajaro = new Ave("Cóndor", "Muy Grande");
        pajaro.vuela();
        pajaro.transportar();

    }
}
