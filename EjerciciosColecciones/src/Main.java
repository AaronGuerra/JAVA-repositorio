import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> productos = new ArrayList<>();
        Scanner consola = new Scanner(System.in);
        System.out.println("Cuántos productos quiere agregar? ");
        int cantidad = consola.nextInt();
        String producto = consola.nextLine();
        System.out.println("Ingrese un producto: ");
        System.out.println("Productos: " + producto);
    }
}
