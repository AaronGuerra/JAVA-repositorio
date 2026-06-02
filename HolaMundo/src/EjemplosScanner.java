    import java.util.Scanner;

    public class EjemplosScanner {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            System.out.print("Ingresa un número: ");
            int num = entrada.nextInt(); // 25\n
            System.out.print("Ingresa otro número: ");
            int num1 = entrada.nextInt();
            System.out.print("Ingresa un nombre: ");//Al usar String es necesario usar nextline arriba, para dar el salto de línea
            String nombre = entrada.nextLine();
            System.out.println("Resultado: " + num + ", " + nombre + " y " + num1);
        }
    }
