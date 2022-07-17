<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bootstrap Front_5</title>
<style>
html, body {
	margin: 0;
	padding: 0;
	height: 100%;
}

#big {
	min-height: 100%;
	position: relative;
}

#small {
	padding-bottom: 200px; /* footer의 높이 */
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
	position: relative;
	left: 300px;
	width: 1500px;
}
</style>
</head>
<body>
	<div id="big">
		<!-- 내용물 및 푸터를 감싸는 div -->
		<div id="small">
			<!-- 내용물을 감싸는 div -->
			<div id="header">
				<jsp:include page="../header_notlogin.jsp"></jsp:include>
			</div>

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
		</div>
		<!-- small -->
		<div id="footer">
			<jsp:include page="../footer.jsp"></jsp:include></div>
	</div>
	<!-- big -->
</body>
</html>