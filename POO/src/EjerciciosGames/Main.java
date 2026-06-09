package EjerciciosGames;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- MÉTODO BÁSICO DE CREACIÓN DE CLASE SIMPLE ---");
        var juego1 = new VideoGame("Half-Life 2", "Aventura, Acción, Disparos", 12000);
        var juego2 = new VideoGame("Phantom Doctrine", "Estrategia, Combate Táctico por Turnos", 40000);

        System.out.println("Nombre: " + juego1.getNombre() + "\nGénero: " + juego1.getGenero() + "\nPrecio: " + juego1.getPrecio() + "\n");
        System.out.println("Nombre: " + juego2.getNombre() + "\nGénero: " + juego2.getGenero() + "\nPrecio: " + juego2.getPrecio());

        System.out.println("--- NUEVOS JUEGOS AGREGADOS 1 ---");
        VideoGame juego3 = new VideoGame("STAR WARS™ Battlefront™ II: Celebration Edition", "Aventura, Acción, Disparos", 31900);
        VideoGame juego4 = new VideoGame("EA SPORTS FC™ 26", "Deportes, Simulación", 80900);
        VideoGame juego5 = new VideoGame("Kingdom Come: Deliverance", "Acción, Aventura, Mundo Abierto, RPG", 23000);

        juego3.showInfo();
        juego4.showInfo();
        juego5.showInfo();

        System.out.println("--- NUEVOS JUEGOS AGREGADOS 2 CON HERENCIA ---");
        PCGame juego6 = new PCGame("Batman™: Arkham Knight", "Acción, Mundo Abierto, Superhéroes, Sigilo", 50000, "\nSISTEMA OPERATIVO: Win 7 SP1, Win 8.1 de 64 bits,\nPROCESADOR: Intel Core i5-750 a 2.67 GHz o AMD Phenom II X4 965 a 3.4 GHz.,\nMEMORIA: 6 GB de RAM, \nGRÁFICOS: NVIDIA GeForce GTX 660 o AMD Radeon HD 7870 (mínimo 2 GB de VRAM),\nDIRECTX: Versión 11, \nALMACENAMIENTO: 45 GB de espacio disponible.");
        ConsoleGame juego7 = new ConsoleGame("The Legend of Zelda Tears of the Kingdom", "Aventura, Acción", 80000, "Nintendo Switch 2");

        System.out.println("\n --- INFORMACIÓN DE LOS JUEGOS CON SHOW INFO ---");

        juego1.showInfo();
        juego2.showInfo();

        juego6.showInfo();
        juego7.showInfo();

        System.out.println("\n --- INTENTO DE CAMBIO EN EL PRECIO DE UN JUEGO CON SETTER ---");

        System.out.println("Juego: " + juego1.getNombre() + ", Precio: " + juego1.getPrecio());
        juego1.setPrecio(15000);
        System.out.println("Juego: " + juego1.getNombre() + ", Precio: " + juego1.getPrecio());
        juego2.setPrecio(0);
        System.out.println("Juego: " + juego2.getNombre() + ", Precio: " + juego2.getPrecio());
        juego5.setPrecio(0);
        System.out.println("Juego: " + juego5.getNombre() + ", Precio: " + juego5.getPrecio());
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Juego: " + juego6.getNombre() + ", Precio: " + juego6.getPrecio() + ", Requisitos: " + juego6.requisitosMinimos);
        System.out.println("\nJuego: " + juego7.getNombre() + ", Precio: " + juego7.getPrecio() + ", Consola Compatible: " + juego7.consolaCompatible);






    }
}
