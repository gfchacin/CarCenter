package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import co.com.asesoftware.business.MechanicsBusiness;
import co.com.asesoftware.ws.client.MechanicDto;

public final class mechanicsAvailable_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Lista de Mecanicos Disponibles</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 align=\"center\">Lista de Mecanicos Disponibles</h1>\n");
      out.write("        \n");
      out.write("        <table border=\"1\" width=\"900\" align=\"center\">\n");
      out.write("            <tr bgcolor=\"skyblue\">\n");
      out.write("                <th colspan=\"11\">Mantenimiento de Mecanicos</th>\n");
      out.write("                <th><a href=\"mechanicregistration.jsp\"><img src=\"C:\\Users\\User\\Documents\\NetBeansProjects\\CarCenter\\iconos\\adicionar.jpg\" width=\"40\" height=\"40\"></a></th>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr bgcolor=\"skyblue\">\n");
      out.write("                <th>Tipo Identificación</th>\n");
      out.write("                <th>Documento</th>\n");
      out.write("                <th>Primer Nombre</th>\n");
      out.write("                <th>Segundo Nombre</th>\n");
      out.write("                <th>Primer Apellido</th>\n");
      out.write("                <th>Segundo Apellido</th>\n");
      out.write("                <th>Télefono</th>\n");
      out.write("                <th>Dirección</th>\n");
      out.write("                <th>Email</th>\n");
      out.write("                <th>Estado</th>\n");
      out.write("                <th>Horas Laboradas</th>\n");
      out.write("                <th>Acción</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

            
            MechanicDto[] mechanicList = MechanicsBusiness.getAvailableMechanics();
            for(int index=0;index<mechanicList.length;index++)
            {
        
      out.write("     \n");
      out.write("            <tr>  \n");
      out.write("                <th>");
      out.print(mechanicList[index].getDocumentType());
      out.write("</th>\n");
      out.write("                <th>");
      out.print(mechanicList[index].getDocument());
      out.write("</th>\n");
      out.write("                <th>");
      out.print(mechanicList[index].getFirstName());
      out.write("</th>\n");
      out.write("                <th>");
      out.print(mechanicList[index].getSecondName());
      out.write("</th>\n");
      out.write("                <th>");
      out.print(mechanicList[index].getFirstLastName());
      out.write("</th>\n");
      out.write("                <th>");
      out.print(mechanicList[index].getSecondLastName());
      out.write("</th>\n");
      out.write("                <th>");
      out.print(mechanicList[index].getPhone());
      out.write("</th>\n");
      out.write("                <th>");
      out.print(mechanicList[index].getAddress());
      out.write("</th>\n");
      out.write("                <th>");
      out.print(mechanicList[index].getEmail());
      out.write("</th>\n");
      out.write("                <th>");
      out.print(mechanicList[index].getState().compareTo("L")==0?"Disponible":"Asignado");
      out.write("</th>\n");
      out.write("                <th>");
      out.print(mechanicList[index].getHorasTrabajadas());
      out.write("</th>\n");
      out.write("                <th><a href=\"mechanicregistration.jsp\"><img src=\"C:\\Users\\User\\Documents\\NetBeansProjects\\CarCenter\\iconos\\asignar.jpg\" width=\"30\" height=\"30\"></a></th>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("        ");
   }
        
        
      out.write("\n");
      out.write("            \n");
      out.write("        </table>\n");
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
