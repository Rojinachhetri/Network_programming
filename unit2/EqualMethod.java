import java.net.*;

public class EqualMethod {
    public static void main(String[] args) {
        try {
            InetAddress addr1 = InetAddress.getByName("www.google.com");
            InetAddress addr2 = InetAddress.getByName("news.google.com");
            
            if (addr1.equals(addr2)) {
                System.out.println("Both domains represent the same machine");
            } else {
                System.out.println("They are separate machines");
            }
            
        } catch (UnknownHostException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
