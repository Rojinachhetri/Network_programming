import java.io.*;
import java.net.*;

public class Headerinfo {
    public static void main(String[] args) {
        try {
            URI uri = new URI("https://annapurnapost.com");
            URL url = uri.toURL();
            URLConnection conn = url.openConnection();
            //  print header info
            System.out.println(" Content-encoding " + conn.getContentEncoding());
            System.out.println( " Contnent-length:" + conn.getContentLength());
            System.out.println("Content-type : " + conn.getContentType());
            System.out.println("date:" + conn.getDate());
            System.out.println("Expires :" + conn.getExpiration());
            System.out.println( "Last-Modified" + conn.getLastModified());
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        } catch(URISyntaxException ex){
            System.out.println(ex.getMessage());
        } catch(IOException ex1) {
            System.out.println(ex1.getMessage());
        }
    }    
}
