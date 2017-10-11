package com.josereal.controlador;


/*
 *Autor: Darhius929
 **/
import java.net.URL;
import java.net.HttpURLConnection;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.InputStream;
 
public class PublicaIP {
 
	private String publicIP = null;
 
    public PublicaIP() {
    	
    }
    
    public String obtenerIP(){
    	
    	try {
            URL tempURL = new URL("http://checkip.amazonaws.com");
            BufferedReader tempBr = new BufferedReader(new InputStreamReader(tempURL.openStream()));  
            
            publicIP=tempBr.readLine();


    	} catch (Exception ex) {
            publicIP = "<No es posible resolver la direccion IP>";   
    	}

    	
    	
    	
    	return publicIP;
    }
}