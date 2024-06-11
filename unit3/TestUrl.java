
// wap to test url class
import java.net.*;

public class TestUrl {
    public static void main(String[] args) {
        try {
            URI uri = new URI("https://www.google.com/");
            URL url = uri.toURL();
            System.out.println("port: "+ url.getPort());
            System.out.println("port: "+ url.getProtocol());

        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }catch(URISyntaxException ex){
            System.out.println(ex.getMessage());
        }

    }
    
}
