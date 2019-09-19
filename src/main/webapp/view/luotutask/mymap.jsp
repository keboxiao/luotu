<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>SmartMapX</title>
    <script type="text/javascript" src="<%=request.getContextPath() %>/jquery-easyui-1.5.1/jquery.min.js"></script>
		<script type="text/javascript" src="<%=request.getContextPath() %>/jquery-easyui-1.5.1/jquery.easyui.min.js"></script>
		<script type="text/javascript" src="<%=request.getContextPath() %>/jquery-easyui-1.5.1/locale/easyui-lang-zh_CN.js"></script>
		<link rel="stylesheet" href="<%=request.getContextPath() %>/jquery-easyui-1.5.1/themes/default/easyui.css" type="text/css"></link>
		<link rel="stylesheet" href="<%=request.getContextPath() %>/jquery-easyui-1.5.1/themes/icon.css" type="text/css"></link>
		<link rel="stylesheet" href="<%=request.getContextPath() %>/css/dlgtable.css" type="text/css"></link>
    <script src='http://132.102.102.87/map/assets/smartmapx.js'></script>
    <link href='http://132.102.102.87/map/assets/smartmapx.css' rel='stylesheet' />

    <style>
        body { margin:0; padding:0; }
        #map { position:absolute; top:0; bottom:0; width:100%; }
        #menu {position: absolute;top: 10px;left: 20px;z-index: 99;}
    </style>
</head>
<body>
<div id='menu'>
   <div id="tb" style="padding: 3px"
			data-options="region:'north',title:'查询条件',border:false">
			<form id="admin_yhgl_searchForm">
				地址名称：
				<input id="addr" class="easyui-textbox" name="addr" />
				<a href="javascript:void(0);" class="easyui-linkbutton"
					data-options="iconCls:'icon-search'" onclick="searchFun();">查询</a>
				<a href="javascript:void(0);" class="easyui-linkbutton"
					data-options="iconCls:'icon-redo'" onclick="clearFun();">重置</a>
				<a href="javascript:void(0);" class="easyui-linkbutton"
					data-options="iconCls:'icon-redo'" onclick="dingwei();">定位</a>
			</form>
		</div>
		<div>
			<table id="grid" toolbar="#tb" title="自然村" style="width:800px;height:250px" iconCls="icon-search"
				data-options="singleSelect:true,rownumbers:true,collapsible:true,pagination:true,striped:true,fitColumns:true"></table>
		</div>
</div>
<div id='map'></div>
<script>
    smartmapx.mapbase = 'http://132.102.102.87';
    smartmapx.apikey = 'eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJuYmYiOjE1MzcxODM1OTgsImRhdGEiOiJ7XCJsb2dpbl9uYW1lXCI6XCJyb290XCIsXCJnZW5kZXJcIjoyLFwidXNlcl9pZFwiOlwiZm1fc3lzdGVtX3VzZXJfcm9vdFwiLFwidXNlcl9uYW1lXCI6XCJyb290XCIsXCJ1c2VyX29yaWdpbl9pZFwiOlwiZm1fbG9jYWxcIixcInByb2R1Y3RfaWRcIjpcIlwiLFwiZXhwaXJlX3RpbWVcIjpcIlwiLFwic291cmNlX2lkXCI6XCJcIixcInR5cGVcIjpcIlwiLFwiY29ycF9pZFwiOlwiZm1fc3lzdGVtX2NvcnBcIn0iLCJleHAiOjQwOTI1OTkzNDksImp0aSI6ImFfNjhmZjBhZGY5OTcxNDQ0NThjNzViZWFiN2FjNTkzYWYifQ.W122WkT6QR4HZWbpalkpmirV9JWkDYcCkmNZoxCB_z8';
    // 初始化地图
    var map = new smartmapx.Map({
        container: 'map',
        mapId: 'map_id_1',
        center: [116.39738, 39.90579],
        zoom: 10
    });

    // 添加缩放条
    var nav = new smartmapx.NavigationControl();
    map.addControl(nav, 'top-right');

    // 添加比例尺
    map.addControl(new smartmapx.ScaleControl({
        maxWidth: 100,
        unit: 'm'
    }));
    const marker = new smartmapx.UnionMarker([116.28465,40.0469115]);  //新增添加marker方式， 原有方式继续支持
    map.on('click',function (e) {
        console.log(e.lngLat.lng+","+e.lngLat.lat)
    });

 
    $(function() {
    	$('#grid').datagrid( {
    		url : '../../app/searchFiveLevelAddress',
    		pageSize : 15,
    		pageList : [ 15, 20, 30 ],
    		columns : [ [ {
    			field : 'addrId',
    			title : 'id',
    			width : 38,
    			align : 'center'
    		}, {
    			field : 'addrLevel1',
    			title : '一级',
    			width : 60,
    			align : 'center'
    		}, {
    			field: 'addrLevel2', 
    			title: '二级', 
    			align: 'center', 
    			width : 60,
    			align : 'center'
    		}, {
    			field : 'addrLevel3',
    			title : '三级',
    			width : 70,
    			align : 'center'
    		} , {
    			field : 'addrLevel4',
    			title : '四级',
    			width : 100,
    			align : 'center'
    		}, {
    			field : 'addrLevel5',
    			title : '五级',
    			width : 120,
    			align : 'center'
    		}, {
    			field : 'fullName',
    			title : '地址全称',
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
    	$('#addr').textbox('setValue', '');
    	$('#grid').datagrid('load', {});
    }
    
    function dingwei() {
    	//alert("luotu");
    	var rows = $('#grid').datagrid('getSelections');
    	var point = [];
    	if (rows.length > 0) {
    		point.push(rows[0].lon);
    		point.push(rows[0].lat);
    		map.flyTo({
                center: point,
                zoom: 14
            });
    				
    	} else {
    		$.messager.show({
    			title : '提示',
    			msg : '请选择一行记录！'
    		});
    	}
    }
</script>
</body>
</html>