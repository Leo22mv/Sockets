package Sockets;

import java.io.DataOutputStream;
import java.io.IOException;

public class Cliente extends ConexionSockets {
    
    public Cliente() throws IOException {
        super("cliente");
    }
    
    public void startClient() {
        try {
            salidaServidor = new DataOutputStream(socketCliente.getOutputStream()); // Flujo de datos hacia el servidor
            
            for (int i = 0; i < 3; i++) { // Enviamos 3 mensajes para probar
                salidaServidor.writeUTF("Este es el mensaje número " + (i+1) + "\n"); // Se escribe en el servidor usando su flujo de datos
            }
            
            socketCliente.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
