package sockets;

import java.io.BufferedWriter;
import java.io.IOException;

import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by lenovo on 20.06.2017.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1234);

//w localhost wpisujemy adres IP komputera do ktorego chcemy sie podlaczyc. Najpierw uruchamiamy server nastepnie klient
//        ogarnac wielowatkowosc dla plynnosci czatu

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        Scanner scanner = new Scanner(socket.getInputStream());
      boolean flag = true;
      while(flag) {
         Scanner scannerToUser = new Scanner(System.in);

          writer.write(scannerToUser.nextLine() + "\n");
          writer.flush();
          System.out.println("Guest: " + scanner.nextLine());
      }
        socket.close();
    }
}
