package com.company;
import java.io.*;
import java.net.*;
//Client - Server One Way Communication using Socket Programming in Java{Single Machine}
public class Server {
    public static void main(String[] args)throws Exception {
        try {
            ServerSocket ss = new ServerSocket(8080);
            System.out.println("Server is waiting for the client...");
            Socket sk = ss.accept(); // it will accept the client request.
            System.out.println("Connection has been Established...");
            InputStreamReader isr = new InputStreamReader(sk.getInputStream()); // it will take the input from the client;
            BufferedReader br = new BufferedReader(isr); // it will convert all the byte code of the message into the character.
            String s = br.readLine();
            System.out.println("Message from -> "+ s);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}
