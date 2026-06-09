package Encapsulacion;

public class Persona {
    // Atributos
    private String nombre;
    private int edad;
    private final String RUT;
    private String correo;

    // Constructor
    public Persona(String nombre, int edad, String rut){
        this.nombre = nombre;
        setEdad(edad);
        this.RUT = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getRut() {
        return RUT;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if(edad > 0){
            this.edad = edad;
        }
    }



}
