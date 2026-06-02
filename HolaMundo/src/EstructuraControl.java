import java.util.Scanner;

public class EstructuraControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cual es tu edad: ");
        int edad = sc.nextInt();

        // Condicionales
        if(edad >= 18){
            System.out.println("Es mayor de edad");
        } else if (edad >= 13) {
            System.out.println("Es adolescente");
        } else {
            System.out.println("Es un niño");
        }

        // Switch
        System.out.print("Ingrese un número del 1 al 7:");
        int dia = sc.nextInt();

        switch(dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6,7:
                System.out.println("Finde");
                break;
            default:
                System.out.println("Ingrese un número valido");

        }
    }

}