package com.company;
import java.io.PrintWriter;
import java.net.*;
//Client - Server One Way Communication using Socket Programming in Java{Single Machine}
public class Client {
    public static void main(String[] args) throws Exception {
        try{
            Socket sk = new Socket("localhost", 8080);
            PrintWriter pw = new PrintWriter(sk.getOutputStream()); // for sending message to the server.
            pw.println("Client: Hello Server.. how are you ???");
            pw.flush(); // it will take all the character of the message.
            pw.close();
        }
        catch (Exception e){
            System.out.println("Error..");
        }
    }
}
