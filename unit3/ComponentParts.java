import java.net.*; // to test component of url

public class ComponentParts {
    public static void main(String[] args) {
        try {
            // Corrected the URL string by removing the leading space
            URI uri = new URI("http://www.testingmcafeesites.com/index.html");
            URL url = uri.toURL();
            System.out.println("HOST: " + url.getHost());
        } catch (URISyntaxException e) {
            System.out.println(e.getMessage());
        } catch (MalformedURLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
