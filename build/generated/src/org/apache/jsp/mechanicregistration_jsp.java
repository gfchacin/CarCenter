package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import co.com.asesoftware.business.MechanicsBusiness;

public final class mechanicregistration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 align=\"center\">FORMULARIO DE REGISTRO DE MECANICOS</h1>\n");
      out.write("        <form action =\"\" method=\"post\">\n");
      out.write("            <table border=\"1\" align=\"center\" width=\"300\">\n");
      out.write("                <tr bgcolor=\"skyblue\">\n");
      out.write("                    <th colspan=\"2\">Datos del Colaborador</th>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"center\">Tipo de Documento: </td>\n");
      out.write("                    <td align=\"center\"><select name =\"selectTpoDoc\">\n");
      out.write("                        <option value=\"CC\">Cedula de Ciudadania</option>\n");
      out.write("                        <option value=\"CE\">Cedula de Extranjeria</option>\n");
      out.write("                        <option value=\"PP\">Pasaporte</option>\n");
      out.write("                        <option value=\"TI\">Tarjeta de Identidad</option>\n");
      out.write("                    </select></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"center\">Documento: </td>\n");
      out.write("                    <td align=\"center\"><input type=\"text\" name=\"txtDoc\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"center\">Primer Nombre: </td>\n");
      out.write("                    <td align=\"center\"><input type=\"text\" name=\"txtPrNom\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"center\">Segundo Nombre: </td>\n");
      out.write("                    <td align=\"center\"><input type=\"text\" name=\"txtScNom\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"center\">Primer Apellido: </td>\n");
      out.write("                    <td align=\"center\"><input type=\"text\" name=\"txtPrApe\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"center\">Segundo Apellido: </td>\n");
      out.write("                    <td align=\"center\"><input type=\"text\" name=\"txtScApe\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"center\">Celular: </td>\n");
      out.write("                    <td align=\"center\"><input type=\"text\" name=\"txtCel\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"center\">Direccion: </td>\n");
      out.write("                    <td align=\"center\"><input type=\"text\" name=\"txtDir\"></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td align=\"center\">Email: </td>\n");
      out.write("                    <td align=\"center\"><input type=\"text\" name=\"txtEmail\"></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td align=\"center\">Estado: </td>\n");
      out.write("                    <td align=\"center\"><select name =\"selectTpoEst\">\n");
      out.write("                                        <option value=\"A\">Asignado</option>\n");
      out.write("                                        <option value=\"L\">Libre</option>\n");
      out.write("                                       </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th colspan=\"2\"><input type=\"submit\" name=\"btnMecReg\" value=\"Registrar Mecanico\"></th>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        ");

            if(request.getParameter("btnMecReg")!=null){
            String stateExecution = MechanicsBusiness.registerMechanics(request.getParameter("selectTpoDoc"), 
                    request.getParameter("txtDoc"), 
                    request.getParameter("txtPrNom"), 
                    request.getParameter("txtScNom"), 
                    request.getParameter("txtPrApe"), 
                    request.getParameter("txtScNom"), 
                    request.getParameter("txtCel"), 
                    request.getParameter("txtDir"), 
                    request.getParameter("txtEmail"), 
                    request.getParameter("selectTpoEst"));
            if(stateExecution.compareTo("OK")==0)
            {
                request.getRequestDispatcher("insertok.jsp").forward(request, response);
            }
            else
            {
                request.getRequestDispatcher("inserterror.jsp").forward(request, response);
            }
            }
        
      out.write("\n");
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
