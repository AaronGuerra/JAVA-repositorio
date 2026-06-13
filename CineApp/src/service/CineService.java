package service;

import model.*;
import util.ConsolaUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CineService {
    // Migración a Maps para cumplir el BONUS y optimizar el Pool de datos
    private Map<String, Cliente> poolClientes;
    private Map<String, Pelicula> poolPeliculas;
    private List<Funcion> funciones; // Las funciones se mantienen en lista por sus horarios variados

    public CineService() {
        this.poolClientes = new HashMap<>();
        this.poolPeliculas = new HashMap<>();
        this.funciones = new ArrayList<>();
        cargarDatosDemostracion();
    }

    private void cargarDatosDemostracion() {
        Pelicula p1 = new Pelicula("Toy Story 2", 95, 0);
        Pelicula p2 = new Pelicula("Deadpool and Wolverine", 108, 18);

        // Almacenamos usando el título en minúsculas como clave para evitar problemas de mayúsculas
        poolPeliculas.put(p1.getTitulo().toLowerCase(), p1);
        poolPeliculas.put(p2.getTitulo().toLowerCase(), p2);

        funciones.add(new Funcion(p1, "14:00", 7)); // Sala pequeña para pruebas
        funciones.add(new Funcion(p2, "22:00", 7));

        // Cliente semilla para pruebas rápidas
        poolClientes.put("aaron", new Cliente("Aarón", 34));
        poolClientes.put("sara", new Cliente("Sara", 33));
        poolClientes.put("jona", new Cliente("Jonatán", 31));
        poolClientes.put("joel", new Cliente("Joel", 27));
        poolClientes.put("samuel", new Cliente("Samuel", 21));
        poolClientes.put("daniel", new Cliente("Daniel", 19));
    }

    public void iniciarMenu() {
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("\n--- 🎬 SISTEMA DE CINE (POOL CON MAPS) ---");
            System.out.println("1) Registrar cliente");
            System.out.println("2) Agregar película a la cartelera (Pool)");
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
                    ConsolaUtil.cerrarScanner();
                }
                default -> System.out.println("⚠️ Opción inválida.");
            }
        }
    }

    private void crearCliente() {
        String nombre = ConsolaUtil.leerTexto("Ingrese el nombre del cliente: ");
        String llave = nombre.toLowerCase();

        // Validación instantánea gracias al Map
        if (poolClientes.containsKey(llave)) {
            System.out.println("⚠️ Ya existe un cliente registrado con ese nombre.");
            ConsolaUtil.esperarEnter();
            return;
        }

        int edad = ConsolaUtil.leerEntero("Ingrese la edad del cliente: ");
        if (nombre.isEmpty() || edad < 0) {
            System.out.println("⚠️ Datos inválidos.");
            return;
        }

        poolClientes.put(llave, new Cliente(nombre, edad));
        System.out.println("✅ Cliente registrado con éxito en el pool.");
    }

    private void agregarPelicula() {
        String titulo = ConsolaUtil.leerTexto("Título de la película: ");
        String llave = titulo.toLowerCase();

        if (poolPeliculas.containsKey(llave)) {
            System.out.println("⚠️ Esta película ya existe en el pool de la cartelera.");
            ConsolaUtil.esperarEnter();
            return;
        }

        int duracion = ConsolaUtil.leerEntero("Duración en minutos: ");
        int edadMinima = ConsolaUtil.leerEntero("Edad mínima requerida (0 para ATP): ");

        if (titulo.isEmpty() || duracion <= 0 || edadMinima < 0) {
            System.out.println("⚠️ Datos de película inválidos.");
            return;
        }

        poolPeliculas.put(llave, new Pelicula(titulo, duracion, edadMinima));
        System.out.println("✅ Película agregada al pool de la cartelera.");
    }

    private void crearFuncion() {
        if (poolPeliculas.isEmpty()) {
            System.out.println("⚠️ No hay películas en el pool para crear una función.");
            return;
        }

        System.out.println("\n--- PELÍCULAS DISPONIBLES EN POOL ---");
        // Recorremos los valores del mapa directamente
        for (Pelicula p : poolPeliculas.values()) {
            System.out.println("- " + p.obtenerInformacion());
        }

        String titulo = ConsolaUtil.leerTexto("Escriba el título exacto de la película para la función: ");
        Pelicula peliculaSeleccionada = poolPeliculas.get(titulo.toLowerCase());

        if (peliculaSeleccionada == null) {
            System.out.println("❌ Película no encontrada en el pool.");
            ConsolaUtil.esperarEnter();
            return;
        }

        String horario = ConsolaUtil.leerTexto("Ingrese el horario (ej. 19:30): ");
        int capacity = ConsolaUtil.leerEntero("Capacidad de la sala: ");

        funciones.add(new Funcion(peliculaSeleccionada, horario, capacity));
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
        if (poolClientes.isEmpty() || funciones.isEmpty()) {
            System.out.println("⚠️ Se requieren clientes y funciones en el sistema.");
            return;
        }

        verCarteleraFunciones();
        int indiceFuncion = ConsolaUtil.leerEntero("Seleccione el número de función: ") - 1;
        if (indiceFuncion < 0 || indiceFuncion >= funciones.size()) return;
        Funcion funcionSeleccionada = funciones.get(indiceFuncion);

        if (funcionSeleccionada.getAsientosDisponibles() <= 0) {
            System.out.println("❌ Sala llena.");
            return;
        }

        // Búsqueda directa de cliente por su clave
        String nombreCliente = ConsolaUtil.leerTexto("Ingrese el nombre del cliente que compra: ");
        Cliente clienteSeleccionado = poolClientes.get(nombreCliente.toLowerCase());

        if (clienteSeleccionado == null) {
            System.out.println("❌ El cliente no está registrado en el sistema.");
            ConsolaUtil.esperarEnter();
            return;
        }

        if (!funcionSeleccionada.validarAccesoCliente(clienteSeleccionado)) {
            System.out.printf("❌ Acceso Denegado: %s tiene %d años. Película requiere un mínimo de %d años.\n",
                    clienteSeleccionado.getNombre(), clienteSeleccionado.getEdad(), funcionSeleccionada.getPelicula().getEdadMinima());
            ConsolaUtil.esperarEnter();
            return;
        }

        int numeroAsiento = ConsolaUtil.leerEntero("Número de asiento: ");
        if (!funcionSeleccionada.verificarAsientoDisponible(numeroAsiento)) {
            System.out.println("❌ Asiento no disponible.");
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
        ConsolaUtil.esperarEnter();
    }

    private void verEntradasCliente() {
        if (poolClientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
            return;
        }

        String nombreCliente = ConsolaUtil.leerTexto("Ingrese el nombre del cliente a consultar: ");
        Cliente c = poolClientes.get(nombreCliente.toLowerCase());

        if (c == null) {
            System.out.println("❌ Cliente no encontrado.");
            ConsolaUtil.esperarEnter();
            return;
        }

        if (c.getEntradas().isEmpty()) {
            System.out.println("Este cliente no posee tickets asociados.");
        } else {
            System.out.printf("\n🎟️ Tickets de %s:\n", c.getNombre());
            for (Entrada e : c.getEntradas()) {
                System.out.println(e.mostrarResumen());
            }
        }
        //Agregamos la pausa al final de la lectura de datos
        ConsolaUtil.esperarEnter();
    }
}