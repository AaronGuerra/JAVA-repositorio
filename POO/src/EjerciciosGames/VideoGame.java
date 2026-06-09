package EjerciciosGames;

public class VideoGame {
    protected String nombre;
    protected String genero;
    protected int precio;

    //Constructor
    public VideoGame(String nombre, String genero, int precio) {
        this.nombre = nombre;
        this.genero = genero;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public int getPrecio() {
        return precio;
    }





    public void setPrecio(int precio) {
        if (precio <= 0) {
            this.precio = getPrecio();
            System.out.println("Error: Precio ingresado inválido, es menor a 0. Ajustando de nuevo al precio original.");
        } else {
            this.precio = precio;
        }
    }


    // Método llamado showInfo() para mostrar los datos
    public void showInfo(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Género: " + this.genero);
        System.out.println("Precio: " + this.precio);
        System.out.println("-------------------------------------------------");
    }


}
