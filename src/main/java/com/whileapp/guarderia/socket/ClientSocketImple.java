/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.whileapp.guarderia.socket;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Component;

/**
 *
 * @author eduardo
 */
public class ClientSocketImple implements ClientSocket {
    private String host;
    private int port;
    private Socket requestSocket;
    
    public ClientSocketImple(String host, int port) {
        this.host = host;
        this.port = port;
    }

    @Override
    public String sendMessage( String msj ){ 
        String mensaje = null;
        try {
            Socket socket = new Socket( host, port );
            OutputStream out = socket.getOutputStream();
            InputStream in = socket.getInputStream();
            DataOutputStream outStream = new DataOutputStream( out );
            BufferedReader br = new BufferedReader( new InputStreamReader( in ) );
            outStream.writeBytes(msj);
            outStream.flush();
            
            mensaje = br.readLine();
            
            socket.close();
            
        } catch (IOException ex) {
            Logger.getLogger(ClientSocketImple.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mensaje;
    }

}
