package org.thangnv;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by DEV on 9/25/2016.
 */
public class Cl {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 13212);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Scanner input = new Scanner(System.in);
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                    String messengeSent;
                    System.out.println("chat đê.....");
                    while (true) {
                        messengeSent = input.nextLine();
                        bufferedWriter.write(messengeSent);
                        bufferedWriter.newLine();
                        bufferedWriter.flush();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();

        String messenge;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        while (true) {
            if ((messenge = bufferedReader.readLine()) != null) {
                System.out.println(messenge);
            }
        }


    }
}
