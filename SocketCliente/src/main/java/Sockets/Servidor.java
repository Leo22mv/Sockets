package Sockets;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Servidor extends ConexionSockets {
    
    public Servidor() throws IOException {
        super("servidor");
    }
    
    public void startServer () {
        try {
            System.out.println("Esperando conexion...");
            socketCliente = socketServidor.accept(); // El metodo accept inicializa el socket
            
            System.out.println("Cliente en linea");
            salidaCliente = new DataOutputStream(socketCliente.getOutputStream()); // Se obtiene el flujo de salida del cliente
            
            salidaCliente.writeUTF("Peticion recibida y aceptada"); // Enviamos un mensaje al cliente
            
            BufferedReader entrada = new BufferedReader (new InputStreamReader(socketCliente.getInputStream())); // Se obtiene el flujo entrante desde el cliente
            
            while ((mensajeServidor = entrada.readLine()) != null) { // Mientras haya mensajes del cliente
                System.out.println("mensajeServidor"); // Mostramos los mensajes recibidos
            }
            
            System.out.println("Fin de la conexion"); // Una vez que termino de leer los mensajes, finalizamos la conexion
            socketServidor.close(); // Se finaliza la conexion con el cliente
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
