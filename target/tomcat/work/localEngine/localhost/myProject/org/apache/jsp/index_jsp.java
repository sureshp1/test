package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("    <h1>JLC TechSuport</h1>\n");
      out.write("    <h2>Login Form</h2>\n");
      out.write("    \n");
      out.write("    <font color=\"red\" size=\"4\" face=\"arial\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${MSG}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" </font>\n");
      out.write("    <form action=\"login.jlc\" method=\"post\">\n");
      out.write("    \n");
      out.write("    <table>\n");
      out.write("    <tr>\n");
      out.write("    <td>Username</td>\n");
      out.write("    <td><input type=\"text\" name=\"username\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${UNM}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\"></td>\n");
      out.write("    <td><font color=\"red\" size=\"4\" face=\"arial\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${UNMERR}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</font></td></tr> \n");
      out.write("    <tr>\n");
      out.write("    <td>Password</td>\n");
      out.write("    <td><input type=\"password\" name=\"password\"></td>\n");
      out.write("    <td><font color=\"red\" size=\"4\" face=\"arial\"/>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${PWDERR}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</font></td></tr>\n");
      out.write("    <tr>\n");
      out.write("    <td colspan=\"3\" align=\"center\"><input type=\"submit\" value=\"Login\"/> </td>\n");
      out.write("    </tr>\n");
      out.write("    </table> \n");
      out.write("    </form>\n");
      out.write("    <h2><a href=\"register.jsp\">New User Signup</a>|<a href=\"forgotpw.jsp\">Forget My password</a></h2>\n");
      out.write("    </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
