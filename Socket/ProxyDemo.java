import java.io.InputStream;
import java.net.*;

public class ProxyDemo {
    public static void main(String[] args) {
        int ch;
        try {
            // Set up the proxy address
            InetSocketAddress proxyAddress = new InetSocketAddress("myproxy.example.com", 1080);
            Proxy proxy = new Proxy(Proxy.Type.SOCKS, proxyAddress);

            // Create a socket with the proxy
            Socket s = new Socket(proxy);

            // Set up the target server address
            InetSocketAddress address = new InetSocketAddress("login.ibiblio.org", 25);

            // Connect the socket to the target server
            s.connect(address);
            System.out.println("Connected to: " + address.toString());

            // Get the input stream of the socket
            InputStream in = s.getInputStream();

            // Read and print the data from the input stream
            while (-1 != (ch = in.read())) {
                System.out.print((char) ch); // Use print to avoid extra new lines
            }

            // Close the socket
            s.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
