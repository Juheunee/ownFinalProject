/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.87
 * Generated at: 2023-06-01 00:52:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class enrollForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\" />\r\n");
      out.write("  \r\n");
      out.write("  <!-- header css -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/css/member/enrollForm.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/css/common/memberForm.css\">\r\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/common.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <title>회원가입</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <!-- 헤더 영역 시작-->\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/header.jsp", out, false);
      out.write("	 \r\n");
      out.write("  <!-- 헤더 영역 끝-->\r\n");
      out.write("\r\n");
      out.write("  <div id=\"Container-Wrapper\">\r\n");
      out.write("    <!-- 페이지 영역 시작 -->\r\n");
      out.write("    <div id=\"container\">\r\n");
      out.write("      <div id=\"main\">\r\n");
      out.write("        <div id=\"content\">\r\n");
      out.write("          <div class=\"page_aticle aticle_type2\">\r\n");
      out.write("\r\n");
      out.write("            <!-- 본문 영역-->\r\n");
      out.write("            <div id=\"viewOrderList\" class=\"page_section section_orderlist\">\r\n");
      out.write("              <div class=\"page_section section_destination\">\r\n");
      out.write("                <!-- 이 영역 안에서 페이지 작업 하시면 됩니다 -->\r\n");
      out.write("                <div id=\"mainContent\">\r\n");
      out.write("                  <div class=\"sub1\" >\r\n");
      out.write("                    <div class=\"title1\">\r\n");
      out.write("                      <h1>회원가입</h1>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"title2\">\r\n");
      out.write("                      <h7>회원으로 가입하시면 첫고객 대상 10% 할인쿠폰을 넣어드립니다. <br>\r\n");
      out.write("                      지금바로 회원가입 해보세요.</h7>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"sub2\">\r\n");
      out.write("                    <div class=\"enrollWrapper\">\r\n");
      out.write("                      <p>\r\n");
      out.write("                        <label for=\"\">● 아이디 </label><br>\r\n");
      out.write("                        <input type=\"text\" name=\"userId\" maxlength=\"15\" placeholder=\"아이디를 입력해주세요.\" required><br>\r\n");
      out.write("                      </p>\r\n");
      out.write("                      <p>\r\n");
      out.write("                        <label for=\"\">● 비밀번호 </label><br>\r\n");
      out.write("                        <input type=\"text\" name=\"userPwd1\" maxlength=\"15\" placeholder=\"영문+숫자+특수문자 조합 8~16자리\" required><br>\r\n");
      out.write("                      </p>\r\n");
      out.write("                      <p>\r\n");
      out.write("                        <label for=\"\">● 비밀번호 확인 </label><br>\r\n");
      out.write("                        <input type=\"text\" name=\"userPwd2\" maxlength=\"15\" placeholder=\"정확히 기입해주세요\" required><br>\r\n");
      out.write("                      </p>\r\n");
      out.write("                      <p>\r\n");
      out.write("                        <label for=\"\">● 이름 </label><br>\r\n");
      out.write("                        <input type=\"text\" name=\"userName\" maxlength=\"15\" placeholder=\"ex)홍길동\" required><br>\r\n");
      out.write("                      </p>\r\n");
      out.write("                      <p>\r\n");
      out.write("                        <label for=\"\">● 주민번호 </label><br>\r\n");
      out.write("                        <input type=\"text\" name=\"userSsn1\" maxlength=\"6\" required> -\r\n");
      out.write("                        <input type=\"text\" name=\"userSnn2\" maxlength=\"7\" required><br>\r\n");
      out.write("                      </p>\r\n");
      out.write("                      <p>\r\n");
      out.write("                        <label for=\"\">● 휴대폰 번호 </label><br>\r\n");
      out.write("                        <input type=\"text\" name=\"phone\" maxlength=\"11\" placeholder=\"(-) 제외하고 숫자  ex)01012349876\" required><br>\r\n");
      out.write("                      </p>\r\n");
      out.write("                      <p>\r\n");
      out.write("                        <label for=\"\">● 이메일 </label><br>\r\n");
      out.write("                        <input type=\"email\" name=\"email\" maxlength=\"30\" placeholder=\"@ 까지 정확한 이메일 형식을 입력해주세요.\" required><br>\r\n");
      out.write("                      </p>\r\n");
      out.write("                      <p>\r\n");
      out.write("                        <label for=\"\">● 거주지 주소 </label><br>\r\n");
      out.write("                        <input type=\"text\" name=\"address\" maxlength=\"30\" placeholder=\"상세 주소를 입력해주세요.\" required><br>\r\n");
      out.write("                      </p>\r\n");
      out.write("                      <span class=\"input_btn checkbox\">\r\n");
      out.write("                        <label>● 성별</label><br>\r\n");
      out.write("                        <input type=\"checkbox\" name=\"gender1\" id=\"gender1\" value=\"Y\"> 남\r\n");
      out.write("                        <input type=\"checkbox\" name=\"gender2\" id=\"gender2\" value=\"Y\"> 여 <br>\r\n");
      out.write("                      </span>\r\n");
      out.write("                      <span class=\"input_btn checkbox\">\r\n");
      out.write("                        <input type=\"checkbox\" name=\"checkbox\" id=\"checkEmail\" value=\"Y\">\r\n");
      out.write("                        <label>이메일수신동의 여부(선택)</label>\r\n");
      out.write("                      </span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"btnWrapper\">\r\n");
      out.write("                      <button type=\"button\" class=\"btn_back\">뒤로가기</button>\r\n");
      out.write("                      <button type=\"button\" class=\"btn_submit\">확인</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- 이 영역 안에서 페이지 작업 하시면 됩니다 -->\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- 본문 영역 끝-->\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- Footer 영역 시작 -->\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/footer.jsp", out, false);
      out.write(" \r\n");
      out.write("  <!-- Footer 영역 끝 -->\r\n");
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