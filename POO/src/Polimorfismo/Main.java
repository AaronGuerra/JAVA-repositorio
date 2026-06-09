package Polimorfismo;


public class Main {
    public static void main(String[] args) {

        var gatito = new Gato("Gringo", "naranjoso");
        gatito.maullarycomer();;
        gatito.hacerSonido();

        var perro = new Perro("Rex", "Pastor Alemán");
        perro.comer();
        perro.hacerSonido();


    }
}
