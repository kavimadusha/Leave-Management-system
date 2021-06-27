package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserLeaveHistory_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>My Leaves</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/user.css\"\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"sidebar\">\n");
      out.write("        <a href=\"UserLeaveReq.jsp\">Request A Leave</a>\n");
      out.write("        <a href=\"UserLeaveInfo.jsp\">My Remaining Leaves</a>\n");
      out.write("        <a class=\"active\" href=\"UserLeaveHistory.jsp\">My Leaves</a>\n");
      out.write("        <a href=\"UserChangePassword.jsp\">Change Password</a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                  <td><img src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSgDjAhlxkHCZYVBPMe6XaQ4oWRR2o-c8hMWPaeotGZ9O_0a-u5aqGEWO4zDie8yAFNTg&usqp=CAU\" width=\"200\" hight=\"250\"></td>\n");
      out.write("                  <td><h1>Leave Management System</h1></td>\n");
      out.write("                  <td><button class=\"logout\" onclick=\"location.href='Login.jsp'\" ><b>Log Out</b></button></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        <hr>\n");
      out.write("        <h2>My Leaves</h2>\n");
      out.write("        <table id=\"emp\" border=\"1\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>From Date</th>\n");
      out.write("                    <th>To Date</th>\n");
      out.write("                    <th>No of Date</th>\n");
      out.write("                    <th>Leave Type</th>\n");
      out.write("                    <th>Reason</th>\n");
      out.write("                    <th>Status</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td>05/07/2021</td>\n");
      out.write("                    <td>08/07/2021</td>\n");
      out.write("                    <td>03 Days</td>\n");
      out.write("                    <td>Casual Leave</td>\n");
      out.write("                    <td>Wedding Preparation</td>\n");
      out.write("                    <td>PENDING...</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>12/05/2021</td>\n");
      out.write("                    <td>13/05/2021</td>\n");
      out.write("                    <td>02 Days</td>\n");
      out.write("                    <td>Casual Leave</td>\n");
      out.write("                    <td>Family Trip</td>\n");
      out.write("                    <td>APPROVED</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>03/03/2021</td>\n");
      out.write("                    <td>04/03/2021</td>\n");
      out.write("                    <td>01 Days</td>\n");
      out.write("                    <td>Annual Leave</td>\n");
      out.write("                    <td>Mothers Birthday</td>\n");
      out.write("                    <td>APPROVED</td>\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("        </div>\n");
      out.write("</body>\n");
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
