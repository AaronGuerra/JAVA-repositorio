import java.util.Scanner;

public class Bucles {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            System.out.print(i);
        }

        System.out.println(" ");

        int i = 1;
        while(i <= 5){
            System.out.println(i);
            i++;
        }

        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Ingresa un número: ");
            int numero = sc.nextInt();
            System.out.println("Excelente, tu número es: " + numero);
        } catch(Exception e){
            System.out.println("Ingresa un número valido");
        }


    }
}