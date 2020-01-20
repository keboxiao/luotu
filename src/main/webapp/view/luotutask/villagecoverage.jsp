<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE HTML >
<html>
	<head>
		<title>自然村无线信号覆盖情况查询</title>
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
	  $('#birth_year').datebox({
          onShowPanel: function () {//显示日趋选择对象后再触发弹出月份层的事件，初始化时没有生成月份层
              span.trigger('click'); //触发click事件弹出月份层
              if (!tds) setTimeout(function () {//延时触发获取月份对象，因为上面的事件触发和对象生成有时间间隔
                  tds = p.find('div.calendar-menu-month-inner td');
                  tds.click(function (e) {
                      e.stopPropagation(); //禁止冒泡执行easyui给月份绑定的事件
                      var year = $(".calendar-menu-year").val();
                      var month = parseInt($(this).attr('abbr'), 10);
                      $('#birth_year').datebox('hidePanel')//隐藏日期对象
                      .datebox('setValue', year + '-' + month); //设置日期的值
                  });
              }, 0)
          },
          parser: function (s) {//配置parser，返回选择的日期
              if (!s) return new Date();
              var ss = (s.split('-'));
              var y = parseInt(ss[0],10);
              var m = parseInt(ss[1],10);            
              if (!isNaN(y) && !isNaN(m)){
                  return new Date(y,m-1);
              } else {
                  return new Date();
              }  
          },
          formatter: function (d) { 
              debugger;
              var y = d.getFullYear();
              var m = d.getMonth()+1;
              var d = d.getDate();
              return y+'-'+(m<10?('0'+m):m);
          }//配置formatter，只返回年月
      });
      var p = $('#birth_year').datebox('panel'), //日期选择对象
          tds = false, //日期选择对象中月份
          span = p.find('span.calendar-text'); //显示月份层的触发控件
	$('#grid').datagrid( {
		url : '../../app/searchPeriodVillageCoverage',
		pageSize : 15,
		pageList : [ 15, 20, 30 ],
		columns : [ [ {
			field : 'period',
			title : '周期',
			width : 100,
			align : 'center'
		},{
			field : 'taskType',
			title : '测试类型',
			width : 100,
			align : 'center'
		},{
			field : 'addrLevel1',
			title : '地市',
			width : 100,
			align : 'center'
		}, {
			field : 'addrLevel2',
			title : '区县',
			width : 100,
			align : 'center'
		}, {
			field: 'addrLevel3', 
			title: '镇区', 
			align: 'center', 
			width : 100,
			align : 'center'
		}, {
			field : 'addrLevel4',
			title : '行政村',
			width : 100,
			align : 'center'
		} , {
			field : 'fullName',
			title : '全称',
			width : 280,
			align : 'center'
		}, {
			field : 'avgrsrp',
			title : '平均RSRP',
			width : 80,
			align : 'center'
		}, {
			field : 'amount',
			title : '测试点',
			width : 80,
			align : 'center'
		}, {
			field : 'coverage',
			title : '覆盖情况',
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
	$('#village').textbox('setValue', '');
	$('#birth_year').datebox('setValue','');
	$('#grid').datagrid('load', {});
}


</script>

	</head>
	<body>
		<div id="tb" style="padding: 3px"
			data-options="region:'north',title:'查询条件',border:false">
			<form id="admin_yhgl_searchForm">
			  统计周期：<input type="text" id="birth_year" name="period" class="easyui-datebox" style="width: 100px;padding-left: 10px"/> 
				村名：
				<input id="village" class="easyui-textbox" name="village" />
				
				<a href="javascript:void(0);" class="easyui-linkbutton"
					data-options="iconCls:'icon-search'" onclick="searchFun();">查询</a>
				<a href="javascript:void(0);" class="easyui-linkbutton"
					data-options="iconCls:'icon-redo'" onclick="clearFun();">重置</a>
			</form>
		</div>
		<div>
			<table id="grid" toolbar="#tb" title="自然村无线信号覆盖情况查询" iconCls="icon-search"
				data-options="singleSelect:true,rownumbers:true,pagination:true,striped:true,fitColumns:true"></table>
		</div>
	</body>

</html>