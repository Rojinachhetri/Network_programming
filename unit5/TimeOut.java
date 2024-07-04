//print url to configure conncetion

import java.io.IOException;
import java.net.*;

public class TimeOut{

    public static void main(String[] args) {

        try {
            URI uri = new URI("https://en.wikipedia.org/wiki/Computer");
            URL url = uri.toURL();
            URLConnection conn = url.openConnection();
            System.out.println("connect timeout:" + conn.getConnectTimeout());
            System.out.println("Read Timeout: " + conn.getReadTimeout());

        } catch (URISyntaxException e) {
            System.out.println(e.getMessage());

        } catch (MalformedURLException ex2) {
            System.out.println(ex2.getMessage());

        } catch (IOException ex3) {
            System.out.println(ex3.getMessage());

        }
    }
}
