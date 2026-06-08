package Introduccion;

public class Main {
    public static void main(String[] args) {

        var persona1 = new Persona("Ezequiel", 25,"eze@gmail.com");
        System.out.println(persona1.nombre + " " + persona1.edad);

        persona1.presentarse();
        persona1.infoPersona();

        // Modificador de acceso
        //public
        //private
        //default
        //protected



    }



}






