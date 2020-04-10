<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="height: 100%">
   <head>
       <meta charset="utf-8">
       	<script type="text/javascript" src="<%=request.getContextPath() %>/jquery-easyui-1.5.1/jquery.min.js"></script>
		<script type="text/javascript" src="<%=request.getContextPath() %>/jquery-easyui-1.5.1/jquery.easyui.min.js"></script>
		<script type="text/javascript" src="<%=request.getContextPath() %>/jquery-easyui-1.5.1/locale/easyui-lang-zh_CN.js"></script>
		<link rel="stylesheet" href="<%=request.getContextPath() %>/jquery-easyui-1.5.1/themes/default/easyui.css" type="text/css"></link>
		<link rel="stylesheet" href="<%=request.getContextPath() %>/jquery-easyui-1.5.1/themes/icon.css" type="text/css"></link>
            <script type="text/javascript" src="<%=request.getContextPath() %>/js/echarts.min.js"></script>
   </head>
   <body style="height: 100%; margin: 0">
   <div style="text-align:center;">
   <form id="form1" name="form1">
   统计周期：<input type="text" id="birth_year" name="period" class="easyui-datebox" style="width: 100px;padding-left: 10px"/> 
   <a href="javascript:void(0);" class="easyui-linkbutton"
					data-options="iconCls:'icon-search'" onclick="searchFun();">统计</a>
					</form>
					
					</div>
       <div id="container" style="height: 50%"></div>
       <div id="piechart" style="height: 40%"></div>
       <script type="text/javascript">
       var dom = document.getElementById("container");
       var pie = document.getElementById("piechart");
       var myChart = echarts.init(dom);
       var pieChart = echarts.init(pie);
       var app = {};
       option = null;
       option = {
           legend: {},
           tooltip: {},
           dataset: {
           	"source": [{
           		"area": "茂南区",
           		"优": 0,
           		"中": 0,
           		"差": 0,
           		"良": 0
           	},
           	{
           		"area": "电白区",
           		"优": 0,
           		"中": 0,
           		"差": 0,
           		"良": 0
           	},
           	{
           		"area": "高州市",
           		"优": 0,
           		"中": 0,
           		"差": 0,
           		"良": 0
           	},
           	{
           		"area": "信宜市",
           		"优": 0,
           		"中": 0,
           		"差": 0,
           		"良": 0
           	},
           	{
           		"area": "化州市",
           		"优": 0,
           		"中": 0,
           		"差": 0,
           		"良": 0
           	}],
           	"dimensions": ["area",
           	"优",
           	"良",
           	"中",
           	"差"]
           },
           xAxis: {type: 'category'},
           yAxis: {},
           // Declare several bar series, each will be mapped
           // to a column of dataset.source by default.
           series: [
               {type: 'bar'
       		},
               {type: 'bar'
       		},
               {type: 'bar'
       		},
               {type: 'bar'
       		}
           ]
       };
       pieoption = null;
       pieoption = {
           title: {
               text: '自然村覆盖统计',
              // subtext: '纯属虚构',
               left: 'center'
           },
           tooltip: {
               trigger: 'item',
               formatter: '{a} <br/>{b} : {c} ({d}%)'
           },
           legend: {
               orient: 'vertical',
               left: 'left',
               data: []
           },
           series: [
               {
                   name: '覆盖统计',
                   type: 'pie',
                   radius: '55%',
                   center: ['50%', '60%'],
                   data: [
                       {value: 0, name: '优'},
                       {value: 0, name: '良'},
                       {value: 0, name: '中'},
                       {value: 0, name: '差'}
                   ],
                   emphasis: {
                       itemStyle: {
                           shadowBlur: 10,
                           shadowOffsetX: 0,
                           shadowColor: 'rgba(0, 0, 0, 0.5)'
                       }
                   }
               }
           ]
       };
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

if (option && typeof option === "object") {
    myChart.setOption(option, true);
}
if (pieoption && typeof option === "object") {
    pieChart.setOption(pieoption, true);
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
    	   $.ajax
    	   ({
    	   	url: "../../app/getBarDataSet",
    	   	dataType: "json",
    	   	type: "get",
    	   	data: $('#form1').serialize(),
    	       success:function(data){
    	   	       option.dataset=data;
    	   	       myChart.setOption(option, true);
    	   	},
    	       error:function(){
    	       	alert('failed!');
    	       },
    	   });
    	   $.ajax
    	   ({
    	   	url: "../../app/getPieDataSet",
    	   	dataType: "json",
    	   	type: "get",
    	   	data: $('#form1').serialize(),
    	       success:function(data){
    	   	       pieoption.series[0].data=data;
    	   	       pieChart.setOption(pieoption, true);
    	   	},
    	       error:function(){
    	       	alert('failed!');
    	       },
    	   });
    		//$('#grid').datagrid('load', serializeObject($('#admin_yhgl_searchForm')));
    	}
       </script>
   </body>
</html>