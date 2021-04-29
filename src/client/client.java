/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import com.sun.security.ntlm.Client;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gandolfi.paolo
 */

public class client {
    public static void main(String[] args) throws IOException {
    char[]lista= new char[10];
    char[]lista2={'a', 'b', 'c','d', 'e', 'f','g', 'h', 'i', 'j','k','l','m','n','o', 'p','q','r','s','t','u','v','w','x','y','z'};
    
        for (int i = 0; i < lista.length; i++) {
            int a=(int)((Math.random()*lista2.length));
            lista[i]=lista2[a];
           
        }
        try{
            Socket server = new Socket("127.0.0.1", 6666);
            PrintWriter out = new PrintWriter(server.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(server.getInputStream()));
            

                out.println(lista[1]);
                String risposta = in.readLine();
                System.out.println(risposta);


            in.close();
            server.close();

            } catch (IOException ex) {
                System.out.println("IOException");
        }

    }
}

    


