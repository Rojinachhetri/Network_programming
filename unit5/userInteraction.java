// check if user interaction ia allowed or not

import java.io.IOException;
import java.net.*;

public class userInteraction {

    public static void main(String[] args) {

        try {
            URI uri = new URI("https://en.wikipedia.org/wiki/Computer");
            URL url = uri.toURL();
            URLConnection conn = url.openConnection();
            if (conn.getAllowUserInteraction()) {
                System.out.println("user interaction is allowed");
            } else {
                System.out.println("not allowed");
                conn.setAllowUserInteraction(true);
            }
            if (conn.getAllowUserInteraction()) {
                System.out.println("user interaction is allowed");
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

