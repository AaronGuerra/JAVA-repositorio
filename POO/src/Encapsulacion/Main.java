package Encapsulacion;

public class Main {
    public static void main(String[] args) {

    var persona1 = new Persona("Samuel", 21, "12345678-9");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad() + " años.");
        System.out.println("RUT: " + persona1.getRut());

        persona1.setNombre("Ezequiel");
        persona1.setEdad(6);

        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad() + " meses.");






    }
}
