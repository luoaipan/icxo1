var redir=false;
var peval=false;
var frecity=null,frestate=null,freform;
var ai_ie=document.all;
var wasFcs=null;
var toFcs=null;
var errmsg;
var psz=null;
var segment='';
var sign=null;
var sqd=new Array();
var http  = {errTo:null,isErr:false}
var sprTb = {cur:null,cb:null,to:null,last:null,initDly:250,dly:250,tabs:new Array(),editIdx:null,lck:0}
var pGet_frce=new Array();
var col = document.getElementById("bd");
var scps=new Array();
var tips,tipObjs=new Array();
document.domain=document.domain;

function p_o(o){return document.getElementById(o);}
function errMsg() {
	if (http.isErr) {
		alert(errmsg);
		setErr(false);
	}
}
function setErr(isErr){
	http.isErr=isErr;
}
function impScr(u) {
	if (!scps[u]){
		scps[u]=1;
		var scr=document.createElement("script");
		scr.setAttribute("type","text/javascript");
		scr.setAttribute("src",u);
		document.getElementsByTagName("head")[0].appendChild(scr);
	}
}
function showTab(did,cid,cback,init){
	if(init!=null)eval(init);
	if(did==null)return false;
	var div=p_o(did);
	var tab=p_o(cid);
	if(tab==null)return false;
	var tabs=div.childNodes;
	for(var i=0;i<tabs.length;i++){
		tabs[i].className='dn';
		if(tabs[i].style)tabs[i].style.visibility='hidden';
	}
	tab.className='di';
	if(tab.style)tab.style.visibility='visible';
	if(cback!=null)eval(cback);
	ai_poo();
	fcs();
	return true;
}
function mkTab(did,cid,htm){
	var div=p_o(did);
	if(div==null)return;
	var newT=false;
	var tab=p_o(cid);
	if(!tab){
		tab=document.createElement('div');
		tab.setAttribute('id',cid);
		newT=true;
	}
	tab.className='dn';
	tab.innerHTML=htm;
	if(newT)div.appendChild(tab);
}
String.prototype.trim=function(){return this.replace( /^\s*/, '').replace( /\s*$/, '' );}
function trimQ(q){if(q)q.value=q.value.trim()}
function allLI(arg) {
var x = p_o((arg)).getElementsByTagName("li").length;
	while (x>0) {
		p_o((arg+x)).className="";
		p_o((arg+'a'+x)).className="";x--;
	}
}
function selTab(arg,i){
	if(arg!=null){
		allLI(arg);
		lidx = (arg +i);
		liadx = (arg+'a'+i);
	}
	if(arg == 'r'){
		p_o(liadx).className="curr";
	}else if(arg!=null){
		p_o(liadx).className="sel";
	}
}
function addState(u){
	for(var k in sqd){
		if(u.indexOf(k+'=')<0)u+='&'+k+'='+sqd[k];
	}
  	return u;
}
function pGet(url,i,arg,id,cback,frce,fcsId,qdata){
	var cid=id+i;
	toFcs=fcsId;
	if(typeof(pGet_frce[cid])!='undefined'){
		frce=pGet_frce[cid];
	}
	if(frce||showTab(id,cid,cback)==false){
		var uid=(new Date()).getTime();
		url+='&uid='+uid+'&cid='+cid
		if(arg)url+='&targ='+arg;
		if(qdata)url+='&'+qdata;
		url=addState(url);
		if(i)url+='&tid='+i;
		if(cback)url+='&cback='+escape(cback);
		sendReq(url);
	}else{
		selTab(arg,i);
	}
}
function fcs(id){
	if(id==null){
		if(toFcs==null)return;
		id=toFcs;
	}
	var o=p_o(id);
	toFcs=null;
	if(!o)return;
	if(o.getAttribute("tabIndex")==null||!o.getAttributeNode("tabIndex").specified){
		switch(o.nodeName.toLowerCase()){
			case 'a':
			case 'body':
			case 'button':
			case 'frame':
			case 'iframe':
			case 'img':
			case 'input':
			case 'object':
			case 'select':
			case 'textarea':
				break;
			default:
				o.setAttribute("tabIndex","-1");
				break;
		}
	}
	if(o.focus){
		if(document.all){
			o.focus();
			o.focus(); // intentional IE fix
		}else{
			setTimeout('p_o("' + o.id + '").focus()', 0);
		}
	}
}
function sendReq(u) {
	var f,r;
	peval=true;
	setErr(true);
	if(http.errTo)clearTimeout(http.errTo);
	http.errTo=setTimeout(errMsg,10000);

	f=function(){if(r.readyState>3)evalResp(r);}
	r=window.XMLHttpRequest?new XMLHttpRequest():new ActiveXObject("Microsoft.XMLHTTP");
	r.open('GET',u,1);
	r.onreadystatechange=f;
	r.setRequestHeader('content-type','text/xml');
	r.send(null);
}
function evalResp(re){
	if(re.status==200&&re.responseText){
		eval(re.responseText);
	}else{
		errMsg();
	}
}
function isRedir(){return redir;}
function setLoc(mod,zip,inc,div,args,fcsId) {
	toFcs=fcsId;
	var url='locset.adp?mod='+escape(mod)+'&inc='+escape(inc)+'&div='+escape(div);
	if(zip==null){
		url+='&reset=1';
	}else{
		url+='&zip='+escape(zip);
	}
	if(args!=null){
		url+=args;
	}
	var uid=(new Date()).getTime();
	url+='&uid='+uid;
	url=addState(url);
	redir=true;
	sendReq(url);
}
function redirLoc(url,qry){
	var oF=document.createElement('form');
	oF.action=url;
	oF.method='get';
	var q=qry.split('|');
	for(i=0;i<q.length;i++){
		var oI=document.createElement('input');
		oI.type='hidden';
		oI.name=q[i];
		oI.value=q[++i];
		oF.appendChild(oI);
	}
	document.getElementsByTagName('body')[0].appendChild(oF);
	oF.submit();
}
function replCt(destId,data){
	var node=p_o(destId);
	var newNode=document.createElement('div');
	newNode.innerHTML=data;
	for(i=node.childNodes.length - 1;i>=0;i--){
		if(node.childNodes[i].all){
			//IE6 workaround for page blink when select list exists
			//This approach leaks nodes
			var tmpNodes=node.childNodes[i].all;
			for(j=0;j<tmpNodes.length;j++){
				tmpNodes[j].setAttribute('id','');
			}
			node.childNodes[i].setAttribute('id','');
			node.childNodes[i].style.display='none';
		}else{
			node.removeChild(node.childNodes[i]);
		}
	}
	node.appendChild(newNode);
	ai_poo();
	fcs();
}
function doFcs(){
	if(document.activeElement&&wasFcs&&document.activeElement!=wasFcs) {
		wasFcs.focus();
	} else {
		p_o('topQuery2').focus();
	}
}
function setSrch(o,u,lu){
	if(p_o('topQuery2').value!=""){
		o.href=u+escape(p_o('topQuery2').value);
	} else {
		o.href=lu;
	}
}
function imp(u){
	if (!(u.length))return;
	var d=(new Date()).getTime();
	if (u.indexOf('?')>-1){
		u+='&'+d;
	}else{
		u+='?'+d;
	}
	var oI=document.createElement('img');
	oI.width=1;
	oI.height=1;
	p_o('itrk').appendChild(oI);
	oI.src=u;
}
function cf(){
	var fv=0,x;
	if(navigator.plugins&&navigator.plugins.length){
		x=navigator.plugins["Shockwave Flash"];
		if(x){
			if(x.description)fv=x.description.charAt(x.description.indexOf('.')-1);
			fv==7?fv=1:fv=0;
		}
	}else{
		try{
			x=new ActiveXObject("ShockwaveFlash.ShockwaveFlash.7");
			fv=1;
		}
		catch(e){}

	}
	return fv;
}
function ae(o,et,fn){
	var x;
	if(x=o.addEventListener)x(et,fn,0);
	else if(x=o.attachEvent){
		o['e'+et+fn]=fn;
		o[et+fn]=function(){o['e'+et+fn](window.event);}
		x('on'+et,o[et+fn]);
	}
}
function mkOmnObjs(){
	var omtags = new Array('a','div','ul','table','p','h4','h3');
	for (i=0; i<omtags.length;i++) {
		var tags=document.getElementsByTagName(omtags[i]);
		if (omtags[i] == 'a') {
			var attr='name';
		} else {
			var attr='id';
		}
		for (j=0; j<tags.length; j++) {
			if (tags[j].getAttribute(attr) && tags[j].getAttribute(attr).indexOf('om_') == 0) {
				var name=tags[j].getAttribute(attr).substring(3);
				if (omtags[i] == 'a') {
					if(tags[j].onclick==null)tags[j].onclick=new Function("e","s_objectID='"+name+"';");
				} else {
					var atags=tags[j].getElementsByTagName('a');
					for (k=0;k<atags.length;k++) {
						if(atags[k].onclick==null)atags[k].onclick=new Function("e","s_objectID='"+name+(k+1)+"';");
					}
				}
			}
		}
	}
}
function omo(id,defaultId){
	if(defaultId&&s_objectID==defaultId)return;
	s_objectID=id;
}
function omcl(obj,id,typ){
	if(!typ)typ='o';
	var s=s_gi(cl_account);
	id+='-'+psz;
	if(segment!='')id+='-'+segment;
	var f=function(){s.tl(1,typ,id);s.sa(s_account)}
	setTimeout(f,0);
}
function clk(e,btnId){
	e=(e)?e:event;
	var key=(e.charCode)?e.charCode:((e.which)?e.which:e.keyCode);
	if ((key==13||key==3)&&p_o(btnId)){
		p_o(btnId).click();
		return false;
 	}
	return true;
}
var c=0;
var tkr='';
var dlini=false;
var to=null;
var pto=null;
var dlnum=1;
var nDls=1;
var dldur=8000;
var dllast;
var troflags = new Array();
var dlpops = new Array();
var dlpvs = new Array();
var pd;
var psed=false;
var psetype='ctrl';
var fitab='';
var dlactPP=false;
function dlinit(){
	dlini=true;
}
function startdl(dur) {
	if(dur==null)dur=getdldur(dlnum);
	to=setTimeout('dlgo()',dur);
}
function dlf(){return dlgo('CTRL',1)}
function dlb(){return dlgo('CTRL',-1)}
function dlckgo(){
	if (dlCk=gC('dlact')) {
		dlCk=dlCk.replace('dl','');
		dlgo('NUM',dlCk);
	}
}
function dlgo(typ,num){
	var qdata,fcsId,doErr=1;
	dlini=true;
	dllast=dlnum;
	switch(typ){
		case 'NUM':
			if(dlnum==num)return false;
			clrT();
			dlnum=num;
			fcsId='dlC';
			break;
		case 'CTRL':
			clrT(); 
			psed=true;
			psetype='ctrl';
			(num>0)?dlnum++:dlnum--;
			fcsId='dlC';
			break;
		default:
			if(!psed) dlnum++;
			doErr=0;
			fcsId=null;
			qdata='peval=true';
			break;
			
	}
	if(dlnum>nDls){
		dlnum=1;
	}else if(dlnum<1){
		dlnum=nDls;
	}
	if(nDls!=1){
		var pUrl = 'tab.adp?type=portal&id=dlC&mod=dlDhtml&dlact=dl'+dlnum;
		if(dlpops['dl'+dlnum]) {
			pUrl += '&dlitem='+dlpops['dl'+dlnum];
		}
		pGet(pUrl,dlnum,null,'dlC','dlc()',null,fcsId,qdata);
		if(!doErr)setErr(0);
		if(dlactPP)setC('dlact','dl'+dlnum,'session');
	}
	setPse();
	return false;
}

function dlc() {
	dlteaser();
	dlcnt();
	if(p_o('dlsngb'+dlnum))p_o('dlsngb'+dlnum).style.display='block';

	if(!psed){
		startdl();
	}
	if(p_o('tro'+dlnum))track('tro'+dlnum,true);
	if(p_o('dla'+dlnum))track('dla'+dlnum,true);
}

function dlcnt() {
	if (p_o('dlcount')) {
		p_o('dlcount').innerHTML = dlnum + '/' + nDls;
	}
}

var tsrovrd=false;
function dlteaser() {
	if (p_o('dlpv')) {
		if (tsrovrd) {
			nextDL = dlnum;
		} else if (dlnum == nDls) {
			nextDL = 1;
		} else {
			nextDL = dlnum + 1;
		}
		if (dlpvs[nextDL]) {
			p_o('dlpv').innerHTML = dlpvs[nextDL];
		}
	}
}

function dlp(persist,type){
	if(persist!=null){
		var exp;
		persist?exp='persist':exp=new Date(new Date().getTime() - 86400*1000);
		setC('dlp',persist,exp)
	}
	if(type!=null) {
		psetype=type;
	} else {
		psetype='ctrl';
	}
	if(psed){
		psed=false;
		startdl();
	}else{
		psed=true;
		clrT();
	}
	setPse();
	return false;
}
function setPse(){
	if(!p_o('dlpi'))return;
	if(psed){
		p_o('dlpi').src=pctrl_off;
	}else{
		p_o('dlpi').src=pctrl_on;
	}
}
function track(id,once) {
	if(!(o=p_o(id)))return;
	if(once && troflags[id]){
		return;
	}
	var d=o.innerHTML;
	var urls=d.split(",");
	for(i=0;i<urls.length;i++) {
		if(urls[i].length)imp(urls[i]);
	}
	if(once)troflags[id] = 1;
}
function fitrk() {
	if(fitab==null)return;
	track('fiap'+fitab,true);
}
function clrT(){
	if(to){
		clearTimeout(to);
		to=null;
	}
}
ae(window,'load',dlinit);
function getdldur(dlnum) {
	if (o=p_o('dlcyc'+dlnum)) {
		return (o.innerHTML * 1000);
	}
	return dldur;
}
function ai_ad(pid, aid){
	var par=p_o(pid);
	var adpt=p_o(aid);
	par.appendChild(adpt);
	adpt.style.position='inherit';
}
function ai_posX(obj){
	var left=0;
	if(obj.offsetParent){
		while(obj.offsetParent){
			left+=obj.offsetLeft;
			obj=obj.offsetParent;
		}
	}else if(obj.x)left+=obj.x;
	return left;
}
function ai_posY(obj){
	var top=0;
	if(obj.offsetParent){
		while(obj.offsetParent){
			top+=obj.offsetTop;
			obj=obj.offsetParent;
		}
	} else if(obj.x)top+=obj.y;
	return top;
}
function ai_pos(a,b){
	var oA=p_o(a);
	var oB=p_o(b);
	oB.style.display='block';
	oB.style.top=ai_posY(oA)+'px';
	oB.style.left=ai_posX(oA)+'px';
}
var ai_posArr=new Array();
function ai_poo(){
	if(ai_ie){
		for(var i=0;i<ai_posArr.length;i++){
			ai_pos(ai_posArr[i].targ,ai_posArr[i].hid);
		}
	}
}
function ai_inj(targ,tad){
	if (!ai_ie) {
		ai_ad(targ,tad);
	} else {
		var oTad=p_o(tad);
		if(oTad.className){
			oTad.className+=' ai_fl';
		}else{
			oTad.className='ai_fl';
		}
		ai_pos(targ,tad);
		ai_posArr.push({targ:targ,hid:tad});
	}
}
function resizeTarg(a,b) {
	p_o(a).style.height=p_o(b).offsetHeight;
	ai_poo();
}
function orsz(){
	ai_poo();
	posMore();
	posDLSnag();
	posSprTbEdit();
}
window.onresize=orsz;
function cb(e) {
	if(!e)var e=window.event;
	e.cancelBubble=true;
	if(e.stopPropagation)e.stopPropagation();
}
function gC(k){
	var c=document.cookie.split(';');
	for(var i=0;i<c.length;i++){
		var s=c[i].trim().split('=');
		if(s[0]==k)return s[1];
	}
	return null;
}
var uk="www.aol.co.uk",ca="www.aol.ca",de="www.aol.de",fr="www.aol.fr";
var ius=new Array(uk,ca,de,fr)
var TZs=new Array();
TZs={
	0:{'en-gb':uk},
	1:{'en-gb':uk,'de':de,'de-at':de,'de-li':de,'de-lu':de,'de-ch':de,'fr':fr,'fr-be':fr,'fr-lu':fr,'fr-mc':fr,'fr-ch':fr},
	2:{'de':de,'de-at':de,'de-li':de,'de-lu':de,'de-ch':de,'fr':fr,'fr-be':fr,'fr-lu':fr,'fr-mc':fr,'fr-ch':fr},
	3:{},4:{},5:{},6:{},7:{},8:{},9:{},10:{},11:{},12:{},13:{},
	"-12":{},"-11":{},"-10":{},"-9":{},
	"-8":{'en-ca':ca,'fr-ca':ca},
	"-7":{'en-ca':ca,'fr-ca':ca},
	"-6":{'en-ca':ca,'fr-ca':ca},
	"-5":{'en-ca':ca,'fr-ca':ca},
	"-4":{'en-ca':ca,'fr-ca':ca},
	"-3":{'en-ca':ca,'fr-ca':ca},
	"-2":{},"-1":{}
}
var offSet=String(-(new Date().getTimezoneOffset()/60));
var langloc=String(nav_lang());
var fqdn;
if(TZs[offSet] && TZs[offSet][langloc])fqdn=TZs[offSet][langloc];
var doIr=true;
if(typeof iro!="undefined") {
	for(var i in iro) {
		if(iro[i]==fqdn)doIr=false;
	}
}
if(gC("intlr")=="0")doIr=false;
if(!gC("byPass")&&doIr){
	var ckNm="l18nUrl";
	var myLclUrl=gC(ckNm);
	if(myLclUrl!=null){
		for(i=0;i<ius.length;i++){
			if(myLclUrl.indexOf(ius[i])>=0){
				window.location.href=myLclUrl+"?src="+document.domain;
				break;
			}
		}
	} else if(fqdn){
		fqdn="http://"+fqdn;
		document.cookie=ckNm+"="+fqdn+";";
		window.location.href=fqdn+"?src="+document.domain;
	}
}
function nav_lang(){
if(typeof(navigator.language)=="string")return (navigator.language.toLowerCase());
else if(typeof(navigator.userLanguage)=="string")return (navigator.userLanguage.toLowerCase());
else return 0;
}
function winClick(){
	togMore(0);
	togSprTbEdit(null,1)
	mkHm();
}
function winOver(){
	closeSprTbTmd();
	hdEbBub();
}
window.document.onclick=winClick;
window.document.onmouseover=winOver;
var mre=0
function togMore(state){
	var oDiv=p_o('smore');
	if(!oDiv)return;
	if(state==null)state=Math.abs(mre-1);
	if(state){
		posMore();
		oDiv.style.zIndex=9999999;
		oDiv.style.display='block';
	} else {
		oDiv.style.display='none';
	}
	mre=state;
}
function posMore(){
	var oDiv=p_o('smore');
	var oLnk=p_o('stopam');
	if(oDiv&&oLnk){
		oDiv.style.left=(ai_posX(oLnk)+15)+'px';
		oDiv.style.top=(ai_posY(oLnk)+oLnk.offsetHeight)+'px';
	}
}
function openSprTbTmd(tab,idx,url,to,frce) {
	sprTb.lck=0;
	var ms=sprTb.initDly;
	setSprTb(tab);
	if(to!=null){
		ms=to;
	}else if(p_o('sTbBdy').style.display=='block'){
		ms=sprTb.dly;
	}
	if(sprTb.to)clearTimeout(sprTb.to);
	sprTb.to=setTimeout('openSprTb("'+tab+'","'+idx+'","'+url+'",'+frce+')',ms);
}
function openSprTb(tab,idx,url,frce,trk) {
	sprTb.to=null;
	if(sprTb.cur!=tab)return;
	setActTb(idx)
	if(sprTb.last==tab)return;
	if(trk==null)trk=1;
	showTab('sTbBdy','sTbLdng');
	p_o('sTbBdy').style.display='block';
	ai_poo();
	url+='&ref=http://'+location.hostname+location.pathname;
	pGet(url,tab,null,'sTbBdy','sprTb.last="'+tab+'";'+sprTb.cb,frce,'sTbFcs','init=if(sprTb.last!="'+tab+'")did=null');
	if(trk)omcl(p_o('sTb_'+tab),'sTb_'+tab);
	sprTb.cb=null;
	sprTb.last=tab;
}
function setActTb(idx){
	closeSprTbStyles()
	p_o('sTb_'+idx).className+=' sel'
}
function closeSprTbStyles(){
	var tabs=p_o('sTbs').getElementsByTagName('a');
	for(i=0;i<tabs.length;i++){
		tabs[i].className=tabs[i].className.replace('sel','');
	}
}
function setSprTb(tab) {
	sprTb.cur=tab;
}
function closeSprTbTmd() {
	if(sprTb.lck)return;
	setSprTb(null);
	setTimeout('closeSprTb()',500);
}
function closeSprTb() {
	if(sprTb.cur!=null)return;
	toFcs=null;
	if(p_o('sTbBdy')){
		p_o('sTbBdy').style.display='none';
	}else{
		return;
	}
	closeSprTbStyles()
	sprTb.last=null;
	ai_poo();
}
function setTxtVal(node,val) {
	if(node)node.innerHTML=val;
}
function setImg(oImg,src,alt){
	if(oImg){
		oImg.src=src;
		oImg.alt=alt;
	}
}
function setCurWthr(){
	var nodes;
	var oI=p_o('wImgNew');
	var oT=p_o('wTmpNew');
	if (!oI||!oT)return;
	nodes=p_o('sTbs').getElementsByTagName('b');
	for(i=0;i<nodes.length;i++){
		if(nodes[i].id&&nodes[i].id.indexOf('wTmp_')==0)setTxtVal(nodes[i],oT.innerHTML)
	}
	nodes=p_o('sTbs').getElementsByTagName('img');
	for(i=0;i<nodes.length;i++){
		if(nodes[i].id&&nodes[i].id.indexOf('wImg_')==0)setImg(nodes[i],oI.src,oI.alt);
	}
}
function setHoro(){
	var nodes;
	var oI=p_o('hImgNew_'+sign);
	if(!oI)return;
	nodes=p_o('sTbs').getElementsByTagName('img');
	for(i=0;i<nodes.length;i++){
		if(nodes[i].id&&nodes[i].id.indexOf('hImg_')==0)setImg(nodes[i],oI.src,oI.alt);
	}
}
function setMlCnt(){
	var oI=p_o('mlImgNew');
	var oT=p_o('mlCntNew');
	if (!oI||!oT)return;
	setImg(p_o('mlImg'),oI.src,oI.alt);
	setTxtVal(p_o('mlCnt'),oT.innerHTML)
}
function titleImgs(){
	var I=document.getElementsByTagName('img');
	for (i=0;i<I.length;i++)I[i].title=I[i].alt
}
function chkinp(obj){
	if (obj.value != '') {
		obj.className = 'q'
	} else {
		obj.className = 'q qg'
	}
}
function setHome(u,oLnk) {
	if(!u)u='http://www.aol.com/';
	if(!oLnk)oLnk=document.getElementById("mkh");
	var clsNm=document.getElementsByTagName('html')[0].className;

	if(oLnk.addBehavior) {
		oLnk.style.behavior='url(#default#homepage)';
		oLnk.setHomePage(u);
		return false;
	} else if (clsNm!=null && clsNm.match('Gecko')) {
		mkHome();
		return false;
	} else {
		window.open(oLnk.href,'_blank','height=540,width=625,status=1,menubar=1,scrollbars=1');
		return false;
	}
	return true;
}
function setC(key,val,exp,dom){
        if(exp=='session')exp='';
        else if(exp=='persist'||exp==null)exp='EXPIRES='+new Date(new Date().getTime()+2*365*24*60*60*1000).toGMTString();
        else exp='EXPIRES='+exp;
        (dom!=null)?dom='DOMAIN='+dom+';':dom='';
        document.cookie=key+'='+val+';'+exp+';PATH=/;'+dom;
}
function posDLSnag() {
	var pos = p_o('dlbo');
	var sng = p_o('sng');
	sng.style.left=(ai_posX(pos)+pos.offsetWidth-sng.offsetWidth+2)+'px';
	sng.style.top=(ai_posY(pos))+'px';
}
function showDLSnag() {
	var pos = p_o('dl');
	var sng = p_o('sng');
	if (sng.style.display=='block') {
		sng.style.display='none';
		if(psetype=='auto')dlp(null,'auto');
	} else {
		sng.style.display='block';
		pGet('tab.adp?type=portal&id=sng&mod=snag','1',null,'sng',null,0,'sngFcs');
		posDLSnag();
		if(!psed)dlp(null,'auto');
	}
	return false;
}
function togSprTbEdit(idx,close){
	if(idx==null&&sprTb.editIdx==null)return;
	else if(idx==null)idx=sprTb.editIdx;

	if(sprTb.editIdx==idx||close){
		p_o('sprTbEdtWr').style.display='none';
		fcs('stbArrDn_'+sprTb.editIdx)
		sprTb.editIdx=null;
	}else{
		var oAs=p_o('sprTbEdtLst').getElementsByTagName('a');
		for(i=0;i<oAs.length;i++){
			var aId=oAs[i].id.replace(/-/, ".");
			if(sprTb.tabs[idx]&&aId==sprTb.tabs[idx]+'_sprTbEdt'){
				oAs[i].className='sel'
			}else{
				oAs[i].className=''
			}
		}
		p_o('sprTbEdtWr').style.display='block';
		posSprTbEdit(idx);
		sprTb.editIdx=idx;
		fcs('stbArrUp')
	}
}
function posSprTbEdit(idx){
	if(idx==null)idx=sprTb.editIdx;
	var relNode=p_o('stbArrDn_'+idx)
	var oDiv=p_o('sprTbEdtWr');
	if(relNode==null||(oDiv&&oDiv.style.display=='none'))return;
	oDiv.style.left=(ai_posX(relNode)-oDiv.offsetWidth+4+relNode.offsetWidth)+'px';
	oDiv.style.top=(ai_posY(relNode)+3)+'px';
}
function editSprTb(newTb,qdata,noExpnd){
	if(newTb==sprTb.tabs[sprTb.editIdx])return;
	var ck,tabs;
	if(ck=gC('stbs'))tabs=ck.split(',');
	else tabs=new Array('','','','');
	tabs[sprTb.editIdx]=newTb;
	ck=tabs.join(',');
	setC('stbs',ck,'persist');
	showTab('sTbBdy','sTbLdng');
	ai_poo();
	pGet('/tab.adp?idx='+sprTb.editIdx+'&ref=http://'+location.hostname+location.pathname,newTb,null,'new_sTb','replSprTb('+sprTb.editIdx+',"'+newTb+'",'+(noExpnd==1)+')',1,'sTbFcs',qdata)
	omcl(p_o('sTb_'+(sprTb.editIdx+1)),'edit_sTb'+sprTb.editIdx+'_'+newTb);
}
function replSprTb(idx,newTb,noExpnd){
	p_o('stli'+idx).innerHTML=p_o('new_stli'+idx).innerHTML;
	if(p_o('sTbBdy'+newTb)){
		replCt('sTbBdy'+newTb,p_o('new_sTbBdy'+newTb).innerHTML)
	}else{
		mkTab('sTbBdy','sTbBdy'+newTb,p_o('new_sTbBdy'+newTb).innerHTML);
		showTab('sTbBdy','sTbBdy'+newTb);
	}
	sprTb.tabs[idx]=newTb;
	if(noExpnd){
		setSprTb(null);
		closeSprTb();
	} else {
		setActTb(idx);
		setSprTb(newTb);
		openSprTb(newTb,idx,null,0,0);
	}
	ai_poo();
	p_o('new_sTb'+newTb).parentNode.removeChild(p_o('new_sTb'+newTb))
}
function swpClr(color){
	if (typeof(currClr)=='undefined')return false;
	if (currClr==color)return false;
	var cc=p_o('cl'+currClr).parentNode;
	var nc=p_o('cl'+color).parentNode;
	cc.className=cc.className.replace('on','');
	nc.className+=' on';
	var col=p_o('bd');
	col.className=col.className.replace(currClr,' '+color);
	setC('clr',color);
	currClr=color;
	return false;
}
function mkHome() {
	var obj = p_o('mkhp');
	if (!obj) {
		return;
	}
	if (obj.style.display=='block') {
		obj.style.display='none';
	} else {
		posMkhome();
		obj.style.display='block';
	}
	return false;
}
function mkHm() {
	var obj = p_o('mkhp');
	if (!obj) {
		return;
	}
	obj.style.display='none';
}
function posMkhome(){
	var oDiv=p_o('mkhp');
	var oLnk=p_o('mkh');
	if(oDiv&&oLnk){
		oDiv.style.left=(ai_posX(oLnk))+'px';
		oDiv.style.top=(ai_posY(oLnk)+15)+'px';
	}
}
var vidt=null;
function playvid(id,div,embd,plr,auto,dmn){
	if(typeof(mp)!='object'){
		if(vidt)clearTimeout(vidt);
		vidt=setTimeout('playvid("'+id+'","'+div+'","'+embd+'","'+plr+'","'+auto+'")',500);
		return;
	}
	if(dmn!=null){
		mp.host=dmn+"."+document.domain;
	}
	mp.launcher(plr,'pmmsid:'+id,['embed:'+embd,'autoplay:'+auto,'embedDivId:'+div]);
}
var radt=null;
function playrad(st,co){
	if(typeof(radio)!='function'){
		if(radt)clearTimeout(radt);
		radt=setTimeout('playrad("'+st+'","'+co+'")',500);
		return;
	}
	radio.openPlayer(st,co);
}
var wimDebug=false;
var wimLogoutTxt=null;
var wimBaseAuthURI=null;
var wimBaseTransURI=null;
var wimCfgDone=false;
var authToken=null;
function chgAimGrp(grps) {
	if(grps==null)return;
	grp=escape(grps.options[grps.selectedIndex].value);

	if(typeof(wimRef)=='undefined') {
		wimRef='http://'+location.hostname+location.pathname;
	}
	showTab('sTbBdy','sTbLdng');
	pGet('tab.adp?type=portal&id=sTbBdy&mod=supertab.aim&grp='+grp+'&ref='+escape(wimRef),'aim',null,'sTbBdy',null,1,'sTbFcs');
}
function setAuthTokenV(token) {
	if(authToken==null)authToken=token;
}
var aimt=null;
function openIMWndw(sn) {
	if(!wimCfgDone) {
		if(typeof(AIM.params.text) != 'object') {
			if(aimt)clearTimeout(aimt);
			aimt=setTimeout('openIMWndw("'+sn+'")',500);
			return;
		}
		AIM.params.DEBUG=wimDebug;
		AIM.params.token=authToken;
		AIM.params.text.availabilityMenuItems.endSession.cls="dn";
		AIM.params.text.availabilityMenuItems.soundOption.cls="dn";
		if(wimLogoutTxt)AIM.params.text.autoLogOut=wimLogoutTxt;
		if(wimBaseTransURI)AIM.params.baseTransactionURI=wimBaseTransURI;
		if(wimBaseAuthURI)AIM.params.baseAuthURI=wimBaseAuthURI;
		ae(window,'beforeunload',clrAuthTokenC);
		wimCfgDone=true;
	}


	/**
	*	Override the AIM API's endSession function. 
	*/
	AIM.transactions.endSession = function() {
		var tObj = {
			dataURI: "http://" + document.domain  + "/endaimsess.adp?k=" + AIM.params.wimKey + "&aimsid=" + AIM.params.sessionId + "&baseUrl=" + AIM.params.baseTransactionURI,
			type:"endSession"
		}
		AIM.core.requestData(tObj);
		if(document.getElementById("AIMBuddyListContainer")) document.getElementById("AIMBuddyListContainer").style.display = "none";
	}

	AIM.widgets.IM.launch(sn);
}
function clrAuthTokenC() {
	setC('atok','','Thu, 01-Jan-1970 00:00:01 GMT');
}
function getEventX(event){
	if(event.pageX)return event.pageX;
	return event.clientX;
}
function getEventY(event){
	if(event.pageY)return event.pageY;
	return event.clientY;
}
function shwEbBub(event,txt){
	if(!event)event=window.event;
	var bo=p_o('ebbub');
	bo.innerHTML=txt;
	bo.style.top=getEventY(event)+15+'px';
	bo.style.left=getEventX(event)-100+'px';
	bo.style.display='block';
	document.onmousemove=function(moveEvent){mvEbBub(moveEvent,bo);};
}
function mvEbBub(event,bubObj){
	if(!event)event=window.event;
	bubObj.style.top=getEventY(event)+15+'px';
	bubObj.style.left=getEventX(event)-100+'px';
}
function hdEbBub(){
	if(p_o('ebbub'))p_o('ebbub').style.display='none';
	document.onmousemove=null;
}
function showTips() {
	var i;
	for (i in tips) {
		var tipObj=document.createElement('div');
		var innerObj=document.createElement('div');
		var arrowObj=document.createElement('div');
		tipObj.className='tip';
		innerObj.className='tipin';
		innerObj.innerHTML=tips[i][1];
		tipObj.appendChild(innerObj);
		document.body.appendChild(tipObj);
		document.body.appendChild(arrowObj);
		showTip(tips[i][0],tipObj,arrowObj,tips[i][2],tips[i][3],tips[i][4],tips[i][5]);
	}
}
function showTip(tgt,tipObj,arrowObj,x,y,time,arrowpos) {
	var tgtObj=p_o(tgt);
	if (tgtObj) {
		tipObj.style.display="block";
		arrowObj.style.display="block";
		posTip(tgtObj,tipObj,arrowObj,x,y,arrowpos);
		tipObjs.push(new Array(tgtObj,tipObj,arrowObj,x,y,arrowpos));
		ae(window,'resize',posTips);
		if(time>0){
			setTimeout(function(){tipObj.style.display="none";arrowObj.style.display="none";},time*1000);
		}
	}
}
function posTips(){
	for (i in tipObjs) {
		posTip(tipObjs[i][0],tipObjs[i][1],tipObjs[i][2],tipObjs[i][3],tipObjs[i][4],tipObjs[i][5]);
	}
}
function posTip(tgtObj,tipObj,arrowObj,x,y,arrowpos){
	var left,aleft,top,atop;
	switch(arrowpos) {
			case 1:
				left=ai_posX(tgtObj)-3+x;
				top=ai_posY(tgtObj)+10+tgtObj.offsetHeight+y;
				aleft=left+5;
				atop=top-8;
				arrowObj.className='tiparrowup';
				break;
			case 2:
				left=ai_posX(tgtObj)-tipObj.offsetWidth/2+tgtObj.offsetWidth/2+3+x;
				top=ai_posY(tgtObj)+10+tgtObj.offsetHeight+y;
				aleft=left+tipObj.offsetWidth/2-8;
				atop=top-8;
				arrowObj.className='tiparrowup';
				break;
			case 3:
				left=ai_posX(tgtObj)-tipObj.offsetWidth+tgtObj.offsetWidth/2+17+x;
				top=ai_posY(tgtObj)+10+tgtObj.offsetHeight+y;
				aleft=left+tipObj.offsetWidth-22;
				atop=top-8;
				arrowObj.className='tiparrowup';
				break;
			case 4:
				left=ai_posX(tgtObj)-3+x;
				top=ai_posY(tgtObj)-tipObj.offsetHeight-5+y;
				aleft=left+5;
				atop=top+tipObj.offsetHeight-2;
				arrowObj.className='tiparrowdown';
				break;
			case 6:
				left=ai_posX(tgtObj)-tipObj.offsetWidth+tgtObj.offsetWidth/2+17+x;
				top=ai_posY(tgtObj)-tipObj.offsetHeight-5+y;
				aleft=left+tipObj.offsetWidth-22;
				atop=top+tipObj.offsetHeight-2;
				arrowObj.className='tiparrowdown';
				break;
			case 5:
			default:
				left=ai_posX(tgtObj)-tipObj.offsetWidth/2+tgtObj.offsetWidth/2+3+x;
				top=ai_posY(tgtObj)-tipObj.offsetHeight-5+y;
				aleft=left+tipObj.offsetWidth/2-8;
				atop=top+tipObj.offsetHeight-2;
				arrowObj.className='tiparrowdown';
				break;
		}
		tipObj.style.left=left+'px';
		tipObj.style.top=top+'px';
		arrowObj.style.left=aleft+'px';
		arrowObj.style.top=atop+'px';
}
ae(window,'load',showTips);
function irShow() {
	p_o('iro').className="di";
}
function irStay(chk,lnk,eng) {
	var locale=langloc.split('-')[1];
	var lang=langloc.split('-')[0];
	if(!locale)locale=lang;
	if(eng)lang="en";
	var s_265=s_gi('aolcommem',0,1);
	s_265.linkTrackVars='eVar1';
	s_265.linkTrackEvents='none';
	if(p_o(chk).checked){
		setC('intlr','0','persist');
		s_265.eVar1="us_"+locale+"_enb";
		s_265.tl(lnk,'o',locale+"|us|"+lang+"|enb");
	} else {
		s_265.eVar1="us_"+locale+"_dis";
		s_265.tl(lnk,'o',locale+"|us|"+lang+"|dis");
	}
	s_265.sa(s_account);
	p_o('iro').className="dn";
	fcs('topQuery2');
}
function irGo(url,eUrl,dUrl,chk,lnk,eng) {
	var locale=langloc.split('-')[1];
	var lang=langloc.split('-')[0];
	if(!locale)locale=lang;
	if(eng)lang="en";
	var s_265=s_gi('aolcommem',0,1);
	s_265.linkTrackEvents='none';
	if(p_o(chk).checked){
		setC('intlr',url,'persist');
		s_265.linkTrackVars='none';
		s_265.tl(lnk,'o',locale+"|"+locale+"|"+lang+"|enb");
		s_265.sa(s_account);
		lnk.href=eUrl;
	} else {
		s_265.linkTrackVars='eVar1';
		s_265.eVar1=locale+"_"+locale+"_dis";
		s_265.tl(lnk,'o',locale+"|"+locale+"|"+lang+"|dis");
		s_265.sa(s_account);
		lnk.href=dUrl;
	}
}
function srchRp(v){
	var rp=p_o('srchrp');
	if(rp)rp.value=v;
}
