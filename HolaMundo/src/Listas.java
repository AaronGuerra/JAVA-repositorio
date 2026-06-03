import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();

        // Agregar elementos
        nombres.add("Ernesto");
        nombres.add("Silvia");
        nombres.add("Aarón");
        nombres.add("Sara");
        nombres.add("Jonatán");
        nombres.add("Joel");
        nombres.add("Samuel");
        nombres.add("Daniel");
        nombres.add("Excelsior");
        //System.out.println(nombres);
        System.out.println("-----------------------------------------------------");

        // Acceder a los elementos
        System.out.println(nombres.get(8)); // Obtiene el primer ingresado.
        System.out.println("-----------------------------------------------------");

        // Modificar elementos
        nombres.set(8,"Aarón Esteban");
        System.out.println(nombres.getLast());
        System.out.println("-----------------------------------------------------");

        // Eliminar elementos
        nombres.remove("Aarón Esteban");
        System.out.println(nombres.getLast());
        System.out.println("-----------------------------------------------------");

        // Tamaño de la lista (dinámico) y agregar otros nuevos
        System.out.println("El tamaño de la Lista es: " + nombres.size());
        nombres.add("Javier");
        nombres.add("Ezequiel");
        System.out.println("El tamaño de la Lista es: " + nombres.size());
        System.out.println(nombres);
        System.out.println("-----------------------------------------------------");


        List<Integer> numeros = new ArrayList<>();

        for (int i = 1; i<8; i++){
            numeros.add(i);
        }
        System.out.println(numeros);
        System.out.println("-----------------------------------------------------");

        List<Integer> edad = new ArrayList<>();
        edad.add(60);
        edad.add(59);
        edad.add(34);
        edad.add(32);
        edad.add(30);
        edad.add(26);
        edad.add(20);
        edad.add(18);
        edad.add(37);
        edad.add(6);
        System.out.println(edad);
        System.out.println("-------------------------- MÉTODO 1 ---------------------------");
        for (int i = 0; i < nombres.size(); i++){
            // Idea 50% mía / 50% de la IA
            String nombre = nombres.get(i);
            int valorEdad = edad.get(i);

            if (i == nombres.size() - 1) {
                System.out.println(nombre + " tiene " + valorEdad + " meses.");
            } else {
                System.out.println(nombre + " tiene " + valorEdad + " años.");
            }

        }

        System.out.println("------------------------- MÉTODO 2 ----------------------------");

        // idea 100% IA

        // 1. Creas el molde (Clase)
        class Persona {
            String nombre;
            int edad;
            boolean esMeses; // Una bandera para saber si la edad es en meses o años

            Persona(String nombre, int edad, boolean esMeses) {
                this.nombre = nombre;
                this.edad = edad;
                this.esMeses = esMeses;
            }
        }

        // 2. Así usarías una sola lista en tu código principal
               List<Persona> personas = new ArrayList<>();
               personas.add(new Persona("Ernesto", 60, false));
               personas.add(new Persona("Silvia", 59, false));
               personas.add(new Persona("Aarón", 34, false));
               personas.add(new Persona("Sara", 32, false));
               personas.add(new Persona("Jonatán", 30, false));
               personas.add(new Persona("Joel", 26, false));
               personas.add(new Persona("Samuel", 20, false));
               personas.add(new Persona("Daniel", 18, false));
               personas.add(new Persona("Ezequiel", 6, true)); // Aquí marcas que son meses

        // 3. Tu bucle for queda limpio y seguro
               for (Persona p : personas) {
                  String unidad = p.esMeses ? "meses" : "años";
                  System.out.println(p.nombre + " tiene " + p.edad + " " + unidad + ".");
               }




    }
}
