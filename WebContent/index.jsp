<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script>
	window.onload = function(){
		document.getElementById("input").onclick = function(){
			location.href = "input.jsp";
		}
		
		document.getElementById("output").onclick = function(){
			location.href = "output.jsp";
		}
		
	}
</script>
</head>
<body>
	5jo fighting!!
	
	<div id="wrapper">
		<div>Person Test</div><br>
		<div><button id="input">Input</button></div>
		<div><button id="output">Output</button></div>
	</div>
</body>
</html>