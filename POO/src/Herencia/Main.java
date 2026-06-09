package Herencia;

public class Main {
    public static void main(String[] args) {

        var gatito = new Gato("Gringo", "naranja");
        var perrito = new Perro("Rex", "Pastor Alemán");
        System.out.println(gatito.nombre);
        System.out.println(gatito.color);
        gatito.maullarycomer();


        System.out.println(perrito.nombre);
        System.out.println(perrito.raza);
        perrito.comer();
        perrito.ladrar();




    }
}
