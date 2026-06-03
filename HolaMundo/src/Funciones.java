import java.util.Scanner;

public class Funciones {
    // Crear nueva función que imprima un mensaje
    static void impresion(String mensaje){
        System.out.println("Mensaje: " + mensaje);
    }

    // Crear función sumar
    static int sumar(int a, int b){
        return a + b;
    }

    // Crear función sin parámetros
    static void saludarC25(){
        System.out.println("Hola Cohorte 25");
    }

    // Crear una función esPar
    static boolean esPar(int numero){
        if(numero % 2 == 0){
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un mensaje: ");
        String mensajeIngresado = sc.nextLine();
        impresion(mensajeIngresado);

        System.out.print("Ingrese un número: ");
        var num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese otro número: ");
        int num2 = sc.nextInt();

        System.out.println("Resultado: "+ sumar(num1, num2) );

        System.out.printf("Su número %d es par: %b \n", num1, esPar(num1));





        saludarC25();

    }

}