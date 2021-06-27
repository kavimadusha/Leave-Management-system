package org.apache.jsp.User_0020JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserLeaveReq_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <head>\n");
      out.write("        <title>Request A Leave</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/user.css\"\n");
      out.write("    </head>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"sidebar\">\n");
      out.write("        <a class=\"active\" href=\"UserLeaveReq.jsp\">Request A Leave</a>\n");
      out.write("        <a href=\"UserLeaveInfo.jsp\">My Remaining Leaves</a>\n");
      out.write("        <a href=\"UserLeaveHistory.jsp\">My Leaves</a>\n");
      out.write("        <a href=\"UserChangePassword.jsp\">Change Password</a>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"content\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                  <td><img src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSgDjAhlxkHCZYVBPMe6XaQ4oWRR2o-c8hMWPaeotGZ9O_0a-u5aqGEWO4zDie8yAFNTg&usqp=CAU\" width=\"200\" hight=\"250\"></td>\n");
      out.write("                  <td><h1>Leave Management System</h1></td>\n");
      out.write("                  <td><button class=\"logout\"><b>Log Out</b></button></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        <hr>\n");
      out.write("        <h2>Request A Leave</h2>\n");
      out.write("        <form method=\"POST\">\n");
      out.write("            <center>\n");
      out.write("            <table id=\"opt\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Emp ID:</td>\n");
      out.write("                    <td><input id=\"ipt\" type=\"text\" name=\"empid\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><br></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Emp Name:</td>\n");
      out.write("                    <td><input id=\"ipt\" type=\"text\" name=\"empname\" required=\"\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><br></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>From Date:</td>\n");
      out.write("                    <td><input id=\"ipt\" type=\"date\" name=\"frm\" required=\"\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><br></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>To Date:</td>\n");
      out.write("                    <td><input id=\"ipt\" type=\"date\" name=\"to\" required=\"\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><br></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Reason For Leave:</td>\n");
      out.write("                    <td><textarea id=\"ipt\" name=\"reason\" rows=\"4\" cols=\"20\" required=\"\"></textarea></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><br></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Leave Type:</td>\n");
      out.write("                    <td>\n");
      out.write("                        <select id=\"ipt\" name=\"type\">\n");
      out.write("                            <option value=\"casual\">Causal Leave</option>\n");
      out.write("                            <option value=\"medical\">Medical Leave</option>\n");
      out.write("                            <option value=\"annual\">Annual Leave</option>\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            </center>\n");
      out.write("            <br>\n");
      out.write("            <center>\n");
      out.write("                <input class=\"submit\" type=\"submit\" value=\"Submit\" />\n");
      out.write("                <input class=\"reset\" type=\"reset\" value=\"Cancel\" />\n");
      out.write("            </center>\n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
