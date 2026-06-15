package app;

import service.RefugioService;

public class Main {
    public static void main(String[] args) {
        // Instanciamos el servicio del refugio
        RefugioService refugio = new RefugioService();

        // Iniciamos el ciclo del menú principal
        refugio.iniciar();
    }
}