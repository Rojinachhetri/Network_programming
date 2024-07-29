import java.io.*;
import java.net.*;

public class SocketOptions {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("example.com", 80);

            // Set socket options
            socket.setSoTimeout(2000); // 2 seconds timeout
            socket.setTcpNoDelay(true); // Disable Nagle's algorithm
            socket.setKeepAlive(true); // Enable keep-alive
            socket.setReceiveBufferSize(1024 * 8); // 8KB receive buffer
            socket.setSendBufferSize(1024 * 8); // 8KB send buffer

            // Connect and communicate with the server...
            
            socket.close();
        } catch (IOException e) {
            System.out.println("Socket error: " + e.getMessage());
        }
    }
}
