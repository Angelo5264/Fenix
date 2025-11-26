package Kernel.Gant;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Cliente {
    public static void main(String[] args) {
        String host="127.0.0.1";
        int puerto =5000;
        DataInputStream in=null;
        DataOutputStream out=null;

        try {
            Socket sc = new Socket(host,puerto);
            in = new DataInputStream(sc.getInputStream());
            out= new DataOutputStream(sc.getOutputStream());
            String mensaje=in.readUTF();
            IO.println(mensaje);
            sc.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }



}
