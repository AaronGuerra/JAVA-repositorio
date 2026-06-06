import java.util.*;


public class Main {
    public static void main(String[] args) {

        System.out.println("Ejercicio 1: ArrayList - Registro de Productos");
        // ---- Paso 1: Crear el ArrayList ----
        List<String> productos = new ArrayList<>();
        Scanner consola = new Scanner(System.in);

        // ---- Paso 2: Preguntar cuántos productos registrar ----
        System.out.print("¿Cuántos productos quiere agregar? ");
        int cantidad = consola.nextInt();
        consola.nextLine(); // Limpiar el buffer del scanner (¡Excelente que lo hayas puesto!)

        // ---- Paso 3: Pide cada producto y agregarlo a la lista ----
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
            String producto = consola.nextLine(); // Declaramos la variable aquí dentro

            // Agregamos el producto al ArrayList
            productos.add(producto);
        }

        System.out.println("\n--- Registro Completado ---");

        // ---- Paso 4: Mostrar todos los productos registrados ----
        System.out.println("Productos en la lista:");
        // Corregido: Se añade "String" antes de "prod"
        for (String prod : productos) {
            System.out.println("- " + prod);
        }

        // ---- Paso 5: Mostrar cuántos productos fueron ingresados ----
        int totalProductos = productos.size();
        System.out.println("\nTotal de productos ingresados: " + totalProductos);


        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Ejercicio 2: Set - Registro de Usuarios Únicos");

// ---- "Base de Datos" de usuarios ya guardados anteriormente ----
        Set<String> usuariosExistentes = new HashSet<>();
        usuariosExistentes.add("Javier");
        usuariosExistentes.add("Ezequiel");
        usuariosExistentes.add("Pepito");


        // Mostramos al usuario lo que ya está guardado para que sirva de referencia
        System.out.println("=== Usuarios ya registrados en el sistema ===");
        for (String existente : usuariosExistentes) {
            System.out.println("• " + existente);
        }
        System.out.println("=============================================\n");

        // ---- Paso 2: Preguntar cuántos nuevos usuarios registrar ----
        System.out.print("¿Cuántos usuarios nuevos desea registrar? ");
        int userCantidad = consola.nextInt();
        consola.nextLine(); // Limpiar el buffer

        // ---- Paso 3: Solicitar cada usuario y comparar ----
        for (int i = 0; i < userCantidad; i++) {
            System.out.print("Ingrese el nombre del usuario nuevo " + (i + 1) + ": ");
            String nuevoUsuario = consola.nextLine();

            // Aquí ocurre la magia del boolean:
            // .contains() verifica si el elemento YA EXISTE en los guardados.
            boolean yaExiste = usuariosExistentes.contains(nuevoUsuario);

            if (yaExiste) {
                // Si el boolean es verdadero, significa que está repetido con los guardados
                System.out.println("Usuario repetido");
            } else {
                // Si no existe, lo guardamos exitosamente en nuestro Set
                usuariosExistentes.add(nuevoUsuario);
                System.out.println("¡Usuario registrado con éxito!");
            }
        }

        System.out.println("\n--- Registro Completado ---");

        // ---- Paso 6: Mostrar todos los usuarios únicos registrados (viejos + nuevos) ----
        System.out.println("Paso 6: Mostrar todos los usuarios únicos registrados.");
        for (String usu : usuariosExistentes) {
            System.out.println("- " + usu);
        }

        // ---- Paso 7: Mostrar cuántos usuarios únicos existen en total ----
        System.out.println("\nPaso 7: Mostrar cuántos usuarios únicos existen.");
        int totalUnicos = usuariosExistentes.size();
        System.out.println("Cantidad total de usuarios únicos en el sistema: " + totalUnicos);

        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Ejercicio 3: Map - Agenda Telefónica");

        // Paso 1: Crear un HashMap<String, String> (Clave: Nombre, Valor: Teléfono)
        Map<String, String> contactos = new HashMap<>();

        // Paso 2 y 3: Registrar 5 contactos y guardarlos en el Map
        System.out.println("--- Registro de 5 Contactos ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("\nContacto " + i + ":");
            System.out.print("Ingrese el nombre: ");
            String nombre = consola.nextLine();

            System.out.print("Ingrese el teléfono: ");
            String telefono = consola.nextLine();

            // Guardar la información en el Map usando el método put()
            contactos.put(nombre, telefono);
        }

        // Paso 4: Mostrar todos los contactos registrados
        System.out.println("\n--- Lista de Contactos Registrados ---");
        // Recorremos el Map usando Map.Entry para obtener clave y valor simultáneamente
        for (Map.Entry<String, String> contacto : contactos.entrySet()) {
            System.out.println("Nombre: " + contacto.getKey() + " | Teléfono: " + contacto.getValue());
        }

        // Paso 5: Solicitar un nombre para buscar
        System.out.println("\n--- Búsqueda de Contacto ---");
        System.out.print("Ingrese el nombre del contacto que desea buscar: ");
        String nombreBuscar = consola.nextLine();

        // Paso 6: Mostrar el teléfono asociado a ese nombre
        // Validamos si la clave existe antes de intentar mostrarla
        if (contactos.containsKey(nombreBuscar)) {
            String telefonoEncontrado = contactos.get(nombreBuscar);
            System.out.println("El teléfono de " + nombreBuscar + " es: " + telefonoEncontrado);
        } else {
            System.out.println("Lo sentimos, el contacto '" + nombreBuscar + "' no existe en la agenda.");
        }

        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Ejercicio 4: Stream - Filtrar Notas Aprobadas");

        List<Double> notas = new ArrayList<>();
        notas.add(2.5);
        notas.add(3.7);
        notas.add(4.2);
        notas.add(6.9);
        notas.add(5.5);
        notas.add(5.8);
        notas.add(6.7);
        notas.add(6.5);
        notas.add(6.3);
        notas.add(7.0);

        // Paso 4: Contar cuántas notas aprobadas existen
        long cantidadAprobadas = notas.stream()
                                                .filter(nota -> nota > 4.0) // Filtra las notas mayores a 4.0
                                                .count();// Cuenta cuántas pasaron el filtro

        System.out.println("Cantidad de notas aprobadas: " + cantidadAprobadas);




    }
}
