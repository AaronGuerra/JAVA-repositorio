public class ColeccionesArrays {
    public static void main(String[] args) {

        int[] numeros = new int[6]; // 0 por default
        String[] nombres = new String[6]; // null por default
        String[] usuarios = {"Aarón", "Sara", "Jonatán", "Joel", "Samuel", "Daniel"};

        System.out.println(usuarios[4]);
        System.out.println("----------------------------------------------------------");
        numeros[0] = 34;
        //Muestra o imprime: System.out.println("usuarios[0] = " + numeros[0]);
        numeros[1] = 32;
        //Muestra o imprime: System.out.println("usuarios[1] = " + numeros[1]);
        numeros[2] = 30;
        //Muestra o imprime: System.out.println("usuarios[2] = " + numeros[2]);
        numeros[3] = 26;
        //Muestra o imprime: System.out.println("usuarios[3] = " + numeros[3]);
        numeros[4] = 20;
        //Muestra o imprime: System.out.println("usuarios[4] = " + numeros[4]);
        numeros[5] = 18;
        //Muestra o imprime: System.out.println("usuarios[5] = " + numeros[5]);


        for (int i = 0; i < numeros.length; i++){
            System.out.println( usuarios[i] + " tiene: " + numeros[i] + " años.");
        }

        int tamanio = numeros.length;
        System.out.println("El largo del Array es= " + tamanio);

        System.out.println("----------------------------------------------------------");

        numeros[numeros.length-1] = 19;

        for (int i = 0; i < numeros.length; i++){
            System.out.println( usuarios[i] + " tiene: " + numeros[i] + " años.");
        }



    }
}
