import java.io.*;
import java.net.*;

public class DayTime {

    public static void main(String[] args) {
        int ch;
        try {
            // Correct the URL to use the hostname and port for the Daytime Protocol
            Socket socket = new Socket("time.nist.gov", 13);
            System.out.println(socket.toString());
            InputStream in = socket.getInputStream();
            while ((ch = in.read()) != -1) {
                System.out.print((char) ch);
            }
            in.close();
            socket.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
