package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MyUi_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <title>MyUi.jsp</title>\r\n");
      out.write("\t\r\n");
      out.write("    <meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("    <meta http-equiv=\"description\" content=\"this is my page\">\r\n");
      out.write("    <meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"themes/default/easyui.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"themes/icon.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"..demo.css\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"jquery.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"jquery.easyui.min.js\"></script>\r\n");
      out.write("    <!--<link rel=\"stylesheet\" type=\"text/css\" href=\"./styles.css\">-->\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("    \tbody{\r\n");
      out.write("\t\t\tfont-size:12px;\r\n");
      out.write("\t\t}\r\n");
      out.write("    </style>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    \tfunction urlClick(myTitle,myUrl){\r\n");
      out.write("    \t\t//判断title='菜系管理' 是否存在\t\r\n");
      out.write("    \t\tvar ifExist=$(\"#myTabs\").tabs(\"exists\",myTitle);\t\r\n");
      out.write("    \t\tif(!ifExist){\r\n");
      out.write("    \t\t\t$(\"#myTabs\").tabs('add',{\r\n");
      out.write("    \t\t\ttitle:myTitle,\r\n");
      out.write("    \t\t\tclosable:true,\r\n");
      out.write("    \t\t\tcontent:'<iframe frameborder=\"0\" height=\"100%\" width=\"100%\" scrolling=\"no\" src=\"'+myUrl+'\"></iframe>'\r\n");
      out.write("    \t\t\t});\r\n");
      out.write("    \t\t}\r\n");
      out.write("    \t\t$(\"#myTabs\").tabs(\"select\",myTitle);\r\n");
      out.write("    \t}\r\n");
      out.write("    </script>\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body style=\"margin:0px\">\r\n");
      out.write("\t<div class=\"easyui-layout\" style=\"width:100%;height:100%;\">\r\n");
      out.write("\t\t<!-- 北部 只会设置 高度 -->\r\n");
      out.write("\t\t<div data-options=\"region:'north'\" style=\"height:16%;\">\r\n");
      out.write("\t\t\t<div style=\"height:85%\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div style=\"text-align: right;width: 86%\"><a href=\"\" style=\"\">安全退出</a></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div data-options=\"region:'west',split:true\" title=\"导航菜单\" style=\"width:20%;\">\r\n");
      out.write("\t\t\t<div class=\"easyui-accordion\" style=\"width:100%;height:50%;\">\r\n");
      out.write("\t\t\t\t<div title=\"权限管理\" style=\"overflow:auto;padding:10xp;\">\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div title=\"系统设置\" style=\"padding:10px;\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div data-options=\"region:'center',iconCls:'icon-large-chart'\">\r\n");
      out.write("\t\t\t<div id=\"myTabs\" class=\"easyui-tabs\"  style=\"width:100%;height:100%\">\r\n");
      out.write("\t\t\t\t<div title=\"欢迎访问\"  style=\"padding:10px\"></div>\r\n");
      out.write("\t\t\t</div>\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /MyUi.jsp(50,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("menu");
    // /MyUi.jsp(50,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/MyUi.jsp(50,5) '${requestScope.menuList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${requestScope.menuList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<a href=\"javascript:urlClick('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${menu.menuName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('\'');
          out.write(',');
          out.write('\'');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${menu.menuUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("')\" style=\"text-decoration: none\"><img alt=\"\" src=\"themes/icons/man.png\" style=\"margin-top:10px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${menu.menuName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("<br/></a>\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
