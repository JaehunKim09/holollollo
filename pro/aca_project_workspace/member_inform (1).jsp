<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보_본인확인</title>
<style>
/* footer */
footer{
position:absolute;
width:100%;
height:100%;
}
#p_container {
	position: relative;
	width: 1500px;
	height: 100%;
	margin: 0 auto;
	top : 150px;
}

#a_container_main{ /* main 들어있는 p_container 얘로 전체 위치 조정 */
position:absolute;
width:1500px;
height:100%;
left:300px;
}

#mypage_div{
position:absolute;
left:300px;
border:1px solid black;
width:900px;
height:80px;
text-align:left;
}

#mypage_span{
font-size:30px;
font-weight:bold;
}

#mypage_table_div{
height:100%;
}

#mypage_table{
position:absolute;
left:300px;
top:100px;
border-collapse:collapse;
border:1px solid gray;
color:gray;
margin-top:10px;
}

#mypage_table th{
border:1px solid gray;
}

#mypage_table th:hover{
background:black;
color:white;
}

#loginbox {
	width: 100%;
	height: 100%;
	position: absolute;
	left: 0;
	top: 30px;
}

#login1 {
	font-size: 25px;
	position: absolute;
	left: 420px;
	text-align: center;
}

#login2 {
	font-size: 15px;
	position: absolute;
	left: 420px;
	top: 40px;
}

#name {
	display: inline-block;
	position: absolute;
	left: 550px;
	top: 170px;
	height: 35px;
	width: 350px;
	border: 1px solid #1b5ac2;
	background: #ffffff;
}

#pw {
	display: inline-block;
	position: absolute;
	left: 550px;
	top: 220px;
	height: 35px;
	width: 350px;
	border: 1px solid #1b5ac2;
	background: #ffffff;
}

#loginbut {
	left: 550px;
	width: 350px;
	height: 35px;
	border: 0px;
	background: #1b5ac2;
	outline: none;
	float: right;
	color: #ffffff;
}
span{
	font-size: 12px;
}

</style>
</head>
<body>
	<!-- header -->
	<header>
		<jsp:include page="header_notlogin.jsp"></jsp:include>
	</header>
	
	<div id="a_container_main">
	<hr size="2" style="color:lightgray">
		<div id="mypage_div">
		<br><span id="mypage_span">마이페이지
		</span>&nbsp;&nbsp;&nbsp; 홍길동 회원님을 위한 마이페이지 입니다.
		</div>
		
		<div id="mypage_table_div">
		<table id="mypage_table">
			<tr>
				<th>구매내역</th>
				<th>회원정보</th>
				<th>내 구매후기</th>
				<th>내 문의내역</th>
		</table>
		</div>
	</div>	

	<!-- login -->
	<div id="p_container">

		<div id="loginbox">
			<div id="login1">
				<b>본인확인</b>
			</div>
			<div id="login2">
				회원님의 정보를 안전하게 보호하기 위해 비밀번호를 한번 더 입력해주세요.
				<hr>
			</div>
		</div>

		<div id="name">
			<input id="input" type="text" placeholder="이름"><br>
			<br>
		</div>
		<div id="pw">
			<input id="input" type="password" placeholder="비밀번호"><br>	
			<br>
			<span>*비밀번호는 타인에게 노출되지 않도록 주의하시기 바랍니다.</span>
			<br>
			<br>
			<button id="loginbut">확인</button>
		</div>
	</div>
</body>
<!-- footer -->
<footer>
<jsp:include page="footer.jsp"></jsp:include>
</footer>
</html>