import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        try {
            final ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("Server is running, waiting client's");
            final Socket client = serverSocket.accept();
            System.out.println("Cliente conectado do IP " + client.getInetAddress().getHostAddress());

            Scanner entrada = new Scanner(client.getInputStream());

            while (entrada.hasNextLine()) {
                System.out.println(entrada.nextLine());
            }

            entrada.close();
            serverSocket.close();

            System.out.println("Servidor is stopped!");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
