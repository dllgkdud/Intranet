/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2023-01-01 00:38:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.net.InetAddress;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/D:/lhy/pro004/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/team/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1670133326757L));
    _jspx_dependants.put("jar:file:/D:/lhy/pro004/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/team/WEB-INF/lib/standard.jar!/META-INF/fmt.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("jar:file:/D:/lhy/pro004/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/team/WEB-INF/lib/standard.jar!/META-INF/fn.tld", Long.valueOf(1098678690000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("java.lang");
    _jspx_imports_packages.add("java.text");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.net.InetAddress");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /admin/admin.jsp(8,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("path1");
      // /admin/admin.jsp(8,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(request.getContextPath() );
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\t<title>Admin</title>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path1 }/head.jsp", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null), out, false);
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path1 }/header.jsp", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null), out, false);
      out.write("\r\n");
      out.write("\t<section class=\"section\">\r\n");
      out.write("\t\t<div class=\"container-scroller\">\r\n");
      out.write("\t\t\t<nav class=\"sidebar sidebar-offcanvas\" id=\"sidebar\">\r\n");
      out.write("\t\t\t\t<div class=\"sidebar-brand-wrapper d-none d-lg-flex align-items-center justify-content-center fixed-top\">\r\n");
      out.write("\t            \t<a class=\"sidebar-brand brand-logo\" href=\"index.html\"><img src=\"./img/logo.png\" alt=\"logo\" style=\"width:80px; height:75px; margin-left: 55px; margin-top: 45px;\"/></a>\r\n");
      out.write("\t            \t<a class=\"sidebar-brand brand-logo-mini\" href=\"index.html\"><img src=\"./assets/images/logo-mini.svg\" alt=\"logo\" /></a>\r\n");
      out.write("\t          \t</div>\r\n");
      out.write("\t          \t<ul class=\"nav\">\r\n");
      out.write("\t            \t<li class=\"nav-item profile\">\r\n");
      out.write("\t\t              <div class=\"profile-desc\">\r\n");
      out.write("\t\t                <div class=\"profile-pic\">\r\n");
      out.write("\t\t                  <div class=\"count-indicator\">\r\n");
      out.write("\t\t                    <img class=\"img-xs rounded-circle \" src=\"https://cdn-icons-png.flaticon.com/512/4623/4623635.png\" alt=\"\">\r\n");
      out.write("\t\t                    <span class=\"count bg-success\"></span>\r\n");
      out.write("\t\t                  </div>\r\n");
      out.write("\t\t                  <div class=\"profile-name\">\r\n");
      out.write("\t\t                    <h5 class=\"mb-0 font-weight-normal\">KIM</h5>\r\n");
      out.write("\t\t                    <span>관리자 계정</span>\r\n");
      out.write("\t\t                  </div>\r\n");
      out.write("\t\t                </div>\r\n");
      out.write("\t\t                <div class=\"dropdown-menu dropdown-menu-right sidebar-dropdown preview-list\" aria-labelledby=\"profile-dropdown\">\r\n");
      out.write("\t\t                  <a href=\"#\" class=\"dropdown-item preview-item\">\r\n");
      out.write("\t\t                    <div class=\"preview-thumbnail\">\r\n");
      out.write("\t\t                      <div class=\"preview-icon bg-dark rounded-circle\">\r\n");
      out.write("\t\t                        <i class=\"mdi mdi-settings text-primary\"></i>\r\n");
      out.write("\t\t                      </div>\r\n");
      out.write("\t\t                    </div>\r\n");
      out.write("\t\t                    <div class=\"preview-item-content\">\r\n");
      out.write("\t\t                      <p class=\"preview-subject ellipsis mb-1 text-small\">Account settings</p>\r\n");
      out.write("\t\t                    </div>\r\n");
      out.write("\t\t                  </a>\r\n");
      out.write("\t\t                  <div class=\"dropdown-divider\"></div>\r\n");
      out.write("\t\t                  <a href=\"#\" class=\"dropdown-item preview-item\">\r\n");
      out.write("\t\t                    <div class=\"preview-thumbnail\">\r\n");
      out.write("\t\t                      <div class=\"preview-icon bg-dark rounded-circle\">\r\n");
      out.write("\t\t                        <i class=\"mdi mdi-onepassword  text-info\"></i>\r\n");
      out.write("\t\t                      </div>\r\n");
      out.write("\t\t                    </div>\r\n");
      out.write("\t\t                    <div class=\"preview-item-content\">\r\n");
      out.write("\t\t                      <p class=\"preview-subject ellipsis mb-1 text-small\">Change Password</p>\r\n");
      out.write("\t\t                    </div>\r\n");
      out.write("\t\t                  </a>\r\n");
      out.write("\t\t                  <div class=\"dropdown-divider\"></div>\r\n");
      out.write("\t\t                  <a href=\"#\" class=\"dropdown-item preview-item\">\r\n");
      out.write("\t\t                    <div class=\"preview-thumbnail\">\r\n");
      out.write("\t\t                      <div class=\"preview-icon bg-dark rounded-circle\">\r\n");
      out.write("\t\t                        <i class=\"mdi mdi-calendar-today text-success\"></i>\r\n");
      out.write("\t\t                      </div>\r\n");
      out.write("\t\t                    </div>\r\n");
      out.write("\t\t                    <div class=\"preview-item-content\">\r\n");
      out.write("\t\t                      <p class=\"preview-subject ellipsis mb-1 text-small\">To-do list</p>\r\n");
      out.write("\t\t                    </div>\r\n");
      out.write("\t\t                  </a>\r\n");
      out.write("\t\t                </div>\r\n");
      out.write("\t\t              </div>\r\n");
      out.write("\t            \t</li>\r\n");
      out.write("\t\t            <li class=\"nav-item nav-category\">\r\n");
      out.write("\t\t              <span class=\"nav-link\">현재 페이지 기능</span>\r\n");
      out.write("\t\t            </li>\r\n");
      out.write("\t\t            <li class=\"nav-item menu-items\">\r\n");
      out.write("\t\t              <a class=\"nav-link\" href=\"index.html\">\r\n");
      out.write("\t\t                <span class=\"menu-icon\">\r\n");
      out.write("\t\t                  <i class=\"mdi mdi-speedometer\"></i>\r\n");
      out.write("\t\t                </span>\r\n");
      out.write("\t\t                <span class=\"menu-title\">전체문서</span>\r\n");
      out.write("\t\t              </a>\r\n");
      out.write("\t\t            </li>\r\n");
      out.write("\t\t            <li class=\"nav-item menu-items\">\r\n");
      out.write("\t\t              <a class=\"nav-link\" href=\"index.html\">\r\n");
      out.write("\t\t                <span class=\"menu-icon\">\r\n");
      out.write("\t\t                  <i class=\"mdi mdi-speedometer\"></i>\r\n");
      out.write("\t\t                </span>\r\n");
      out.write("\t\t                <span class=\"menu-title\">문서작성</span>\r\n");
      out.write("\t\t              </a>\r\n");
      out.write("\t\t            </li>\r\n");
      out.write("\t\t            <li class=\"nav-item menu-items\">\r\n");
      out.write("\t\t              <a class=\"nav-link\" href=\"pages/forms/basic_elements.html\">\r\n");
      out.write("\t\t                <span class=\"menu-icon\">\r\n");
      out.write("\t\t                  <i class=\"mdi mdi-playlist-play\"></i>\r\n");
      out.write("\t\t                </span>\r\n");
      out.write("\t\t                <span class=\"menu-title\">결재대기</span>\r\n");
      out.write("\t\t              </a>\r\n");
      out.write("\t\t            </li>\r\n");
      out.write("\t\t            <li class=\"nav-item menu-items\">\r\n");
      out.write("\t\t              <a class=\"nav-link\" href=\"pages/tables/basic-table.html\">\r\n");
      out.write("\t\t                <span class=\"menu-icon\">\r\n");
      out.write("\t\t                  <i class=\"mdi mdi-table-large\"></i>\r\n");
      out.write("\t\t                </span>\r\n");
      out.write("\t\t                <span class=\"menu-title\">결재완료</span>\r\n");
      out.write("\t\t              </a>\r\n");
      out.write("\t\t            </li>\r\n");
      out.write("\t            \t<li class=\"nav-item menu-items\">\r\n");
      out.write("\t\t                <a class=\"nav-link\" href=\"pages/tables/basic-table.html\">\r\n");
      out.write("\t\t                  <span class=\"menu-icon\">\r\n");
      out.write("\t\t                    <i class=\"mdi mdi-table-large\"></i>\r\n");
      out.write("\t\t                  </span>\r\n");
      out.write("\t\t                  <span class=\"menu-title\">결재보류</span>\r\n");
      out.write("\t\t                </a>\r\n");
      out.write("\t\t\t\t\t</li> \r\n");
      out.write("\t          \t</ul>\r\n");
      out.write("\t        </nav>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<h2>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sid }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("님 환영합니다.</h2>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path1 }/footer.jsp", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null), out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
