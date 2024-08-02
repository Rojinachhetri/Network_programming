// java program to implement day time protocol using udp protocol
import java.net.*;
import java.nio.charset.StandardCharsets;

public class DayTimeUDP {

    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            socket.setSoTimeout(10000);  
            InetAddress host = InetAddress.getByName("time.nist.gov");
            DatagramPacket request = new DatagramPacket(new byte[1], 1, host, 13);
            DatagramPacket response = new DatagramPacket(new byte[1024], 1024);

            socket.send(request);  // Corrected from String.send(request)
            socket.receive(response);

            String result = new String(response.getData(), 0, response.getLength(), StandardCharsets.US_ASCII);
            System.out.println(result);

            socket.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
