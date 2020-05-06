<%@ page contentType="text/html;charset=gbk"  pageEncoding="gbk"%>
<%@ page import="com.myniko.util.FileWrite" %>
<%@ page import="com.myniko.util.ReadFromUrl" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<link rel="stylesheet" type="text/css" href="http://ceo.icxo.com/new/newceo_style.css">
  <head>
    <base href="<%=basePath%>">    
    <title>My JSP 'staticurl.jsp' starting page</title>    
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">    
	<Script language="JavaScript">
		function doSubmit(){
			document.static.hiddenaction.value="static";
			document.static.submit();
		}
	</script>
<%
	if(request.getParameter("hiddenaction")!=null&&request.getParameter("hiddenaction").equals("static")){
		String filename="/home/icxobjadmin/websites/news_icxo/"+request.getParameter("filename");		
		FileWrite.writeFileFromUrl(filename,request.getParameter("url"));		
		out.println("静态成功");
	}
%>
  </head> 
  <body>    
     <form name="static" method="post" action="" >
     	<input type="hidden" name="hiddenaction" value="">		<table align="center" bgcolor="#FFFFFF"> 
			<tr>
				<td>
		     	动态URL网址<input type=text name="url">
		     	<br>
		     	输入形式为： http://ceo.icxo.com/news/index1gd.html
     			　注：不加前缀http://也可</td>
     		</tr>      		
			<tr>
			  <td>				
		     	静态后命名的文件名:<input type=text name="filename">
		     	  注：拷贝文件名时切记不要加空格<br>
	     	    比如 CEO(ceo.icxo.com)频道 :如果要静态的文件在 news文件夹下，并且静态后的静态文件为： index1.html,那么 你需要输入：ceo/news/index1.html     			</td>
     		</tr>
     		<tr>
     			<td>
     				<input type="button" value="提交" onClick="doSubmit()">
     			</td>
     		</tr>
     		
     	</table>
     </form>		     
  </body>
</html>