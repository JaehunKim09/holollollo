<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<style>
footer{
position:absolute;
width:100%;
height:100%;
}
#p_container_myPage{
position:absolute;
width:100%;
height:100%;
margin:0 auto;
border: 1px solid black;

}
#myPage {
	position: relative;
	border: 1px solid black;
	width: 800;
	height: 50px;
	left: 250px;
	top: 300px;
	font-size: 30px;
}

.ShopList {
	position: relative;
	left: 250px;
	top: 320px;
	width: 120px;
	height: 50px;
	border: 1px solid black;
	font-size: 18px;
	margin-right: 20px;
}

.ShopList_td {
	width: 120px;
	height: 50px;
	border: 1px solid black;
}

</style>
</head>
<body>

		<jsp:include page="header_notlogin.jsp"></jsp:include>
	<footer>
<div id="p_container_myPage">
	<div id="myPage">마이페이지</div>

	<div class="ShopList">
		<div class="ShopList_td">구매내역</div>
		<div class="ShopList_td">회원정보</div>
		<div class="ShopList_td">내 구매후기</div>
		<div class="ShopList_td">내 문의내역</div>
	</div>

	<div id="p_container_myPage">
	
	</div>
</div>

		<jsp:include page="footer.jsp"></jsp:include>
	</footer>
</body>
</html>