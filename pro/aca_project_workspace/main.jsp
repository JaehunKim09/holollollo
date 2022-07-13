<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bootstrap Front</title>
<style>
footer{
position:absolute;
width:100%;
height:100%;
}
#banner{
position:absolute;
margin:0;
width:100%;
height:100px;
top:230px;
border : 1px solid black;
}
</style>
</head>
<body>
<!-- header -->
<jsp:include page="header_notlogin.jsp"></jsp:include>

<!-- 배너 이미지 삽입 공간 -->
<div id="banner">
<img src="...">
여기는 배너이미지 넣는 곳.
</div>

<!-- footer -->
<footer>
<jsp:include page="footer.jsp"></jsp:include>
</footer>
</body>

</html>