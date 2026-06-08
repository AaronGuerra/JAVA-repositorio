import java.util.Scanner;

public class FuncionesEjercicios {
    //Funciones

    // Crear función sumar
    static int sumar(int a, int b){
        return a + b;
    }

    // Crear función restar
    static int restar(int a, int b){
        return  a - b;
    }

    // Crear función multiplicar
    static int multi(int a, int b){
        return  a * b;
    }

    // Crear función dividir
    static int dividir(int a, int b){
        if (b == 0){
            throw new ArithmeticException("No se puede dividir por 0");
        }else {
            return a / b;
        }
    }



    public static void main(String[] args) {

        // Función ingresar número por consola
        Scanner entrada = new Scanner(System.in);
        // Méthod While
        while (true){
            System.out.print("Ingrese un número: ");

            if (entrada.hasNextInt()){
                int numero = entrada.nextInt(); // Ahora sí es seguro guardarlo
                entrada.nextLine(); // Limpia el buffer (importante en Java)

                // Aquí se puede usar la variable 'número' o hacer el 'return'
                System.out.println("Número válido ingresado: " + numero);
                break; // Rompe el bucle si ya se tiene el número
            } else {
                System.out.println("Debe ingresar un número válido");
                entrada.nextLine(); // Descarta la entrada incorrecta para que no se muerda el bucle

            }
        }

        System.out.println("-----------------------------------------------------------------");








    }
}
