package app;

import service.CineService;

public class Main {
    public static void main(String[] args) {
        // Inicializa el servicio que a su vez se comunicará dinámicamente con util y model
        CineService service = new CineService();
        service.iniciarMenu();
    }
}