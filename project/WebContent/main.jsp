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
height:300px;
top:10px;
border : 1px solid black;
}
.product{
display:inline-block;
width:200px;
height:200px;
border: 1px solid black;
top:500px;
left:60px;
bottom:500px;
margin-right:40px;
}
#container2{
position:absolute;
top:430px;
left:470px;
width:1500px;
height:500px;
}
#product{
position:absolute;
top:360px;
left:470px;
}
</style>
</head>
<body>
<!-- header -->
<jsp:include page="header_notlogin.jsp"></jsp:include>
<footer>

<!-- 배너 이미지 삽입 공간 -->
<div id="banner">
<img src="...">
여기는 배너이미지 넣는 곳.
</div>

<div id="product">*추천 상품</div>

<div id="container2">
<div class="product">
	<img class="product">
	상품1
</div>

<div class="product">
	<img class="product">
	상품2
</div>
<div class="product">
	<img class="product">
	상품3
</div>
<div class="product">
	<img class="product">
	상품4
</div>
</div>
<!-- footer -->

<jsp:include page="footer.jsp"></jsp:include>
</footer>
</body>

</html>