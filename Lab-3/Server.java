package com.company;
import java.net.*;
import java.io.*;
public class Server {
    public static void main(String[] args) throws Exception {
        try {
            ServerSocket ss = new ServerSocket(8080);
            System.out.println("Server is Waiting for Client");
            Socket sk = ss.accept();//here Server is accepting the request of client;
            System.out.println("Connection has been Established.");
            InputStreamReader isr = new InputStreamReader(sk.getInputStream()); // here we are taking client input.
            BufferedReader br = new BufferedReader(isr); // here we are reading the input.
            String s = br.readLine();// here we are reading the input line by line and converting into string.
            System.out.println("Message From Client: "+ s);

            // Responding back to Client;
            PrintWriter pw = new PrintWriter(sk.getOutputStream());
            pw.println("Hii Client.. i am Good");
            pw.flush();
            pw.close();
        }
        catch (Exception e){
            System.out.println("Error"+ e);
        }
    }
}
