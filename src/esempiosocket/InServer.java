/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esempiosocket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class InServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        ServerSocket ss = new ServerSocket(4545);
        while(true){
            Socket s = ss.accept();
            int ninviato= s.getInputStream().read();
            System.out.println("Ricevuto intero: " + ninviato);
            s.close();
        }
    }
    
}
