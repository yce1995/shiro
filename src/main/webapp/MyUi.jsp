<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page pageEncoding="UTF-8" %>
<html>
  <head>
    <title>MyUi.jsp</title>
	
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="themes/icon.css">
	<link rel="stylesheet" type="text/css" href="..demo.css">
    <script type="text/javascript" src="jquery.min.js"></script>
	<script type="text/javascript" src="jquery.easyui.min.js"></script>
    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->
	<style type="text/css">
    	body{
			font-size:12px;
		}
    </style>
    <script type="text/javascript">
    	function urlClick(myTitle,myUrl){
    		//判断title='菜系管理' 是否存在	
    		var ifExist=$("#myTabs").tabs("exists",myTitle);	
    		if(!ifExist){
    			$("#myTabs").tabs('add',{
    			title:myTitle,
    			closable:true,
    			content:'<iframe frameborder="0" height="100%" width="100%" scrolling="no" src="'+myUrl+'"></iframe>'
    			});
    		}
    		$("#myTabs").tabs("select",myTitle);
    	}
    </script>
  </head>
  
  <body style="margin:0px">
	<div class="easyui-layout" style="width:100%;height:100%;">
		<!-- 北部 只会设置 高度 -->
		<div data-options="region:'north'" style="height:16%;">
			<div style="height:85%">
			
			</div>
			<div style="text-align: right;width: 86%"><a href="" style="">安全退出</a></div>
		</div>
		<div data-options="region:'west',split:true" title="导航菜单" style="width:20%;">
			<div class="easyui-accordion" style="width:100%;height:50%;">
				<div title="权限管理" style="overflow:auto;padding:10xp;">
					<c:forEach var="menu" items="${requestScope.menuList}">
						<a href="javascript:urlClick('${menu.menuName}','${pageContext.request.contextPath}${menu.menuUrl}')" style="text-decoration: none"><img alt="" src="themes/icons/man.png" style="margin-top:10px;">${menu.menuName}<br/></a>
					</c:forEach>
				</div>
				<div title="系统设置" style="padding:10px;">
			
				</div>
			</div>
		</div>
		<div data-options="region:'center',iconCls:'icon-large-chart'">
			<div id="myTabs" class="easyui-tabs"  style="width:100%;height:100%">
				<div title="欢迎访问"  style="padding:10px"></div>
			</div>	
		</div>
	</div>
  </body>
</html>
