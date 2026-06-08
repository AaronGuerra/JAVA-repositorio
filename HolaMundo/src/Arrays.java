public class Arrays {
    public static void main(String[] args) {
       int[] numeros = new int[8]; // Valores en 0 por Default
       String[] nombres = new String[8]; // Valores en null por Default
       String[] usuarios = {"Ernesto", "Silvia", "Aarón", "Sara", "Jonatán", "Joel", "Samuel", "Daniel"};

       System.out.println("Usuario en la posición 6 del Array:");
       System.out.println(usuarios[6]);
       System.out.println("-------------------------------------------------------------");
       numeros[0] = 60;
       numeros[1] = 59;
       numeros[2] = 34;
       numeros[3] = 32;
       numeros[4] = 30;
       numeros[5] = 27;
       numeros[6] = 20;
       numeros[7] = 18;


       for (int i = 0; i < numeros.length; i++){
            System.out.println(usuarios[i] + ": " + numeros[i]);
       }

        numeros[numeros.length-1] = 19;
        System.out.println("Se cambió la edad de " + usuarios[7] + " a: " + numeros[7]);
        numeros[numeros.length-1] = 18;
        System.out.println("Se cambió otra vez la edad de " + usuarios[7] + " a: " + numeros[7]);

       int tamanio = numeros.length;
       System.out.println("El largo del Array es: " +tamanio);

    }
}
