package util;

import java.util.Scanner;

public class ConsolaUtil {
    private static Scanner scanner;

    // Inicializa el Scanner de forma única y centralizada
    private static void asegurarScanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
    }

    // Lee un texto de la consola de manera segura
    public static String leerTexto(String mensaje) {
        asegurarScanner();
        System.out.print(mensaje);
        return scanner.nextLine().trim();
    }

    // Cumple la Regla del Paso 10: Control de errores de entrada usando try/catch
    public static int leerEntero(String mensaje) {
        asegurarScanner();
        while (true) {
            System.out.print(mensaje);
            try {
                int valor = scanner.nextInt();
                scanner.nextLine(); // Limpieza crítica del salto de línea en el buffer
                return valor;
            } catch (Exception e) {
                System.out.println("⚠️ Error de entrada: Debe ingresar un número entero válido.");
                scanner.nextLine(); // Descarta la entrada inválida para evitar bucles infinitos
            }
        }
    }
    // Pausa el sistema hasta que se presione ENTER
    public static void esperarEnter() {
        asegurarScanner();
        System.out.println("\n🔹 Presione [ENTER] para continuar...");
        scanner.nextLine();
    }

    // Método para cerrar el recurso al apagar el sistema (buena práctica)
    public static void cerrarScanner() {
        if (scanner != null) {
            scanner.close();
        }
    }
}