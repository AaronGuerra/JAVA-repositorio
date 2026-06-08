import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Ejercicios básicos en JAVA");
        System.out.println("1 - Calcular edad por fecha");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese su año de nacimiento: ");
        int fechaNac = entrada.nextInt();
        int edadActual = 2026 - fechaNac;
        System.out.println("Hola amigos, soy " + nombre + " tengo " + edadActual + " años, porque nací en " + fechaNac);
        System.out.println("-----------------------------------------------------");

        System.out.println("2 - Convertir temperaturas");
        System.out.print("Ingresa una temperatura: ");
        double tempCel = entrada.nextDouble();
        double tempFar = (tempCel * 9/5) + 32;
        System.out.println("La temperatura en Celsius es: " + tempCel + " grados y su conversión a Fahrenheit es: " + tempFar + " grados");
        System.out.println("-----------------------------------------------------");

        System.out.println("3 - Calcular área y perímetro de un rectángulo");
        System.out.println("Ingresa la base: ");
        double base = entrada.nextDouble();
        System.out.println("Ingresa la altura: ");
        double altura = entrada.nextDouble();
        double perimetro = (base + altura) * 2;
        double area = base * altura;
        System.out.println("El área es: " + area + " y el perímetro es " + perimetro);
        System.out.println("-----------------------------------------------------");

        System.out.println("4 - Calculadora de Descuento");
        System.out.println("Ingrese un precio de un precio de un producto: ");
        double precio = entrada.nextDouble();
        System.out.println("Ingrese un descuento al producto: ");
        double descuento = entrada.nextDouble();
        double precioDes = precio * (descuento/100);
        double total = precio - precioDes;

        System.out.println("\n--- Resumen de Compra ---");
        System.out.println("Precio Original: $" + precio);
        System.out.println("Descuento Aplicado: $" + precioDes);
        System.out.println("Total a pagar: $" + total);
        System.out.println("-----------------------------------------------------");

        System.out.println("5 - Condicionales");
        System.out.println("Ingrese un número: ");
        int numCond = entrada.nextInt();

        if (numCond>0){
            System.out.println("El número es Positivo");
        }else if (numCond<0) {
            System.out.println("El número es Negativo");
        }else {
            System.out.println("El número es Cero");
        }
        System.out.println("-----------------------------------------------------");

        System.out.println("6 - Condicionales Edad");
        System.out.println("Ingrese un número: ");
        int numEdad = entrada.nextInt();

        if (numEdad>=18){
            System.out.println("Es mayor de edad");
        }else if (numEdad<17) {
            System.out.println("Es menor de edad");
        }else{
            System.out.println("Ingrese un número válido");

        }


    }
}
