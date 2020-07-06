<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>我的地图</title>
    <script type="text/javascript" src="<%=request.getContextPath() %>/jquery-easyui-1.5.1/jquery.min.js"></script>
		<script type="text/javascript" src="<%=request.getContextPath() %>/jquery-easyui-1.5.1/jquery.easyui.min.js"></script>
		<script type="text/javascript" src="<%=request.getContextPath() %>/jquery-easyui-1.5.1/locale/easyui-lang-zh_CN.js"></script>
		<link rel="stylesheet" href="http://132.102.102.87/map/api/css/bootstrap.min.css">
		<link rel="stylesheet" href="<%=request.getContextPath() %>/jquery-easyui-1.5.1/themes/default/easyui.css" type="text/css"></link>
		<link rel="stylesheet" href="<%=request.getContextPath() %>/jquery-easyui-1.5.1/themes/icon.css" type="text/css"></link>
		<link rel="stylesheet" href="<%=request.getContextPath() %>/css/dlgtable.css" type="text/css"></link>
    <script src='http://132.102.102.87/map/assets/smartmapx.js'></script>
    <link href='http://132.102.102.87/map/assets/smartmapx.css' rel='stylesheet' />
    <script src="http://132.102.102.87/map/api/js/bootstrap.min.js"></script>
        <style>
        body { margin:0; padding:0; }
        .panel-body{padding:0;}
        #map { position:absolute; top:0; bottom:0; width:100%; }
        .easyui-panel {width: 50% !important;position: absolute;top: 10px;left: 20px;z-index: 99;}


        table th {
            text-align: center;
        }

        .smartmapx-popup-content h1{
            color: red;
        }
        .smartmapx-popup-close-button {
            position: absolute;
            right:2px;
            top:4px;
            z-index: 11;
            opacity: 0;
        }
        .smartmapx-popup-content {
            padding: 0px;
        }

        .modal-content {
            width: 300px;
            border: none;
            border-radius: 0px;
        }
        .modal-content .modal-header{
            padding:5px;
            background-color: #137fb3;
            color: white;
            font-weight: bolder;
        }
        .modal-content .modal-title {
            overflow: hidden;
            text-overflow: ellipsis;
            white-space: nowrap
        }
        .modal-content .modal-body {
            border: none;
            padding: 5px;
        }
        .checkbox, .radio {
            display: inline-block;
        }
    </style>
</head>
<body>
<div class="easyui-panel" style="padding:5px;">
   <a href="javascript:void(0);" class="easyui-linkbutton"
					data-options="iconCls:'icon-search'" onclick="searchWin();">自然村查询</a>
	 <a href="javascript:void(0);" class="easyui-linkbutton"
					data-options="iconCls:'icon-search'" onclick="bsearchWin();">建筑物查询</a>
   <a href="javascript:void(0);" class="easyui-linkbutton" onclick="openTucengDialog();"> 图层显隐</a>
   <a href="javascript:void(0);" class="easyui-linkbutton" onclick="openDingweiDialog();">经纬度定位</a>
</div>
<div id="dingwei_dialog" class="easyui-dialog" title="经纬度定位" data-options="iconCls:'icon-save'"  style="width: 360px; height: 200px; padding: 10px 20px;" closed="true"
	buttons="#dingweidlg-buttons">
	<div>
	经纬度：<input id="lonlat" class="easyui-textbox" name="lonlat" />
	<a href="javascript:void(0);" class="easyui-linkbutton"
					data-options="iconCls:'icon-redo'" onclick="lldingwei();">定位</a>
	</div>
	<div>输入示例：110.6,21.6</div>
</div>
<div id="dingweidlg-buttons">
	 <a	href="javascript:void(0)" class="easyui-linkbutton"
		onclick="javascript:$('#dingwei_dialog').dialog('close')"
		iconcls="icon-cancel">关闭</a>
</div>
<div id="tuceng_dialog" class="easyui-dialog" title="图层显隐" data-options="iconCls:'icon-save'"  style="width: 200px; height: 200px; padding: 10px 20px;" closed="true"
	buttons="#tucengdlg-buttons">
 <div>
   <span>
             建筑物：
        <input id="smx" type="checkbox" checked style="display: inline-block;" name="fruit" value="Apple">
    </span>
 </div>
  <div>
   <span>
             自然村：
        <input id="village" type="checkbox" checked style="display: inline-block;" name="fruit" value="Apple">
    </span>
 </div>
 <div>
   <span>
             分光器（OBD）：
        <input id="obd" type="checkbox" style="display: inline-block;" name="obd">
    </span>
 </div>
</div>
<div id="tucengdlg-buttons">
	 <a	href="javascript:void(0)" class="easyui-linkbutton"
		onclick="javascript:$('#tuceng_dialog').dialog('close')"
		iconcls="icon-cancel">关闭</a>
</div>
<div id="w" class="easyui-window" title="自然村查询" data-options="iconCls:'icon-save',closed:true" style="width:821px;height:301px;padding:1px;">
    <div id="tb" style="padding: 0px"
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
			<table id="grid" toolbar="#tb" style="width:800px;height:260px;padding: 0px" iconCls="icon-search"
				data-options="singleSelect:true,rownumbers:true,collapsible:true,pagination:true,striped:true,fitColumns:true"></table>
		</div>
</div>

<div id="buildingwin" class="easyui-window" title="建筑物查询" data-options="iconCls:'icon-save',closed:true" style="width:861px;height:301px;padding:1px;">
    <div id="btb" style="padding: 0px"
			data-options="region:'north',title:'查询条件',border:false">
			<form id="building_searchForm">
				地址名称：
				<input id="baddr" class="easyui-textbox" name="addr" />
				<a href="javascript:void(0);" class="easyui-linkbutton"
					data-options="iconCls:'icon-search'" onclick="bsearchFun();">查询</a>
				<a href="javascript:void(0);" class="easyui-linkbutton"
					data-options="iconCls:'icon-redo'" onclick="bclearFun();">重置</a>
				<a href="javascript:void(0);" class="easyui-linkbutton"
					data-options="iconCls:'icon-redo'" onclick="bdingwei();">定位</a>
				<a href="javascript:void(0);" class="easyui-linkbutton"
					data-options="iconCls:'icon-redo'" onclick="marker.remove();">取消标注</a>
			</form>
		</div>
		<div>
			<table id="bgrid" toolbar="#btb" style="width:840px;height:260px;padding: 0px" iconCls="icon-search"
				data-options="singleSelect:true,rownumbers:true,collapsible:true,pagination:true,striped:true,fitColumns:true"></table>
		</div>
</div>

<div id='map'></div>
<script type="text/javascript">
    smartmapx.mapbase = 'http://132.102.102.87';
    smartmapx.apikey = 'eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJuYmYiOjE1MzcxODM1OTgsImRhdGEiOiJ7XCJsb2dpbl9uYW1lXCI6XCJyb290XCIsXCJnZW5kZXJcIjoyLFwidXNlcl9pZFwiOlwiZm1fc3lzdGVtX3VzZXJfcm9vdFwiLFwidXNlcl9uYW1lXCI6XCJyb290XCIsXCJ1c2VyX29yaWdpbl9pZFwiOlwiZm1fbG9jYWxcIixcInByb2R1Y3RfaWRcIjpcIlwiLFwiZXhwaXJlX3RpbWVcIjpcIlwiLFwic291cmNlX2lkXCI6XCJcIixcInR5cGVcIjpcIlwiLFwiY29ycF9pZFwiOlwiZm1fc3lzdGVtX2NvcnBcIn0iLCJleHAiOjQwOTI1OTkzNDksImp0aSI6ImFfNjhmZjBhZGY5OTcxNDQ0NThjNzViZWFiN2FjNTkzYWYifQ.W122WkT6QR4HZWbpalkpmirV9JWkDYcCkmNZoxCB_z8';
    var map = new smartmapx.Map({
        container: 'map',
        mapId: '9c4d3142-64a7-45f2-b85b-7dd1c14c79b1',
        center: [110.628115, 21.957925],
        zoom: 16
    });

    var marker = null;
    // 添加缩放条
    var nav = new smartmapx.NavigationControl();
    map.addControl(nav, 'top-right');

    // 添加比例尺
    map.addControl(new smartmapx.ScaleControl({
        maxWidth: 100,
        unit: 'm'
    }));
   // const marker = null;
    data = {
        type: 'FeatureCollection',
        features: []
    };

   // map.setLayoutProperty('34c65aee-0504-46c7-a2f7-ca6193a2d1c3', 'visibility', 'none');
    const popup = new smartmapx.Popup({
        closeOnClick: false,
        closeButton: true,
    });
    map.on('load', function (e) {
    	//marker = new smartmapx.UnionMarker([116.28465,40.0469115]);
        map.addSource('satellite', { 
            "type": "raster", 
            "tiles": [ 
               'http://132.102.102.87/maoming_data/{z}/{x}/{y}.png' 
            ] 
        }); 

        map.addLayer({
            "id": "satellite_layer",
            "type": "raster",
            "source": "satellite"
        }, '6ef59d8a-7cb4-46f8-a67a-929df02984ac');
        map.on('click', '0ae4b26b-9c6e-44db-9eab-8ff20a79d11b', function (e) {  //图层点击图层事件
            console.log(e);
            var properties = e.features[0].properties;
            popup.setLngLat(e.lngLat)
                .setHTML('<div class="modal-content"  > <div class="modal-header" > ' +
                    '<button type="button" class="close" style="margin: 0px;" data-dismiss="modal" aria-label="Close">' +
                    '<span aria-hidden="true">&times;</span></button> ' +
                    '<h5 class="modal-title">建筑物' +'</h5> </div> ' +
                    '<div class="modal-body"><div><label>id：</label>'+ properties. f_ee9aadfe6a0e47869fb6337193baa07e  +' </div> ' +
                    '<div><label>地市：</label>'+properties.f_8ba85ea20c644cf09b3f8faf48acddc4 +'</div>' +
                    '<div> <label>区县：</label>'+properties.f_d7873bca82bb4ed1b8cf19e6a8c2cd9b +'</div>' +
                    '<div> <label>乡镇：</label>'+properties.f_ddea530061474fd785ab79a1827212c3 +'</div>' +
                    '<div> <label>行政村：</label>'+properties.f_e8c0be42cbb547aebf6c6570eabc7513  +'</div>' +
                    '<div> <label>自然村：</label>'+properties.f_123fd9a443a14c8593eadfe9ffd86fcb  +'</div>' +
                    '<div> <label>自编号：</label>'+properties.f_400543d8519346e488148379b574ac6a  +'</div>' +
                    '<div> <label>地址全称：</label>'+properties.f_7d63ddf1bd2344308e1ae048c9a37e09  +'</div>'
                ).addTo(map);
        });
        map.on('click', '34c65aee-0504-46c7-a2f7-ca6193a2d1c3', function (e) {  //OBD点击图层事件
            console.log(e);
            var properties = e.features[0].properties;
            popup.setLngLat(e.lngLat)
                .setHTML('<div class="modal-content"  > <div class="modal-header" > ' +
                    '<button type="button" class="close" style="margin: 0px;" data-dismiss="modal" aria-label="Close">' +
                    '<span aria-hidden="true">&times;</span></button> ' +
                    '<h5 class="modal-title">OBD</h5> </div> ' +
                    '<div class="modal-body"><div><label>OBD编码：</label>'+'</div>' +
                    '<div> <label>OBD名称：</label>'+properties.f_0164a3017d81471bb3a0c42b5a8d2326 +'</div>' +
                    '<div> <label>所属网格单元：</label>'+properties.f_9f7c0105f762459e966d47ea27cacd06 +'</div>'
                ).addTo(map);
        });
        map.setLayoutProperty('34c65aee-0504-46c7-a2f7-ca6193a2d1c3', 'visibility', 'none');
        marker = new smartmapx.UnionMarker([116.28465,40.0469115]);
    });
   // map.setLayoutProperty('34c65aee-0504-46c7-a2f7-ca6193a2d1c3', 'visibility', 'none');
    $('#smx').click(function (event) {
        console.log(event.target.checked);
        if (event.target.checked) {
        	 map.setLayoutProperty('0ae4b26b-9c6e-44db-9eab-8ff20a79d11b', 'visibility', 'visible');
             map.setLayoutProperty('2ca6a4fe-64a9-43a1-98f0-0df5c3cc07c0', 'visibility', 'visible');
        } else {
            map.setLayoutProperty('0ae4b26b-9c6e-44db-9eab-8ff20a79d11b', 'visibility', 'none');
            map.setLayoutProperty('2ca6a4fe-64a9-43a1-98f0-0df5c3cc07c0', 'visibility', 'none');
        }
    });

    $('#village').click(function (event) {
        console.log(event.target.checked);
        if (event.target.checked) {
        	 map.setLayoutProperty('6ef59d8a-7cb4-46f8-a67a-929df02984ac', 'visibility', 'visible');
        } else {
            map.setLayoutProperty('6ef59d8a-7cb4-46f8-a67a-929df02984ac', 'visibility', 'none');
        }
    });

    $('#obd').click(function (event) {
        console.log(event.target.checked);
        if (event.target.checked) {
        	 map.setLayoutProperty('34c65aee-0504-46c7-a2f7-ca6193a2d1c3', 'visibility', 'visible');
        } else {
            map.setLayoutProperty('34c65aee-0504-46c7-a2f7-ca6193a2d1c3', 'visibility', 'none');
        }
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
    
    function openTucengDialog() {
    	$('#tuceng_dialog').dialog('open');
    }
    function openDingweiDialog() {
    	$('#dingwei_dialog').dialog('open');
    }
    function lldingwei() {
    	//alert("luotu");
    	var lonlat=$("#lonlat").textbox('getValue');
    	var arr=lonlat.split(",");
    	var point = [];
    	point.push(arr[0]);
    	point.push(arr[1]);
    	map.flyTo({
            center: point,
            zoom: 17
        });
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
                zoom: 17
            });
    				
    	} else {
    		$.messager.show({
    			title : '提示',
    			msg : '请选择一行记录！'
    		});
    	}
    }
    
    function bdingwei() {
    	//alert("luotu");
    	var rows = $('#bgrid').datagrid('getSelections');
    	var point = [];
    	if (rows.length > 0) {
    		point.push(rows[0].lon);
    		point.push(rows[0].lat);
    		map.flyTo({
                center: point,
                zoom: 17
            });
    		marker.setLngLat(point);
    		marker.addTo(map);
    	} else {
    		$.messager.show({
    			title : '提示',
    			msg : '请选择一行记录！'
    		});
    	}
    }
    function searchWin() {
    $('#w').window('open');
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
    }
    
    function bsearchWin() {
        $('#buildingwin').window('open');
        $('#bgrid').datagrid( {
    		url : '../../app/searchSevenLevelAddress',
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
    			width : 90,
    			align : 'center'
    		}, {
    			field : 'addrLevel5',
    			title : '五级',
    			width : 100,
    			align : 'center'
    		}, {
    			field : 'fullName',
    			title : '地址全称',
    			width : 410,
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
    		}] ]
    	});
        }
    
    function bsearchFun() {
    	$('#bgrid').datagrid('load', serializeObject($('#building_searchForm')));
    }
    function bclearFun() {
    	$('#baddr').textbox('setValue', '');
    	$('#bgrid').datagrid('load', {});
    }
</script>
</body>
</html>