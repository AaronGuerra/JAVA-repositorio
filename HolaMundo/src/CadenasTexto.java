import java.util.Scanner;

public class CadenasTexto {
    public static void main(String[] args) {
        String nombre = "Aarón";
        System.out.println("Mi nombre es: " + nombre);
        System.out.println("Longitud: " + nombre.length());
        System.out.println("Caracter: " + nombre.charAt(3));
        System.out.println("minúscula: " + nombre.toLowerCase());
        System.out.println("Mayúscula: " + nombre.toUpperCase());
        System.out.println(nombre.contains("ro"));

        System.out.println(nombre == "Aarón");
        System.out.println(nombre.equals("AARÓN"));


        //Prompt de JAVA
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingresa una edad: ");
        int edad = consola.nextInt();
        System.out.println("Su edad es: " + edad);

    }
}
