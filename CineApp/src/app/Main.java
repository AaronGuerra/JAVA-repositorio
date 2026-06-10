package app;

import services.AdministrarClientes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Menú
        Scanner sc = new Scanner(System.in);
        var adminClientes = new AdministrarClientes();

        int opcion;
        do{
            System.out.println("""
                    ### Sistema de cine ###
                    1. Registrar cliente
                    2. Registrar pelicula
                    3. Mostrar cliente
                    4. Mostrar pelicula
                    5. Salir      
                    """);
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion){
                case 1:
                    System.out.print("Nombre de cliente: ");
                    String nombre = sc.nextLine();
                    System.out.print("Edad del cliente: ");
                    int edad = sc.nextInt();
                    sc.nextLine(); // limpiar buffer
                    adminClientes.crearCliente(nombre, edad);
                    break;
                case 2:
                    System.out.println("Registrar peliculas");
                    break;
                case 3:
                    adminClientes.mostrarClientes();
                    break;
                case 4:
                    System.out.println("Mostrar pelicula");
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        } while(opcion != 5);

        sc.close();




    }
}
