<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>SmartMapX</title>
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
    <span>
        图层显隐：
        <input id="smx" type="checkbox" checked style="display: inline-block;" name="fruit" value="Apple">
    </span>
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
<div id="mm1" style="width:150px;">
    <div data-options="iconCls:'icon-undo'">Undo</div>
    <div data-options="iconCls:'icon-redo'">Redo</div>
    <div class="menu-sep"></div>
    <div>Cut</div>
    <div>Copy</div>
    <div>Paste</div>
    <div class="menu-sep"></div>
    <div>
        <span>Toolbar</span>
        <div>
            <div>Address</div>
            <div>Link</div>
            <div>Navigation Toolbar</div>
            <div>Bookmark Toolbar</div>
            <div class="menu-sep"></div>
            <div>New Toolbar...</div>
        </div>
    </div>
    <div data-options="iconCls:'icon-remove'">Delete</div>
    <div>Select All</div>
</div>
<div id="mm2" style="width:100px;">
    <div>Help</div>
    <div>Update</div>
    <div>About</div>
</div>
<div id="mm3" class="menu-content" style="background:#f0f0f0;padding:10px;text-align:left">
    <img src="http://www.jeasyui.com/images/logo1.png" style="width:150px;height:50px">
    <p style="font-size:14px;color:#444;">Try jQuery EasyUI to build your modern, interactive, javascript applications.</p>
</div>
<!--<div id="mm4" class="menu-content" style="background:#f0f0f0;padding:10px;text-align:left">
    <input class="easyui-checkbox" name="fruit" value="Apple" label="Apple:">
</div>-->
<div id='map'></div>
<script type="text/javascript">
    smartmapx.mapbase = 'http://132.102.102.87';
    smartmapx.apikey = 'eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJuYmYiOjE1MzcxODM1OTgsImRhdGEiOiJ7XCJsb2dpbl9uYW1lXCI6XCJyb290XCIsXCJnZW5kZXJcIjoyLFwidXNlcl9pZFwiOlwiZm1fc3lzdGVtX3VzZXJfcm9vdFwiLFwidXNlcl9uYW1lXCI6XCJyb290XCIsXCJ1c2VyX29yaWdpbl9pZFwiOlwiZm1fbG9jYWxcIixcInByb2R1Y3RfaWRcIjpcIlwiLFwiZXhwaXJlX3RpbWVcIjpcIlwiLFwic291cmNlX2lkXCI6XCJcIixcInR5cGVcIjpcIlwiLFwiY29ycF9pZFwiOlwiZm1fc3lzdGVtX2NvcnBcIn0iLCJleHAiOjQwOTI1OTkzNDksImp0aSI6ImFfNjhmZjBhZGY5OTcxNDQ0NThjNzViZWFiN2FjNTkzYWYifQ.W122WkT6QR4HZWbpalkpmirV9JWkDYcCkmNZoxCB_z8';
    var map = new smartmapx.Map({
        container: 'map',
        mapId: '57b0d805-2144-45c7-ade8-e45fc2552a29',
        center: [110.930443, 21.663422],
        zoom: 15
    });
    const marker = null;
    data = {
        type: 'FeatureCollection',
        features: []
    };

    const popup = new smartmapx.Popup({
        closeOnClick: false,
        closeButton: true,
    });
    map.on('load', function (e) {
        map.on('click', '24426030-3001-4b23-82e2-d9338996019c', function (e) {  //图层点击图层事件
            console.log(e);
            var properties = e.features[0].properties;
            popup.setLngLat(e.lngLat)
                .setHTML('<div class="modal-content"  > <div class="modal-header" > ' +
                    '<button type="button" class="close" style="margin: 0px;" data-dismiss="modal" aria-label="Close">' +
                    '<span aria-hidden="true">&times;</span></button> ' +
                    '<h5 class="modal-title">id: '+ properties. f_b936f4ec7392451bb0fb263886eb9046  +'</h5> </div> ' +
                    '<div class="modal-body"><div><label>地市：</label>'+properties.f_4843d2aa6989484b878bf9ba3379cc4f +'</div>' +
                    '<div> <label>区县：</label>'+properties.f_0e1a3b7ad2a340d8977ae57b8fb20a13 +'</div>' +
                    '<div> <label>乡镇：</label>'+properties.f_8c222d7c11bf4a13880141602ccb2ff3 +'</div>' +
                    '<div> <label>行政村：</label>'+properties.f_27999d43f14d41ab8cba17a781d1144b  +'</div>' +
                    '<div> <label>自然村：</label>'+properties.f_704c51bbfb824faa909a61edad8ff24c  +'</div>' +
                    '<div> <label>自编号七级：</label>'+properties.f_d91610a872c748ffa1d0a15bfe125949  +'</div>' +
                    '<div> <label>地址全称：</label>'+properties.f_0fdb5c63491444c083d9926d723434bb  +'</div>'
                ).addTo(map);
        });
    });
    $('#smx').click(function (event) {
        console.log(event.target.checked);
        if (event.target.checked) {
            map.setLayoutProperty('24426030-3001-4b23-82e2-d9338996019c', 'visibility', 'visible');
        } else {
            map.setLayoutProperty('24426030-3001-4b23-82e2-d9338996019c', 'visibility', 'none');
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
    
    function dingwei() {
    	//alert("luotu");
    	var rows = $('#grid').datagrid('getSelections');
    	var point = [];
    	if (rows.length > 0) {
    		point.push(rows[0].lon);
    		point.push(rows[0].lat);
    		map.flyTo({
                center: point,
                zoom: 15
            });
    				
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
</script>
</body>
</html>