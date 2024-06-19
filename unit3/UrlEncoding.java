import java.io.*;
import java.net.*;


public class UrlEncoding {
    public static void main(String[] args) {
        try {
            String encoded = URLEncoder.encode("what:is:computer:network", "UTF-8");
            System.out.println("Encoded String :" +encoded);
            String decoded = URLDecoder.decode(encoded, "UTF-8");
            System.out.println(decoded);
        } catch (UnsupportedEncodingException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
