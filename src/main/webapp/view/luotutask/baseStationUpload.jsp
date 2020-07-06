<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>更新5G基站数据</title>
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
function loadFile(){
    $("#form").form('submit', {
            type:"post",  //提交方式    
            url:"../../app/uploadBaseStation", //请求url
            dataType : 'json',
			success : function(r) {
				$.messager.show( {
					title : '提示',
					msg : r.msg
				});
			}   
     });  
}

</script>
</head>
<body>
	<table width="100%" border="0" align="center" cellpadding="0"
		cellspacing="1" frame="box">
		<tr height='35px'>
			<td  style="font-size:16px" class="oddTd" colspan="3" >
				 上传5G基站数据
			</td>
		</tr>
		<tr height='35px'>
			<form id="form" name="form" enctype="multipart/form-data"
				method="post">
			<td align="left" style="width: 90px">
				<div id="newUpload2">
					<input id="file" type="file" name="file" multiple="true">
				</div>
			</td>
			<td>
				<input type="button" onclick="javascript:loadFile();" value="上传文件"/>
			</td>
			<td>
				<a href="down_module.jsp">下载导入模板</a>
			</td>
			</form>
		</tr>

	</table>
</body>
</html>