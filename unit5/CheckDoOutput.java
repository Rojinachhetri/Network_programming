// check if read opertion is allowed using getDooutput method

import java.io.IOException;
import java.net.*;

public class CheckDoOutput {

    public static void main(String[] args) {

        try {
            URI uri = new URI("https://en.wikipedia.org/wiki/Computer");
            URL url = uri.toURL();
            URLConnection conn = url.openConnection();
            if (conn.getDoOutput()) {
                System.out.println("write opration is allowed");
            } else {
                System.out.println("write operation is not allowed");
                conn.setAllowUserInteraction(true);
            }
            if (conn.getAllowUserInteraction()) {
                System.out.println("Now you are  allowed");
            }
        
        } catch (URISyntaxException e) {
            System.out.println(e.getMessage());

        } catch (MalformedURLException ex2) {
            System.out.println(ex2.getMessage());

        } catch (IOException ex3) {
            System.out.println(ex3.getMessage());

        }
    }
}

