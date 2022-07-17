<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bootstrap Front</title>
<style>
footer {
	position: absolute;
	width: 100%;
	height: 1500px;
}

.product {
	display: inline-block;
	width: 300px;
	height: 300px;
	border: 1px solid black;
	top: 500px;
	left: 60px;
	bottom: 500px;
	margin-right: 40px;
}

#container2 {
	position: absolute;
	top:50px;
	left: 220px;
	width: 1500px;
	height: 500px;
}
</style>
</head>
<body>
	<jsp:include page="../header_notlogin.jsp"></jsp:include>
	<footer>
		<div id="container2">
			<div class="product">
				<img class="product"> 상품1
			</div>

			<div class="product">
				<img class="product"> 상품2
			</div>
			<div class="product">
				<img class="product"> 상품3
			</div>
			<div class="product">
				<img class="product"> 상품4
			</div>
			<br>
			<br>
			<br>
			<br>
			<div class="product">
				<img class="product"> 상품5
			</div>

			<div class="product">
				<img class="product"> 상품6
			</div>
			<div class="product">
				<img class="product"> 상품7
			</div>
			<div class="product">
				<img class="product"> 상품8
			</div>
		</div>
		<!-- footer -->

		<jsp:include page="../footer.jsp"></jsp:include>
	</footer>
</body>

</html>