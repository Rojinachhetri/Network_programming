//how to download the object
// implement get contol mathod in url
//uri-> url->openstream->openconnective

import java.io.*;
import java.net.*;

public class DownloadObject {
    public static void main(String[] args) {
        try {
           URI uri = new URI(args[0]);
           URL url = uri.toURL();
           Object ob = url.getContent();
           System.out.println(ob.getClass());
           System.out.println(ob.toString());
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }catch (URISyntaxException ex1) {
        System.out.println(ex1.getMessage());
    }catch (IOException ex2) {
    System.out.println(ex2.getMessage());
}

}
}
    
    

