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
		out.println("��̬�ɹ�");
	}
%>
  </head> 
  <body>    
     <form name="static" method="post" action="" >
     	<input type="hidden" name="hiddenaction" value="">		<table align="center" bgcolor="#FFFFFF"> 
			<tr>
				<td>
		     	��̬URL��ַ<input type=text name="url">
		     	<br>
		     	������ʽΪ�� http://ceo.icxo.com/news/index1gd.html
     			��ע������ǰ׺http://Ҳ��</td>
     		</tr>      		
			<tr>
			  <td>				
		     	��̬���������ļ���:<input type=text name="filename">
		     	  ע�������ļ���ʱ�мǲ�Ҫ�ӿո�<br>
	     	    ���� CEO(ceo.icxo.com)Ƶ�� :���Ҫ��̬���ļ��� news�ļ����£����Ҿ�̬��ľ�̬�ļ�Ϊ�� index1.html,��ô ����Ҫ���룺ceo/news/index1.html     			</td>
     		</tr>
     		<tr>
     			<td>
     				<input type="button" value="�ύ" onClick="doSubmit()">
     			</td>
     		</tr>
     		
     	</table>
     </form>		     
  </body>
</html>