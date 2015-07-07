package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    \r\n");
      out.write("    <body>\r\n");
      out.write("    <center>\r\n");
      out.write("    <h1>JLC TechSuport</h1>\r\n");
      out.write("    <h2>Registration Form</h2>\r\n");
      out.write("   \r\n");
      out.write("    <font color=\"red\" size=\"4\" face=\"arial\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${MSG}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" </font>\r\n");
      out.write("    <form action=\"register.jlc\" method=\"post\">\r\n");
      out.write("    \r\n");
      out.write("    <table>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td>Full name</td>\r\n");
      out.write("    <td><input type=\"text\" name=\"fname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${FNM}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></td>\r\n");
      out.write("    <td><font color=\"red\" size=\"4\" face=\"arial\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${FNMERR}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</font></td></tr> \r\n");
      out.write("    <tr>\r\n");
      out.write("    <td>Email Id</td>\r\n");
      out.write("    <td><input type=\"text\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${EML}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></td>\r\n");
      out.write("    <td><font color=\"red\" size=\"4\" face=\"arial\"/>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${EMLERR}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</font></td></tr>\r\n");
      out.write("     <tr>\r\n");
      out.write("    <td>Phone</td>\r\n");
      out.write("    <td><input type=\"text\" name=\"phone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PHN}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></td>\r\n");
      out.write("    <td><font color=\"red\" size=\"4\" face=\"arial\"/>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PHNERR}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</font></td></tr>\r\n");
      out.write("     <tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td>Username</td>\r\n");
      out.write("    <td><input type=\"text\" name=\"username\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${UNM}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></td>\r\n");
      out.write("    <td><font color=\"red\" size=\"4\" face=\"arial\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${UNMERR}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</font></td></tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td>Password</td>\r\n");
      out.write("    <td><input type=\"password\" name=\"password\"></td>\r\n");
      out.write("    <td><font color=\"red\" size=\"4\" face=\"arial\"/>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PWDERR}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</font></td></tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("    <td colspan=\"3\" align=\"center\"><input type=\"submit\" value=\"Register\"/> </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    </table> \r\n");
      out.write("    </form>\r\n");
      out.write("    <h2><a href=\"index.jsp\">Login</a></h2>\r\n");
      out.write("    </center>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
