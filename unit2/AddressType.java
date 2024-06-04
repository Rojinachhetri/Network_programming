import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressType {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("No address provided.");
            return;
        }

        String testAddress = args[0];
        try {
            InetAddress address = InetAddress.getByName(testAddress);

            if (address.isLoopbackAddress()) {
                System.err.println(testAddress + " is a loopback address.");
            }

            if (address.isAnyLocalAddress()) {
                System.err.println(testAddress + " is a wildcard address.");
            }

            if (address.isMulticastAddress()) {
                System.err.println(testAddress + " is a multicast address.");
            }

        } catch (UnknownHostException e) {
            System.err.println("Unknown host: " + e.getMessage());
        }
    }
}
