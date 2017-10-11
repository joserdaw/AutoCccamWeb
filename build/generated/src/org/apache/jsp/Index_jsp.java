package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.IOException;
import com.josereal.modelo.*;
import com.josereal.controlador.*;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>AutoCccam WEB</title>\n");
      out.write("        <link rel=\"STYLESHEET\" type=\"text/css\" href=\"hojaweb.css\">\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"random.ico\" />\n");
      out.write("        <script src=\"funcionesjs.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
Funciones funci=new Funciones();
      out.write("\n");
      out.write("        \n");
      out.write("        <h1>AutoCccam generator</h1>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <form name=\"formulario\">\n");
      out.write("            <input id=\"check\" type=\"checkbox\" checked=\"checked\" value=\"srvr1\">Servidor 1</input>\n");
      out.write("            <br>\n");
      out.write("            <input id=\"check\" type=\"checkbox\" checked=\"checked\" value=\"srvr2\">Servidor 2</input>\n");
      out.write("            <br>\n");
      out.write("            <input id=\"check\" type=\"checkbox\" checked=\"checked\" value=\"srvr3\">Servidor 3</input>\n");
      out.write("            <br>\n");
      out.write("            <input id=\"check\" type=\"checkbox\" checked=\"checked\" value=\"srvr4\">Servidor 4</input>\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("            <select id=\"comboselect\">\n");
      out.write("                <option value=\"general\" selected=\"selected\">General</option>\n");
      out.write("                <option value=\"hadu\">Hadu</option>\n");
      out.write("            </select>\n");
      out.write("\n");
      out.write("            <br>\n");
      out.write("            <button id=\"btnGenerar\" onclick=\"generarFichero()\">Generar</button>\n");
      out.write("        </form>\n");
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
