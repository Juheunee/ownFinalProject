/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.87
 * Generated at: 2023-05-30 08:28:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.notice;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class faq_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\" />\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("  <!-- header css -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/css/footer.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/css/reset.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/css/header.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/css/form.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/css/faq.css\">\r\n");
      out.write("  <!--제이쿼리-->\r\n");
      out.write("  <script src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("  <!-- CSS only -->\r\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\r\n");
      out.write("  <!--폰트-->\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.jsdelivr.net/gh/moonspam/NanumSquare@2.0/nanumsquare.css\">\r\n");
      out.write("  <title>FAQ</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <!-- 헤더 영역 시작-->\r\n");
      out.write("    <nav class=\"navbar navbar-expand-lg bg-light fixed-top\">\r\n");
      out.write("      <div class=\"container-fluid\">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"/mian/main.html\"><img class=\"headerLogo\" src=\"/resources/img/헤더로고.png\" alt=\"headerLogo\"></a>\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#collapsibleNavbar\">\r\n");
      out.write("          <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"collapse navbar-collapse justify-content-end\" id=\"collapsibleNavbar\">\r\n");
      out.write("          <ul class=\"navbar-nav\">\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link\" href=\"#\">커뮤니티</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link\" href=\"#\">채팅상담</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link\" href=\"#\">펫시터찾기</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link\" href=\"#\">이용후기</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link\" href=\"#\">로그인</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link petsiter\" href=\"#\">펫시터지원</a>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <!-- 헤더 영역 끝-->\r\n");
      out.write("\r\n");
      out.write("  <div id=\"Container-Wrapper\">\r\n");
      out.write("    <!-- 페이지 영역 시작 -->\r\n");
      out.write("    <div id=\"container\">\r\n");
      out.write("      <div id=\"main\">\r\n");
      out.write("        <div id=\"content\">\r\n");
      out.write("          <div class=\"page_aticle aticle_type2\">\r\n");
      out.write("            <!-- 사이드 메뉴바 -->\r\n");
      out.write("            <div id=\"snb\" class=\"snb_my\" style=\"position: absolute;\">\r\n");
      out.write("              <img src=\"/resources/img/사이드바이미지.png\" alt=\"sideBarImg\">\r\n");
      out.write("              <h2 class=\"tit_snb\">고객센터</h2>\r\n");
      out.write("              <div class=\"inner_sub\">\r\n");
      out.write("                <ul class=\"list_menu\">\r\n");
      out.write("                  <li>\r\n");
      out.write("                    <a href=\"/notice/noticeList.html\">공지사항</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li class=\"on\">\r\n");
      out.write("                    <a href=\"/notice/faq.html\">자주하는 질문</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                  <li>\r\n");
      out.write("                    <a href=\"/notice/inquiryList.html\">1:1 문의</a>\r\n");
      out.write("                  </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- 사이드 메뉴바 끝 -->\r\n");
      out.write("\r\n");
      out.write("            <!-- 본문 영역-->\r\n");
      out.write("            <div id=\"viewOrderList\" class=\"page_section section_orderlist\">\r\n");
      out.write("              <div class=\"page_section section_destination\">\r\n");
      out.write("                <div class=\"box\">\r\n");
      out.write("\r\n");
      out.write("                  <div class=\"title\">\r\n");
      out.write("                    <h2>자주하는 질문</h2>\r\n");
      out.write("                    <span>고객님들께서 자주 하시는 질문을 언니들이 모두 모았습니다.</span>\r\n");
      out.write("                    <hr/>\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("                  <div class=\"accordion accordion-flush\" id=\"accordionExample\" style=\"margin: 30px;\">\r\n");
      out.write("                    <div class=\"accordion-item\">\r\n");
      out.write("                      <h2 class=\"accordion-header\" id=\"flush-heading1\">\r\n");
      out.write("                        <button class=\"accordion-button collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#flush-collapse1\" aria-expanded=\"false\" aria-controls=\"flush-collapse1\">\r\n");
      out.write("                            예약 취소 및 환불 규정은 어떻게 되나요?\r\n");
      out.write("                        </button>\r\n");
      out.write("                      </h2>\r\n");
      out.write("                      <div id=\"flush-collapse1\" class=\"accordion-collapse collapse\" aria-labelledby=\"flush-heading1\" data-bs-parent=\"#accordionFlushExample\">\r\n");
      out.write("                        <div class=\"accordion-body\">\r\n");
      out.write("                            예약 취소에 따른 환불 가능 금액은 체크인 전 시간에 따라 달라집니다. <br/>\r\n");
      out.write("                            체크인 시간을 기준으로 3일(72시간) 전 취소 시 100% 환불, 3일(72시간) 이내 취소 시 50% 환불됩니다. <br/>\r\n");
      out.write("                            1일(24시간) 이내 취소 시엔 환불이 불가하고 조기 서비스 종료 시에도 남은 일수에 해당하는 금액 또한 환불 불가합니다. <br/>\r\n");
      out.write("                            다만, 펫시터님의 요청 수락 이후 (매칭 이후) 2시간 이내 취소는 전액 환불이 가능합니다. <br/>\r\n");
      out.write("                            예약 변경은 예약 취소 후 다시 예약 신청하셔야 하며, 되도록이면 5일 이전에 해주시길 바랍니다. <br/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"accordion-item\">\r\n");
      out.write("                      <h2 class=\"accordion-header\" id=\"flush-heading2\">\r\n");
      out.write("                        <button class=\"accordion-button collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#flush-collapse2\" aria-expanded=\"false\" aria-controls=\"flush-collapse2\">\r\n");
      out.write("                            서비스 이용중 반려동물이 아프거나 다치면 어떻게 하나요?\r\n");
      out.write("                        </button>\r\n");
      out.write("                      </h2>\r\n");
      out.write("                      <div id=\"flush-collapse2\" class=\"accordion-collapse collapse\" aria-labelledby=\"flush-heading2\" data-bs-parent=\"#accordionFlushExample\">\r\n");
      out.write("                        <div class=\"accordion-body\">\r\n");
      out.write("                            펫시팅 도중 반려동물의 건강에 이상이 생긴 경우, 사전에 펫시터님과 고객님께서 정한 병원으로 즉시 이송하여 진단, 치료를 받을 수 있습니다. <br/>\r\n");
      out.write("                            진단 및 치료 후 수의학적 판단에 의한 과실 여부에 따라 펫시스터즈의 프리미엄 안전 보상 프로그램을 적용 받으실 수 있습니다.\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"accordion-item\">\r\n");
      out.write("                      <h2 class=\"accordion-header\" id=\"flush-heading3\">\r\n");
      out.write("                        <button class=\"accordion-button collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#flush-collapse3\" aria-expanded=\"false\" aria-controls=\"flush-collapse3\">\r\n");
      out.write("                            서비스에 대한 비용 결제는 언제되나요?\r\n");
      out.write("                        </button>\r\n");
      out.write("                      </h2>\r\n");
      out.write("                      <div id=\"flush-collapse3\" class=\"accordion-collapse collapse\" aria-labelledby=\"flush-heading3\" data-bs-parent=\"#accordionFlushExample\">\r\n");
      out.write("                        <div class=\"accordion-body\">\r\n");
      out.write("                            펫시스터즈는 예약 요청과 동시에 선결제가 이뤄집니다. 따라서 예약 시 펫시팅 기간 및 조건을 신중히 확인하고 예약해주세요.\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"accordion-item\">\r\n");
      out.write("                      <h2 class=\"accordion-header\" id=\"flush-heading4\">\r\n");
      out.write("                        <button class=\"accordion-button collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#flush-collapse4\" aria-expanded=\"false\" aria-controls=\"flush-collapse4\">\r\n");
      out.write("                            고양이도 맡길 수 있나요?\r\n");
      out.write("                        </button>\r\n");
      out.write("                      </h2>\r\n");
      out.write("                      <div id=\"flush-collapse4\" class=\"accordion-collapse collapse\" aria-labelledby=\"flush-heading4\" data-bs-parent=\"#accordionFlushExample\">\r\n");
      out.write("                        <div class=\"accordion-body\">\r\n");
      out.write("                            고양이의 경우 영역성이 강한 본능적 특성 때문에, 환경이 바뀌면 스트레스를 받을 가능성이 크기에 방문 펫시터 서비스를 준비중입니다. 앞으로 점차 늘어날 서비스에 많은 관심 부탁드립니다.\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"accordion-item\">\r\n");
      out.write("                        <h2 class=\"accordion-header\" id=\"flush-heading5\">\r\n");
      out.write("                          <button class=\"accordion-button collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#flush-collapse5\" aria-expanded=\"false\" aria-controls=\"flush-collapse5\">\r\n");
      out.write("                            예약된 체크인 또는 체크아웃 시간보다 늦어졌어요.\r\n");
      out.write("                          </button>\r\n");
      out.write("                        </h2>\r\n");
      out.write("                        <div id=\"flush-collapse5\" class=\"accordion-collapse collapse\" aria-labelledby=\"flush-heading5\" data-bs-parent=\"#accordionFlushExample\">\r\n");
      out.write("                          <div class=\"accordion-body\">\r\n");
      out.write("                            먼저 체크인 또는 체크아웃 시간보다 늦어지는 경우 반드시 펫시터님께 연락해서 얼만큼 늦어지게 되는 지 연락해주세요. <br/>\r\n");
      out.write("                            체크아웃이 늦어지는 경우는 펫시터님이 늦어진 시간 만큼 추가금 결제 요청을 할 수 있습니다.\r\n");
      out.write("                          </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"accordion-item\">\r\n");
      out.write("                        <h2 class=\"accordion-header\" id=\"flush-heading6\">\r\n");
      out.write("                          <button class=\"accordion-button collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#flush-collapse6\" aria-expanded=\"false\" aria-controls=\"flush-collapse6\">\r\n");
      out.write("                            아이디와 비밀번호를 잃어버렸어요. 어떻게 찾나요?\r\n");
      out.write("                          </button>\r\n");
      out.write("                        </h2>\r\n");
      out.write("                        <div id=\"flush-collapse6\" class=\"accordion-collapse collapse\" aria-labelledby=\"flush-heading6\" data-bs-parent=\"#accordionFlushExample\">\r\n");
      out.write("                            <div class=\"accordion-body\">\r\n");
      out.write("                                첫 화면에서 로그인 버튼을 눌러 아이디, 비밀번호 찾기 버튼을 누르면\r\n");
      out.write("                                아이디 혹은 비밀번호를 찾을 수 있는 페이지로 이동합니다.\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"accordion-item\">\r\n");
      out.write("                        <h2 class=\"accordion-header\" id=\"flush-heading7\">\r\n");
      out.write("                          <button class=\"accordion-button collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#flush-collapse7\" aria-expanded=\"false\" aria-controls=\"flush-collapse7\">\r\n");
      out.write("                            호텔이나 병원에 맡기는것과 다른 점은 무엇인가요?\r\n");
      out.write("                          </button>\r\n");
      out.write("                        </h2>\r\n");
      out.write("                        <div id=\"flush-collapse7\" class=\"accordion-collapse collapse\" aria-labelledby=\"flush-heading7\" data-bs-parent=\"#accordionFlushExample\">\r\n");
      out.write("                            <div class=\"accordion-body\">\r\n");
      out.write("                                호텔이나 병원의 경우 여러 마리의 반려동물을 수용하여야 하기 때문에 24시간 맞춤케어가 힘든 단점이 있습니다. <br/>\r\n");
      out.write("                                펫시스터즈의 펫시팅 서비스는 반려동물 밀착 케어를 원칙으로 하며, 반려동물이 펫시터의 가정집에서 있는 동안 안전하게 지낼 수 있도록 합니다.\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"accordion-item\">\r\n");
      out.write("                        <h2 class=\"accordion-header\" id=\"flush-heading8\">\r\n");
      out.write("                          <button class=\"accordion-button collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#flush-collapse8\" aria-expanded=\"false\" aria-controls=\"flush-collapse8\">\r\n");
      out.write("                            펫시팅 전에 필요한 준비사항은 뭐가 있나요?\r\n");
      out.write("                          </button>\r\n");
      out.write("                        </h2>\r\n");
      out.write("                        <div id=\"flush-collapse8\" class=\"accordion-collapse collapse\" aria-labelledby=\"flush-heading8\" data-bs-parent=\"#accordionFlushExample\">\r\n");
      out.write("                            <div class=\"accordion-body\">\r\n");
      out.write("                                기본적인 준비물들은 배변패드, 배변 판, 배식 도구, 사료 강아지 인식표 및 산책도구 등이 있습니다. <br/>\r\n");
      out.write("                                하지만 펫시터분들마다 준비물에 대한 요구사항이 다를 수 있으니 펫시터분들의 프로필을 필히 읽어 보시고 대화를 해보시기 바랍니다. <br/>\r\n");
      out.write("                                또한 펫시팅을 맡기기 위해선 기본적인 5차 접종이 꼭 완료되어야 합니다.\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"accordion-item\">\r\n");
      out.write("                        <h2 class=\"accordion-header\" id=\"flush-heading9\">\r\n");
      out.write("                          <button class=\"accordion-button collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#flush-collapse9\" aria-expanded=\"false\" aria-controls=\"flush-collapse9\">\r\n");
      out.write("                            하네스 or 인식표가 없는데 가능한가요?\r\n");
      out.write("                          </button>\r\n");
      out.write("                        </h2>\r\n");
      out.write("                        <div id=\"flush-collapse9\" class=\"accordion-collapse collapse\" aria-labelledby=\"flush-heading9\" data-bs-parent=\"#accordionFlushExample\">\r\n");
      out.write("                            <div class=\"accordion-body\">\r\n");
      out.write("                                산책서비스를 이용하는 경우 이중산책줄 착용을 위해 하네스는 필수입니다.\r\n");
      out.write("                                이중산책줄 착용이 불가한 경우 산책서비스 이용이 제한됩니다. <br/>\r\n");
      out.write("                                반려동물 등록이 의무화 됨에 따라 외부 이동, 산책 시 인식표 착용 또한 의무사항이 되었습니다. <br/>\r\n");
      out.write("                                인식표 없이 산책을 희망하는 경우 펫시스터즈는 관련된 법령에 대한 의무가 없음을 알려드립니다.\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                      <div class=\"accordion-item\">\r\n");
      out.write("                        <h2 class=\"accordion-header\" id=\"flush-heading10\">\r\n");
      out.write("                          <button class=\"accordion-button collapsed\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#flush-collapse10\" aria-expanded=\"false\" aria-controls=\"flush-collapse10\">\r\n");
      out.write("                            펫시터의 개인 연락처를 알 수 있나요?\r\n");
      out.write("                          </button>\r\n");
      out.write("                        </h2>\r\n");
      out.write("                        <div id=\"flush-collapse10\" class=\"accordion-collapse collapse\" aria-labelledby=\"flush-heading10\" data-bs-parent=\"#accordionFlushExample\">\r\n");
      out.write("                            <div class=\"accordion-body\">\r\n");
      out.write("                                저희 펫시스터즈는 펫시터분들의 안전성과 개인정보 보안을 위하여 개인 연락처를 드릴 수 없습니다. <br/>\r\n");
      out.write("                                대신 펫시스터즈의 홈페이지 내의 채팅 메뉴를 통해 메시지를 주고 받을 수 있습니다.\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                      </div>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- 본문 영역 끝-->\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <!-- Footer 영역 시작 -->\r\n");
      out.write("  <div id=\"footer\">\r\n");
      out.write("    <div class=\"inner_footer\">\r\n");
      out.write("      <div class=\"cc_footer\">\r\n");
      out.write("        <!-- cc = company calls -->\r\n");
      out.write("        <h2 class=\"cc_tit\">더 궁금한것이 있으세요?\r\n");
      out.write("        </h2>\r\n");
      out.write("        <div class=\"cc_view cc_kakao\">\r\n");
      out.write("          <a href=\"#\" class=\"footerTag\">\r\n");
      out.write("            <div class=\"footerLink\">1:1 카톡상담</div>\r\n");
      out.write("          </a>\r\n");
      out.write("          <a href=\"#\" class=\"footerTag\">\r\n");
      out.write("            <div class=\"footerLink\">자주묻는질문</div>\r\n");
      out.write("          </a>\r\n");
      out.write("          <a href=\"#\" class=\"footerTag\">\r\n");
      out.write("            <div class=\"footerLink\">02-1561-4463</div>\r\n");
      out.write("          </a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <strong class=\"copy\">Copyright ©2023 PetSisters. All Right Reserved.</strong>\r\n");
      out.write("      </div>\r\n");
      out.write("  \r\n");
      out.write("      <div class=\"company_info\">\r\n");
      out.write("        <h2 class=\"cc_tit\">펫시스터즈\r\n");
      out.write("          <img id=\"footerLogo\" src=\"/resources/img/푸터로고.png\" alt=\"footerLogo\">\r\n");
      out.write("        </h2>\r\n");
      out.write("        <div class=\"spec_info\">\r\n");
      out.write("          주식회사 개봐주는언니들\r\n");
      out.write("          <span class=\"bar\">I</span>\r\n");
      out.write("          대표 : 조승호\r\n");
      out.write("          <br>\r\n");
      out.write("          사업자등록번호 : 215-15-41572\r\n");
      out.write("          <br>\r\n");
      out.write("          대표전화 : 02-1588-1548\r\n");
      out.write("          <span class=\"bar\">I</span>\r\n");
      out.write("          통신판매업 신고 : 2011-경기광명-1384 <br>\r\n");
      out.write("          팩스 : 02-1568-4548\r\n");
      out.write("          <br>\r\n");
      out.write("          사업장 소재지 : 서울특별시 영등포구 선유동2로 57 이레빌딩\r\n");
      out.write("          <br>\r\n");
      out.write("          개인정보 보호 책임자 : 정재훈 <a href=\"#\">jjh156@naver.com</a>\r\n");
      out.write("          <br>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  \r\n");
      out.write("    <div class=\"link_footer\">\r\n");
      out.write("      <a href=\"\">이용약관</a>\r\n");
      out.write("      <a href=\"\">위치정보활용약관</a>\r\n");
      out.write("      <a href=\"\">개인정보취급방침</a>\r\n");
      out.write("      <a href=\"\">안정보상프로그램</a>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- Footer 영역 끝 -->\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("      $(document).ready(function () {\r\n");
      out.write("        $(window).scroll(function () {\r\n");
      out.write("          var scrollTop = $(document).scrollTop();\r\n");
      out.write("          var footerOffset = $(\".link_footer\").offset().top;\r\n");
      out.write("          var windowHeight = $(window).height();\r\n");
      out.write("\r\n");
      out.write("          if (scrollTop + windowHeight > footerOffset) {\r\n");
      out.write("            scrollTop = footerOffset - windowHeight;\r\n");
      out.write("          }\r\n");
      out.write("\r\n");
      out.write("          $(\".snb_my\").stop();\r\n");
      out.write("          $(\".snb_my\").animate({ \"top\": scrollTop });\r\n");
      out.write("        });\r\n");
      out.write("      });\r\n");
      out.write("    </script>\r\n");
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
