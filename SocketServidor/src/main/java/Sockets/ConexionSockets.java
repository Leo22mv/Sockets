package Sockets;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ConexionSockets {
    private final int puerto = 8080; // Puerto para conectar
    private final String host = "localhost"; // Direccion ip para la conexion
    protected String mensajeServidor; // Mensajes recibidos en el servidor
    protected ServerSocket socketServidor; // Socket del servidor
    protected Socket socketCliente; // Socket del cliente
    protected DataOutputStream salidaServidor, salidaCliente; // Variables de salida
    
    public ConexionSockets (String tipo) throws IOException {
        if (tipo.equalsIgnoreCase("servidor")) {
            socketServidor = new ServerSocket(puerto); // Creamos socket para el servidor, se usa el puerto configurado anteriormente
            socketCliente = new Socket(); // Creamos socket para el cliente
        } else {
            socketCliente = new Socket(host, puerto); // Creamos socket para el cliente y le pasamos como parámetro el host y el puerto
        }
    }
}
