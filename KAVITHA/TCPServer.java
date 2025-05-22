import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Server is waiting for a connection...");

            Socket clientSocket = serverSocket.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            // Step 1: Receive SYN
            String syn = in.readLine();
            System.out.println("Received: " + syn);

            // Step 2: Send SYN-ACK
            out.println("SYN-ACK");
            System.out.println("Sent: SYN-ACK");

            // Step 3: Receive ACK
            String ack = in.readLine();
            System.out.println("Received: " + ack);

            System.out.println("Connection Established");
            clientSocket.close();
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}