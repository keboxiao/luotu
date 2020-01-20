<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE HTML >
<html>
	<head>
		<title>任务管理</title>
		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		
		<script type="text/javascript" src="<%=request.getContextPath() %>/jquery-easyui-1.5.1/jquery.min.js"></script>
		<script type="text/javascript" src="<%=request.getContextPath() %>/jquery-easyui-1.5.1/jquery.easyui.min.js"></script>
		<script type="text/javascript" src="<%=request.getContextPath() %>/jquery-easyui-1.5.1/locale/easyui-lang-zh_CN.js"></script>
		<link rel="stylesheet" href="<%=request.getContextPath() %>/jquery-easyui-1.5.1/themes/default/easyui.css" type="text/css"></link>
		<link rel="stylesheet" href="<%=request.getContextPath() %>/jquery-easyui-1.5.1/themes/icon.css" type="text/css"></link>
		<link rel="stylesheet" href="<%=request.getContextPath() %>/css/dlgtable.css" type="text/css"></link>
<style type="text/css">
body {
	margin: 1px
}
</style>
		<script type="text/javascript">

$(function() {
	$('#grid').datagrid( {
		url : '../../app/listAddressTask',
		pageSize : 15,
		pageList : [ 15, 20, 30 ],
		columns : [ [ {
			field : 'taskId',
			title : 'id',
			width : 260,
			align : 'center'
		}, {
			field : 'total',
			title : '总记录数',
			width : 80,
			align : 'center'
		}, {
			field: 'achieve', 
			title: '完成数', 
			align: 'center', 
			width : 80,
			align : 'center'
		}, {
			field : 'formatBeginTime',
			title : '任务开始时间',
			width : 180,
			align : 'center'
		} , {
			field : 'formatEndTime',
			title : '任务结束时间',
			width : 180,
			align : 'center'
		}, {
			field : 'taskType',
			title : '任务类型',
			width : 180,
			align : 'center'
		}, {
			field : 'state',
			title : '状态',
			width : 80,
			align : 'center'
		}] ]
	});
});

serializeObject = function(form) {
	var o = {};
	$.each(form.serializeArray(), function(index) {
		if (o[this['name']]) {
			o[this['name']] = o[this['name']] + "," + this['value'];
		} else {
			o[this['name']] = this['value'];
		}
	});
	return o;
};

function searchFun() {
	$('#grid').datagrid('load', serializeObject($('#admin_yhgl_searchForm')));
}
function clearFun() {
	//$('#endtime').datebox('setValue','');
	var state = document.getElementById("state");
	state.options[0].selected = true;
	$('#grid').datagrid('load', {});
}

function newTask() {
	$.messager.confirm('确认', '您确定要新建地址获取任务吗？', function(r) {
	if (r) {
	$.ajax( {
		type : 'POST',
		url : '../../app/getAddressDataFromAMap',
		data : $('#batchForm').serialize(),
		dataType : 'json',
		success : function(r) {
			$.messager.show( {
				title : '提示',
				msg : r.msg
			});
			$("#grid").datagrid("load");
		}
	});
	}
	});
}

function newCQTTask() {
	$.messager.confirm('确认', '您确定要新建CQT任务吗？', function(r) {
	if (r) {
	$.ajax( {
		type : 'POST',
		url : '../../app/cqtmatchaddr',
		data : $('#batchForm').serialize(),
		dataType : 'json',
		success : function(r) {
			$.messager.show( {
				title : '提示',
				msg : r.msg
			});
			$("#grid").datagrid("load");
		}
	});
	}
	});
}

function matchFiveLevelAddr() {
	$.messager.confirm('确认', '您确定要新建地址匹配任务吗？', function(r) {
	if (r) {
	$.ajax( {
		type : 'POST',
		url : '../../app/matchFiveLevelAddr',
		data : $('#batchForm').serialize(),
		dataType : 'json',
		success : function(r) {
			$.messager.show( {
				title : '提示',
				msg : r.msg
			});
			$("#grid").datagrid("load");
		}
	});
	}
	});
}
</script>

	</head>
	<body>
		<div id="tb" style="padding: 3px"
			data-options="region:'north',title:'查询条件',border:false">
			<form id="admin_yhgl_searchForm">
				起始日期：<input id="begintime" class="easyui-datebox" name="begintime" />
				终止日期：<input id="endtime" class="easyui-datebox" name="endtime" />
				状态：
				<select id="state" name="state">
					<option value="all">
						请选择
					</option>
					<option value="1">
						待处理
					</option>
					<option value="2">
						已完成
					</option>
					<option value="3">
						归档
					</option>
				</select>
				<a href="javascript:void(0);" id="edit"
					class="easyui-linkbutton" iconCls="icon-edit" onclick="newTask()">新建地址任务</a>
				<a href="javascript:void(0);" id="edit"
					class="easyui-linkbutton" iconCls="icon-edit" onclick="newCQTTask()">CQT地址匹配</a>
				<a href="javascript:void(0);" id="edit"
					class="easyui-linkbutton" iconCls="icon-edit" onclick="matchFiveLevelAddr()">五级地址匹配</a>
				<a href="javascript:void(0);" class="easyui-linkbutton"
					data-options="iconCls:'icon-search'" onclick="searchFun();">查询</a>
				<a href="javascript:void(0);" class="easyui-linkbutton"
					data-options="iconCls:'icon-redo'" onclick="clearFun();">重置</a>
			</form>
		</div>
		<div>
			<table id="grid" toolbar="#tb" title="获取地址任务" iconCls="icon-search"
				data-options="singleSelect:true,rownumbers:true,pagination:true,striped:true"></table>
		</div>
	</body>

</html>