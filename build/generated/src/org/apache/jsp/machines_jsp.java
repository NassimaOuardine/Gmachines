package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entities.Machine;
import service.MachineService;

public final class machines_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>JSP Page</title>\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: #f0f0f0;\n");
      out.write("            text-align: center;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        form {\n");
      out.write("            max-width: 400px;\n");
      out.write("            margin: 20px auto;\n");
      out.write("            padding: 20px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            background-color: #fff;\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        fieldset {\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            padding: 10px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            background-color: #f9f9f9;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        legend {\n");
      out.write("            font-weight: bold;\n");
      out.write("            font-size: 1.2em;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        table {\n");
      out.write("            width: 100%;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th, td {\n");
      out.write("            padding: 10px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th {\n");
      out.write("            background-color: #007bff;\n");
      out.write("            color: #fff;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        tr:nth-child(even) {\n");
      out.write("            background-color: #f2f2f2;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"text\"] {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 10px;\n");
      out.write("            margin: 5px 0;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"submit\"],\n");
      out.write("        input[type=\"reset\"] {\n");
      out.write("            background-color: #007bff;\n");
      out.write("            color: #fff;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input[type=\"reset\"] {\n");
      out.write("            margin-left: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        a {\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: #007bff;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <form action=\"MachineController\" method=\"GET\">\n");
      out.write("        <fieldset>\n");
      out.write("            <legend>Information Machine</legend>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Referance :</td>\n");
      out.write("                    <td><input type=\"text\" name=\"ref\" value=\"\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Marque :</td>\n");
      out.write("                    <td><input type=\"text\" name=\"marque\" value=\"\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Prix :</td>\n");
      out.write("                    <td><input type=\"text\" name=\"prix\" value=\"\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input type=\"submit\" value=\"Ajouter\" /><input type=\"reset\" value=\"Annuler\" /></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </fieldset>\n");
      out.write("    </form>\n");
      out.write("    <fieldset>\n");
      out.write("        <legend>Liste des machines</legend>\n");
      out.write("        <table>\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>ID</th>\n");
      out.write("                    <th>Referance</th>\n");
      out.write("                    <th>Marque</th>\n");
      out.write("                    <th>Prix</th>\n");
      out.write("                    <th>Modifier</th>\n");
      out.write("                    <th>Supprimer</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    MachineService ms = new MachineService();
                    for (Machine m : ms.findAll()) {
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( m.getId() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( m.getRef() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( m.getMarque() );
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( m.getPrix() );
      out.write("</td>\n");
      out.write("                    <td><a href=\"MachineController?op=delete&id=");
      out.print( m.getId() );
      out.write("\">Supprimer</a></td>\n");
      out.write("                    <td><a href=\"MachineController\">Modifier</a></td>\n");
      out.write("                </tr>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </fieldset>\n");
      out.write("</body>\n");
      out.write("</html>");
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
