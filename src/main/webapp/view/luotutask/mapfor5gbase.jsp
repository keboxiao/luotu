<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>5G站点分布图</title>
	<link rel="stylesheet" href="http://132.102.102.87/map/api/css/bootstrap.min.css">
    <script src='http://132.102.102.87/map/assets/smartmapx.js'></script>
    <link href='http://132.102.102.87/map/assets/smartmapx.css' rel='stylesheet' />
    <script src="http://132.102.102.87/map/api/js/bootstrap.min.js"></script>
    <script src="http://132.102.102.87/map/api/js/turf.min.js"></script>
    	<script type="text/javascript" src="<%=request.getContextPath() %>/jquery-easyui-1.5.1/jquery.min.js"></script>
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
<div style="position:relative; top: 10px; left: 10px; z-index: 100">

</div>
<div id='map'></div>
<script type="text/javascript">
$.getJSON('../../app/getAllBaseStation',function(citys){
    smartmapx.mapbase = 'http://132.102.102.87';
    smartmapx.apikey = 'eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJuYmYiOjE1MzcxODM1OTgsImRhdGEiOiJ7XCJsb2dpbl9uYW1lXCI6XCJyb290XCIsXCJnZW5kZXJcIjoyLFwidXNlcl9pZFwiOlwiZm1fc3lzdGVtX3VzZXJfcm9vdFwiLFwidXNlcl9uYW1lXCI6XCJyb290XCIsXCJ1c2VyX29yaWdpbl9pZFwiOlwiZm1fbG9jYWxcIixcInByb2R1Y3RfaWRcIjpcIlwiLFwiZXhwaXJlX3RpbWVcIjpcIlwiLFwic291cmNlX2lkXCI6XCJcIixcInR5cGVcIjpcIlwiLFwiY29ycF9pZFwiOlwiZm1fc3lzdGVtX2NvcnBcIn0iLCJleHAiOjQwOTI1OTkzNDksImp0aSI6ImFfNjhmZjBhZGY5OTcxNDQ0NThjNzViZWFiN2FjNTkzYWYifQ.W122WkT6QR4HZWbpalkpmirV9JWkDYcCkmNZoxCB_z8';
    var map = new smartmapx.Map({
        container: 'map',
        mapId: '8f35ed11-9e64-42cc-a0b2-936893d11d70',
        center: [110.937012434,21.666752994],
        zoom: 16
    });

    // 添加缩放条
    var nav = new smartmapx.NavigationControl();
    map.addControl(nav, 'top-right');

    // 添加比例尺
    map.addControl(new smartmapx.ScaleControl({
        maxWidth: 100,
        unit: 'm'
    }));

    const popup = new smartmapx.Popup({
        closeOnClick: false,
        closeButton: true,
    });

    //制作三个圆所需数据(半径不一样)
    const features_li = [
        {type: "FeatureCollection", radius: 1, features: []},
        {type: "FeatureCollection", radius: 2/3, features: []},
        {type: "FeatureCollection", radius: 1/3, features: []}
    ];
    for (let i = 0; i < citys.length; i++) {
        const options = {steps: 64, units: 'kilometers'};
        for (let m = 0; m < features_li.length; m++) {
            const circle = turf.circle(citys[i].coordinates, (citys[i].radius * features_li[m].radius)/1000,  options);
            const feature = {
                "type": "Feature",
                "geometry": {
                    "type": "Polygon",
                    "coordinates": circle.geometry.coordinates
                },
                "properties": {
                    'name': citys[i].baseName,
                    'radius': citys[i].radius,
                    'color': citys[i].color
                }
            }
            features_li[m].features.push(feature)
        }
    }

    map.on('load', () => {
        // 外边框圆数据源
        map.addSource('all', {
            data: features_li[0],
            type: 'geojson'
        });

        // 中间圆数据源
        map.addSource('two_thirds', {
            data: features_li[1],
            type: 'geojson'
        });

        //中心圆数据源
        map.addSource('one_third', {
            data: features_li[2],
            type: 'geojson'
        });

        // 外边框的圆和线
        map.addLayer({
            "id": 'all_fill',
            "type": "fill",
            "source": 'all',
            "layout": {
                "visibility": "visible"
            },
            "paint": {
                'fill-color': ['get', 'color'],
                'fill-opacity': 0.1
            }
        })
        map.addLayer({
            "id": 'all_line',
            "type": "line",
            "source": 'all',
            "paint": {
                'line-color': ['get', 'color'],
                'line-width': 10,
                'line-opacity':  0.2,
                'line-blur': 8
            }
        });


        // 中间边框的圆和线图层
        map.addLayer({
            "id": 'two_thirds_fill',
            "type": "fill",
            "source": 'two_thirds',
            "layout": {
                "visibility": "visible"
            },
            "paint": {
                'fill-color': ['get', 'color'],
                'fill-opacity': 0.2
            }
        });
        map.addLayer({
            "id": 'two_thirds_line',
            "type": "line",
            "source": 'two_thirds',
            "paint": {
                'line-color': ['get', 'color'],
                'line-width': 15,
                'line-opacity':  0.28,
                'line-blur': 8
            }
        });


        // 中心圆和线的图层
        map.addLayer({
            "id": 'one_third_fill',
            "type": "fill",
            "source": 'one_third',
            "layout": {
                "visibility": "visible"
            },
            "paint": {
                'fill-color': ['get', 'color'],
                'fill-opacity': 0.3
            }
        });
        map.addLayer({
            "id": 'one_third_line',
            "type": "line",
            "source": 'one_third',
            "paint": {
                'line-color': ['get', 'color'],
                'line-width': 20,
                'line-opacity':  0.38,
                'line-blur': 10
            }
        });

    });

    //基站点击事件
    map.on('click', 'all_fill', function (e) {
        console.log(e.features[0].properties)
    })

        function show() {
        map.setLayoutProperty('e766f48a-d105-43cd-9820-268e7298bdf0', 'visibility', 'visible');
      //  map.setLayoutProperty('2ca6a4fe-64a9-43a1-98f0-0df5c3cc07c0', 'visibility', 'visible');
    }

    function hide() {
        map.setLayoutProperty('e766f48a-d105-43cd-9820-268e7298bdf0', 'visibility', 'none');//建筑物隐藏
      //  map.setLayoutProperty('2ca6a4fe-64a9-43a1-98f0-0df5c3cc07c0', 'visibility', 'none');
    }
  //  map.on('click', function (e) {
        // console.log(e)
  //  })
})
    
</script>
</body>
</html>