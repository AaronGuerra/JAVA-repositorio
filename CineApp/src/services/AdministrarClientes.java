package services;

import model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class AdministrarClientes {

    private List<Cliente> clientes = new ArrayList<>();

    public void crearCliente(String nombre, int edad){
        var cliente = new Cliente(nombre, edad);
        clientes.add(cliente);
    }

    public void mostrarClientes(){
        for(Cliente c : clientes){
            System.out.println(c.getNombre() + " - Edad: " + c.getEdad());
        }
    }
}

