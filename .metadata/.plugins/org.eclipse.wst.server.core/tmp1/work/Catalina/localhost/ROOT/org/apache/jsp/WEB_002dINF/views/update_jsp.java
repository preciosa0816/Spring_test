/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.50
 * Generated at: 2020-02-09 04:26:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1551255114016L));
    _jspx_dependants.put("/WEB-INF/views/common/footer.jsp", Long.valueOf(1548207220192L));
  }

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
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"/common/css/common.css\" type=\"text/css\" />\r\n");
      out.write("\t<script src=\"/common/js/jquery-1.12.0.min.js\"> </script>\r\n");
      out.write("</head>\r\n");
	//세션 정보 가져온다.


boolean isLogin = false;
	if(session != null && "Y".equals(session.getAttribute("isLogin"))){
		isLogin = true;
	}


      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\t\t/**\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t1.id html input 테그에 내용 입력시 영문만 입력 하도록 한다.\r\n");
      out.write("\t\t\t2.id 또는 password 필드에 \"\" (공백) 값이 들어가면 값을 입력하라는 경고창 출력한다.\r\n");
      out.write("\t\t\t  2.2 id input html 테그에 \"\" 시 다음과 같이 출력 alert(\"아이디를 입력해 주시기 바랍니다.\");\r\n");
      out.write("\t\t\t  2.3 password input html 테그에 \"\" 시 다음과 같이 출력 alert(\"비밀번호를 입력해 주시기 바랍니다.\");\r\n");
      out.write("\t\t\t3.각 필드에 값이 입력 되면 userInfo 객체를 참고 하여 id,password 입력값하고 같으면 login() 함수 호출. 아니라면 alert(\"아이디,패스워드가 틀립니다\"); 경고창 출력\r\n");
      out.write("\t\t\t4.로그인 함수 호출 하면 로그인이 완료된 화면이 보여지게 되는데 div id 가 context인 항목에 장진철 님이 로그인 하셧습니다. 라고 출력 한다. \r\n");
      out.write("\t\t*/\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction logout(){\r\n");
      out.write("\t\t\tlocation.href=\"/login/logout.action\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t</script>\r\n");
      out.print(isLogin );
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"fixed-header\">\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t");

			if(isLogin){
		
      out.write("\r\n");
      out.write("\t\t\t회원님이 로그인 하셧습니다.<input type=\"button\" value=\"로그아웃\" onclick=\"logout()\"/>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");

			}else{
		
      out.write("\r\n");
      out.write("\t\t\t\t<a href=\"/login/login.action\" >로그인</a>\t\t\r\n");
      out.write("\t\t");

			}
		
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<br><br>\r\n");
      out.write("\t여기에 보통 쇼핑몰 카테고리 메뉴나 회원 로그인 버튼 같은게 나옵니다.\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- <div  align=\"center\"  style=\" border: 2px solid; text-align: center; padding: 20px\"> -->\r\n");
      out.write("<div>\"");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\t/* $(document).ready(function(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfnCommentSave = function(){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar param = {\r\n");
      out.write("\t\t\t\tcomment: $(\"#comment\").val()\r\n");
      out.write("\t\t\t};\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype : \"post\",\r\n");
      out.write("\t\t\t\turl : \"/comment/write.action\",\r\n");
      out.write("\t\t\t\tdata: param,\r\n");
      out.write("\t\t\t\tdataType: \"json\",\r\n");
      out.write("\t\t\t\tsuccess : function(data){\r\n");
      out.write("\t\t\t\t\tif(data != null && data.length > 0){\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tvar html = \"\";\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\tfor (var i = 0; i < data.length; i++) {\r\n");
      out.write("\t\t\t\t\t\t\thtml += \"<li>\"+data[i].COMMENT_CONTENT+\"</li>\";\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t$(\"#comment_list\").html(html);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\terror : function(e){\r\n");
      out.write("\t\t\t\t\tconsole.log(e)\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}); */\r\n");
      out.write("</script>\r\n");
      out.write("<div  align=\"center\" class=\"container\">\r\n");
      out.write("\r\n");
      out.write("<form action=\"/board/updateArticle\" method=\"post\">\r\n");
      out.write("\t<table border=\"1\">\r\n");
      out.write("\t<caption>게시글 수정하기</caption>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td    style=\"width: 100px;\">번호</td>\r\n");
      out.write("\t\t\t<td><input name=\"num\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardDto.num}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly style=\"background:#e0e0eb;\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>이름</td>\r\n");
      out.write("\t\t\t<td><input name=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardDto.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" ></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>제목</td>\r\n");
      out.write("\t\t\t<td><input name=\"title\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardDto.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>날짜</td>\r\n");
      out.write("\t\t\t<td><input name=\"writeday\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardDto.writeday}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly style=\"background:#e0e0eb;\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>조회수</td>\r\n");
      out.write("\t\t\t<td><input name=\"readcount\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardDto.readcount}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly style=\"background:#e0e0eb;\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>내용</td>\r\n");
      out.write("\t\t\t<td><textarea name=\"content\" cols=\"40\" rows=\"5\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardDto.content}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</textarea></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"수정\" />\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</table><br/>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<a href=\"list.action\">리스트</a> |\r\n");
      out.write("\t<a href=\"deleteForm.action?num=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${boardDto.num}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">삭제</a>\r\n");
      out.write("\t\r\n");
      out.write("</form>\t\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"fixed-footer\">\r\n");
      out.write("여기는 푸터입니다.<br>여기에 보통 회사 소개나 회사 주소가 나옵니다.\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
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
