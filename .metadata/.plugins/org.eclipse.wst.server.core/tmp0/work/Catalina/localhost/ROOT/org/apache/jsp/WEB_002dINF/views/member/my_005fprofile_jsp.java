/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.87
 * Generated at: 2023-06-12 05:46:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class my_005fprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <link rel=\"stylesheet\" href=\"/resources/css/member/my_profile.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/css/common/memberForm.css\">\r\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/common.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <title>마이페이지_내프로필관리</title>\r\n");
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
      out.write("            <!-- 사이드 메뉴바 -->\r\n");
      out.write("            <div id=\"snb\" class=\"snb_my\" style=\"position: absolute;\">\r\n");
      out.write("              <img src=\"/resources/img/main/사이드바이미지.png\" alt=\"sideBarImg\">\r\n");
      out.write("              <h2 class=\"tit_snb\">My Page</h2>\r\n");
      out.write("              <div class=\"inner_sub\">\r\n");
      out.write("                <ul class=\"list_menu\">\r\n");
      out.write("                  <li class=\"on\">\r\n");
      out.write("                    <a href=\"myProfile.me\">내 프로필</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li>\r\n");
      out.write("                    <a href=\"petProfile.me\">반려동물 프로필</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li>\r\n");
      out.write("                    <a href=\"petsiterLike.me\">펫시터 찜</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li>\r\n");
      out.write("                    <a href=\"myBoard.me\">내 게시글 및 댓글</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li>\r\n");
      out.write("                    <a href=\"reservationList\">예약 조회</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li>\r\n");
      out.write("                    <a href=\"journalList\">돌봄 일지</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- 사이드 메뉴바 끝 -->\r\n");
      out.write("\r\n");
      out.write("            <!-- 본문 영역-->\r\n");
      out.write("            <div id=\"viewOrderList\" class=\"page_section section_orderlist\">\r\n");
      out.write("              <div class=\"page_section section_destination\">\r\n");
      out.write("                <!-- 이 영역 안에서 페이지 작업 하시면 됩니다 -->\r\n");
      out.write("                <!--<div style=\"height: 1000px; background-color: beige;\"></div> -->\r\n");
      out.write("                <div id=\"titleWrapper\">\r\n");
      out.write("                  <h3 class=\"title_11\">내 프로필 정보</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("                <form id=\"profileWrapper\" action=\"update.me\" method=\"get\">\r\n");
      out.write("                  <hr>\r\n");
      out.write("                    <div class=\"file_main\">\r\n");
      out.write("                      <label>사진</label>\r\n");
      out.write("                      <div class=\"file_change\">\r\n");
      out.write("                        <img class=\"profile_img\" src=\"/resources/upFiles/member_profiles/user01.png\" />\r\n");
      out.write("                        <div class=\"profile_con\">\r\n");
      out.write("                          <p>등록된 사진은 회원님의 게시물이나 댓글들에 사용됩니다.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                  <hr>\r\n");
      out.write("                  <label>아이디</label>\r\n");
      out.write("                  <input class=\"default_id\" id=\"userId\" placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ loginUser.userId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly />\r\n");
      out.write("                  <hr>\r\n");
      out.write("                  <label>비밀번호</label>\r\n");
      out.write("                  <input class=\"change_pwd\" id=\"userPwd\" placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ loginUser.userPwd }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("                  <hr>\r\n");
      out.write("                  <label>닉네임</label>\r\n");
      out.write("                  <input class=\"change_nick\" id=\"userNickname\" placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ loginUser.userNickname }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("                  <hr>\r\n");
      out.write("                  <label>이메일</label>\r\n");
      out.write("                  <input class=\"change_email\" id=\"email\" placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ loginUser.email }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("                  <hr>\r\n");
      out.write("                  <label>휴대전화</label>\r\n");
      out.write("                  <input class=\"change_phone\" id=\"phone\" placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ loginUser.phone }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("                  <hr>\r\n");
      out.write("                  <label>주소</label>\r\n");
      out.write("                  <input class=\"change_address\" id=\"address\" placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ loginUser.address }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("                  <br>\r\n");
      out.write("                  <button type=\"submit\" class=\"update_btn\">수정하기</button>\r\n");
      out.write("                  <button type=\"submit\" class=\"delete_btn\" data-toggle=\"modal\" data-target=\"#deleteForm\">탈퇴하기</button>\r\n");
      out.write("                </form>\r\n");
      out.write("                <!-- 이 영역 안에서 페이지 작업 하시면 됩니다 -->\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- 본문 영역 끝-->\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <!-- 회원탈퇴 버튼 클릭 시 보여질 Modal -->\r\n");
      out.write("    <div class=\"modal fade\" id=\"deleteForm\">\r\n");
      out.write("        <div class=\"modal-dialog modal-sm\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Modal Header -->\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    <h4 class=\"modal-title\">회원탈퇴</h4>\r\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <form action=\"delete.me\" method=\"post\">\r\n");
      out.write("                    <!-- Modal body -->\r\n");
      out.write("                    <div class=\"modal-body\">\r\n");
      out.write("                        <div align=\"center\">\r\n");
      out.write("                            탈퇴 후 복구가 불가능합니다. <br>\r\n");
      out.write("                            정말로 탈퇴 하시겠습니까? <br>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <br>\r\n");
      out.write("                            <label for=\"userPwd\" class=\"mr-sm-2\">Password : </label>\r\n");
      out.write("                            <input type=\"password\" class=\"form-control mb-2 mr-sm-2\" placeholder=\"Enter Password\" id=\"userPwd\" name=\"userPwd\"> <br>\r\n");
      out.write("                            <input type=\"hidden\" name=\"userId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ loginUser.userId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- Modal footer -->\r\n");
      out.write("                    <div class=\"modal-footer\" align=\"center\">\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-danger\">탈퇴하기</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
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
