import java.util.HashMap;
import java.util.Map;

public class collectionMap {
    public static void main(String[] args) {


        Map<String, Integer> sueldos = new HashMap<>();

        // Agregar valores
        sueldos.put("Aarón", 1700);
        sueldos.put("Sara", 800);
        sueldos.put("Jonatán", 2000);
        sueldos.put("Joel", 1200);
        sueldos.put("Javier", 1900);
        sueldos.put("Pepe", 700);

        System.out.println(sueldos);

        // Obtener un valor
        System.out.println(sueldos.get("Jonatán"));

        // Modificar valor
        sueldos.put("Jonatán", 1800);
        System.out.println(sueldos);
        sueldos.put("Sara", 1000);
        sueldos.put("Jonatán", 1900);
        System.out.println(sueldos);

        // Verificar existencia
        System.out.println(sueldos.containsKey("Jonatán"));
        System.out.println(sueldos.containsValue(2000));
        System.out.println(sueldos.containsValue(1900));

        // Eliminar un elemento
        sueldos.remove("Pepe");
        System.out.println(sueldos);

        // Tamaño
        System.out.println("El tamaño es: " + sueldos.size());

        // Recorrer valores
        for (Integer sueldo : sueldos.values()){
            System.out.println(sueldo);
        }

        // Recorrer claves
        for (String nombre : sueldos.keySet()){
            System.out.println(nombre);
        }

        // Recorrer la colección completa
        for (Map.Entry<String, Integer> InfoUsers : sueldos.entrySet()){
            System.out.println(InfoUsers.getKey());
            System.out.println(InfoUsers.getValue());
            //System.out.println(InfoUsers.getKey() + " = " + InfoUsers.getValue());
        }







    }
}
