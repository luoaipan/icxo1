/*
 * JSP generated by Resin-3.1.14 (built Mon, 28 Oct 2013 09:30:45 PDT)
 */

package _jsp._bbs;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public class _blog_0school__html extends com.caucho.jsp.JavaPage
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("bbs/blog_school.html"), -3703405914339414725L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string0;
  static {
    _jsp_string0 = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\n<head>\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\" />\n<title>\u00ce\u00de\u00b1\u00ea\u00cc\u00e2\u00ce\u00c4\u00b5\u00b5</title>\n<link href=\"http://icxo.com/images/icxo_style.css\" rel=\"stylesheet\" type=\"text/css\">\n</head>\n\n<body>\n<table width=\"600\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n \n \n  <tr>\n    <td height=\"30\"><img src=\"http://211.154.164.205/img/end_i3.gif\" width=\"11\" height=\"9\" /><strong> <a href=\"http://my.icxo.com\" target=\"_blank\">\u00b2\u00a9\u00bf\u00cd\u00cd\u00c6\u00bc\u00f6</a></strong></td>\n    <td width=\"50%\"><img src=\"http://211.154.164.213/img/end_i3.gif\" width=\"11\" height=\"9\" /><strong> <a href=\"http://depot.icxo.com\" target=\"_blank\">\u00c8\u00c8\u00c3\u00c5\u00cf\u00c2\u00d4\u00d8</a></strong></td>\n  </tr>\n  <tr>\n    <td ><script language=\"JavaScript\" src=\"http://my.icxo.com/batch.javascript.php?param=ADRVOwNuV2VaZVsjDXhUJAFvDSNWd1EhBTYAZAY5UGENN1E8C25SLFdkC3UHalw4BWsCLF09Ai5TMlJ5AmxYJwBjVXgDYldnWnpbPg1lVHsBOA00VjdRfQVlAD8GaFAvDWlRaws%2FUi9XMQs%2FBz5ccwVhAnFdawJnU3NSegIxWCUAMlU2A3VXY1piWz4Nb1QxASoNSFZBUQIFFAArBjVQLQ0tUToLbFJ0V20LcgdmXHwFSgJGXVwCQVMuUjkCMVhmAD9VIwMuVzZaIlthDS5UNwFrDW9WbFE0BSMAbgYxUGYNdFFqCzlSM1csC3QHflw%2BBWQCZl1sAnZTbVIwAjZYJABgVWcDLldyWn5bOw0uVDYBeQ15VmZROwUyAGQGKFBcDTdROg%3D%3D\"></script></td>\n    <td><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n      <tr>\n        <td style=\"list-style-type:none; font-size:9px; margin-bottom:-50px\" align=\"center\"><script language=\"JavaScript\" src=\"http://depot.icxo.com/api/javascript.php?key=moban_covertoday_LpO\" type=\"text/javascript\"></script></td>\n        <td valign=\"top\"><script language=\"JavaScript\" src=\"http://depot.icxo.com/api/javascript.php?key=moban_biz_d1X\" type=\"text/javascript\"></script></td>\n      </tr>\n    </table></td>\n  </tr>\n  \n  <tr>\n  <td >&nbsp;</td>\n    <td style=\"list-style-image:\">&nbsp;</td>\n  </tr>\n  <tr>\n  <td ><a href=\"http://my.icxo.com/space.php?uid=253123&amp;do=blog&amp;id=1055085\" target=\"_blank\"></a></td>\n    <td style=\"list-style-image:\">&nbsp;</td>\n  </tr>\n</table>\n</body>\n</html>\n".toCharArray();
  }
}
