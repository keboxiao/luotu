<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE HTML >
<html>
	<head>
		<title>OBD定位任务管理</title>
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
		url : '../../app/listobd',
		pageSize : 15,
		pageList : [ 15, 20, 30 ],
		columns : [ [ {
			field : 'obdCode',
			title : 'obd编码',
			width : 138,
			align : 'center'
		}, {
			field : 'branch',
			title : '分公司',
			width : 80,
			align : 'center'
		}, {
			field: 'gridUnit', 
			title: '网格单元', 
			align: 'center', 
			width : 100,
			align : 'center'
		}, {
			field : 'obdName',
			title : 'obd名称',
			width : 200,
			align : 'center'
		} , {
			field : 'belongsOtb',
			title : '所属光设施',
			width : 100,
			align : 'center'
		}, {
			field : 'belongsOtbName',
			title : '所属光设施名称',
			width : 120,
			align : 'center'
		}, {
			field : 'buildAddress',
			title : 'OBD建设地址',
			width : 350,
			align : 'center'
		}, {
			field : 'lon',
			title : '经度',
			width : 80,
			align : 'center'
		}, {
			field : 'lat',
			title : '纬度',
			width : 80,
			align : 'center'
		}, {
			field : 'state',
			title : '状态',
			width : 50,
			align : 'center'
		}] ]
	});
});

function savebatch() {
	$.messager.confirm('确认', '您确定要保存？', function(r) {
		$.ajax( {
			type : 'POST',
			url : '../../app/updateFileBatch',
			data : $('#batchForm').serialize(),
			dataType : 'json',
			success : function(r) {
				$.messager.show( {
					title : '提示',
					msg : r.msg
				});
				$("#dlgDetails").dialog("close");
				$("#grid").datagrid("load");
			}
		});
	});
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
	$('#obdCode').textbox('setValue', '');
	$('#begintime').datebox('setValue','');
	$('#endtime').datebox('setValue','');
	var state = document.getElementById("state");
	state.options[0].selected = true;
	$('#grid').datagrid('load', {});
}

function handleTask() {
	//alert("luotu");
	var rows = $('#grid').datagrid('getSelections');
	var ids = [];
	if (rows.length > 0) {
		$.messager.confirm('确认', '您是否要保存？', function(r) {
			if (r) {
				for ( var i = 0; i < rows.length; i++) {
					ids.push(rows[i].obdCode);
				}
				$.ajax({
					type: 'POST',
					url : '${pageContext.request.contextPath}/app/handleTask',
					data : {
						obdCodes : ids.join(',')
					},
					dataType : 'json',
					success : function(r) {
						$('#grid').datagrid('reload');
						$('#grid').datagrid('unselectAll');
						$.messager.show({
							title : '提示',
							msg : r.msg
						});
					}
				});
			}
		});
	} else {
		$.messager.show({
			title : '提示',
			msg : '请选择OBD！'
		});
	}
}


</script>

	</head>
	<body>
		<div id="tb" style="padding: 3px"
			data-options="region:'north',title:'查询条件',border:false">
			<form id="admin_yhgl_searchForm">
				obd编码：
				<input id="obdCode" class="easyui-textbox" name="obdCode" />
				状态：
				<select id="state" name="state">
					<option value="">
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
				<a href="javascript:void(0);" class="easyui-linkbutton"
					data-options="iconCls:'icon-search'" onclick="searchFun();">查询</a>
				<a href="javascript:void(0);" class="easyui-linkbutton"
					data-options="iconCls:'icon-redo'" onclick="clearFun();">重置</a>
				<a href="javascript:void(0);" id="edit"
					class="easyui-linkbutton" iconCls="icon-edit" onclick="handleTask();">处理完毕</a>
			</form>
		</div>
		<div>
			<table id="grid" toolbar="#tb" title="obd定位任务" iconCls="icon-search"
				data-options="singleSelect:true,rownumbers:true,pagination:true,striped:true,fitColumns:true"></table>
		</div>
	</body>

</html>