/*
 * JSP generated by Resin-3.1.14 (built Mon, 28 Oct 2013 09:30:45 PDT)
 */

package _jsp;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public class _tab3__html extends com.caucho.jsp.JavaPage
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("tab3.html"), -3964778615181467294L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string0;
  static {
    _jsp_string0 = "<html>\r\n<head>\r\n\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gbk\" />\r\n<title>\u00ce\u00de\u00b1\u00ea\u00cc\u00e2\u00ce\u00c4\u00b5\u00b5</title>\r\n\r\n<link href=\"gundong/css/style.css\" rel=\"stylesheet\" type=\"text/css\" /> \r\n\r\n\r\n<link href=\"images/table.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n\r\n<link href=\"icxo/icxo_style.css\" type=\"text/css\" rel=\"stylesheet\">\r\n\r\n</head>\r\n\r\n\r\n<body>\r\n\r\n<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" >\r\n\r\n  <tr>\r\n\r\n    <td><table width=\"100%\" border=\"0\">\r\n\r\n\r\n      <tr>\r\n        <td width=\"133\" height=\"180\" rowspan=\"2\"><div class=\"dlcat\"><a href=\"http://office.icxo.com/htmlnews/2018/07/17/1415195.htm\" target=\"_blank\"><img src=\"images/3gl.jpg\" alt=\"2018\u00d4\u00b1\u00b9\u00a4\u00bd\u00b1\u00c0\u00f8\u00d0\u00c2\u00bb\u00fa\u00d6\u00c6\u00a3\u00ba\u00d7\u00b7\u00bb\u00f7\u00b7\u00d6\u00b2\u00e3\u00ca\u00bd\u00bc\u00a4\u00c0\u00f8\" width=\"128\" height=\"150\" border=\"0\"/></a><br>\r\n<a href=\"http://office.icxo.com/htmlnews/2018/07/17/1415195.htm\" target=\"_blank\">\u00ba\u00ce\u00d6\u00d6\u00bd\u00b1\u00c0\u00f8\u00c6\u00f0\u00b5\u00bd\u00bc\u00a4\u00bb\u00af\u00d7\u00f7\u00d3\u00c3</a></div></td>\r\n      </tr>\r\n\r\n      <tr>\r\n\r\n        <td><h1 class=\"STYLE14\"><a href=\"http://office.icxo.com/htmlnews/2018/07/17/1415195.htm\" target=\"_blank\" class=\"STYLE15\">2018\u00d4\u00b1\u00b9\u00a4\u00bd\u00b1\u00c0\u00f8\u00d0\u00c2\u00bb\u00fa\u00d6\u00c6</a></h1>\r\n		\r\n            <a href=\"http://office.icxo.com/htmlnews/2018/07/17/1415198.htm\" target=\"_blank\">\u00d4\u00da\u00c2\u00d2\u00ca\u00c0\u00d6\u00d0\u00d4\u00b1\u00b9\u00a4\u00d2\u00bb\u00b0\u00e3\u00bb\u00e1\u00d7\u00b7\u00cb\u00e6\u00ca\u00b2\u00c3\u00b4\u00d1\u00f9\u00b5\u00c4\u00c0\u00cf\u00b0\u00e5\u00a3\u00bf</a><br>\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n                    <a href=\"http://office.icxo.com/htmlnews/2018/07/17/1415196.htm\" target=\"_blank\">\u00b9\u00dc\u00c0\u00ed\u00d3\u00a6\u00b8\u00c3\u00c8\u00e7\u00ba\u00ce\u00b4\u00d3\u00d2\u00d5\u00ca\u00f5\u00d7\u00df\u00cf\u00f2\u00bf\u00c6\u00d1\u00a7\u00a1\u00aa\u00d1\u00ad\u00d6\u00a4\u00b9\u00dc\u00c0\u00ed</a>\r\n                    <h2 class=\"STYLE3\"><b> <a href=\"http://office.icxo.com/htmlnews/2018/07/17/1415194.htm\" target=\"_blank\">\u00c8\u00d5\u00b1\u00be\u00d6\u00c6\u00d4\u00ec\u00c6\u00c6\u00c3\u00f0\u00a3\u00ac\u00d4\u00ec\u00bc\u00d9\u00b1\u00b3\u00ba\u00f3\u00d3\u00d0\u00ba\u00ce\u00c4\u00d1\u00d1\u00d4\u00d6\u00ae\u00d2\u00fe</a></b></h2>\r\n					\r\n					\r\n                    <h2 class=\"STYLE3\"><a href=\"http://office.icxo.com/htmlnews/2018/07/17/1415201.htm\" target=\"_blank\">\u00b9\u00dc\u00c0\u00ed\u00d2\u00f2\u00c2\u00d2\u00b6\u00f8\u00b1\u00e4\u00a3\u00ac\u00d4\u00d3\u00c5\u00c6\u00be\u00fc\u00b1\u00c8\u00c3\u00f7\u00d0\u00c7\u00b6\u00d3\u00b8\u00fc\u00b8\u00f8\u00c1\u00a6</a></h2>\r\n			\r\n\r\n\r\n\r\n\r\n\r\n\r\n                    <table width=\"100%\" border=\"0\">\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n                    <tr>\r\n                     <td width=\"67%\"><h3 class=\"STYLE3\"><strong><a href=\"http://office.icxo.com/htmlnews/2018/07/17/1415200.htm\" target=\"_blank\">\u00d2\u00d4\u00ce\u00de\u00ce\u00d2\u00d7\u00d4\u00d0\u00ed\u00a3\u00ac\u00b2\u00c5\u00ca\u00c7\u00ba\u00c3\u00c1\u00ec\u00b5\u00bc</a></strong></h3>\r\n                        \r\n					   <a href=\"http://office.icxo.com/htmlnews/2018/07/17/1415193.htm\" target=\"_blank\">\u00bf\u00b4\u00c3\u00f7\u00d0\u00c7\u00be\u00ad\u00c0\u00ed\u00c8\u00cb\u00b5\u00c4\u00b5\u00bc\u00ca\u00a6\u00bc\u00c6\u00bb\u00ae</a>	\r\n						 \r\n						 \r\n						 \r\n						 \r\n						 \r\n						 \r\n						 			     \r\n                       <a href=\"http://office.icxo.com/htmlnews/2018/07/17/1415188.htm\" target=\"_blank\">\u00c5\u00e0\u00d1\u00f8\u00c8\u00cb\u00b2\u00c5\u00bb\u00b9\u00ca\u00c7\u00cd\u00ea\u00b3\u00c9\u00d2\u00b5\u00bc\u00a8\u00a3\u00bf</a></td>\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n                      <td width=\"33%\"><a href=\"http://office.icxo.com/\" target=\"_blank\"><img src=\"images/3gls.jpg\" alt=\"\u00bf\u00ec\u00c0\u00d6\u00b0\u00ec\u00b9\u00ab\"width=\"60\" height=\"60\" border=\"0\" /></a></td>\r\n                    </tr>\r\n            </table>\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n              </div></td>\r\n      </tr>\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n    </table>\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n      <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n          <tr>\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n            <td width=\"183\"><a href=\"http://office.icxo.com/\" target=\"_blank\"><strong>\u00d6\u00b0\u00b3\u00a1</strong></a><span class=\"f12px\">\u00a1\u00a1<a href=\"http://school.icxo.com/\" target=\"_blank\">\u00d1\u00a7\u00cc\u00c3</a>|<a href=\"http://mkt.icxo.com/\" target=\"_blank\">\u00d3\u00aa\u00cf\u00fa</a>|<a href=\"http://data.icxo.com/\" target=\"_blank\">\u00ca\u00fd\u00be\u00dd</a></span></td>\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n            <td valign=\"top\"><table width=\"96%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n                <tr>\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n                  <td>&nbsp;</td>\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n                  <td align=\"right\"><div align=\"right\"><a href=\"tab2.html\"><img src=\"http://211.154.164.205/images/bctrl.gif\" width=\"24\" height=\"23\" border=\"0\" /></a><a href=\"tab3.html\"><img src=\"http://211.154.164.205/images/pctrl.gif\" width=\"24\" height=\"23\" border=\"0\" /></a><a href=\"tab4.html\"><img src=\"http://211.154.164.205/images/fctrl.gif\" width=\"25\" height=\"23\" border=\"0\" /></a></div></td>\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n                </tr>\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n            </table></td>\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n          </tr>\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n      </table></td>\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n  </tr>\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n</table>\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n".toCharArray();
  }
}
