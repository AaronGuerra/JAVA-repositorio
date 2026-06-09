package EjerciciosGames;

public class PCGame extends VideoGame {
    String requisitosMinimos;

    public PCGame(String nombre, String genero, int precio, String requisitosMinimos){
        super(nombre, genero, precio);
        this.requisitosMinimos = requisitosMinimos;
    }

    // Método llamado showInfo() para mostrar los datos
    @Override
    public void showInfo() {
        super.showInfo(); // Llama al showInfo() del padre para mostrar nombre, género y precio
        System.out.println("Requisitos Mínimos: " + this.requisitosMinimos);
        System.out.println("-----------------------------------------------------------------------");
    }

}
