
<!--
//xmlhttp


var http_request=false;
//Ҫ��ʾ������
var htmlstring;

//����ִ�б���
var j=1;

var autochange=true;

//ҳ�洦����ִ��
//viewtab('tab',1);

//��ʾ��ϸ����Ŀ��������Ŀ����
function viewtab(tabname,id){
	var i;
	
	
	for (i=1;i<6;i++){
			//����ڵ�������ʽ�趨
			//document.getElementById(tabname+id).className="activetabcss";
			if (i==id){
				document.getElementById('tab_td'+i).className="activetab_td";
				
				getnews(tabname,id);
			
			}
			else
			{
				document.getElementById('tab_td'+i).className="noactivetab_td";
				
			}
			//��ȡ��ҳ����
			
			
	}
	
	
	//�����Ϊ��ȡ���Զ�ִ��
	autochange=false;
	

}



//��ʾ��ϸ����Ŀ��������Ŀ����
function viewtabauto(tabname,id){
	
	
	
	
	if (autochange==true){
	var i;
	for (i=1;i<6;i++){
			//����ڵ�������ʽ�趨
			//document.getElementById(tabname+id).className="activetabcss";
			if (i==id){
				document.getElementById('tab_td'+i).className="activetab_td";
				getnews(tabname,id);
			}
			else
			{
				document.getElementById('tab_td'+i).className="noactivetab_td";
				
			}
			//��ȡ��ҳ����
			
			
	}
	
	
	//���¼�����ʾ���ڵı���
	if(j<5)
	{
		j++;
	}
	else{
		j=1;
	}
	}
}






//��ȡ��ҳ���ݺ���
function getnews(tabname,id){
	
	document.getElementById('tab_content').src = tabname + id + '.html';
	
	
	//var url;
	//�����ⲿ��ҳ����,��tabid1.htm,tabid2.htm����ʽ
	//url=tabname + id + '.php';
	
	//ʵ����http_request
	//createhttprequest();
	//�������ҳ,�첽����
	
	//http_request.onreadystatechange = viewnews;
	//http_request.open("GET",url,true);
	//http_request.send(null);
	
	
	
	
	
}

//��ʾ����viewnews
function viewnews(){
	//�ж�״̬�Ƿ���ȷ
	
	//����ַ�����htmldocument������
				��//var htmlDocument =http_request.responseText;
				//����ҳ����ʾ
				//document.getElementById("tab_content").innerHTML=htmlDocument;
				
	if(http_request.readyState == 5){
			
			��//if(http_request.status == 200){
			
		
				
				var htmlDocument =http_request.responseText;
				
				//�����ַ�������
				document.getElementById("tab_content").innerHTML=htmlDocument;
				
			//}
	}
	

														
	

}
//ʵ����http_request
function createhttprequest(){

		//������������趨
        if (window.XMLHttpRequest) { //ʹ�����IE����� Mozilla, Safari
            http_request = new XMLHttpRequest();
            if (http_request.overrideMimeType) {
				//��http_request.overrideMimeType('text/xml');
                http_request.overrideMimeType('text/html');
            }
        } else if (window.ActiveXObject) { //ʹ��IE�����
            try {
                http_request = new ActiveXObject("Msxml2.XMLHTTP");
            } catch (e) {
                try {
                    http_request = new ActiveXObject("Microsoft.XMLHTTP");
                } catch (e) {}
            }
        }

        if (!http_request) {
            alert('�����������֧��xmlhttp!');
            return false;
        }

	
	
}



//ҳ���Զ�ˢ�£�������ʾ
function openurl_timer(){
	viewtabauto('tab',1)

	//��ʱִ�г���
	
	setInterval("viewtabauto('tab',j);",5000);
	
}

-->

