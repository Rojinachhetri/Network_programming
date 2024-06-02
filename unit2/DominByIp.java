import java.net.*;
class  DominByIp{
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("142.250.193.196");
            System.out.println("Name: "+ address.getHostName());
            
        } catch (UnknownHostException e) {
            System.err.println(e.getMessage());
        }
    }
}