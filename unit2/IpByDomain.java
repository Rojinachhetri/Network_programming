package unit2;
import java.net.*;
public class IpByDomain {
    public static void main(String[] args) {
        try{
            InetAddress address = InetAddress.getByName("www.google.com");
            System.out.println(address);
        }
        catch (UnknownHostException ex){
            System.out.println("could not find www.google.com");
        }
       

        
    }
    
}
