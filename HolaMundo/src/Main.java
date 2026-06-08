//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        //Comentarios de una línea
        /*Comentarios de varias líneas */

        int numero = 6;
        System.out.println("Número: " + numero);
        System.out.println("Hola Mundo, soy Ezequiel Aarón Aravena Guerra y tengo " + numero + " meses de edad.");

        int num1 = 15;
        int num2 = 19;
        int edad = (num1 + num2);

        System.out.println("Hola, me llamo Aarón Guerra, tengo " + edad + " años de edad, y soy el tío de Ezequiel.");

        int n1= 5;
        int n2= 5;
        int n3= 2;
        int edad1= ((n1 + n2) * n3);

        System.out.println("Soy Samuel, tengo " + edad1 + " años, y Aarón es mi hermano.");

        //Tipos de datos:
        byte tipoByte = 34;
        short tipoShort = 32000;
        int tipoInt = 18;
        double tipoDouble = 1.82555;
        float tipoFloat = 5.555F; //no trabajaremos con float
        boolean isReal = true;
        boolean isValido = false;
        boolean hasCarnet = false;
        char tipoChar = 'A';
        String tipoCadena = "Hola, soy Daniel Guerra";

        var variable = "Hola";
        System.out.println(variable);
        variable = "Mundo";
        System.out.println(variable);

        final double PI = 3.14; //importante trabajar las variables con mayúsculas.

        //Imprimir y concatenar
        System.out.println(tipoCadena + ", tengo " + tipoInt + " años.");
        System.out.println(" PI = " + PI);
        System.out.printf("%s, mi edad es %d, mi altura es %.2f, es %b que la letra a es %c.\n", tipoCadena, tipoInt, tipoDouble,isReal, tipoChar);


        tipoCadena = "Sara Priscila";
        tipoInt = 32;
        tipoDouble = 1.66;
        hasCarnet = true;

        System.out.printf("""
        Usuario: %s
        Edad: %d
        Altura: %.2f
        Carnet: %b
        """, tipoCadena, tipoInt, tipoDouble, hasCarnet);

          /* System.out.print("Hola Mundo");
        System.out.print("Voy a quedar pegadita arriba");

        System.out.print("Edad Kathy (" + numero + ")");
        System.out.printf("Edad Kathy (%d)", número);
        */
    }
}