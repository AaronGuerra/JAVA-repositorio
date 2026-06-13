package service;

import model.*;
import util.ConsolaUtil; // Importación de nuestra nueva capa de utilidades
import java.util.ArrayList;
import java.util.List;

public class CineService {
    private List<Cliente> clientes;
    private List<Funcion> funciones;
    private List<Pelicula> carteleraPeliculas;

    public CineService() {
        this.clientes = new ArrayList<>();
        this.funciones = new ArrayList<>();
        this.carteleraPeliculas = new ArrayList<>();
        cargarDatosDemostracion();
    }

    private void cargarDatosDemostracion() {
        Pelicula p1 = new Pelicula("Toy Story", 95, 0);
        Pelicula p2 = new Pelicula("Deadpool", 108, 18);
        carteleraPeliculas.add(p1);
        carteleraPeliculas.add(p2);

        funciones.add(new Funcion(p1, "14:00", 3)); // Sala pequeña para pruebas
        funciones.add(new Funcion(p2, "22:00", 5));
    }

    public void iniciarMenu() {
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("\n--- 🎬 GESTIÓN DE CINE (ESTRUCTURA MÓDULO UTIL) ---");
            System.out.println("1) Registrar cliente");
            System.out.println("2) Agregar película a la cartelera");
            System.out.println("3) Crear función para una película");
            System.out.println("4) Ver cartelera de funciones");
            System.out.println("5) Comprar entrada");
            System.out.println("6) Ver entradas del cliente");
            System.out.println("0) Salir");
            opcion = ConsolaUtil.leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1 -> crearCliente();
                case 2 -> agregarPelicula();
                case 3 -> crearFuncion();
                case 4 -> verCarteleraFunciones();
                case 5 -> comprarEntrada();
                case 6 -> verEntradasCliente();
                case 0 -> {
                    System.out.println("Saliendo del sistema...");
                    ConsolaUtil.cerrarScanner(); // Cierre limpio del recurso global
                }
                default -> System.out.println("⚠️ Opción inválida.");
            }
        }
    }

    private void crearCliente() {
        String nombre = ConsolaUtil.leerTexto("Ingrese el nombre del cliente: ");
        int edad = ConsolaUtil.leerEntero("Ingrese la edad del cliente: ");

        if (nombre.isEmpty() || edad < 0) {
            System.out.println("⚠️ Datos inválidos.");
            return;
        }
        clientes.add(new Cliente(nombre, edad));
        System.out.println("✅ Cliente registrado con éxito.");
    }

    private void agregarPelicula() {
        String titulo = ConsolaUtil.leerTexto("Título de la película: ");
        int duracion = ConsolaUtil.leerEntero("Duración en minutos: ");
        int edadMinima = ConsolaUtil.leerEntero("Edad mínima requerida (0 para ATP): ");

        if (titulo.isEmpty() || duracion <= 0 || edadMinima < 0) {
            System.out.println("⚠️ Datos de película inválidos.");
            return;
        }
        carteleraPeliculas.add(new Pelicula(titulo, duracion, edadMinima));
        System.out.println("✅ Película agregada al catálogo global.");
    }

    private void crearFuncion() {
        if (carteleraPeliculas.isEmpty()) {
            System.out.println("⚠️ No hay películas disponibles en el catálogo.");
            return;
        }
        System.out.println("\n--- SELECCIONE UNA PELÍCULA ---");
        for (int i = 0; i < carteleraPeliculas.size(); i++) {
            System.out.printf("[%d] %s\n", i + 1, carteleraPeliculas.get(i).obtenerInformacion());
        }
        int indicePel = ConsolaUtil.leerEntero("Número de película: ") - 1;
        if (indicePel < 0 || indicePel >= carteleraPeliculas.size()) return;

        String horario = ConsolaUtil.leerTexto("Ingrese el horario (ej. 19:30): ");
        int capacidad = ConsolaUtil.leerEntero("Capacidad de la sala: ");

        funciones.add(new Funcion(carteleraPeliculas.get(indicePel), horario, capacidad));
        System.out.println("✅ Función creada exitosamente.");
    }

    private void verCarteleraFunciones() {
        if (funciones.isEmpty()) {
            System.out.println("No hay funciones programadas.");
            return;
        }
        System.out.println("\n--- CARTELERA DE FUNCIONES ---");
        for (int i = 0; i < funciones.size(); i++) {
            Funcion f = funciones.get(i);
            System.out.printf("[%d] %s | Hora: %s | Asientos Libres: %d\n",
                    i + 1, f.getPelicula().obtenerInformacion(), f.getHorario(), f.getAsientosDisponibles());
        }
    }

    private void comprarEntrada() {
        if (clientes.isEmpty() || funciones.isEmpty()) {
            System.out.println("⚠️ Requieres clientes y funciones en el sistema.");
            return;
        }

        verCarteleraFunciones();
        int indiceFuncion = ConsolaUtil.leerEntero("Seleccione la función: ") - 1;
        if (indiceFuncion < 0 || indiceFuncion >= funciones.size()) return;
        Funcion funcionSeleccionada = funciones.get(indiceFuncion);

        // Regla de negocio: Validación de capacidad disponible de sala
        if (funcionSeleccionada.getAsientosDisponibles() <= 0) {
            System.out.println("❌ Compra rechazada: La sala de esta función está llena.");
            return;
        }

        System.out.println("\n--- SELECCIONE CLIENTE ---");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.printf("[%d] %s (Edad: %d)\n", i + 1, clientes.get(i).getNombre(), clientes.get(i).getEdad());
        }
        int indiceCliente = ConsolaUtil.leerEntero("Número de cliente: ") - 1;
        if (indiceCliente < 0 || indiceCliente >= clientes.size()) return;
        Cliente clienteSeleccionado = clientes.get(indiceCliente);

        // Regla de negocio: Validación de la restricción de edad
        if (!funcionSeleccionada.validarAccesoCliente(clienteSeleccionado)) {
            System.out.printf("❌ Acceso Denegado: %s tiene %d años. Película requiere un mínimo de %d años.\n",
                    clienteSeleccionado.getNombre(), clienteSeleccionado.getEdad(), funcionSeleccionada.getPelicula().getEdadMinima());
            return;
        }

        int numeroAsiento = ConsolaUtil.leerEntero("Número de asiento: ");
        // Regla de negocio: Evitar venta duplicada de un mismo asiento físico
        if (!funcionSeleccionada.verificarAsientoDisponible(numeroAsiento)) {
            System.out.println("❌ Error: El asiento ya se encuentra vendido o está fuera del rango de la sala.");
            return;
        }

        System.out.println("Tipo de Entrada: 1) Normal  2) Estudiante");
        int tipo = ConsolaUtil.leerEntero("Selección: ");

        Entrada nuevaEntrada = (tipo == 2)
                ? new EntradaEstudiante(clienteSeleccionado, funcionSeleccionada, numeroAsiento)
                : new Entrada(clienteSeleccionado, funcionSeleccionada, numeroAsiento);

        funcionSeleccionada.registrarVentaAsiento(nuevaEntrada);
        clienteSeleccionado.agregarEntrada(nuevaEntrada);

        System.out.println("\n🎉 ¡Entrada comprada con éxito!\n" + nuevaEntrada.mostrarResumen());
    }

    private void verEntradasCliente() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
            return;
        }
        for (int i = 0; i < clientes.size(); i++) {
            System.out.printf("[%d] %s\n", i + 1, clientes.get(i).getNombre());
        }
        int idx = ConsolaUtil.leerEntero("Seleccione cliente: ") - 1;
        if (idx < 0 || idx >= clientes.size()) return;

        Cliente c = clientes.get(idx);
        if (c.getEntradas().isEmpty()) {
            System.out.println("Este cliente no posee tickets asociados.");
        } else {
            System.out.printf("\n🎟️ Tickets de %s:\n", c.getNombre());
            for (Entrada e : c.getEntradas()) {
                System.out.println(e.mostrarResumen());
            }
        }
    }
}