import java.io.IOException;
import java.net.*;

public class URLParts {
    public static void main(String[] args) {
        String[] urls = {

           "https://camo.githubusercontent.com/21ac1bf37e6721747675ad72f6601642567f67683d1cd946a8a6450bb7ce2124/68747470733a2f2f6769746875622d726561646d652d73746174732e76657263656c2e6170702f6170692f746f702d6c616e67733f757365726e616d653d726f6a696e61636868657472692673686f775f69636f6e733d74727565266c6f63616c653d656e266c61796f75743d636f6d70616374 "};
           for (String url_raw : urls){
            try {
           URI uri = new URI(url_raw);
           URL url = uri.toURL();
          
           System.out.println("Protocol:" +url.getProtocol());
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }catch (URISyntaxException ex1) {
        System.out.println(ex1.getMessage());
    }catch (IOException ex2) {
    System.out.println(ex2.getMessage());
}

}
}

}
