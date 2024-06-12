
import java.net.*;

public class ProtocolTester {

    public static void tester(String url_raw) {
        try {
            URI uri = new URI(url_raw);
            URL url = uri.toURL();
            System.out.println(url.getProtocol() + " is supported");

        } catch (MalformedURLException ex) {
            System.out.println(ex.getMessage());
        } catch (URISyntaxException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
    String[] urls = {
        "https://example.com",
        "http://www.adc.org",
        "telnet://dibner.poly.edu/",
        "gopher://gopher.anc.org.za/",
        "nfs://utopia.poly.edu/usr/tmp/",
         "mailto:elharo@ibiblio.org"
        };
        for(String url : urls){
            tester(url);
        }
        
    }

 }
