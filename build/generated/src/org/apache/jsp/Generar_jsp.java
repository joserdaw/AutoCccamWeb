package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import com.jaunt.component.Form;
import com.jaunt.*;
import com.josereal.controlador.*;
import com.josereal.modelo.*;
import com.josereal.utilidades.*;

public final class Generar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <!--meta http-equiv=\"refresh\" content=\"15\" url=AutoCccamWeb/Index.html\" -->\n");
      out.write("        <title>Descarga</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");

        String tipoSalida=request.getParameter("combo");
        String ruta="C:\\Users\\daw2r\\Desktop";
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
                    
      out.write(" <script> alert(\"Error en el server 1\") </script>   ");

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
                    
      out.write("<script> alert(\"Error en el server 2\") </script>");

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
                
      out.write("<script> alert(\"Error en el server 3\") </script>");

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
                     
      out.write(" <script> alert(\"Error en el server 4\") </script>   ");

            }

            iniciarf.guardarEnFichero(tipoSalida, servidores, ruta);

        }
        
      out.write("\n");
      out.write("        \n");
      out.write("        <h1>Se han generado ");
 out.println(servidores.size()); 
      out.write(" líneas</h1>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
