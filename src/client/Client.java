package client;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Socket cliente = null;
        try {
            cliente = new Socket("127.0.0.1", 1234);

            System.out.println("Conectado ao servidor, digite algo...");

            PrintStream saida = new PrintStream(cliente.getOutputStream());
            Scanner teclado = new Scanner(System.in);
            while (teclado.hasNextLine()) {
                saida.println(teclado.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
