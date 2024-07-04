import java.io.IOException;
import java.net.*;

public class UseCache{

    public static void main(String[] args) {

        try {
            URI uri = new URI("https://en.wikipedia.org/wiki/Computer");
            URL url = uri.toURL();
            URLConnection conn = url.openConnection();
          if(conn.getUseCaches()){
            System.out.println("local cache will be used");
          }else{
            System.out.println("fresh page is fetched everytime");
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


