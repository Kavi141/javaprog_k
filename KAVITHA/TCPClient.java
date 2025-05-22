import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Step 1: Send SYN
            out.println("SYN");
            System.out.println("Sent: SYN");

            // Step 2: Receive SYN-ACK
            String synAck = in.readLine();
            System.out.println("Received: " + synAck);

            // Step 3: Send ACK
            out.println("ACK");
            System.out.println("Sent: ACK");

            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}