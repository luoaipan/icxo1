/*
 * JSP generated by Resin-3.1.14 (built Mon, 28 Oct 2013 09:30:45 PDT)
 */

package _jsp._js;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public class _re_0ent__html extends com.caucho.jsp.JavaPage
{
  private static final java.util.HashMap<String,java.lang.reflect.Method> _jsp_functionMap = new java.util.HashMap<String,java.lang.reflect.Method>();
  private boolean _caucho_isDead;
  
  public void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response)
    throws java.io.IOException, javax.servlet.ServletException
  {
    com.caucho.server.webapp.WebApp _jsp_application = _caucho_getApplication();
    javax.servlet.ServletContext application = _jsp_application;
    com.caucho.jsp.PageContextImpl pageContext = _jsp_application.getJspApplicationContext().allocatePageContext(this, _jsp_application, request, response, null, null, 8192, true, false);
    javax.servlet.jsp.PageContext _jsp_parentContext = pageContext;
    javax.servlet.jsp.JspWriter out = pageContext.getOut();
    final javax.el.ELContext _jsp_env = pageContext.getELContext();
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.Servlet page = this;
    response.setContentType("text/html");
    try {
      out.write(_jsp_string0, 0, _jsp_string0.length);
    } catch (java.lang.Throwable _jsp_e) {
      pageContext.handlePageException(_jsp_e);
    } finally {
      _jsp_application.getJspApplicationContext().freePageContext(pageContext);
    }
  }

  private java.util.ArrayList _caucho_depends = new java.util.ArrayList();

  public java.util.ArrayList _caucho_getDependList()
  {
    return _caucho_depends;
  }

  public void _caucho_addDepend(com.caucho.vfs.PersistentDependency depend)
  {
    super._caucho_addDepend(depend);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  public boolean _caucho_isModified()
  {
    if (_caucho_isDead)
      return true;
    if (com.caucho.server.util.CauchoSystem.getVersionId() != -4655132092424790577L)
      return true;
    for (int i = _caucho_depends.size() - 1; i >= 0; i--) {
      com.caucho.vfs.Dependency depend;
      depend = (com.caucho.vfs.Dependency) _caucho_depends.get(i);
      if (depend.isModified())
        return true;
    }
    return false;
  }

  public long _caucho_lastModified()
  {
    return 0;
  }

  public java.util.HashMap<String,java.lang.reflect.Method> _caucho_getFunctionMap()
  {
    return _jsp_functionMap;
  }

  public void init(ServletConfig config)
    throws ServletException
  {
    com.caucho.server.webapp.WebApp webApp
      = (com.caucho.server.webapp.WebApp) config.getServletContext();
    super.init(config);
    com.caucho.jsp.TaglibManager manager = webApp.getJspApplicationContext().getTaglibManager();
    com.caucho.jsp.PageContextImpl pageContext = new com.caucho.jsp.PageContextImpl(webApp, this);
  }

  public void destroy()
  {
      _caucho_isDead = true;
      super.destroy();
  }

  public void init(com.caucho.vfs.Path appDir)
    throws javax.servlet.ServletException
  {
    com.caucho.vfs.Path resinHome = com.caucho.server.util.CauchoSystem.getResinHome();
    com.caucho.vfs.MergePath mergePath = new com.caucho.vfs.MergePath();
    mergePath.addMergePath(appDir);
    mergePath.addMergePath(resinHome);
    com.caucho.loader.DynamicClassLoader loader;
    loader = (com.caucho.loader.DynamicClassLoader) getClass().getClassLoader();
    String resourcePath = loader.getResourcePathSpecificFirst();
    mergePath.addClassPath(resourcePath);
    com.caucho.vfs.Depend depend;
    depend = new com.caucho.vfs.Depend(appDir.lookup("js/re_ent.html"), 8029896931622464335L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string0;
  static {
    _jsp_string0 = "\r\n\r\n<html>\r\n\r\n\r\n\r\n<head>\r\n\r\n\r\n\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\">\r\n\r\n\r\n\r\n<title>\u00ca\u00c0\u00bd\u00e7\u00d3\u00e9\u00c0\u00d6\u00b1\u00a8\u00b5\u00c0ent.icxo.com</title>\r\n\r\n\r\n\r\n<link href=\"http://ent.icxo.com/images/ent_style.css\" type=text/css rel=stylesheet>\r\n\r\n\r\n\r\n<style type=\"text/css\">\r\n\r\n\r\n\r\n<!--\r\n\r\n\r\n\r\na{color:#000000;text-decoration:none;line-height:18px;}\r\n\r\n\r\n\r\na:link{color:#000000;text-decoration:none;line-height:18px;}\r\n\r\n\r\n\r\na:visited{color:#000000;text-decoration:none;line-height:18px;}\r\n\r\n\r\n\r\na:hover{color:#FF9900;text-decoration:underline;line-height:18px;}\r\n\r\n\r\n\r\na:active{color:#FF9900;text-decoration:underline;line-height:18px;}\r\n\r\n\r\n\r\n.STYLE4 {color: #FF0000}\r\n\r\n\r\n\r\n.STYLE5 {color: #99CC00}\r\n\r\n.r         {FONT-SIZE: 12px;COLOR: #ffffff;line-height:160%;} \r\n\r\n.r:link     {FONT-SIZE: 12px;COLOR: #ffffff;line-height:160%;} \r\n\r\n.r:visited  {FONT-SIZE: 12px;COLOR: #ffffff;line-height:160%;} \r\n\r\n.r:hover    {FONT-SIZE: 12px;COLOR: #ffffff;line-height:160%;} \r\n\r\n.r:active   {FONT-SIZE: 12px;COLOR: #ffffff;line-height:160%;}\r\n\r\n\r\n\r\n-->\r\n\r\n\r\n\r\n</style>\r\n\r\n\r\n\r\n</head>\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n<BODY onload=setTime() >\r\n\r\n<STYLE type=text/css>\r\n\r\n\r\n\r\n.myDIV {\r\n\r\n\r\n\r\n	FONT-SIZE: 12px; FONT-FAMILY: '\u00cb\u00ce\u00cc\u00e5'\r\n\r\n\r\n\r\n}\r\n\r\n\r\n\r\n.myDIV {\r\n\r\n\r\n\r\n	FILTER: revealTrans(transition=4,duration=2); WIDTH: 100%; POSITION: absolute\r\n\r\n\r\n\r\n}\r\n\r\n\r\n\r\n</STYLE>\r\n\r\n\r\n\r\n<DIV id=sc1 class=myDIV onmouseover=isScroll(1) style='VISIBILITY: visible' onmouseout=isScroll(0)>\r\n\r\n\r\n\r\n  <table width=\"280\" height=\"240\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\r\n\r\n\r\n    <tr>\r\n\r\n\r\n\r\n      <td height=\"90\"><a href=\"http://ent.icxo.com/sp/xiaosan.htm\" target=\"_blank\"><img src=\"http://photo.icxo.com/20103/2010339370re_ent.jpg\" alt=\"\u00d3\u00e9\u00c0\u00d6\u00c8\u00a6\u00c3\u00f7\u00d0\u00c7\u00b5\u00da\u00b6\u00fe\u00b4\u00fa\u00b4\u00f3\u00b5\u00f7\u00b2\u00e9\" width=\"280\" height=\"90\" border=\"0\"></a></td>\r\n\r\n    </tr>\r\n\r\n\r\n\r\n    <tr>\r\n\r\n\r\n\r\n      <td bgcolor=\"AB2500\">\u00a1\u00a1<a href=\"http://ent.icxo.com\" target=\"_blank\" class=\"r\">[\u00d3\u00e9\u00c0\u00d6] </a><a href=\"http://ent.icxo.com/sp/buyazhao.htm\" target=\"_blank\" class=\"r\">\u00b4\u00ab\u00ca\u00de\u00ca\u00de\u00d4\u00f8\u00d3\u00eb\u00b3\u00b5\u00c9\u00cc\u00c5\u00c4\u00b2\u00bb\u00d1\u00c5\u00ca\u00d3\u00c6\u00b5 \u00c1\u00f7\u00b3\u00f6\u00b5\u00da\u00cb\u00c4\u00bc\u00be?</a></td>\r\n\r\n    </tr>\r\n\r\n\r\n\r\n    \r\n\r\n	\r\n\r\n	<tr>\r\n\r\n\r\n\r\n      <td bgcolor=\"AB2500\">\u00a1\u00a1<a href=\"http://ent.icxo.com\" target=\"_blank\" class=\"r\">[\u00d3\u00e9\u00c0\u00d6] </a><a href=\"http://ent.icxo.com/sp/sanji.htm\" target=\"_blank\" class=\"r\">\u00c8\u00ce\u00b4\u00ef\u00bb\u00aa\u00bb\u00d8\u00ed\u00f8\u00c8\u00fd\u00bc\u00b6\u00c6\u00ac\u00cb\u00ea\u00d4\u00c2 \u00ce\u00de\u00d2\u00e2\u00bd\u00f8\u00be\u00fc\u00ba\u00c3\u00c0\u00b3\u00ce\u00eb</a></td>\r\n\r\n    </tr>\r\n\r\n\r\n\r\n    <tr>\r\n\r\n\r\n\r\n      <td bgcolor=\"CF6D5B\">\u00a1\u00a1<a href=\"http://man.icxo.com\" target=\"_blank\" class=\"r\">[\u00c4\u00d0\u00c8\u00cb]</a><a href=\"http://man.icxo.com/sp/wuzun.html\" target=\"_blank\" class=\"r\"> \u00ce\u00e2\u00d7\u00f0\u00a1\u00aa\u00a1\u00aa\u00b4\u00d3\u00bb\u00ad\u00c0\u00ef\u00d7\u00df\u00b3\u00f6\u00b5\u00c4\u00c4\u00d0\u00d7\u00d3\u00a3\u00a1</a></td>\r\n\r\n    </tr>\r\n\r\n\r\n\r\n    <tr>\r\n\r\n\r\n\r\n      <td bgcolor=\"CF6D5B\">\u00a1\u00a1<a href=\"http://lady.icxo.com\" target=\"_blank\" class=\"r\">[\u00c5\u00ae\u00c8\u00cb]</a> <a href=\"http://lady.icxo.com/sp/chiqinglang.htm\" target=\"_blank\" class=\"r\">\u00d3\u00e9\u00c0\u00d6\u00c8\u00a6 \u00bb\u00b9\u00d3\u00d0\u00bc\u00b8\u00b8\u00f6\u00b3\u00d5\u00c7\u00e9\u00c0\u00c9\u00a3\u00bf</a></td>\r\n\r\n    </tr>\r\n\r\n\r\n\r\n    <tr>\r\n\r\n\r\n\r\n      <td bgcolor=\"CF6D5B\">\u00a1\u00a1<a href=\"http://life.icxo.com\" target=\"_blank\" class=\"r\">[\u00c9\u00fa\u00bb\u00ee]</a> <a href=\"http://life.icxo.com/zhuanti/kaixin001.html\" target=\"_blank\" class=\"r\">\u00bf\u00aa\u00d0\u00c4\u00cd\u00f8\u00cd\u00e2\u00b9\u00d2\u00b9\u00a6\u00c2\u00ca\u00bc\u00bc\u00c7\u00c9\u00d2\u00bb\u00cd\u00f8\u00b4\u00f2\u00be\u00a1</a></td>\r\n\r\n    </tr>\r\n\r\n\r\n\r\n    <tr>\r\n\r\n\r\n\r\n      <td bgcolor=\"AB2500\">\u00a1\u00a1<a href=\"http://health.icxo.com\" target=\"_blank\" class=\"r\">[\u00bd\u00a1\u00bf\u00b5] </a><a href=\"http://ent.icxo.com/sp/jiedilian.htm\" target=\"_blank\" class=\"r\"> \u00d0\u00ec\u00be\u00b2\u00c0\u00d9\u00b1\u00bb\u00c6\u00d8\u00cb\u00a6\u00bb\u00c6\u00be\u00f5\u00c1\u00b5\u00c9\u00cf\u00bb\u00c6\u00c1\u00a2\u00d0\u00d0\u00d3\u00d6\u00d2\u00aa\u00bd\u00e3\u00b5\u00dc\u00c1\u00b5</a></td>\r\n\r\n    </tr>\r\n\r\n	<tr>\r\n\r\n\r\n\r\n       <td bgcolor=\"AB2500\">\u00a1\u00a1<a href=\"http://ox.icxo.com\" target=\"_blank\" class=\"r\">[\u00b9\u00ab\u00c5\u00a3]</a><a href=\"http://ent.icxo.com/sp/haomen.htm\" target=\"_blank\" class=\"r\"> \u00c1\u00ba\u00c2\u00e5\u00ca\u00a9\u00d4\u00d9\u00bb\u00b3\u00d4\u00d0\u00c8\u00fd\u00b8\u00f6\u00d4\u00c2 \u00c0\u00ee\u00d4\u00f3\u00bf\u00ac\u00d3\u00f9\u00d7\u00bc\u00c1\u00f4\u00b8\u00db\u00b4\u00fd\u00b2\u00fa</a></td>\r\n\r\n    </tr>\r\n\r\n  </table>\r\n\r\n\r\n\r\n</DIV>\r\n\r\n<DIV id=sc2  class=myDIV onmouseover=isScroll(1) style='VISIBILITY: hidden' onmouseout=isScroll(0)>\r\n\r\n\r\n\r\n  <table width=\"280\" height=\"240\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\r\n\r\n\r\n    <tr>\r\n\r\n\r\n\r\n      <td height=\"90\"><a href=\"http://ent.icxo.com/sp/xiaosan.htm\" target=\"_blank\"><img src=\"http://photo.icxo.com/20103/2010339370re_ent.jpg\" alt=\"\u00d3\u00e9\u00c0\u00d6\u00c8\u00a6\u00c3\u00f7\u00d0\u00c7\u00b5\u00da\u00b6\u00fe\u00b4\u00fa\u00b4\u00f3\u00b5\u00f7\u00b2\u00e9\" width=\"280\" height=\"90\" border=\"0\"></a></td>\r\n\r\n    </tr>\r\n\r\n\r\n\r\n    <tr>\r\n\r\n\r\n\r\n      <td bgcolor=\"CF6D5B\">\u00a1\u00a1<a href=\"http://ent.icxo.com\" target=\"_blank\" class=\"r\">[\u00d3\u00e9\u00c0\u00d6] </a><a href=\"http://ent.icxo.com/sp/guodegang.htm\" target=\"_blank\" class=\"r\">\u00b5\u00e7\u00d3\u00b0\u00d4\u00bd\u00b9\u00e2\u00b1\u00a6\u00ba\u00d0\u00d4\u00ec\u00d0\u00cd \u00b9\u00f9\u00b5\u00c2\u00b8\u00d9\u00b3\u00f6\u00d1\u00dd\u00e5\u00fc\u00c3\u00c4\u00b0\u00e6\u00b2\u00dc\u00b2\u00d9</a></td>\r\n\r\n    </tr>\r\n\r\n\r\n\r\n    <tr>\r\n\r\n\r\n\r\n      <td bgcolor=\"CF6D5B\">\u00a1\u00a1<a href=\"http://media.icxo.com/\" target=\"_blank\" class=\"r\">[</a><a href=\"http://ent.icxo.com\" target=\"_blank\" class=\"r\">\u00d3\u00e9\u00c0\u00d6</a><a href=\"http://media.icxo.com/\" target=\"_blank\" class=\"r\">] </a><a href=\"http://ent.icxo.com/sp/liyapeng.htm\" target=\"_blank\" class=\"r\">\u00cd\u00f5\u00b7\u00c6\u00b8\u00b4\u00b3\u00f6\u00b8\u00f6\u00b3\u00aa\u00ca\u00b1\u00bc\u00e4\u00c7\u00c3\u00b6\u00a8 \u00ca\u00d7\u00d1\u00dd\u00b6\u00a8\u00d3\u00da10\u00d4\u00c222\u00c8\u00d5</a></td>\r\n\r\n    </tr>\r\n\r\n\r\n\r\n  <tr>\r\n\r\n\r\n\r\n      <td bgcolor=\"AB2500\">\u00a1\u00a1<a href=\"http://man.icxo.com\" target=\"_blank\" class=\"r\">[\u00c4\u00d0\u00c8\u00cb]</a><a href=\"http://man.icxo.com/sp/hanguonanzhuang.htm\" target=\"_blank\" class=\"r\"> \u00ba\u00ab\u00b9\u00fa\u00ca\u00b1\u00c9\u00d0\u00c4\u00d0\u00d7\u00b0\u00b4\u00ee\u00c5\u00e4 \u00d5\u00c3\u00cf\u00d4\u00c4\u00d0\u00c8\u00cb\u00f7\u00c8\u00c1\u00a6\u00a3\u00a1</a></td>\r\n\r\n    </tr>\r\n\r\n\r\n\r\n    <tr>\r\n\r\n\r\n\r\n      <td bgcolor=\"AB2500\">\u00a1\u00a1<a href=\"http://lady.icxo.com\" target=\"_blank\" class=\"r\">[\u00c5\u00ae\u00c8\u00cb]</a> <a href=\"http://lady.icxo.com/sp/30.htm\" target=\"_blank\" class=\"r\">\u00bb\u00e9\u00d2\u00f6\u00bf\u00d6\u00be\u00e5\u00d6\u00a2 \u00ca\u00a3\u00c4\u00d0+\u00ca\u00a3\u00c5\u00ae=\u00d7\u00ea\u00ca\u00afOR\u00b7\u00cf\u00c6\u00b7\u00a3\u00bf </a></td>\r\n\r\n    </tr>\r\n\r\n\r\n\r\n    <tr>\r\n\r\n\r\n\r\n      <td bgcolor=\"AB2500\">\u00a1\u00a1<a href=\"http://life.icxo.com\" target=\"_blank\" class=\"r\">[\u00c9\u00fa\u00bb\u00ee]</a> <a href=\"http://life.icxo.com/sp/yuexin.html\" target=\"_blank\" class=\"r\">\u00d2\u00bb\u00c4\u00ea\u00ca\u00d5\u00c8\u00eb\u00b6\u00e0\u00c9\u00d9\u00cb\u00e3\u00d6\u00d0\u00b2\u00fa\u00a3\u00bf</a></td>\r\n\r\n    </tr>\r\n\r\n\r\n\r\n    <tr>\r\n\r\n\r\n\r\n      <td bgcolor=\"CF6D5B\">\u00a1\u00a1<a href=\"http://digest.icxo.com\" target=\"_blank\" class=\"r\">[\u00ce\u00c4\u00d5\u00aa]</a><a href=\"http://ent.icxo.com/sp/xiaoshenyang.htm\" target=\"_blank\" class=\"r\"> \u00b9\u00e3\u00b8\u00e6\u00ca\u00d5\u00d2\u00e6\u00c8\u00ab\u00bd\u00bb\u00d1\u00eb\u00ca\u00d3 \u00d5\u00d4\u00b1\u00be\u00c9\u00bd\u00b2\u00bb\u00cd\u00cb\u00b3\u00f6\u00d1\u00eb\u00ca\u00d3\u00b4\u00ba\u00cd\u00ed</a></td>\r\n\r\n    </tr>\r\n\r\n	<tr>\r\n\r\n\r\n\r\n      <td bgcolor=\"CF6D5B\">\u00a1\u00a1<a href=\"http://ox.icxo.com\" target=\"_blank\" class=\"r\">[\u00b9\u00ab\u00c5\u00a3] </a><a href=\"http://ent.icxo.com/sp/chujia.htm\" target=\"_blank\" class=\"r\">\u00b1\u00ed\u00d1\u00dd\u00d2\u00d5\u00ca\u00f5\u00bc\u00d2\u00d3\u00ce\u00b1\u00be\u00b2\u00fd\u00cc\u00ea\u00b6\u00c8\u00b3\u00f6\u00bc\u00d2 \u00b8\u00d0\u00ca\u00dc\u00cb\u00c2\u00d4\u00ba\u00c9\u00fa\u00bb\u00ee</a></td>\r\n\r\n    </tr>\r\n\r\n  </table>\r\n\r\n\r\n\r\n</DIV>\r\n\r\n\r\n\r\n<SCRIPT>\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nvar sc1=document.getElementById('sc1');\r\n\r\n\r\n\r\nvar sc2=document.getElementById('sc2');\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n//\u00c9\u00e8\u00d6\u00c3\u00cf\u00d4\u00ca\u00be\u00c4\u00c4\u00b8\u00f6\u00b2\u00e3\u00b5\u00c4\u00b1\u00e4\u00c1\u00bf\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nvar sL=1;\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n//\u00c9\u00e8\u00d6\u00c3\u00b6\u00af\u00d3\u00eb\u00b2\u00bb\u00b6\u00af\u00b5\u00c4\u00b1\u00e4\u00c1\u00bf\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nvar iS=0;\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n//\u00c9\u00e8\u00b6\u00a8\u00cf\u00d4\u00ca\u00be\u00ca\u00b1\u00bc\u00e4\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nfunction setTime()\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n{\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n	if(iS==0)\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n	{\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n		if(sL%2==1)\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n		{\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n			cs1(sc1,1);\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n			cs1(sc2,0);\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n			setTimeout('setTime()',5000);\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n		}\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n		else{\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n			cs1(sc1,0);\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n			cs1(sc2,1);\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n			setTimeout('setTime()',5000);\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n		}\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n		sL++;\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n	}\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n	else \r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n		{\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n         setTimeout('setTime()',1000);\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n 		 }\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n}\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n//\u00cf\u00d4\u00ca\u00be\u00ba\u00af\u00ca\u00fd\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nfunction cs1(a,b)\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n{if(a==null)return;\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n a.filters.revealTrans.apply();\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n if(b==1) a.style.visibility='visible';\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n else a.style.visibility='hidden';\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n a.filters.revealTrans.play();}\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n//\u00c9\u00e8\u00b6\u00a8is\u00b1\u00e4\u00c1\u00bf\r\n\r\n\r\n\r\n// v==1 \u00b2\u00bb\u00b9\u00f6\u00b6\u00af v==0 \u00b9\u00f6\u00b6\u00af\r\n\r\n\r\n\r\nfunction isScroll(v){\r\n\r\n\r\n\r\niS=v;\r\n\r\n\r\n\r\n}\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n</SCRIPT>\r\n\r\n\r\n\r\n</body>\r\n\r\n\r\n\r\n</html>".toCharArray();
  }
}
