import java.io.*;
import java.net.*;
public class OpenConnection {
    
    public static void main(String[] args) {
        int ch;
        try {
            URI uri = new URI("https://www.nagarjunacollege.edu.np/");
            URL url = uri.toURL();
            URLConnection uc = url.openConnection();
            InputStream in = uc.getInputStream();
            while(( ch = in.read())!= -1){
                System.out.println((char) ch);
            }
            System.out.println();
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
        catch (URISyntaxException ex1) {
            System.out.println(ex1.getMessage());
    }
    catch (IOException ex2) {
        System.out.println(ex2.getMessage());
}
    }
}