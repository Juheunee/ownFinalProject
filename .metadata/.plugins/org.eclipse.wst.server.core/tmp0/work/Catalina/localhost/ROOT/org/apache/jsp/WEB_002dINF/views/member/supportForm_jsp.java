/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.87
 * Generated at: 2023-06-01 00:53:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class supportForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/css/member/supportForm.css\">\r\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/common.jsp", out, false);
      out.write("\r\n");
      out.write("  <title>펫시터지원폼</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  <div id=\"wrap\">\r\n");
      out.write("  \r\n");
      out.write("      ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/header.jsp", out, false);
      out.write("	\r\n");
      out.write("  \r\n");
      out.write("    <!-- 본문 시작 -->\r\n");
      out.write("\r\n");
      out.write("    <main class=\"supportBody\">\r\n");
      out.write("      <section class=\"supportTitle\">\r\n");
      out.write("        <div style=\"width: 1000px; margin: 0px auto; padding-top: 158px;\">\r\n");
      out.write("          <h2 style=\"font-size: 50px; font-weight: 600; color: rgb(85, 85, 85);\">\r\n");
      out.write("            지원서 작성하기</h2>\r\n");
      out.write("        </div>\r\n");
      out.write("      </section>\r\n");
      out.write("      <section class=\"supportContentArea\">\r\n");
      out.write("        <div class=\"supportContent\">\r\n");
      out.write("          <form class=\"supportForm\">\r\n");
      out.write("              <p style=\"font-size: 17px; font-weight: 600; color: rgb(85, 85, 85);\">● 거주지 주소</p>\r\n");
      out.write("              <p style=\"margin-top: 10px; font-size: 13px; color: rgb(153, 153, 153);\">시/군/구까지 입력해주세요</p>\r\n");
      out.write("              <div style=\"margin-top: 15px;\">\r\n");
      out.write("                <input type=\"text\" name=\"address\" placeholder=\"예) 서울시 강남구 논현동\" value=\"\">\r\n");
      out.write("              </div>\r\n");
      out.write("              <p style=\"margin-top: 50px; font-size: 17px; \r\n");
      out.write("              font-weight: 600; color: rgb(85, 85, 85);\">● 거주지 유형</p>\r\n");
      out.write("              <div style=\"margin-top: 20px;\">\r\n");
      out.write("                <input type=\"radio\" id=\"10pyeong\" name=\"pyeong\" value=\"10\" style=\"margin-left: 3px;\">\r\n");
      out.write("                <label style=\"margin-left: 5px;\" for=\"10pyeong\">10평 이하</label>\r\n");
      out.write("                <input type=\"radio\" id=\"20pyeong\" name=\"pyeong\" value=\"20\" style=\"margin-left: 20px;\">\r\n");
      out.write("                <label style=\"margin-left: 5px;\" for=\"20pyeong\">11평 ~ 20평 이하</label>\r\n");
      out.write("                <input type=\"radio\" id=\"30pyeong\" name=\"pyeong\" value=\"30\" style=\"margin-left: 20px;\">\r\n");
      out.write("                <label style=\"margin-left: 5px;\" for=\"30pyeong\">21평 ~ 30평 이하</label>\r\n");
      out.write("                <input type=\"radio\" id=\"40pyeong\" name=\"pyeong\" value=\"40\" style=\"margin-left: 20px;\">\r\n");
      out.write("                <label style=\"margin-left: 5px;\" for=\"40pyeong\">31평 이상</label>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <p style=\"margin-top: 50px; font-size: 17px; \r\n");
      out.write("              font-weight: 600; color: rgb(85, 85, 85);\">● 본인을 포함한 가족구성원 흡연 여부</p>\r\n");
      out.write("              <div style=\"margin-top: 20px;\">\r\n");
      out.write("                <input type=\"radio\" id=\"smoking\" name=\"smoke\" value=\"10\" style=\"margin-left: 3px;\">\r\n");
      out.write("                <label style=\"margin-left: 5px;\" for=\"smoking\">네, 흡연자가 있어요.</label>\r\n");
      out.write("                <input type=\"radio\" id=\"non-smoking\" name=\"smoke\" value=\"10\" style=\"margin-left: 20px;\">\r\n");
      out.write("                <label style=\"margin-left: 5px;\" for=\"non-smoking\">아니오, 흡연자는 없습니다.</label>\r\n");
      out.write("              </div>\r\n");
      out.write("              \r\n");
      out.write("              <p style=\"margin-top: 50px; font-size: 17px; \r\n");
      out.write("              font-weight: 600; color: rgb(85, 85, 85);\">● 강아지 반려 경험 유무</p>\r\n");
      out.write("              <div style=\"margin-top: 20px;\">\r\n");
      out.write("                <input type=\"radio\" id=\"yes-myExperience\" name=\"myExperience\" value=\"Y\" style=\"margin-left: 3px;\">\r\n");
      out.write("                <label style=\"margin-left: 5px;\" for=\"yes-myExperience\">예, 강아지 반려 경험이 있습니다.</label>\r\n");
      out.write("                <input type=\"radio\" id=\"no-myExperience\" name=\"myExperience\" value=\"N\" style=\"margin-left: 20px;\">\r\n");
      out.write("                <label style=\"margin-left: 5px;\" for=\"no-myExperience\">아니오, 강아지 반려 경험이 없습니다.</label>\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("              <p style=\"margin-top: 50px; font-size: 17px; \r\n");
      out.write("              font-weight: 600; color: rgb(85, 85, 85);\">● 타인의 반려동물을 돌봐준 경험</p>\r\n");
      out.write("              <span style=\"font-size: 15px; margin-top: 10px; color: rgb(153, 153, 153);\">\r\n");
      out.write("                자신의 반려동물이 아닌 친구, 다른 가족 구성원의 반려동물을 돌보았던 \r\n");
      out.write("                  경험이 있다면 구체적으로 적어주세요. (경험이 없다면 \"없습니다\" 라고 작성)\r\n");
      out.write("              </span>\r\n");
      out.write("              <textarea class=\"experienceArea\" name=\"otherExperience\" placeholder=\"타인의 반려동물을 돌봐준 경험에 대해서 알려주세요.\"></textarea>\r\n");
      out.write("\r\n");
      out.write("              <p style=\"margin-top: 50px; font-size: 17px; \r\n");
      out.write("              font-weight: 600; color: rgb(85, 85, 85);\">● 그 외 반려동물 관련 경력 또는 경험</p>\r\n");
      out.write("              <span style=\"font-size: 15px; margin-top: 10px; color: rgb(153, 153, 153);\">\r\n");
      out.write("                봉사활동 동물 병원 근무 경험, 애견 카페 이용 경험, 호텔링/펫시터 이용 경험, 아르바이트 경험, \r\n");
      out.write("                자격증 취득 여부 등을 구체적으로 적어주세요. (경험이 없다면 \"없습니다\" 라고 작성)</span>\r\n");
      out.write("              <textarea class=\"experienceArea\" name=\"etcExperience\" placeholder=\"그 외 반려동물 관련 경력 또는 경험에 대해서 알려주세요.\"></textarea>\r\n");
      out.write("\r\n");
      out.write("              <p style=\"margin-top: 50px; font-size: 17px; \r\n");
      out.write("              font-weight: 600; color: rgb(85, 85, 85);\">● 펫시터 활동 경력</p>\r\n");
      out.write("              <input type=\"radio\" id=\"yes-petsitterExperience\" name=\"petsitterExperience\" value=\"Y\" style=\"margin-left: 3px;\">\r\n");
      out.write("              <label style=\"margin-left: 5px;\" for=\"yes-petsitterExperience\">예, 펫시터 활동 경험이 있습니다.</label>\r\n");
      out.write("              <input type=\"radio\" id=\"no-petsitterExperience\" name=\"petsitterExperience\" value=\"N\" style=\"margin-left: 20px;\">\r\n");
      out.write("              <label style=\"margin-left: 5px;\" for=\"no-petsitterExperience\">아니오, 펫시터 활동 경험이 없습니다.</label>\r\n");
      out.write("\r\n");
      out.write("              <p style=\"margin-top: 50px; font-size: 17px; \r\n");
      out.write("              font-weight: 600; color: rgb(85, 85, 85);\">● 동의 사항</p>\r\n");
      out.write("              <input type=\"checkbox\" id=\"consent1\" name=\"consent1\" value=\"O\"> <label for=\"consent1\">개인정보 수집/이용에 동의합니다.</label><br>\r\n");
      out.write("              <input type=\"checkbox\" id=\"consent2\" name=\"consent2\" value=\"O\"> <label for=\"consent2\">펫시터 활동을 위한 교육수료에 동의하며 평일 혹은 주말 중 하루 진행되는 교육 참여가 가능합니다.</label><br>\r\n");
      out.write("              <input type=\"checkbox\" id=\"consent3\" name=\"consent3\" value=\"O\"> <label for=\"consent3\">지원서에 기재된 내용은 모두 본인이 작성하였으며, 사실과 다름 없음을 확인했습니다.</label><br>\r\n");
      out.write("              <p style=\"font-size: 13px; color: rgb(153, 153, 153); \r\n");
      out.write("              margin-left: 25px;\">* 사실과 다를 경우, 합격이 취소될 수 있습니다.</p>\r\n");
      out.write("              <div id=\"supportSubmitArea\">\r\n");
      out.write("                <button id=\"supportSubmit\" type=\"submit\">최종 제출</button>\r\n");
      out.write("              </div>\r\n");
      out.write("            </form>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("      </section>\r\n");
      out.write("    </main>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- 본문 끝 -->\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/footer.jsp", out, false);
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- JavaScript Bundle with Popper -->\r\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
