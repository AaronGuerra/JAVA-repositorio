package service;

import model.*;       // Esto trae a Cliente, Mascota, Perro y Gato
import util.InputUtil; // Esto trae la utilidad del teclado

// 👇 ¡ESTOS SON LOS IMPORTS QUE TE FALTAN PARA ARREGLAR EL ERROR! 👇
import interfaces.Adoptable;
import interfaces.Entrenable;

// También las colecciones de Java
import java.util.ArrayList;
import java.util.List;

public class RefugioService{

    // Colección en memoria para almacenar a los clientes
    private List<Cliente> clientes = new ArrayList<>();

    public void iniciar() {
        boolean salir = false;

        while (!salir) {
            System.out.println("\n=======================");
            System.out.println("   🐾 REFUGIO ANIMAL 🐾 ");
            System.out.println("=======================");
            System.out.println("1) Crear cliente");
            System.out.println("2) Registrar y asociar mascota");
            System.out.println("3) Ver clientes y mascotas (Reporte)");
            System.out.println("0) Salir");
            System.out.println("=======================");

            // Usamos nuestra clase utilitaria
            int op = InputUtil.leerInt("Seleccione una opción: ");

            switch (op) {
                case 1 -> crearCliente();
                case 2 -> registrarMascota();
                case 3 -> mostrarDatos();
                case 0 -> {
                    System.out.println("Saliendo del sistema... ¡Buen trabajo, dev!");
                    salir = true;
                }
                default -> System.out.println("⚠️ Opción inválida. Intente de nuevo.");
            }
        }
    }

    private void crearCliente() {
        System.out.println("\n--- [Nuevo Cliente] ---");
        String nombre = InputUtil.leerString("Nombre del cliente: ");

        // Validación de negocio de nivel Senior: evitar duplicados por nombre
        for (Cliente c : clientes) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("⚠️ Error: Ya existe un cliente registrado con ese nombre.");
                return;
            }
        }

        Cliente nuevoCliente = new Cliente(nombre);
        clientes.add(nuevoCliente);
        System.out.println("✅ Cliente '" + nombre + "' registrado con éxito.");
        InputUtil.esperarEnter();
    }

    private void registrarMascota() {
        System.out.println("\n--- [Registrar Mascota] ---");
        if (clientes.isEmpty()) {
            System.out.println("⚠️ Error: No hay clientes en el sistema. Registre un cliente primero.");
            return;
        }

        // Mostrar clientes disponibles para asociar
        System.out.println("Clientes disponibles:");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((i + 1) + ") " + clientes.get(i).getNombre());
        }

        int indiceCliente = InputUtil.leerInt("Seleccione el número del dueño: ") - 1;

        // Validación de límites del índice del Array
        if (indiceCliente < 0 || indiceCliente >= clientes.size()) {
            System.out.println("⚠️ Error: Selección de cliente inválida.");
            return;
        }

        Cliente dueño = clientes.get(indiceCliente);

        String nombreMascota = InputUtil.leerString("Nombre de la mascota: ");

        // Validación de edad (Nivel 1 de las actividades sugeridas)
        int edad = -1;
        while (edad < 0) {
            edad = InputUtil.leerInt("Edad de la mascota (años): ");
            if (edad < 0) {
                System.out.println("⚠️ Error: La edad no puede ser negativa.");
            }
        }

        System.out.println("Tipo de mascota: 1) Perro | 2) Gato");
        int tipo = InputUtil.leerInt("Seleccione tipo: ");

        Mascota nuevaMascota;
        if (tipo == 1) {
            nuevaMascota = new Perro(nombreMascota, edad);
        } else if (tipo == 2) {
            nuevaMascota = new Gato(nombreMascota, edad);
        } else {
            System.out.println("⚠️ Tipo inválido. Operación cancelada.");
            return;
        }

        // Asociar la mascota al cliente seleccionado
        dueño.agregarMascota(nuevaMascota);
        System.out.println("✅ '" + nombreMascota + "' ha sido asociado/a a " + dueño.getNombre() + ".");
        InputUtil.esperarEnter();
    }

    private void mostrarDatos() {
        System.out.println("\n--- [Reporte General del Refugio] ---");
        if (clientes.isEmpty()) {
            System.out.println("No hay datos que mostrar.");
            return;
        }

        for (Cliente c : clientes) {
            System.out.println("\n👤 Cliente: " + c.getNombre());
            List<Mascota> listaMascotas = c.getMascotas();

            if (listaMascotas.isEmpty()) {
                System.out.println("   └─ (No tiene mascotas asignadas aún)");
            } else {
                for (Mascota m : listaMascotas) {
                    System.out.print("   └─ 🐾 ");
                    m.mostrarInfo(); // Polimorfismo dinámico heredado
                    System.out.print("      Sonido: ");
                    m.hacerSonido(); // Polimorfismo puro

                    // Polimorfismo avanzado usando Interfaces e instanceof
                    if (m instanceof Adoptable) {
                        System.out.println("      Adopción: " + ((Adoptable) m).datosAdopcion());
                    }
                    if (m instanceof Entrenable) {
                        System.out.print("      Entrenamiento: ");
                        ((Entrenable) m).entrenar();
                    }
                }
            }
        }
        // 👇 ¡AQUÍ ESTÁ EL TRUCO SENIOR! 👇
        System.out.println("\n=======================================");
        System.out.println("👉 Presione ENTER para volver al menú principal...");
        System.out.println("=======================================");

        // Llamamos a nuestro utilitario. Como se queda esperando un String,
        // el programa se detendrá hasta que presiones Enter.
        InputUtil.esperarEnter();
    }
}