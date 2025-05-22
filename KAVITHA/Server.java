import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server is waiting for a connection...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Receive FIN from Client
            String msg = in.readLine();
            if ("FIN".equals(msg)) {
                System.out.println("Received FIN from Client. Sending ACK...");
                out.println("ACK"); // Send ACK
                Thread.sleep(1000); // Simulating delay

                System.out.println("Sending FIN to Client...");
                out.println("FIN"); // Send FIN
            }

            // Wait for Client's final ACK
            msg = in.readLine();
            if ("ACK".equals(msg)) {
                System.out.println("Received ACK from Client. Closing connection...");
            }

            socket.close();
            serverSocket.close();
            System.out.println("Connection closed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}