/*
 * JSP generated by Resin-3.1.14 (built Mon, 28 Oct 2013 09:30:45 PDT)
 */

package _jsp._bbs;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public class _bbs_0cio__html extends com.caucho.jsp.JavaPage
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("bbs/bbs_cio.html"), 4277326646970239624L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string0;
  static {
    _jsp_string0 = "<html>\r\n<head >\r\n<link href=\"http://icxo.com/images/icxo_style.css\" type=text/css rel=stylesheet>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\na:link {\r\n\r\n	text-decoration: none;\r\n\r\n	color: #000000;\r\n\r\n}\r\n\r\na:visited {\r\n\r\n	text-decoration: none;\r\n\r\n	color: #666666;\r\n\r\n}\r\n\r\na:hover {\r\n\r\n	text-decoration: none;\r\n\r\n}\r\n\r\na:active {\r\n\r\n	text-decoration: none;\r\n\r\n}\r\n-->\r\n\r\n</style>\r\n</head>\r\n<body leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\">\r\n<table width=\"291\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n                  <TR>\r\n                    <TD bgColor=#FFFFFF height=\"30\"><img src=\"http://cio.icxo.com/images/end_i3.gif\" width=\"11\" height=\"9\"><a href=\"http://bbs.icxo.com\" target=\"_blank\"><strong>CIO\u00c9\u00e7\u00c7\u00f8\u00d6\u00d8\u00b0\u00f5\u00bb\u00b0\u00cc\u00e2</strong></a></TD>\r\n                  </TR>\r\n                  <TR>\r\n                    <TD><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                        <tr>\r\n                          <td height=\"50\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                              <tr>\r\n                                <td height=\"30px\" valign=\"top\" style=\"font-size:14px; font-weight:bold; in-line:height=50px\" ><script language=\"JavaScript\" src=\"http://bbs.icxo.com/api/javascript.php?key=moban_fin_Ktm\"></script></td>\r\n                              </tr>\r\n                              <tr>\r\n                                <td><script language=\"JavaScript\" src=\"http://bbs.icxo.com/api/javascript.php?key=moban_it_8Qu\"></script></td>\r\n                              </tr>\r\n                              \r\n                              \r\n                              \r\n                              \r\n                              \r\n                              \r\n                          </table></td>\r\n                        </tr>\r\n                        <TR>\r\n                          <TD align=center height=8><img src=\"http://ent.icxo.com/images/xuxian.jpg\" width=\"290\" height=\"8\"></TD>\r\n						  </TR>\r\n                    </table></td>\r\n                  </tr>\r\n              </table>\r\n</body>\r\n</html>".toCharArray();
  }
}
