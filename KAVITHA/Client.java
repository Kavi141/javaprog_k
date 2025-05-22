import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);
            System.out.println("Connected to Server!");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Send FIN to Server
            System.out.println("Sending FIN to Server...");
            out.println("FIN");

            // Wait for ACK from Server
            String msg = in.readLine();
            if ("ACK".equals(msg)) {
                System.out.println("Received ACK from Server. Waiting for FIN...");
            }

            // Wait for Server's FIN
            msg = in.readLine();
            if ("FIN".equals(msg)) {
                System.out.println("Received FIN from Server. Sending ACK...");
                out.println("ACK");
            }

            System.out.println("Connection closed.");
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}