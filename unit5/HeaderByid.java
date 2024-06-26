
import java.io.IOException;
import java.net.*;

public class HeaderByid {

    public static void main(String[] args) {
        int i = 1;
        try {
            URI uri = new URI("https://en.wikipedia.org/wiki/Computer");
            URL url = uri.toURL();
            URLConnection conn = url.openConnection();
            while (true) {
                String header = conn.getHeaderField(i);
                if (header == null) {
                    break;
                }
                System.out.println(conn.getHeaderFieldKey(i) + ":" + header);
                i = i + 1;

            }

            //  } catch (MalformedURLException ex1) {
            //     System.out.println(ex1.getMessage());
        } catch (URISyntaxException ex2) {
            System.out.println(ex2.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }

    }
}
