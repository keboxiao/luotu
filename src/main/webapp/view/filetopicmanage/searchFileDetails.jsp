<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML >
<html>
	<head>
		<title>共享文件管理</title>
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
		
			<style type="text/css">
		#mostSchemeListId,#perSchemeNumberId,#mostTimeId,#mostHopId,#delayTimeId{
			width:98%;
			height:30px;
		}
		#addDialogId{
			width:700px;height:425px;
			padding:20px 15px 15px 15px;
		}
		
		table.editTable{
		   border-collapse: collapse; 
		   width: 100%;
		   font-size: 16px;
		   /* color:#00bfff; */
		   color:#009999;
		   cellpadding : 3px;
		   text-align: right;
		   
		 }
		 
		  tr,td{
		 	border: solid 1px silver; 
		 }
		
		
		 td.oddTd{
		 	/* width:20%; */
		 	background: #eaeaea;
		 }
		
		#operatePerson,#userId,#ip_id,#port_id{
			width: 97%; height: 100%;
		}
		input#dataDomainId, input#serviceTypeIds{
			width:100%;height:30px;
		}
		#urlId{
			width: 99%; height: 100%;
		}
		textarea{
			margin-top:5px;
			resize:none;
		    height: 100%;
		    width: 100%;
		    font-size: 14px;
		    border:0;
		    overflow:hidden;
		}
		.combobox-item, .combobox-group, .combobox-stick{
			font-size:14px;
		}
		 div.save-reset{
			text-align:center;padding:5px 0;
		 }
		 button{
		 	font-size:16px;
		 }
		
	</style>
		<script type="text/javascript">

$(function() {
	$('#grid').datagrid( {
		url : '../../app/listFileBatch',
		pageSize : 15,
		pageList : [ 15, 20, 30 ],
		columns : [ [ {
			field : 'topicId',
			title : '唯一标识',
			width : 220,
			align : 'center'
		}, {
			field : 'title',
			title : '主题',
			width : 200,
			align : 'center'
		}, {
			field: 'user', 
			title: '创建人', 
			align: 'center', 
			sortable: true ,
			width : 100,
	        formatter: function (value) {
	               return value.name  //班级名称
	        }
		}, {
			field : 'remark',
			title : '备注',
			width : 300,
			align : 'center'
		} ] ]
	});
});

function test() {
	alert($('#userForm1').serialize());
}

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
	$('#title').textbox('setValue', '');
	$('#grid').datagrid('load', {});
}


function addBatch() {
	$("#dlgAdd").dialog("open").dialog('setTitle', '增加');
}

function editBatch() {
	var rowsData = $('#grid').datagrid('getSelections');
	if (!rowsData || rowsData.length==0) {
		tip('请选择一行数据');
		return;
	}		
	if (rowsData.length>1) {
		tip('请选择一行数据');
		return;
	}	
	var row = rowsData[0];
	if (row) {
		$("#dlgDetails").dialog("open").dialog('setTitle', '修改');
		$("#batchForm").form("load", row);
		$("#batch_no").attr('value',row.topicId);
		$('#filegrid').datagrid( {
			url : '../../app/listFileByBatchId?id='+row.topicId+'&file_class=1',
			striped : true,
			rownumbers : true,
			singleSelect:true,
			fitColumns: false,
			columns : [ [ {
				field : 'filename',
				title : '文件名',
				width : 300,
				align : 'center'
			}, {
				field : 'topicId',
				title : '主题号',
				width : 200,
				align : 'center'
			}, {
				field : 'formatAddTime',
				title : '上传时间',
				width : 160,
				align : 'center'
			}, {
				field:'fileId',
				title:'下载',
				align:'center',
				width : 100,
				formatter : function(value) {
					return "<a href='../../app/downloadById?id=" + value + "'>下载</a>";
				}
			} ] ]
		});
	}
}

</script>
<% boolean flag = false; %>
	</head>
	<%@ include file="batchDetails.jsp" %>
	<body align="center">

		<div id="tb" style="padding: 3px"
			data-options="region:'north',title:'查询条件',border:false">
			<form id="admin_yhgl_searchForm">
				主题：
				<input id="title" class="easyui-textbox" name="title" />
				<a href="javascript:void(0);" id="edit"
					class="easyui-linkbutton" iconCls="icon-edit" onclick="editBatch()">详细</a>
				<a href="javascript:void(0);" class="easyui-linkbutton"
					data-options="iconCls:'icon-search'" onclick="searchFun();">查询</a>
				<a href="javascript:void(0);" class="easyui-linkbutton"
					data-options="iconCls:'icon-redo'" onclick="clearFun();">重置</a>
			</form>
		</div>
		<div>
			<table id="grid" toolbar="#tb" title="主题查询" iconCls="icon-search"
				data-options="singleSelect:true,rownumbers:true,pagination:true,striped:true"></table>
		</div>
	</body>

</html>