import  java.net.*;
public class LocalAddress {
    public static void main(String[] args) {
        try {
            InetAddress addr = InetAddress.getLocalHost();
            System.out.println(addr.getHostAddress());
        } catch (UnknownHostException e) {
        }
    }
}
