import java.io.*;
import java.net.*;

public class SocketAddress{
    public static void main(String[] args)  {

        try {
            Socket socket = new Socket("yahoo.com", 80);
            // InetSocketAddress address = (InetSocketAddress) socket.getRemoteSocketAddress();
            System.out.println(socket.getRemoteSocketAddress());
            socket.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
