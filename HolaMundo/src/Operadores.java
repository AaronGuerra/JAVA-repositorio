public class Operadores {
    public static void main(String[] args) {
        // Aritmeticos
        System.out.println(3+2);
        System.out.println(3-2);
        System.out.println(3*2);
        System.out.println(3/2);
        System.out.println(3%2);

        // Operadores de asignación
        int num1 = 35;
        num1 += 3; // num1 = num1 +3
        num1 *= 4; // num1 = num1 *4
        num1 /= 2; // num1 = num1 /2
        num1 %= 2; // num1 = num1 %2
        System.out.println(num1);

        // Operadores de comparación
        System.out.println(2 > 4);
        System.out.println(2 >= 4);
        System.out.println(2 < 4);
        System.out.println(2 <= 4);
        System.out.println(2 != 4);
        System.out.println(2 == 4);

        // Operadores lógicos // Tabla de la verdad
        System.out.println(true && false);
        System.out.println(true || false);

        // Operadores unarios
        int num2 = 2;
        System.out.println("num2++ = " + num2--);
        System.out.println("num2 = " + num2);
        System.out.println("++num2 = " + --num2);
        System.out.println("num2 = " + num2);


    }
}