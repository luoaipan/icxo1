/*
 * JSP generated by Resin-3.1.14 (built Mon, 28 Oct 2013 09:30:45 PDT)
 */

package _jsp;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public class _searchown__html extends com.caucho.jsp.JavaPage
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
      out.write(_jsp_string1, 0, _jsp_string1.length);
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("searchown.html"), 6924386393698582484L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string0;
  private final static char []_jsp_string1;
  static {
    _jsp_string0 = "\n\n<html>\n\n<head>\n\n<title>\u00cb\u00d1\u00cb\u00f7</title>\n<LINK href=\"images/main.css\" type=text/css rel=stylesheet>\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=gb2312\"></head>\n\n<body bgcolor=\"#FFFFFF\" leftmargin=\"0\" topmargin=\"0\" marginwidth=\"0\" marginheight=\"0\">\n\n\n\n\n\n\n\n\n\n  <table width=\"870\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\n    <tr>\n      <td  valign=\"top\"><script src=\"http://ceo.icxo.com/head.js\"></script></td>\n    </tr>\n  </table>\n  <table width=\"870\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#FFFFFF\">\n\n  <tr>\n\n    <td  valign=\"top\">      <table width=\"100%\"  border=\"0\" cellspacing=\"0\" cellpadding=\"0\" style=\"border:#c9d6de 1px solid;\">\n\n      <tr>\n\n        <td ><table width=\"96%\"  border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"border:#c9d6de 1px solid;\">\n\n            <tr>\n\n              <td  valign=\"top\"><table width=\"96%\"  border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\n\n                <tr>\n\n                  <td><!-- SiteSearch Google -->\n\n                      <form method=\"get\" action=\"\" name=\"googlesearch\" >\n\n                     	   <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#ffffff\">\n\n                          		<tr>\n\n                           			 <td width=\"42%\" height=\"32\" nowrap=\"nowrap\">\n\n                            			<input type=\"hidden\" name=\"domains\" value=\"www.icxo.com\">\n\n                 					    <label for=\"sbi\" style=\"display: none\">\u00ca\u00e4\u00c8\u00eb\u00c4\u00fa\u00b5\u00c4\u00cb\u00d1\u00cb\u00f7\u00d7\u00d6\u00b4\u00ca</label>\n\n                  						<input type=\"text\" name=\"q\" size=\"20\" maxlength=\"75\" value=\"\" id=\"sbi\">\n\n                  						<label for=\"sbb\" style=\"display: none\">\u00cc\u00e1\u00bd\u00bb\u00cb\u00d1\u00cb\u00f7\u00b1\u00ed\u00b5\u00a5</label>\n\n                 						 <input type=\"submit\" name=\"sa\" value=\"ICXO\u00cb\u00d1\u00cb\u00f7\" id=\"sbb\">                            		</td>\n\n                            		<td width=\"35%\" nowrap=\"nowrap\">\n\n										<table width=\"210\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n\n											  <tr>\n\n												 <td width=\"62\">\n\n													 <input type=\"radio\" name=\"sitesearch\" value=\"\" id=\"ss0\">\n\n													  <label for=\"ss0\" class=\"red\" title=\"\u00cb\u00d1\u00cb\u00f7\u00cd\u00f8\u00c2\u00e7\">Web</label></td>\n\n													 <td width=\"148\">\n\n														<input type=\"radio\" name=\"sitesearch\" value=\"www.icxo.com\" checked id=\"ss1\">\n\n													<label for=\"ss1\" class=\"red\" title=\"\u00cb\u00d1\u00cb\u00f7 biz.icxo.com\">www.icxo.com</label></td>\n											</tr>\n										</table>									</td>\n\n                           			 <td width=\"23%\" nowrap=\"nowrap\">\n\n									 	<input type=\"hidden\" name=\"client\" value=\"pub-4782891006573276\">\n\n										  <input type=\"hidden\" name=\"forid\" value=\"1\">\n\n										  <input type=\"hidden\" name=\"ie\" value=\"GB2312\">\n\n										  <input type=\"hidden\" name=\"oe\" value=\"GB2312\">\n\n										  <input type=\"hidden\" name=\"cof\" value=\"GALT:#008000;GL:1;DIV:#C3D9FF;VLC:663399;AH:center;BGC:FFFFFF;LBGC:336699;ALC:0000FF;LC:0000FF;T:000000;GFNT:0000FF;GIMP:0000FF;FORID:11\">\n\n										  <input type=\"hidden\" name=\"hl\" value=\"zh-CN\">                            		</td>\n                       		 </tr>\n                        </table>\n                    </form>				</td>\n                </tr>               \n\n              </table>\n\n              <table width=\"100%\" border=\"0\" align=\"center\">\n\n                  <tr>\n\n                    <td ><!-- Google Search Result Snippet Begins -->\n\n                        <div id=\"googleSearchUnitIframe\"></div>\n\n                        <script type=\"text/javascript\" >\n\n							   var googleSearchIframeName = 'googleSearchUnitIframe';\n\n							   var googleSearchFrameWidth = 700;\n\n							   var googleSearchFrameborder = 0 ;\n\n							   var googleSearchDomain = 'www.google.cn';\n\n                  		</script>\n\n                        <script type=\"text/javascript\"\n\n        			 src=\"http://www.google.com/afsonline/show_afs_search.js\">\n\n                  </script>\n\n                        <!-- Google Search Result Snippet Ends --></td>\n                  </tr>\n                </table></td>\n            </tr>\n\n          </table></td>\n\n        <td width=\"20%\" align=\"center\" valign=\"top\" ><script type=\"text/javascript\"><!--\n\ngoogle_ad_client = \"pub-4782891006573276\";\ngoogle_alternate_ad_url = \"http://media.icxo.com/tower120.html\";\ngoogle_ad_width = 160;\ngoogle_ad_height = 600;\ngoogle_ad_format = \"160x600_as\";\ngoogle_ad_type = \"image_text\";\ngoogle_ad_channel = \"\";\ngoogle_color_border = \"FFFFFF\";\ngoogle_color_bg = \"FFFFFF\";\ngoogle_color_link = \"E1771E\";\ngoogle_color_text = \"999999\";\ngoogle_color_url = \"000000\";\n//--></script>\n  <script type=\"text/javascript\"\n\n  src=\"http://pagead2.googlesyndication.com/pagead/show_ads.js\">\n\n  </script><script type=\"text/javascript\"><!--\n\ngoogle_ad_client = \"pub-4782891006573276\";\ngoogle_alternate_ad_url = \"http://media.icxo.com/tower120.html\";\ngoogle_ad_width = 160;\ngoogle_ad_height = 600;\ngoogle_ad_format = \"160x600_as\";\ngoogle_ad_type = \"image_text\";\ngoogle_ad_channel = \"\";\ngoogle_color_border = \"FFFFFF\";\ngoogle_color_bg = \"FFFFFF\";\ngoogle_color_link = \"E1771E\";\ngoogle_color_text = \"999999\";\ngoogle_color_url = \"000000\";\n//--></script>\n  <script type=\"text/javascript\"\n\n  src=\"http://pagead2.googlesyndication.com/pagead/show_ads.js\">\n\n  </script><script type=\"text/javascript\"><!--\n\ngoogle_ad_client = \"pub-4782891006573276\";\ngoogle_alternate_ad_url = \"http://media.icxo.com/tower120.html\";\ngoogle_ad_width = 160;\ngoogle_ad_height = 600;\ngoogle_ad_format = \"160x600_as\";\ngoogle_ad_type = \"image\";\ngoogle_ad_channel = \"\";\ngoogle_color_border = \"FFFFFF\";\ngoogle_color_bg = \"FFFFFF\";\ngoogle_color_link = \"E1771E\";\ngoogle_color_text = \"999999\";\ngoogle_color_url = \"000000\";\n//--></script>\n  <script type=\"text/javascript\"\n\n  src=\"http://pagead2.googlesyndication.com/pagead/show_ads.js\">\n\n  </script></td>\n      </tr>\n\n    </table>\n\n    </td>\n\n    </tr>\n\n</table>\n\n\n\n\n\n\n\n<!----------------------------------JS\u00bb\u00f1\u00b5\u00c3\u00c1\u00ac\u00bd\u00d3\u00b2\u00ce\u00ca\u00fd --------------------------------------------------->\n\n<script language=\"JavaScript\">\n\n 	function GetArgsFromHref(sHref,sArgName){\n\n 		var args=sHref.split(\"?\");\n\n 		var retval=\"\";\n\n 		if(args[0]==sHref){\n\n 			return retval;\n\n 		}var str=args[1];\n\n 		args=str.split(\"&\");\n\n 		for(var i=0;i<args.length;i++){\n\n 			str=args[i];\n\n 			var arg=str.split(\"=\");\n\n 			if(arg.length<=1) continue;\n\n 			if(arg[0]==sArgName) {retval=arg[1];\n\n 				return retval;\n\n 			}\n\n 		\n\n 		}\n\n 	}\n\n 			\n\n          url   =   window.location.href;   \n\n\n\n          type=GetArgsFromHref(url,\"type\");\n\n          word=GetArgsFromHref(url,\"searchword\");\n\n\n\n		  if(type==\"allicxo\"){\n\n		  \n\n		  		document.googlesearch.q.value=word;\n\n		  		document.googlesearch.domains.value=\"icxo.com\";\n\n		  		document.getElementById(\"ss1\").value=\"icxo.com\";\n\n		  		document.googlesearch.submit();\n\n		  }\n\n		 if(type==\"bbs\"){\n\n		  \n\n		  		document.googlesearch.q.value=word;\n\n		  		document.googlesearch.domains.value=\"bbs.icxo.com\";\n\n		  		document.getElementById(\"ss1\").value=\"bbs.icxo.com\";\n\n		  		document.googlesearch.submit();\n\n		  }\n\n		 if(type==\"blog\"){\n\n		  \n\n		  		document.googlesearch.q.value=word;\n\n		  		document.googlesearch.domains.value=\"blog.icxo.com\";\n\n		  		document.getElementById(\"ss1\").value=\"blog.icxo.com\";\n\n		  		document.googlesearch.submit();\n\n		  }\n\n		 if(type==\"depot\"){\n\n		  \n\n		  		document.googlesearch.q.value=word;\n\n		  		document.googlesearch.domains.value=\"depot.icxo.com\";\n\n		  		document.getElementById(\"ss1\").value=\"depot.icxo.com\";\n\n		  		document.googlesearch.submit();\n\n		  }\n\n			if(type==\"card\"){\n\n		  \n\n		  		document.googlesearch.q.value=word;\n\n		  		document.googlesearch.domains.value=\"card.icxo.com\";\n\n		  		document.getElementById(\"ss1\").value=\"card.icxo.com\";\n\n		  		document.googlesearch.submit();\n\n		  }\n\n		 if(type==\"salon\"){\n\n		  \n\n		  		document.googlesearch.q.value=word;\n\n		  		document.googlesearch.domains.value=\"salon.icxo.com\";\n\n		  		document.getElementById(\"ss1\").value=\"salon.icxo.com\";\n\n		  		document.googlesearch.submit();\n\n		  }\n\n		 if(type==\"bi\"){\n\n		  \n\n		  		document.googlesearch.q.value=word;\n\n		  		document.googlesearch.domains.value=\"bi.icxo.com\";\n\n		  		document.getElementById(\"ss1\").value=\"bi.icxo.com\";\n\n		  		document.googlesearch.submit();\n\n		  }\n\n		  \n\n</script>\n\n<!--------------------".toCharArray();
    _jsp_string1 = "---------------JS\u00bb\u00f1\u00b5\u00c3\u00c1\u00ac\u00bd\u00d3--------------------------------------------------->\n\n  \n\n</body>\n\n</html>\n\n".toCharArray();
  }
}
