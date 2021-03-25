/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
Test Pull
 */



package esempiosocket;

import java.io.IOException;
import java.net.Socket;
import java.util.Random;

public class InClient {
     public static void main(String[] args) throws IOException  {
         
         Socket s = new Socket("localhost", 4545);
         Random r = new Random();
         int nCasuale = r.nextInt();
         s.getOutputStream().write(nCasuale);
         s.close();
         
    }
}
