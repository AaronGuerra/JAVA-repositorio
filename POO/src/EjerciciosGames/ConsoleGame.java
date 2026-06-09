package EjerciciosGames;

public class ConsoleGame extends VideoGame{

    String consolaCompatible;

    public ConsoleGame(String nombre, String genero, int precio, String consolaCompatible){
        super(nombre, genero, precio);

        this.consolaCompatible = consolaCompatible;
    }

    // Método llamado showInfo() para mostrar los datos
    @Override
    public void showInfo() {
        super.showInfo(); // Llama al showInfo() del padre
        System.out.println("Consola Compatible: " + this.consolaCompatible);
    }



}
