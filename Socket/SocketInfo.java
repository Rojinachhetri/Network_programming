import java.net.*;

public class SocketInfo {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("yahoo.com", 80);
            System.out.println("Remote Address: " + socket.getInetAddress());
            System.out.println("Remote Port: " + socket.getPort());
            System.out.println("Local Address: " + socket.getLocalAddress());
            System.out.println("Local Port: " + socket.getLocalPort());
            socket.close(); // Close the socket after use
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
