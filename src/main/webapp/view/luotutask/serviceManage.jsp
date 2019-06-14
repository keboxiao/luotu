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
		url : '../../app/listservice',
		pageSize : 15,
		pageList : [ 15, 20, 30 ],
		columns : [ [ {
			field : 'accessCode',
			title : '接入号',
			width : 120,
			align : 'center'
		}, {
			field : 'branch',
			title : '分公司',
			width : 80,
			align : 'center'
		}, {
			field: 'region', 
			title: '区域 ', 
			align: 'center', 
			width : 50,
			align : 'center'
		}, {
			field : 'addressIdStr',
			title : '地址ID',
			width : 100,
			align : 'center'
		} , {
			field : 'address',
			title : '地址名称',
			width : 350,
			align : 'center'
		}, {
			field : 'address7',
			title : '落图新地址ID',
			width : 100,
			align : 'center'
		}, {
			field : 'spType',
			title : '接入设备类型',
			width : 100,
			align : 'center'
		}, {
			field : 'spCode',
			title : '接入设备编码',
			width : 180,
			align : 'center'
		}, {
			field : 'ifCqt',
			title : 'cqt',
			width : 80,
			align : 'center'
		}, {
			field : 'chinaMobile',
			title : '移动网络情况',
			width : 80,
			align : 'center'
		}, {
			field : 'chinaUnion',
			title : '联通网络情况',
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

function luotuSave() {
	//alert("luotu");
	var rows = $('#gridLuotu').datagrid('getRows');
	var ids = [];
	if (rows.length > 0) {
		$.messager.confirm('确认', '您是否要保存？', function(r) {
			if (r) {
				for ( var i = 0; i < rows.length; i++) {
					ids.push(rows[i].id);
				}
				$.ajax({
					type: 'POST',
					url : '${pageContext.request.contextPath}/app/luotu',
					data : {
						ids : ids.join(','),
						address : $('#newAddress').val()
					},
					dataType : 'json',
					success : function(r) {
						$('#grid').datagrid('reload');
						$('#grid').datagrid('unselectAll');
						$('#gridLuotu').datagrid('loadData', {total:0,rows:[]});
						$('#dlgLuotu').dialog('close');
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
			msg : '请选择要落图的业务！'
		});
	}
}
function closeDlgLuotu(){
	$('#dlgLuotu').dialog('close');
	$('#grid').datagrid('unselectAll');
	$('#gridLuotu').datagrid('loadData', {total:0,rows:[]});
}

function deleteLuotuDetails(){
	var rows = $('#gridLuotu').datagrid('getSelections');
	if(rows == null || rows.length<1) {
		$.messager.alert("提示", "请选择要删除的数据");
		return false;
	}
	for(var i=0;i<rows.length;i++) {
		var row = rows[i];
		var rowIndex = $('#gridLuotu').datagrid('getRowIndex',row);
		$('#gridLuotu').datagrid('deleteRow',rowIndex); 
	}
}
function collectDetails(){
	var rows = $('#grid').datagrid('getSelections');
	var flag = true;
	if(rows == null || rows.length<1){
		$.messager.alert("提示", "请选择数据");
		return false;
	}
	for(var i=0;i<rows.length;i++){
			$('#gridLuotu').datagrid('appendRow',{
				id:rows[i].id,
				accessCode:rows[i].accessCode,
				address: rows[i].address,
				state: rows[i].state
			});
	}
}

function luotu() {
	var rowsData = $('#grid').datagrid('getSelections');
	if (!rowsData || rowsData.length==0) {
		$.messager.show( {
			title : '提示',
			msg : '请选择一行数据'
		});
		return;
	}	
	for(var i=0;i<rowsData.length;i++){
		if(rowsData[i].state>1){
			$.messager.show( {
				title : '提示',
				msg : '请选择未经处理的业务！'
			});
			$('#grid').datagrid('unselectAll');
			return;
		}
	}
		$("#dlgLuotu").dialog("open").dialog('setTitle', '落图');
		collectDetails();
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
	$('#grid').datagrid('unselectAll');
	$('#gridLuotu').datagrid('loadData', {total:0,rows:[]});
	$('#grid').datagrid('load', serializeObject($('#admin_yhgl_searchForm')));
}
function clearFun() {
	$('#grid').datagrid('unselectAll');
	$('#gridLuotu').datagrid('loadData', {total:0,rows:[]});
	$('#accessCode').textbox('setValue', '');
	$('#begintime').datebox('setValue','');
	$('#endtime').datebox('setValue','');
	var state = document.getElementById("state");
	state.options[0].selected = true;
	$('#grid').datagrid('load', {});
}

function editBatchById(row) {
	if (row) {
		$("#dlgDetails").dialog("open").dialog('setTitle', '修改');
		$("#batchForm").form("load", row);
		$("#batch_no").attr('value',row.id);
		$('#filegrid').datagrid( {
			url : '../../app/listFileByBatchId?id='+id,
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
				field : 'batchNo',
				title : '主题号',
				width : 80,
				align : 'center'
			}, {
				field : 'uploadTime',
				title : '上传时间',
				width : 200,
				align : 'center'
			}, {
				field:'no',
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

function details() {
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
		$("#dlgDetails").dialog("open").dialog('setTitle', '详情');
		$("#orderForm").form("load", row);
		$("#batch_no").attr('value',row.id);
		$('#workOrderDetails').datagrid( {
			url : '../../app/listOrderDetails?workOrderId='+row.id,
			striped : true,
			rownumbers : true,
			singleSelect:true,
			fitColumns: false,
			columns : [ [ {
				field : 'sysUser',
				title : '处理人',
				width : 90,
				align : 'center',
				formatter: function (value) { 
					return value.name;
				}
			}, {
				field : 'a',
				title : '处理人电话',
				width : 110,
				align : 'center',
				formatter: function (value,row,index) { 
					return row.sysUser.phone;
				}
			}, {
				field : 'formatReachTime',
				title : '到达时间',
				width : 150,
				align : 'center'
			}, {
				field : 'formatFinishTime',
				title : '完成时间',
				width : 150,
				align : 'center'
			}, {
				field:'remark',
				title:'处理意见',
				align:'center',
				width : 200
			}, {
				field:'state',
				title:'状态',
				align:'center',
				width : 70
			} ] ]
		});
		$("#batch_no").attr('value',row.id);
		$('#filegrid').datagrid( {
			url : '../../app/listFileByBatchId?id='+row.id+'&file_class=2',
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
				field : 'batchNo',
				title : '主题号',
				width : 80,
				align : 'center'
			}, {
				field : 'uploadTime',
				title : '上传时间',
				width : 200,
				align : 'center'
			}, {
				field:'no',
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

function toDownLoadExcel(){  
	var begintime = $('#begintime').val();
	var endtime = $('#endtime').val(); 
	var state = $('#state').val();
	document.getElementById("downLoadExcel").href ="${pageContext.request.contextPath}/app/exportExcel?begintime=" + begintime +"&endtime=" + endtime + "&state=" + state;    
}

</script>

	</head>
	<body>
		<div id="tb" style="padding: 3px"
			data-options="region:'north',title:'查询条件',border:false">
			<form id="admin_yhgl_searchForm">
				接入号：
				<input id="accessCode" class="easyui-textbox" name="accessCode" />
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
					class="easyui-linkbutton" iconCls="icon-edit" onclick="details()">详情</a>
				<a href="javascript:void(0);" class="easyui-linkbutton"
					data-options="iconCls:'icon-search'" onclick="searchFun();">查询</a>
					<a href="javascript:void(0);" class="easyui-linkbutton"
					data-options="iconCls:'icon-edit'" onclick="luotu();">落图</a>
				<a href="javascript:void(0);" class="easyui-linkbutton"
					data-options="iconCls:'icon-redo'" onclick="clearFun();">重置</a>
				<a href="javascript:void(0);" id="downLoadExcel"
					class="easyui-linkbutton" iconCls="icon-add" onclick="toDownLoadExcel()">导出excel</a>
			</form>
		</div>
		<div>
			<table id="grid" toolbar="#tb" title="业务地址落图" iconCls="icon-search"
				data-options="singleSelect:false,rownumbers:true,pagination:true,striped:true,fitColumns:true"></table>
		</div>
		
		<div id="dlgLuotu" class="easyui-dialog" style="width: 900px; height: 300px; padding: 10px 20px;" closed="true" buttons="#luotu-buttons">
	<table id="gridLuotu" toolbar="#luotutb" class="easyui-datagrid" title="address to be locate on map"
            data-options="singleSelect:true,collapsible:true">
        <thead>
            <tr>
             <th data-options="field:'id',width:180">id</th>
                <th data-options="field:'accessCode',width:180">接入号</th>
                <th data-options="field:'address',width:300">资源地址</th>
                <th data-options="field:'state',width:100">状态</th>
            </tr>
        </thead>
    </table>
			<div>
				<table>
					<tr>
						<td>新标准地址：</td>
						<td><input id="newAddress" class="easyui-textbox" name="newAddress" /></td>
					</tr>
				</table>
			</div>
			<div id="luotutb" style="padding: 3px"
			data-options="title:'查询条件',border:false">
			<a href="javascript:void(0);" id="edit"
					class="easyui-linkbutton" iconCls="icon-cancel" onclick="deleteLuotuDetails()">删除</a>
		</div>
		</div>
		<div id="luotu-buttons">
		<a href="javascript:void(0)" class="easyui-linkbutton" onclick="luotuSave()" iconcls="icon-save">保存</a>
 		<a href="javascript:void(0)" class="easyui-linkbutton" onclick="closeDlgLuotu()" iconcls="icon-cancel">关闭</a>
		</div>	
	</body>

</html>