<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/jquery/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("input").click(function(){
			var url="index";
			var data={"username":"赖金川"};
			$(this).load(url,data,function(data){
				var jsonData=evla("("+data+")");
				alter("成功"+jsonData.info);
			});
		});
		$("#get").click(function(){
			var url="index";
			var param={"username":"赖金川"};
			$.get(url,param,function(data){
				$("#dd").text(data.success+data.data);
			},"json");
		});
		$("#post").click(function(){
			var url="index";
			var data={"username":$("#post").text()};
			$.ajax({
				"async":true,
				"type":"post",
				"url":url,
				"data":data,
				"dataType":"json",
				"success": function(data){
					$("#dd").text(data.success);
				},
				"error":function(){
					alter("错误");
				}
				
			});	
		});
		
		
			
	
	});
	
</script>
<title>测试ajax</title>
</head>
<body>


<input type="button" value="测试ajaxLoad" id="load">
<button id="get" >get方式</button>
<button id="post" >post方式</button>
<p id="dd"></p>
</body>
</html>