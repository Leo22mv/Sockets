package logica;

import Sockets.Cliente;
import java.io.IOException;

public class SocketCliente {
    
    public static void main (String[] args) throws IOException {
        Cliente cliente = new Cliente(); // Se crea el cliente
        System.out.println("Iniciando cliente... \n");
        cliente.startClient(); // Se inicia el cliente
    }
    
}
