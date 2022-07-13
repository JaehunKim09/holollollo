<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>문의내역</title>
<style type="text/css">
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
#second_tab{
margin-left: 290px; 
margin-top: 100px;
border-collapse: collapse;
width: 500px;
}
#span{
margin-left: 300px;
font-size: 25px;
}
p{
margin-left: 350px;
}
</style>
</head>
<body>
<div style="width: 1250px;">
<!-- header -->
<header>
<jsp:include page="header_notlogin.jsp"></jsp:include>
</header>
<table 
style="margin-left:300px;
top:100px;
border-collapse:collapse;
border:1px solid gray;
color:gray;
margin-top:10px;">
<div id="mypage_div">
		<br><span id="mypage_span">마이페이지
		</span>&nbsp;&nbsp;&nbsp; 홍길동 회원님을 위한 마이페이지 입니다.
		</div>
</table>
<table id="second_tab" border="1px">
<tr>
	<th>구매내역</th><th>회원정보</th><th>내 구매후기</th><th>내 문의내역</th>
</tr>
</table>
<br>
<span id="span">문의내역</span>
<br><br>
<hr style="width: 900px;">
<p>분류&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(데이터베이스)</p>
<hr style="width: 900px;">
<p>일자&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(데이터베이스)</p>
<hr style="width: 900px;">
<p>제목&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(데이터베이스)</p>
<hr style="width: 900px;">
<p>문의내용&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(데이터베이스)</p>
<hr style="width: 900px;">
<p>답변내용&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(데이터베이스)</p>


		<!-- footer -->
<footer>
<jsp:include page="footer.jsp"></jsp:include>
</footer>	
</div>
</body>
</html>