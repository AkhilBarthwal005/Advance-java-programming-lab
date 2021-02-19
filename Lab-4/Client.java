package com.company;
import java.io.*;
import java.net.*;
public class Client  {
    //Client - Server two Way Communication using Socket Programming in Java{Two Machine}
    public static void main(String[] args) throws Exception {
        try {
            Socket sk = new Socket("192.168.43.154",8080); // creating socket class object.
            PrintWriter pw = new PrintWriter(sk.getOutputStream());
            pw.println("Hello Server.. How are you???");
            pw.flush(); // it will send all the character to the server.

            // Receiving the Server Message.
            InputStreamReader isr = new InputStreamReader(sk.getInputStream());
            BufferedReader br = new BufferedReader(isr);
            String s = br.readLine();
            System.out.println("Server: "+ s);
            pw.close(); // connection has been closed here
            sk.close();
        }
        catch (Exception e){
            System.out.println("Error" + e);
        }
    }
}
