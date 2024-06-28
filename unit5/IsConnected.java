import java.io.IOException;
import java.net.*;
public class IsConnected {
    public static void main(String[] args) {

        try {
            URI uri = new URI("https://en.wikipedia.org/wiki/Computer");
            URL url = uri.toURL();
            URLConnection conn = url.openConnection();
             
          conn.connect();
          System.out.println("configured URL:" + conn.getURL().toString());


        } catch (URISyntaxException e) {
            System.out.println(e.getMessage());

        } catch (MalformedURLException ex2) {
            System.out.println(ex2.getMessage());

        } catch (IOException ex3) {
            System.out.println(ex3.getMessage());

        }
    }
}

    

