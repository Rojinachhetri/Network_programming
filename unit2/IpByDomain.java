// A program to print the address of www.google.com
package unit2;
import java.net.*;
public class IpByDomain {
    public static void main(String[] args) {
        try{
            InetAddress address = InetAddress.getByName("www.google.com");
            System.out.println("Address: "+ address.getHostAddress());
            System.out.println("Name: "+ address.getHostName());

        }
        catch (UnknownHostException ex){
            System.out.println("could not find www.google.com");
        }
       

        
    }
    
}
