package org.thangnv;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DEV on 9/25/2016.
 */
public class Sv {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(13212);
        List<Socket> sockets = new ArrayList<>();

        System.out.println("listenning...");
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        sockets.add(serverSocket.accept());
                        System.out.println("conneted!");
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        String messenge;

        while (true) {

            for (Socket socket : sockets) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                if ((messenge = bufferedReader.readLine()) != null) {
                    for (Socket socket1 : sockets) {
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket1.getOutputStream()));
                        bufferedWriter.write(messenge);
                        bufferedWriter.newLine();
                        bufferedWriter.flush();
                    }
                }
            }
        }

    }
}
