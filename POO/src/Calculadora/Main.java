package Calculadora;

public class Main {
    public static void main(String[] args) {

        var calculadora = new Operaciones();
        var resultado1 = calculadora.sumar(7,7);
        System.out.println("Suma: n1 + n2 = " + resultado1);

        var resultado2 = calculadora.sumar(3.5,3.5);
        System.out.println("Suma decimal: n1 + n2 = " + resultado2);

        var resultado3 = calculadora.restar(21,7);
        System.out.println("Resta: n1 - n2 = " + resultado3);

        var resultado4 = calculadora.restar(21.0, 7.0);
        System.out.println("Resta decimal: n1 - n2 = " + resultado4);

    }
}
