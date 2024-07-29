import java.io.*;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class httpClient {
    public static void main(String[] args) {
        SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
        SSLSocket socket = null;
        try {
            socket = (SSLSocket) factory.createSocket("www.usps.com", 443);
            String[] Suites = socket.getEnabledCipherSuites();
            for (String string : Suites) {
                System.out.println(string);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}