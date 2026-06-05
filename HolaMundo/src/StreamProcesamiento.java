import java.util.ArrayList;
import java.util.List;

public class StreamProcesamiento {
    public static void main(String[] args) {


        List<Integer> numeros = new ArrayList<>();
        numeros.add(38);
        numeros.add(34);
        numeros.add(32);
        numeros.add(30);
        numeros.add(26);
        numeros.add(20);
        numeros.add(18);
        numeros.add(6);

        /*for (Integer numero : numeros){
            if (numero > 20) {
                System.out.println(numero);
            }
        }*/
        //System.out.println("--------------------------------------------");
        //numeros.forEach(numero -> System.out.println(numero));

        numeros.stream()
                .filter(numero -> numero >20) // Filtra
                .map(numero -> numero * 2) // Operaciones matemáticas
                .sorted()
                .limit(3)
                .forEach(System.out::println); // numero -> system.out.println(numero)

        List<String> nombres = new ArrayList<>();
        nombres.add("Javier");
        nombres.add("Aarón");
        nombres.add("Sara");
        nombres.add("Jonatán");
        nombres.add("Joel");
        nombres.add("Samuel");
        nombres.add("Daniel");
        nombres.add("Ezequiel");

        nombres.stream()
                .map(nombre -> nombre.toUpperCase())
                .forEach(System.out::println);



















    }
}
