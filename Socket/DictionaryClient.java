import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;

public class DictionaryClient {
    public static void main(String[] args) {
        int ch;
        String [] words = { "gold", "flower","cat","dog"};
        try {
            Socket socket = new Socket("dict.org", 2628);
            OutputStream out = socket.getOutputStream();
            Writer writer = new OutputStreamWriter(out, "UTF-8");
            writer = new BufferedWriter(writer);
            writer.write("DEFINE fd-eng-lat gold\r\n");
            writer.flush();

            InputStream in = socket.getInputStream();
            InputStreamReader reader = new InputStreamReader(in, "ASCII");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println();

            in.close();
            writer.close();
            socket.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}