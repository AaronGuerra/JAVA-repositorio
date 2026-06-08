import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // ---- Paso 1: Crear el ArrayList ----
        Scanner consola = new Scanner(System.in);
        List<String> frutas = new ArrayList<>();

        // ---- Paso 2: Preguntar cuántas frutas registrar ----
        System.out.print("¿Cuántas frutas quiere agregar? ");
        int cantidad = consola.nextInt();
        consola.nextLine();

        // ---- Paso 3: Pide cada fruta y agregarla a la lista ----
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre de la fruta " + (i + 1) + ": ");
            String fruta = consola.nextLine(); // Declaramos la variable aquí dentro

            // Agregamos el producto al ArrayList
            frutas.add(fruta);
        }

        System.out.println("\n--- Registro Completado ---");

        // ---- Paso 4: Mostrar todas las frutas registradas ----
        System.out.println("Productos en la lista:");
        // Corregido: Se añade "String" antes de "prod"
        for (String fruits : frutas) {
            System.out.println("- " + fruits);
        }

        // ---- Paso 5: Mostrar cuántos productos fueron ingresados ----
        int totalFrutas = frutas.size();
        System.out.println("\nTotal de frutas ingresados: " + totalFrutas);

        // ---- Paso 6: Reemplazar una fruta existente ----
        System.out.println("\n--- Modificación de Frutas ---");
        System.out.print("¿Qué fruta desea reemplazar? ");
        String frutaAEmplazar = consola.nextLine();

        // Buscamos si la fruta existe en la lista
        int indice = frutas.indexOf(frutaAEmplazar);

        if (indice != -1) { // .indexOf devuelve -1 si no encuentra el elemento
            System.out.print("Ingrese el nombre de la nueva fruta: ");
            String nuevaFruta = consola.nextLine();

            // Reemplazamos en el índice encontrado
            frutas.set(indice, nuevaFruta);
            System.out.println("¡Fruta reemplazada con éxito!");
        } else {
            System.out.println("La fruta '" + frutaAEmplazar + "' no se encuentra en la lista.");
        }

        // ---- Paso 7: Eliminar una fruta existente ----
        System.out.println("\n--- Eliminación de Frutas ---");
        System.out.print("¿Qué fruta desea eliminar? ");
        String frutaAEliminar = consola.nextLine();

        // .remove() devuelve true si encontró y borró la fruta, o false si no existía
        boolean eliminada = frutas.remove(frutaAEliminar);

        if (eliminada) {
            System.out.println("¡Fruta eliminada con éxito!");
        } else {
            System.out.println("La fruta '" + frutaAEliminar + "' no se pudo eliminar porque no existe.");
        }

        // ---- Paso 8: Mostrar estado final de la lista ----
        System.out.println("\n--- Lista Final de Frutas ---");
        for (String fruits : frutas) {
            System.out.println("- " + fruits);
        }
        System.out.println("Total de frutas final: " + frutas.size());



        consola.close();

    }
}