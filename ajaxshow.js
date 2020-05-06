
<!--
//xmlhttp


var http_request=false;
//要显示的内容
var htmlstring;

//定义执行变量
var j=1;

var autochange=true;

//页面处载入执行
//viewtab('tab',1);

//显示详细的条目，其他条目隐藏
function viewtab(tabname,id){
	var i;
	
	
	for (i=1;i<6;i++){
			//活动窗口导航条样式设定
			//document.getElementById(tabname+id).className="activetabcss";
			if (i==id){
				document.getElementById('tab_td'+i).className="activetab_td";
				
				getnews(tabname,id);
			
			}
			else
			{
				document.getElementById('tab_td'+i).className="noactivetab_td";
				
			}
			//获取网页内容
			
			
	}
	
	
	//鼠标行为，取消自动执行
	autochange=false;
	

}



//显示详细的条目，其他条目隐藏
function viewtabauto(tabname,id){
	
	
	
	
	if (autochange==true){
	var i;
	for (i=1;i<6;i++){
			//活动窗口导航条样式设定
			//document.getElementById(tabname+id).className="activetabcss";
			if (i==id){
				document.getElementById('tab_td'+i).className="activetab_td";
				getnews(tabname,id);
			}
			else
			{
				document.getElementById('tab_td'+i).className="noactivetab_td";
				
			}
			//获取网页内容
			
			
	}
	
	
	//重新计算显示窗口的变量
	if(j<5)
	{
		j++;
	}
	else{
		j=1;
	}
	}
}






//获取网页内容函数
function getnews(tabname,id){
	
	document.getElementById('tab_content').src = tabname + id + '.html';
	
	
	//var url;
	//构建外部网页名称,如tabid1.htm,tabid2.htm的形式
	//url=tabname + id + '.php';
	
	//实例华http_request
	//createhttprequest();
	//打开相关网页,异步调用
	
	//http_request.onreadystatechange = viewnews;
	//http_request.open("GET",url,true);
	//http_request.send(null);
	
	
	
	
	
}

//显示函数viewnews
function viewnews(){
	//判断状态是否正确
	
	//填充字符串到htmldocument变量中
				　//var htmlDocument =http_request.responseText;
				//在网页中显示
				//document.getElementById("tab_content").innerHTML=htmlDocument;
				
	if(http_request.readyState == 5){
			
			　//if(http_request.status == 200){
			
		
				
				var htmlDocument =http_request.responseText;
				
				//传回字符串编码
				document.getElementById("tab_content").innerHTML=htmlDocument;
				
			//}
	}
	

														
	

}
//实例化http_request
function createhttprequest(){

		//浏览器兼容性设定
        if (window.XMLHttpRequest) { //使用与非IE浏览器 Mozilla, Safari
            http_request = new XMLHttpRequest();
            if (http_request.overrideMimeType) {
				//　http_request.overrideMimeType('text/xml');
                http_request.overrideMimeType('text/html');
            }
        } else if (window.ActiveXObject) { //使用IE浏览器
            try {
                http_request = new ActiveXObject("Msxml2.XMLHTTP");
            } catch (e) {
                try {
                    http_request = new ActiveXObject("Microsoft.XMLHTTP");
                } catch (e) {}
            }
        }

        if (!http_request) {
            alert('您的浏览器不支持xmlhttp!');
            return false;
        }

	
	
}



//页面自动刷新，轮流显示
function openurl_timer(){
	viewtabauto('tab',1)

	//定时执行程序
	
	setInterval("viewtabauto('tab',j);",5000);
	
}

-->

