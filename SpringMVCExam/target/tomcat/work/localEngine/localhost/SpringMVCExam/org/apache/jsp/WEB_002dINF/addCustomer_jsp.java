package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class addCustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>My JSP 'login.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!-- CSS -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("\t <link rel=\"stylesheet\" href=\"assets/css/dashboard.css\">\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("\t\t<nav class=\"navbar navbar-inverse navbar-fixed-top\">\r\n");
      out.write("      <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("          </button>\r\n");
      out.write("          <a class=\"navbar-brand\" href=\"#\">电影租赁管理系统</a>\r\n");
      out.write("        </div>\r\n");
      out.write("          <div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("          <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("          ");
if(null != session.getAttribute("user")){
      out.write("\r\n");
      out.write("            <li><a href=\"#\">");
      out.print(session.getAttribute("user") );
      out.write("</a></li>\r\n");
      out.write("          ");
} 
      out.write("\r\n");
      out.write("            <li><a href=\"#\">退出</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("          <form class=\"navbar-form navbar-right\">\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Search...\">\r\n");
      out.write("          </form>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-sm-3 col-md-2 sidebar\">\r\n");
      out.write("          <ul class=\"nav nav-sidebar\">\r\n");
      out.write("            <li class=\"active\"><a href=\"#\">创建customer<span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("           \r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main\">\r\n");
      out.write("          <h1 class=\"page-header\">创建customer</h1>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("          <h2 class=\"sub-header\">用户信息</h2>\r\n");
      out.write("          <div class=\"table-responsive\">\r\n");
      out.write("          <form class=\"form-horizontal col-sm-8\" action=\"");
      out.print(path );
      out.write("/addCustomer.do\" method=\"post\">\r\n");
      out.write("\t\t  \t<div class=\"form-group\">\r\n");
      out.write("\t\t\t    <label for=\"first_name\" class=\"col-sm-2 control-label\">First Name</label>\r\n");
      out.write("\t\t\t    <div class=\"col-sm-5\">\r\n");
      out.write("\t\t\t      <input type=\"text\" class=\"form-control\" id=\"first_name\" name=\"first_name\" placeholder=\"First Name\" required>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t    <label for=\"last_name\" class=\"col-sm-2 control-label\">Last Name</label>\r\n");
      out.write("\t\t\t    <div class=\"col-sm-5\">\r\n");
      out.write("\t\t\t      <input type=\"text\" class=\"form-control\" id=\"last_name\" name=\"last_name\" placeholder=\"Last Name\" required>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t    <label for=\"email\" class=\"col-sm-2 control-label\">Email</label>\r\n");
      out.write("\t\t\t    <div class=\"col-sm-5\">\r\n");
      out.write("\t\t\t      <input type=\"email\" class=\"form-control\" id=\"email\" name=\"email\" placeholder=\"Email\">\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t    <div class=\"form-group\">\r\n");
      out.write("\t\t\t    <label for=\"address\" class=\"col-sm-2 control-label\">Address</label>\r\n");
      out.write("\t\t\t    <div class=\"col-sm-5\">\r\n");
      out.write("\t\t\t       <select class=\"form-control\" id=\"address\" name=\"address\">\r\n");
      out.write("\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t   <div class=\"col-sm-offset-2 col-sm-3\">\r\n");
      out.write("\t\t\t      <button type=\"submit\" class=\"btn btn-primary\" id=\"btnAdd\">增加</button>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t    <div class=\" col-sm-3\">\r\n");
      out.write("\t\t\t      <button type=\"reset\" class=\"btn btn-default\">取消</button>\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t  </div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("   <script src=\"assets/js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t  $(document).ready(function(){\r\n");
      out.write("\t\t  \t\t$.ajax({\r\n");
      out.write("                 type:\"POST\",\r\n");
      out.write("                 url:\"");
      out.print(path );
      out.write("/address.do\",\r\n");
      out.write("                 async: false,\r\n");
      out.write("                 data:{\r\n");
      out.write("                    //userName:userName,\r\n");
      out.write("                    time:new Date()\r\n");
      out.write("                 },\r\n");
      out.write("                 timeout:2000,\r\n");
      out.write("                 dataType:\"json\",\r\n");
      out.write("                 success:function(data){\r\n");
      out.write("                \tvar addelement=document.getElementById(\"address\");  \r\n");
      out.write("                \tfor(var i=0;i<data.length;i++){\r\n");
      out.write("                \t\taddelement.options.add(new Option(data[i].address,data[i].address_id));  \r\n");
      out.write("                \t} \r\n");
      out.write("                \t/* $(\"#address\").options.add(new Option(data[1].address,data[1].address_id));  */\r\n");
      out.write("                \t/* $(\"#address\").appendChild(option);\r\n");
      out.write("                \toption.text = 'hello world';\r\n");
      out.write("     \t\t\t\toption.value =3; */\r\n");
      out.write("                 },\r\n");
      out.write("                 error:function( textStatus, errorThrown){\r\n");
      out.write("                     alert(\"系统ajax交互错误: \" + textStatus);\r\n");
      out.write("                 }\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t  \t});\r\n");
      out.write("\t  </script>\r\n");
      out.write("  </body>\r\n");
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
