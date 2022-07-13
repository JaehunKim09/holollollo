<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보_본인확인</title>
<style>
 footer {
/*	position: absolute;
	width: 100%; 
	height: 100%; */
	
}
/* #p_container_main {
	position: absolute;
	width: 1500px;
	height: 100%;
	left: 300px;
} */

#mypage_div {
	position: absolute;
	left: 300px;
	border: 1px solid black;
	width: 900px;
	height: 80px;
	text-align: left;
}

#mypage_span {
	font-size: 30px;
	font-weight: bold;
}

#mypage_table_div {
	height: 100%;
}

#mypage_table {
	position: absolute;
	left: 300px;
	top: 100px;
	border-collapse: collapse;
	border: 1px solid gray;
	color: gray;
	margin-top: 10px;
}

#mypage_table th {
	border: 1px solid gray;
}

#mypage_table th:hover {
	background: black;
	color: white;
}

#container {
	border: 1px solid gray;
	position: relative;
	width: 700px;
	height: 400px;
	margin: 0 auto;
	top : 100px;
}

#a_container {
	border: 1px solid gray;
	position: relative;
	width: 600px;
	height: 150px;
	top: 100px;
	margin: 0 auto;
	position: relative;
}

#loginbox {
	position: relative;
	width: 94%;
	border-bottom: 1px solid black;
	top: 70px;
	left: 18px;
}

#login1 {
	font-size: 20px;
	position: absolute;
	left: 50px;
	text-align: center;
	top: 20px;
}

#login2 {
	font-size: 15px;
	position: absolute;
	left: 50px;
	top: 50px;
}
#name{
	display: inline-block;
	position: absolute;
	left: 80px;
	top: 20px;
	height: 35px;
	width: 350px;
	border: 1px solid black;
	background: #ffffff;
}
#pw{
	display: inline-block;
	position: absolute;
	left: 80px;
	top: 85px;
	height: 35px;
	width: 350px;
	border: 1px solid black;
	background: #ffffff;
}
#dang{
	font-size: 15px;
	position: absolute;
	left: 50px;
	top: 260px;
}
#check{
	position: absolute;
	left: 270px;
	width: 120px;
	height: 35px;
	top : 330px;
	background: black;
	outline: none;
	color: #ffffff;
}
</style>
</head>
<body>
	<jsp:include page="header_notlogin.jsp"></jsp:include>
	<div id="p_container_main">
		<hr size="2" style="color: lightgray">
		<div id="mypage_div">
			<br> <span id="mypage_span">마이페이지 </span>&nbsp;&nbsp;&nbsp; 홍길동
			회원님을 위한 마이페이지 입니다.
		</div>
		<div id="mypage_table_div">
			<table id="mypage_table">
				<tr>
					<th>구매내역</th>
					<th>회원정보</th>
					<th>내 구매후기</th>
					<th>내 문의내역</th>
				</tr>
			</table>
		</div>
	</div>
	<br>
	<br>
	<br>
	<div id="container">
		<div id="login1">
			<b>본인확인</b>
		</div>
		<div id="login2">회원님의 정보를 안전하게 보호하기 위해 비밀번호를 한번 더 입력해주세요.</div>

		<div id="a_container">
			<div id="loginbox"></div>
			<div id="name">
					<input id="input" type="text" placeholder="이름"><br> <br>
				</div>
			<div id="pw">
				<input id="input" type="text" placeholder="비밀번호"><br> <br>
			</div>
		</div>
			<div id="dang">
			*비밀번호는 타인에게 노출되지 않도록 주의하시기 바랍니다.
			</div>
		<button id="check">확인</button>
	</div>
<footer>
<jsp:include page="footer.jsp"></jsp:include>
</footer>
	
</body>
</html>