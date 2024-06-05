//java  program to get hash code for given ip address
import java.net.*;

public class HashMethod {
    public static void main(String[] args) {
        try {
            InetAddress addr3 = InetAddress.getByName("www.google.com");
            System.err.println("Hash value: " + addr3.hashCode());
        } catch (UnknownHostException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
