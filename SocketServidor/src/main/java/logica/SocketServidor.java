package logica;

import Sockets.Servidor;
import java.io.IOException;

public class SocketServidor {
    
    public static void main (String[] args) throws IOException { // Creamos un servidor y lo iniciamos
        Servidor server = new Servidor();
        System.out.println("Iniciando el servidor... \n");
        server.startServer();
    }
    
}
