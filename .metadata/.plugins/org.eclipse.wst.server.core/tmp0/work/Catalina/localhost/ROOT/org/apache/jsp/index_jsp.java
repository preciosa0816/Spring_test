/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.27
 * Generated at: 2019-12-22 14:22:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      out.write("<html lang=\"ko\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, width=device-width\">\r\n");
      out.write("  <meta name=\"author\" content=\"Kyusup\">\r\n");
      out.write("  <meta name=\"description\" content=\"반응형 웹 도서관 사이트\">\r\n");
      out.write("  <meta name=\"keywords\" content=\"반응형사이트, 웹퍼블리셔, 웹접근성, HTML5\">\r\n");
      out.write("  <title>도서관 프로젝트</title>\r\n");
      out.write("\r\n");
      out.write("  <!-- style -->\r\n");
      out.write("  <link href=\"resources/html/css/reset.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("  <link href=\"resources/html/css/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("  <link href=\"resources/html/css/font-awesome.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("  <link href=\"resources/html/css/slick.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("  <link href=\"resources/html/css/lightgallery.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("  <link href=\"resources/html/css/border.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("  <!-- 파비콘 -->\r\n");
      out.write("<!--\r\n");
      out.write("  <link rel=\"shortcut icon\" href=\"icon/favicon.ico\">\r\n");
      out.write("  <link rel=\"apple-touch-icon-precomposed\" href=\"icon/favicon-152.png\">\r\n");
      out.write("  <link rel=\"icon\" href=\"path/to/favicon.png\">\r\n");
      out.write("  <link rel=\"icon\" href=\"icon/favicon-16.png\" sizes=\"16x16\">\r\n");
      out.write("  <link rel=\"icon\" href=\"icon/favicon-32.png\" sizes=\"32x32\">\r\n");
      out.write("  <link rel=\"icon\" href=\"icon/favicon-48.png\" sizes=\"48x48\">\r\n");
      out.write("  <link rel=\"icon\" href=\"icon/favicon-64.png\" sizes=\"64x64\">\r\n");
      out.write("  <link rel=\"icon\" href=\"icon/favicon-128.png\" sizes=\"128x128\">\r\n");
      out.write("-->\r\n");
      out.write("  <!-- 웹 폰트 -->\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Nanum+Gothic\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Nanum+Brush+Script\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Abel\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("  <!-- HTLM5shiv ie6~8 -->\r\n");
      out.write("  <!--[if lt IE 9]>\r\n");
      out.write("        <script src=\"resources/html/js/html5shiv.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            alert(\"현재 당신이 보는 브라우저는 지원하지 않습니다. 최신 브라우저로 업데이트해주세요!\");\r\n");
      out.write("        </script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("  <style>\r\n");
      out.write("\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("  <header id=\"header\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("          <div class=\"header_menu\">\r\n");
      out.write("            <a href=\"resources/html/form/loginForm.html\">로그인</a>\r\n");
      out.write("            <a href=\"#\">회원가입</a>\r\n");
      out.write("            <select name = \"language\">\r\n");
      out.write("              <option value=\"ko\">한국어</option>\r\n");
      out.write("              <option value=\"en\">English</option>\r\n");
      out.write("            </select>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- //header_menu -->\r\n");
      out.write("          <div class=\"header_tit\">\r\n");
      out.write("            <form>\r\n");
      out.write("              <fieldset>\r\n");
      out.write("                <input type=\"search\"/>\r\n");
      out.write("\t\t\t\t<input type = \"button\" onclick = \"location.href = '/boardList'\">\r\n");
      out.write("<!--                   <button type=\"submit\" onclick=\"location.href='/bookList'\"> -->\r\n");
      out.write("<!--                   \t<i class=\"fa fa-search\"> -->\r\n");
      out.write("<!--                   \t</i> -->\r\n");
      out.write("                  </button>\r\n");
      out.write("              </fieldset>\r\n");
      out.write("            </form>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- //header_tit -->\r\n");
      out.write("<!--          <div class=\"header_icon\">\r\n");
      out.write("            <ul>\r\n");
      out.write("              <li><a href=\"#\"><i class=\"fa fa-html5\" aria-hidden=\"true\"></i><span>HTML5</span></a></li>\r\n");
      out.write("              <li><a href=\"#\"><i class=\"fa fa-github\" aria-hidden=\"true\"></i><span>GitHub</span></a></li>\r\n");
      out.write("              <li><a href=\"#\" class=\"facebook\"><i class=\"fa fa-facebook-square\" aria-hidden=\"true\"></i><span>Fackbook</span></a></li>\r\n");
      out.write("              <li><a href=\"#\" class=\"twitter\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i><span>twitter</span></a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </div>1\r\n");
      out.write("-->\r\n");
      out.write("          <!-- //header_icon -->\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </header>\r\n");
      out.write("  <!-- //nav -->\r\n");
      out.write("\r\n");
      out.write("  <nav id=\"nav\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"nav\">\r\n");
      out.write("          <h2 class=\"ir_su\">전체 메뉴</h2>\r\n");
      out.write("          <div>\r\n");
      out.write("            <h3>도서관 소개</h3>\r\n");
      out.write("            <ol>\r\n");
      out.write("              <li><a href=\"#\">도서관 소개</a></li>\r\n");
      out.write("              <li><a href=\"#\">도서관 시설</a></li>\r\n");
      out.write("              <li><a href=\"#\">도서관 이용 안내</a></li>\r\n");
      out.write("              <li><a href=\"#\">찾아오시는 길</a></li>\r\n");
      out.write("            </ol>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div>\r\n");
      out.write("            <h3>도서 관리</h3>\r\n");
      out.write("            <ol>\r\n");
      out.write("              <li><a href=\"/boardList\">소장 도서 관리</a></li>\r\n");
      out.write("              <li><a href=\"#\">예약 도서 관리</a></li>\r\n");
      out.write("              <li><a href=\"/wish/guide\">희망 도서 관리</a></li>\r\n");
      out.write("              <li><a href=\"#\">추천 도서 관리</a></li>\r\n");
      out.write("            </ol>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div>\r\n");
      out.write("            <h3>열람실 관리</h3>\r\n");
      out.write("            <ol>\r\n");
      out.write("              <li><a href=\"#\">열람실 예약</a></li>\r\n");
      out.write("            </ol>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div>\r\n");
      out.write("            <h3>공지사항</h3>\r\n");
      out.write("            <ol>\r\n");
      out.write("              <li><a href=\"#\">공지사항</a></li>\r\n");
      out.write("            </ol>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div>\r\n");
      out.write("            <h3>게시판</h3>\r\n");
      out.write("            <ol>\r\n");
      out.write("              <li><a href=\"/forum/list\">자유 게시판</a></li>\r\n");
      out.write("              <li><a href=\"#\">Q&A 게시판</a></li>\r\n");
      out.write("            </ol>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </nav>\r\n");
      out.write("  <!-- //nav -->\r\n");
      out.write("\r\n");
      out.write("  <article id=\"title\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"title\">\r\n");
      out.write("        <h2>list</h2>\r\n");
      out.write("        <a href=\"#\" class=\"btn\">\r\n");
      out.write("       \t\t<i class=\"fa fa-angle-down\" aria-hidden=\"true\"></i>\r\n");
      out.write("        \t<span class=\"ir_su\">전체메뉴 보기</span>\r\n");
      out.write("        </a>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </article>\r\n");
      out.write("  <!-- //title -->\r\n");
      out.write("\r\n");
      out.write("  <!-- main -->\r\n");
      out.write("    <section id=\"contents\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <h2 class=\"ir_su\">반응형 사이트 컨텐츠</h2>\r\n");
      out.write("        <section id=\"cont_left\">\r\n");
      out.write("          <h3 class=\"ir_su\">메뉴 및 게시판 컨텐츠 영역</h3>\r\n");
      out.write("          <article class=\"column col1\">\r\n");
      out.write("            <h4 class=\"col_tit\">Menu</h4>\r\n");
      out.write("            <p class=\"col_desc\">이 곳은 메뉴 영역입니다.</p>\r\n");
      out.write("            <!-- 메뉴 -->\r\n");
      out.write("            <div class=\"menu\">\r\n");
      out.write("              <ul>\r\n");
      out.write("                <li><a href=\"#\">도서관 소개 <i class=\"fa fa-angle-double-right\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("                <li><a href=\"/boardList\">소장 도서관리 <i class=\"fa fa-angle-double-right\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("                <li><a href=\"#\">예약 도서관리 <i class=\"fa fa-angle-double-right\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("                <li><a href=\"/wish/guide\">희망 도서관리 <i class=\"fa fa-angle-double-right\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("                <li><a href=\"#\">추천 도서관리 <i class=\"fa fa-angle-double-right\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("                <li><a href=\"#\">열람실 관리 <i class=\"fa fa-angle-double-right\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("                <li><a href=\"#\">공지사항 <i class=\"fa fa-angle-double-right\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("                <li><a href=\"/forum/list\">자유 게시판 <i class=\"fa fa-angle-double-right\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("                <li><a href=\"#\">Q&A 게시판 <i class=\"fa fa-angle-double-right\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--//메뉴 -->\r\n");
      out.write("          </article>\r\n");
      out.write("          <!-- //col1 -->\r\n");
      out.write("\r\n");
      out.write("          <article class=\"column col2\">\r\n");
      out.write("            <h4 class=\"col_tit\">게시판</h4>\r\n");
      out.write("            <p class=\"col_desc\">이 곳은 게시판 영역입니다.</p>\r\n");
      out.write("            <!-- 게시판 -->\r\n");
      out.write("            <div class=\"notice1\">\r\n");
      out.write("              <h5>자유 게시판</h5>\r\n");
      out.write("              <ul>\r\n");
      out.write("                <li><a href=\"#\">이 곳 클릭시 자유게시판 1글로 넘어갑니다.</a></li>\r\n");
      out.write("                <li><a href=\"#\">이 곳 클릭시 자유게시판 2글로 넘어갑니다.</a></li>\r\n");
      out.write("                <li><a href=\"#\">이 곳 클릭시 자유게시판 3글로 넘어갑니다.</a></li>\r\n");
      out.write("                <li><a href=\"#\">이 곳 클릭시 자유게시판 4글로 넘어갑니다.</a></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("              <a href=\"#\" class=\"more\" title=\"더 보기\">More <i class=\"fa fa-plus-circle\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--//게시판 -->\r\n");
      out.write("            <!-- 게시판 -->\r\n");
      out.write("            <div class=\"notice2 mt15\">\r\n");
      out.write("              <h5>Q&A 게시판</h5>\r\n");
      out.write("              <ul>\r\n");
      out.write("                <li><a href=\"#\">이 곳 클릭시 Q&A 1글로 넘어갑니다.</a></li>\r\n");
      out.write("                <li><a href=\"#\">이 곳 클릭시 Q&A 2글로 넘어갑니다.</a></li>\r\n");
      out.write("                <li><a href=\"#\">이 곳 클릭시 Q&A 3글로 넘어갑니다.</a></li>\r\n");
      out.write("                <li><a href=\"#\">이 곳 클릭시 Q&A 4글로 넘어갑니다.</a></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("              <a href=\"#\" class=\"more\" title=\"더 보기\">More <i class=\"fa fa-plus-circle\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--//게시판2 -->\r\n");
      out.write("          </article>\r\n");
      out.write("          <!-- //col2 -->\r\n");
      out.write("\r\n");
      out.write("          <article class=\"column col3\">\r\n");
      out.write("            <h4 class=\"col_tit\">도서관 소개</h4>\r\n");
      out.write("            <p class=\"col_desc\">해당 영역은 도서관 소개 영역입니다.</p>\r\n");
      out.write("            <!-- blog -->\r\n");
      out.write("            <div class=\"blog1\">\r\n");
      out.write("              <h5 class=\"ir_su\">Image1</h5>\r\n");
      out.write("              <figure>\r\n");
      out.write("                <img src=\"resources/html/img/blog4_@1.jpg\" class=\"img-normal\" alt=\"normal image\">\r\n");
      out.write("                <img src=\"resources/html/img/blog4_@2.jpg\" class=\"img-retina\" alt=\"retina image\">\r\n");
      out.write("                <figcaption>이 곳은 도서관 소개글 영역입니다.</figcaption>\r\n");
      out.write("              </figure>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--//blog -->\r\n");
      out.write("            <!-- blog2 -->\r\n");
      out.write("            <div class=\"blog2 mt15\">\r\n");
      out.write("              <div class=\"img-retina\">\r\n");
      out.write("                <h5>Image2</h5>\r\n");
      out.write("              </div>\r\n");
      out.write("              <p>이 곳은 도서관 찾아오시는 글 영역입니다.</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--//blog2 -->\r\n");
      out.write("          </article>\r\n");
      out.write("          <!-- //col3 -->\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- //cont_left -->\r\n");
      out.write("\r\n");
      out.write("        <section id=\"cont_center\">\r\n");
      out.write("          <h3 class=\"ir_su\">반응형 사이트 가운데 컨텐츠</h3>\r\n");
      out.write("          <article class=\"column col4\">\r\n");
      out.write("            <h4 class=\"col_tit\">추천 도서</h4>\r\n");
      out.write("            <p class=\"col_desc\">도서 소개 영역입니다.</p>\r\n");
      out.write("            <!-- 이미지 슬라이드 -->\r\n");
      out.write("            <div class=\"slider\">\r\n");
      out.write("              <div>\r\n");
      out.write("                <figure>\r\n");
      out.write("                  <img src=\"resources/html/img/slider001.jpg\" alt=\"이미지1\">\r\n");
      out.write("                  <figcaption><em>Responsive Site</em><span>슬라이드 플러그인을 이용한 반응형 이미지 슬라이드 입니다.</span></figcaption>\r\n");
      out.write("                </figure>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div>\r\n");
      out.write("                <figure>\r\n");
      out.write("                  <img src=\"resources/html/img/slider001.jpg\" alt=\"이미지2\">\r\n");
      out.write("                  <figcaption><em>Responsive Site</em><span>슬라이드 플러그인을 이용한 반응형 이미지 슬라이드 입니다.</span></figcaption>\r\n");
      out.write("                </figure>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div>\r\n");
      out.write("                <figure>\r\n");
      out.write("                  <img src=\"resources/html/img/slider001.jpg\" alt=\"이미지3\">\r\n");
      out.write("                  <figcaption><em>Responsive Site</em><span>슬라이드 플러그인을 이용한 반응형 이미지 슬라이드 입니다.</span></figcaption>\r\n");
      out.write("                </figure>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--//이미지 슬라이드 -->\r\n");
      out.write("          </article>\r\n");
      out.write("          <!-- //col4 -->\r\n");
      out.write("\r\n");
      out.write("          <article class=\"column col5\">\r\n");
      out.write("            <h4 class=\"col_tit\">도서 소개 영역</h4>\r\n");
      out.write("            <p class=\"col_desc\">해당 영역은 도서 소개 영역입니다.</p>\r\n");
      out.write("            <!-- lightbox -->\r\n");
      out.write("            <div class=\"lightbox square clearfix\">\r\n");
      out.write("              <a href=\"resources/html/img/light01_s.jpg\"><img src=\"resources/html/img/light01.jpg\" alt=\"이미지\"><em>blur</em></a>\r\n");
      out.write("              <a href=\"resources/html/img/light02_s.jpg\"><img src=\"resources/html/img/light02.jpg\" alt=\"이미지\"><em>brightness</em></a>\r\n");
      out.write("              <a href=\"resources/html/img/light03_s.jpg\"><img src=\"resources/html/img/light03.jpg\" alt=\"이미지\"><em>contrast</em></a>\r\n");
      out.write("              <a href=\"resources/html/img/light04_s.jpg\"><img src=\"resources/html/img/light04.jpg\" alt=\"이미지\"><em>grayscale</em></a>\r\n");
      out.write("              <a href=\"resources/html/img/light05_s.jpg\"><img src=\"resources/html/img/light05.jpg\" alt=\"이미지\"><em>hue-rotate</em></a>\r\n");
      out.write("              <a href=\"resources/html/img/light06_s.jpg\"><img src=\"resources/html/img/light06.jpg\" alt=\"이미지\"><em>invert</em></a>\r\n");
      out.write("              <a href=\"resources/html/img/light07_s.jpg\"><img src=\"resources/html/img/light07.jpg\" alt=\"이미지\"><em>opacity</em></a>\r\n");
      out.write("              <a href=\"resources/html/img/light08_s.jpg\"><img src=\"resources/html/img/light08.jpg\" alt=\"이미지\"><em>saturate</em></a>\r\n");
      out.write("              <a href=\"resources/html/img/light09_s.jpg\"><img src=\"resources/html/img/light09.jpg\" alt=\"이미지\"><em>sepia</em></a>\r\n");
      out.write("              <a href=\"resources/html/img/light10_s.jpg\"><img src=\"resources/html/img/light10.jpg\" alt=\"이미지\"><em>Mix</em></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--//lightbox -->\r\n");
      out.write("          </article>\r\n");
      out.write("          <!-- //col5 -->\r\n");
      out.write("\r\n");
      out.write("          <article class=\"column col6\">\r\n");
      out.write("            <h4 class=\"col_tit\">도서관 영상 소개</h4>\r\n");
      out.write("            <p class=\"col_desc\">이 곳은 영상을 보여주는 영역입니다.</p>\r\n");
      out.write("            <!-- video -->\r\n");
      out.write("            <!-- <video autoplay=\"autoplay\" controls=\"controls\" loop=\"loop\">\r\n");
      out.write("\t\t\t\t\t\t\t<source src=\"resources/html/img/video.mp4\" type=\"video/mp4\">\r\n");
      out.write("\t\t\t\t\t\t</video> -->\r\n");
      out.write("            <div class=\"video\">\r\n");
      out.write("              <iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/akJu8OLkiI8\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--//video -->\r\n");
      out.write("          </article>\r\n");
      out.write("          <!-- //col6 -->\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- //cont_center -->\r\n");
      out.write("        <section id=\"cont_right\">\r\n");
      out.write("          <h3 class=\"ir_su\">반응형 사이트 오른쪽 컨텐츠</h3>\r\n");
      out.write("          <article class=\"column col7\">\r\n");
      out.write("            <h4 class=\"col_tit\">희망 도서 관리</h4>\r\n");
      out.write("            <p class=\"col_desc\">해당 그림 클릭 시, 희망 도서 관리 페이지로 이동합니다.</p>\r\n");
      out.write("            <!-- side1 -->\r\n");
      out.write("            <div class=\"side1\">\r\n");
      out.write("              <figure class=\"front\">\r\n");
      out.write("                <img src=\"resources/html/img/side1.jpg\" alt=\"이미지2\">\r\n");
      out.write("              </figure>\r\n");
      out.write("              <div class=\"back\">\r\n");
      out.write("                <i class=\"fa fa-heart fa-4x\" aria-hidden=\"true\"></i>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- side1//-->\r\n");
      out.write("          </article>\r\n");
      out.write("          <!-- //col7 -->\r\n");
      out.write("\r\n");
      out.write("          <article class=\"column col8\">\r\n");
      out.write("            <h4 class=\"col_tit\">열람실 관리</h4>\r\n");
      out.write("            <p class=\"col_desc\">해당 그림 클릭 시, 열람실 관리 페이지로 이동합니다.</p>\r\n");
      out.write("            <!-- side2 -->\r\n");
      out.write("            <div class=\"side2\">\r\n");
      out.write("              <figure class=\"front\">\r\n");
      out.write("                <img src=\"resources/html/img/side2.jpg\" alt=\"이미지2\">\r\n");
      out.write("                <figcaption>\r\n");
      out.write("                  <h3>Hover Effect</h3>\r\n");
      out.write("                </figcaption>\r\n");
      out.write("              </figure>\r\n");
      out.write("              <figure class=\"back\">\r\n");
      out.write("                <img src=\"resources/html/img/side4.jpg\" alt=\"이미지2\">\r\n");
      out.write("                <figcaption>\r\n");
      out.write("                  <h3>Hover Effect</h3>\r\n");
      out.write("                </figcaption>\r\n");
      out.write("              </figure>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- side2//-->\r\n");
      out.write("          </article>\r\n");
      out.write("          <!-- //col8 -->\r\n");
      out.write("\r\n");
      out.write("          <article class=\"column col9\">\r\n");
      out.write("            <h4 class=\"col_tit\">희망도서 관리</h4>\r\n");
      out.write("            <p class=\"col_desc\">이 곳은 희망도서 관리 영역입니다.</p>\r\n");
      out.write("            <!-- side3 -->\r\n");
      out.write("            <div class=\"side3\">\r\n");
      out.write("              <figure>\r\n");
      out.write("                <img src=\"resources/html/img/side3.jpg\" alt=\"이미지3\">\r\n");
      out.write("                <figcaption>\r\n");
      out.write("                  <h3>Hover<em>Effect</em></h3>\r\n");
      out.write("                </figcaption>\r\n");
      out.write("              </figure>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- side3//-->\r\n");
      out.write("          </article>\r\n");
      out.write("          <!-- //col9 -->\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- //cont_right -->\r\n");
      out.write("      </div>\r\n");
      out.write("    </section>\r\n");
      out.write("    <!-- //contents -->\r\n");
      out.write("<!--   </main> -->\r\n");
      out.write("\r\n");
      out.write("  <footer id=\"footer\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"footer\">\r\n");
      out.write("          <ul>\r\n");
      out.write("            <li><a href=\"#\">사이트 도움말</a></li>\r\n");
      out.write("            <li><a href=\"#\">사이트 이용약관</a></li>\r\n");
      out.write("            <li><a href=\"#\">사이트 운영원칙</a></li>\r\n");
      out.write("            <li><a href=\"#\"><strong>개인정보취급방침</strong></a></li>\r\n");
      out.write("            <li><a href=\"#\">책임의 한계와 법적고지</a></li>\r\n");
      out.write("            <li><a href=\"#\">게시중단요청서비스</a></li>\r\n");
      out.write("            <li><a href=\"#\">고객센터</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("          <address>\r\n");
      out.write("            Copyright &copy;<strong>중앙 501 A조</strong> All Rights Reserved.\r\n");
      out.write("          </address>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </footer>\r\n");
      out.write("  <!-- //footer -->\r\n");
      out.write("\r\n");
      out.write("  <!-- JavaScript Libraries -->\r\n");
      out.write("  <script src=\"resources/html/js/jquery.min_1.12.4.js\"></script>\r\n");
      out.write("  <script src=\"resources/html/js/modernizr-custom.js\"></script>\r\n");
      out.write("  <script src=\"resources/html/js/slick.min.js\"></script>\r\n");
      out.write("  <script src=\"resources/html/js/lightgallery.min.js\"></script>\r\n");
      out.write("  <script src=\"resources/html/js/script.js\"></script>\r\n");
      out.write("\r\n");
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
