
import java.io.IOException;
import java.net.*;

public class HeaderByName {

    public static void main(String[] args) {
        try {
            URI uri = new URI("https://annapurnapost.com");
            URL url = uri.toURL();
            URLConnection conn = url.openConnection();
            System.out.println("content-encoding:" + conn.getHeaderField("content-encoding"));
            System.out.println("content Length:" + conn.getHeaderField("content-Lenght"));
            System.out.println("content-type:" + conn.getHeaderField("conetnt-type"));
            System.out.println("Expires:" + conn.getHeaderField("expires"));
            System.out.println("Date" + conn.getHeaderField("date"));

            System.out.println();

        } catch (IOException e) {
            System.out.println(e.getMessage());

        // } catch (MalformedURLException ex1) {
        //     System.out.println(ex1.getMessage());

         } catch (URISyntaxException ex2) {
            System.out.println(ex2.getMessage());
        }
    }

}
