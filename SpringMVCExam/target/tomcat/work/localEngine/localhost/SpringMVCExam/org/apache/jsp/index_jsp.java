package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

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
      out.write("        <div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
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
      out.write("            <li><a href=\"");
      out.print(path);
      out.write("/exit.do\">退出</a></li>\r\n");
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
      out.write("            <li class=\"active\"><a href=\"#\">Customer 管理 <span class=\"sr-only\">(current)</span></a></li>\r\n");
      out.write("            <li><a href=\"filme.jsp\">Film 管理</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main\">\r\n");
      out.write("          <h1 class=\"page-header\">用户管理</h1>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"row placeholders\">\r\n");
      out.write("            <div class=\"col-xs-6 col-sm-3 placeholder\">\r\n");
      out.write("              <span class=\"text-muted\"><button type=\"button\" id=\"btn_query\" class=\"btn btn-primary\">所有用户</button></span>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-xs-6 col-sm-3 placeholder\">\r\n");
      out.write("              <span class=\"text-muted\"><a href=\"addCustomer.jsp\"><button type=\"button\" id=\"btn_add\" class=\"btn btn-primary\">新增用户</button></a></span>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <h2 class=\"sub-header\">用户信息</h2>\r\n");
      out.write("          <div class=\"table-responsive\">\r\n");
      out.write("           \r\n");
      out.write("            <table class=\"table table-striped\" id=\"table\">\r\n");
      out.write("            \t\r\n");
      out.write("            </table>\r\n");
      out.write("            </form>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  \r\n");
      out.write("        <!-- Javascript -->\r\n");
      out.write("        <script src=\"assets/js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/bootstrap-table.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/bootstrap-table-zh-CN.min.js\"></script>\r\n");
      out.write("        <!-- <script src=\"assets/js/query.js\"></script>    --> \r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("\t\t  \t$(document).ready(function(){\r\n");
      out.write("\t\t  \t\t$(\"#btn_query\").click(function(){\r\n");
      out.write("\t\t  \t\t$.ajax({\r\n");
      out.write("                 type:\"POST\",\r\n");
      out.write("                 url:\"");
      out.print(path);
      out.write("/select.do\",\r\n");
      out.write("                 async: false,\r\n");
      out.write("                 data:{\r\n");
      out.write("                    //userName:userName,\r\n");
      out.write("                    time:new Date()\r\n");
      out.write("                 },\r\n");
      out.write("                 timeout:2000,\r\n");
      out.write("                 dataType:\"json\",\r\n");
      out.write("                 success:function(data){\r\n");
      out.write("                \t $(\"#table\").bootstrapTable({\r\n");
      out.write("                \t\t pagination:true,\r\n");
      out.write("                \t\t pageNumber:1,\r\n");
      out.write("                \t\t pageSize:15,\r\n");
      out.write("                \t\t pageList:[25,50,100],\r\n");
      out.write("                \t\t /* showToggle:true, */\r\n");
      out.write("                \t\t columns: [{\r\n");
      out.write("                \t\t        field: '',\r\n");
      out.write("                \t\t        title: '操作'\r\n");
      out.write("                \t\t    },{\r\n");
      out.write("                \t\t        field: 'first_name',\r\n");
      out.write("                \t\t        title: 'first_name'\r\n");
      out.write("                \t\t    }, {\r\n");
      out.write("                \t\t        field: 'last_name',\r\n");
      out.write("                \t\t        title: 'last_name'\r\n");
      out.write("                \t\t    },{\r\n");
      out.write("                \t\t        field: 'email',\r\n");
      out.write("                \t\t        title: 'email'\r\n");
      out.write("                \t\t    },{\r\n");
      out.write("                \t\t        field: 'customer_id',\r\n");
      out.write("                \t\t        title: 'customer_id'\r\n");
      out.write("                \t\t    },{\r\n");
      out.write("                \t\t        field: 'last_update',\r\n");
      out.write("                \t\t        title: 'last_update'\r\n");
      out.write("                \t\t    }],\r\n");
      out.write("                \t\t    \r\n");
      out.write("                \t\t    data: data\r\n");
      out.write("             });\r\n");
      out.write("                 },\r\n");
      out.write("                 error:function( textStatus, errorThrown){\r\n");
      out.write("                     alert(\"系统ajax交互错误: \" + textStatus);\r\n");
      out.write("                 }\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t  \t\t});\r\n");
      out.write("\t\t  \t});\r\n");
      out.write("\t\t</script>  \r\n");
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
