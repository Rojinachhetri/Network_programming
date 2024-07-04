import java.net.*;

public class AddressToHost {
    public static void main(String[] args) {
        try {
            // Define the IP address as a byte array
            byte[] address = {(byte) 163, 70, (byte) 146, 35};
            
            // Get the InetAddress object for the specified IP address
            InetAddress addr = InetAddress.getByAddress(address);
            
            // Print the host name associated with the IP address
            System.out.println("Host name: " + addr.getHostName());
        } catch (Exception e) {
            // Print the error message if an exception occurs
            System.out.println("Error: " + e.getMessage());
        }
    }
}
