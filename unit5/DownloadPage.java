import java.io.IOException;
import java.io.InputStream;
import java.net.*;

public class DownloadPage {

    public static void main(String[] args) {
        int ch;
        try {
            URI uri = new URI("https://example.com");
            URL url = uri.toURL();
            URLConnection conn = url.openConnection();
            InputStream in = conn.getInputStream();
            while ((ch = in.read()) != -1) {
                System.out.print((char)ch);
            }
            System.out.println();
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        } catch (URISyntaxException ex1) {
            System.out.println(ex1.getMessage());
        } catch(IOException ex2) {
            System.out.println(ex2.getMessage());
        }
    }
}
