<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bootstrap Front</title>
<style>
/* footer */
header{
position:fixed;
left:0;
top:0;
width:100%;
height:100px;
background-color:white;
z-index:4;
}
footer{
border:2px solid black;
position:fixed;
left:0;
bottom:0;
width:100%;
height:150px;
background-color:black;
}

#banner{
width:100%;
height:150px;
position:absolute;
top:104px;
left:0;
border : 1px solid black;
}
</style>
</head>
<body>
<!-- header -->
<header>
<jsp:include page="header.jsp"></jsp:include>
</header>
<footer>
<!-- 배너 이미지 삽입 공간 -->
<div id="banner">
<img src="..." class="img-fluid" alt="...">
여기는 배너이미지 넣는 곳.
</div>
<!-- footer -->

<jsp:include page="footer.jsp"></jsp:include>
</footer>	
</body>

</html>