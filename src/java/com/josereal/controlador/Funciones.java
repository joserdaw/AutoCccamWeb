/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.josereal.controlador;

import com.josereal.modelo.Cline;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author casa
 */
public class Funciones {
    
    public String[] sacarCodigo1(String urlservidor) throws IOException {
				
        java.net.URL url=new java.net.URL(urlservidor);
        java.net.URLConnection con = url.openConnection();
        InputStream s = con.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(s));
        String line = "", linea="";
        while((line = bufferedReader.readLine())!=null){
            
            if(line.contains("<h1>")){

                linea=line;

            }
        }

        String []cline=linea.split(" ");

        return cline;
    
    }
    
    public void guardarEnFichero(String formato, ArrayList<Cline> servidores, String ruta) throws IOException{
        
        String directorio=palabraAleatoria();
        
        ruta=ruta+directorio;
        
        File crearCarpeta=new File(ruta);
        crearCarpeta.mkdir();
    
        if(formato.equals("hadu")){
            ruta+="\\Hadu.ini";

            //CREA EL ARCHIVO
            File archivo = new File(ruta);
            BufferedWriter bw;
            if(archivo.exists()) {
                bw = new BufferedWriter(new FileWriter(archivo));
                bw.write("");
            } else {
                bw = new BufferedWriter(new FileWriter(archivo));
                bw.write("");
            }
            bw.close();

        //ESCRIBE LAS CLINES
            try {
            FileWriter fw=new FileWriter(ruta);
            bw=new BufferedWriter(fw);

            //ESCRIBIR AQU� BLOQUE

            bw.write("[General]");
            bw.newLine();
            bw.write("PluginActive=1");
            bw.newLine();
            bw.write("KeyPath2=");
            bw.newLine();
            bw.write("UseTransparency=1");
            bw.newLine();
            bw.write("MonitorSize=501,404;45,45,48,60,24,90,144,144;35,102,156,24,140");
            bw.newLine();
            bw.newLine();

            bw.write("[Options]");
            bw.newLine();
            bw.write("UsePSITables=1");
            bw.newLine();
            bw.write("SurveyPMT=1");
            bw.newLine();
            bw.write("UsePATforPMT=0");
            bw.newLine();
            bw.write("DontUpdViewer=0");
            bw.newLine();
            bw.write("MaxECMPIDs=0");
            bw.newLine();
            bw.write("MaxConnections=0");
            bw.newLine();
            bw.write("DisplayIPorURL=1");
            bw.newLine();
            bw.write("ECMTimeout=3");
            bw.newLine();
            bw.write("MaxCAIDLoops=4");
            bw.newLine();
            bw.write("DCWsOneServ=1");
            bw.newLine();
            bw.write("LogMessages=0");
            bw.newLine();
            bw.write("LogMessLevel=2");
            bw.newLine();
            bw.write("EMMAlone=0");
            bw.newLine();
            bw.write("EMMFaked=0");
            bw.newLine();
            bw.write("EMMLog=1");
            bw.newLine();
            bw.write("DispAllEMMs=0");
            bw.newLine();
            bw.write("CacheUse=1");
            bw.newLine();
            bw.write("CacheUpdate=1");
            bw.newLine();
            bw.write("ManualUse=0");
            bw.newLine();
            bw.write("Systray=0");
            bw.newLine();
            bw.newLine();

            bw.write("[Specific]");
            bw.newLine();
            bw.write("DVBViewerAPI=0");
            bw.newLine();
            bw.write("DVBViewerAllAudio=1");
            bw.newLine();
            bw.write("DVBViewerCSAStat=0");
            bw.newLine();
            bw.write("DVBViewerRecServ=0");
            bw.newLine();
            bw.write("DVBViewerIdleServ=0");
            bw.newLine();
            bw.write("DVBViewerEncrServ=0");
            bw.newLine();
            bw.newLine();

            bw.write("[Device]");
            bw.newLine();
            bw.write("MDRoot=0");
            bw.newLine();
            bw.write("DescrCommand=");
            bw.newLine();
            bw.write("XorEven=");
            bw.newLine();
            bw.write("XorOdd=");
            bw.newLine();
            bw.write("UseTT=0");
            bw.newLine();
            bw.newLine();
            bw.newLine();
            bw.newLine();
            bw.newLine();

            int y=0;

            //FIN BLOQUE
            for(int x=0;x<servidores.size();x++){
                Cline sacar=servidores.get(x);
                y++;
                //ESCRIBIR AQUI NOMBRE DEL SERVER
                bw.write("[Serv_"+y+"]");
                bw.newLine();
                String linea =sacar.toHadu();
                bw.write(linea);
                bw.newLine();
                bw.write("Active=1");
                bw.newLine();
                bw.newLine();
                //ESCRIBIR AQUI ESTADO.
                sacar=null;
            }

            fw.flush();
            bw.close();
            fw.close();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al escribir el fichero");
            }
			
        }else if(formato.equals("general")){
			
            ruta+="\\CCcam.cfg";

            File archivo = new File(ruta);
            BufferedWriter bw;
            if(archivo.exists()) {
                bw = new BufferedWriter(new FileWriter(archivo));
                bw.write("");
            } else {
                bw = new BufferedWriter(new FileWriter(archivo));
                bw.write("");
            }
            bw.close();

            //ESCRIBE LAS CLINES
            try {
                
                FileWriter fw=new FileWriter(ruta);
                bw=new BufferedWriter(fw);

                for(int x=0;x<servidores.size();x++){

                    Cline sacar=servidores.get(x);

                    String linea =sacar.toGeneral();
                    bw.write(linea);
                    bw.newLine();

                    sacar=null;
                }

                fw.flush();
                bw.close();
                fw.close();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al escribir el fichero");
            }    
					
	}

    }
    
    private static String palabraAleatoria() {
	String palabra="";
		
        for(int x=0;x<8;x++){

            String [] abecedario = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", 
                            "K", "L", "M","N","O","P","Q","R","S","T","U","V","W", "X","Y","Z"};

            int num=(int) (Math.random()*(25-0+1));

            palabra+=abecedario[num].toLowerCase();

        }

        return palabra;
    }
    
}
