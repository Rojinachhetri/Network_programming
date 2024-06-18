
import java.net.*;

public class UrlEquality {

    public static void main(String[] args) {
        try {
            URI uri = new URI("http://www.testingmcafeesites.com/index.html");
            URL url1 = uri.toURL();
    
            uri = new URI("http://www.testingmcafeesites.com");
            URL url2 = uri.toURL();
    
            if (url1.equals(url2)) {
                System.out.println("they are equal");
            } else {
                System.out.println("they are not equal");
            }
    
        } catch (URISyntaxException e) {
            System.out.println(e.getMessage());
        } catch (MalformedURLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}