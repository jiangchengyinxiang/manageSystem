<%@ page language="Java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<title>友情链接列表-页面</title>
<%@ include file="/WEB-INF/include/sys/head.jsp" %>
</head>
<body>
	<div class="content-wrapper">
		<!-- Content Header (Page header) -->
		<section class="content-header">
		<ol class="breadcrumb" style="margin-bottom:0"> 
			<li><a style="text-decoration: none;"> <i class="fa fa-dashboard"></i>&nbsp;&nbsp;网站管理</a></li>
			<li class="active">友情链接列表</li>
		</ol>
		</section>

		<!-- Main content -->  
		<section class="content container-fluid">
		<div style="padding: 5px; text-align: left" class="form-inline">
		<div class="form-group">
			<label for="title">&nbsp;&nbsp;&nbsp;&nbsp;标题</label> <input class="form-control input-sm enterIndex" id="title" name="title" placeholder="请输入链接标题" type="text">
		</div>
		<div class="form-group">
			<button type="button" class="btn btn-primary"
				onclick="onSearch()">查询</button>
			<button type="button" class="btn btn-primary"
				onclick="onShowAll()">显示全部</button>
			<button type="button" class="btn btn-primary"
				onclick="onSave(0)">添加链接</button>
		</div>
	</div>
	<div class="row" style="margin:0 0;height:500px">
		<div class="col-md-12">
			<table id="grid" class="jqgrid"></table> 
			<div id="gridPager"></div>
		</div>
	</div>
		</section>
		<!-- /.content -->
	</div>
	
	<script type="text/javascript">
		function onSave(id)
		{
				layer.open({
					  title:"友情链接添加|修改",
					  type: 2,
					  area: ["768px", "480px"],
					  content: "<%=basePath%>webFriendLink/save?id="+id+"&sym=${sym}"
				}); 
		}
		function onRemove(id)
		{
			layer.confirm('确定要删除吗？', {
				  btn: ['确定','取消'] //按钮
				}, function(){
				  //提交方法
				  var postData = {id:id};
				  $.post("<%=basePath%>webFriendLink/remove", postData, function(data) {
						var r= eval('('+data+')');
						layer.msg(r.msg);
						if(r.success==true)
						{
							reloadGrid();
						}
				  });
				});
		}
		
		function onSearch()
		{
			reloadGrid();
		}
		function onShowAll()
		{
			$("#title").val("");
			reloadGrid();
		}
		function saveCallBack() {
			layer.closeAll();
			reloadGrid();
		}
		$(function() {
			$("#grid").jqGrid(
							{
								url : "<%=basePath%>webFriendLink/listPara?sym="+"${sym}",
								styleUI : 'Bootstrap',//设置jqgrid的全局样式为bootstrap样式 
								colModel : [
										{
											label : '标题',
											name : 'title',
											width : 150
										},
										{
											label : '类型',
											name : 'linkType',
											width : 75
										},
										{
											label : '链接',
											name : 'link',
											width : 50
										},
										{
											label : '分类',
											name : 'linkFlag',
											width : 50
										},
										{
											label : '代码',
											name : 'sym',
											width : 50
										},
										{
											label : '操作',
											name : 'id',
											width : 60,
											key : true,
											align: 'center',
											formatter: gridOperat
										}],
										rownumbers:true,
							            autowidth:true,
										viewrecords: true,
										rowNum:20,
										height : window.top.$("#iframeCenter").height()-170,
										mtype: 'POST',   
										datatype : "json",
										pager: "#gridPager"
			});
		});
		function gridOperat(value, options, row){
	    	var html="<a style=\"margin:0 2px\" href=\"javascript:onSave("+value+")\" title=\"\">修改</a>";
	    	html+="<a style=\"margin:0 2px\" href=\"javascript:onRemove("+value+")\" title=\"\">删除</a>";
	        return html;
	    }
		function reloadGrid()
		{
			var queryData={
				"title":$("#title").val()
			};
			$("#grid").jqGrid('setGridParam',{ 
                url:'webFriendLink/listPara',
				treedatatype : 'json',
				postData: queryData
			}).trigger("reloadGrid");
		}
		function saveCallBack() {
			layer.closeAll();
			reloadGrid();
		}
	</script>
</body>
</html>