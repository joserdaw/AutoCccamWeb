<%-- 
    Document   : Generar
    Created on : 10-oct-2017, 9:34:23
    Author     : daw2r
--%>

<%@page import="java.io.IOException"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.jaunt.component.Form"%>
<%@page import="com.jaunt.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.josereal.controlador.*" %>
<%@page import="com.josereal.modelo.*" %>
<%@page import="com.josereal.utilidades.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--meta http-equiv="refresh" content="15" url=AutoCccamWeb/Index.html" -->
        <title>Descarga</title>
    </head>
    <body>
        
        <%
        String tipoSalida=request.getParameter("combo");
        String ruta=System.getProperty("user.home")+"\\Desktop\\";
        boolean srvr1=false, srvr2=false, srvr3=false, srvr4=false;
        PublicaIP tuip=new PublicaIP();
        ArrayList servidores=new ArrayList<Cline>();
        Funciones iniciarf=new Funciones();
        
        if(request.getParameter("srvr1")==null) srvr1=false;
        else srvr1=true;
        
        if(request.getParameter("srvr2")==null) srvr2=false;
        else srvr2=true;
        
        if(request.getParameter("srvr3")==null) srvr3=false;
        else srvr3=true;
        
        if(request.getParameter("srvr4")==null) srvr4=false;
        else srvr4=true;
        
        if(srvr1){
        
            UserAgent server1=new UserAgent();
					
            try {

                    server1.visit("http://fullhd.hack-sat.org/tfrgbff/index.php");

                    Form click1=server1.doc.getForm(0);

                    click1.submit("Active User!");

                    Cline cserver1=new Cline("fullhd.hack-sat.org", "4000", tuip.obtenerIP(), "hack-sat.com");

                    servidores.add(cserver1);

            } catch (ResponseException | SearchException e) {
                    %><script> alert("Error en el server 1") </script><%
            }
        
        
        }

        if(srvr2){

            UserAgent server2=new UserAgent();
					
            try {

                    server2.visit("http://b1.hack-sat.org/bpomiihh/index.php");

                    Form click2=server2.doc.getForm(0);

                    click2.submit("Active User!");

                    Cline cserver2=new Cline("b1.hack-sat.org", "10000", tuip.obtenerIP(), "hack-sat.com");

                    servidores.add(cserver2);

            } catch (ResponseException | SearchException e) {
                    %><script> alert("Error en el server 2") </script><%
            }


        }

        if(srvr3){

            String urlservidor="http://cccam-free2.com/free2/get.php";
					
            try {
                
                String []cline=iniciarf.sacarCodigo1(urlservidor);

                String servidor=cline[5];
                String puerto=cline[6];
                String usuario=cline[7];
                String pass=cline[8];

                Cline cserver3=new Cline(servidor, puerto, usuario, pass);

                servidores.add(cserver3);

            } catch (ArrayIndexOutOfBoundsException | IOException e) {
                %><script> alert("Error en el server 3") </script><%
            }

        }

        if(srvr4){

            String urlservidor="http://freeccamserver.com/free/get2.php";
					
            try {
                
                String []cline=iniciarf.sacarCodigo1(urlservidor);

                String servidor=cline[5];
                String puerto=cline[6];
                String usuario=cline[7];
                String pass=cline[8];

                Cline cserver4=new Cline(servidor, puerto, usuario, pass);

                servidores.add(cserver4);

            } catch (ArrayIndexOutOfBoundsException | IOException e) {
                     %><script> alert("Error en el server 4") </script><%
            }

            iniciarf.guardarEnFichero(tipoSalida, servidores, ruta);

        }
        %>
        
        <h1>Se han generado <% out.println(servidores.size()); %> líneas</h1>
        
        
        
        
    </body>
</html>
