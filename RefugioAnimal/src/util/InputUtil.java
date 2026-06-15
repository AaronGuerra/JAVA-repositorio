package util;

import java.util.Scanner;

public class InputUtil {
    // Declaramos un único Scanner estático para toda la aplicación
    private static final Scanner scanner = new Scanner(System.in);

    // Método para leer enteros de forma segura
    public static int leerInt(String mensaje){
        while (true){
            System.out.println(mensaje);
            try{
                // Leemos la línea completa como String y la transformamos a entero
                return Integer.parseInt(scanner.nextLine().trim());
            }catch (NumberFormatException e) {
                System.out.println("⚠️ Error: Debe ingresar un número entero válido.");
            }
            }
        }

    // Método para leer texto asegurando que no venga vacío
    public static String leerString(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String entrada = scanner.nextLine().trim();
            if (!entrada.isEmpty()) {
                return entrada;
            }
            System.out.println("⚠️ Error: El campo no puede estar vacío.");
        }
    }

    // Método Senior para forzar una pausa real en la consola
    public static void esperarEnter() {
        System.out.println("\n=======================================");
        System.out.println("👉 Presione ENTER para continuar...");
        System.out.println("=======================================");

        // Este nextLine() consumirá cualquier residuo y obligará a detener el programa
        scanner.nextLine();
    }

    }














