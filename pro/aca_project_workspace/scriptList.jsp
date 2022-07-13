<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
footer{ /* footer */
position:absolute;
width:100%;
height:100%;
}
#p_container_main{ /* main 들어있는 p_container 얘로 전체 위치 조정 */
position:absolute;
width:1500px;
height:100%;
left:150px;
}
#mypage_span{
font-size:30px;
font-weight:bold;
}
#mypage_table_div{
height:100%;
}
#mypage_table th{
border:1px solid gray;
}
#mypage_table th:hover{
background:black;
color:white;
}
#product_info{
position:absolute;
width:900px;
left:300px;
top:140px;

}
#product_info_table{
width:1200px;
height:130px;

}
#product_info_table td{
height:200px;
text-align:center;
border:1px solid gray;
}

</style>
</head>
<body>
<jsp:include page="header_notlogin.jsp"></jsp:include>
<footer>
	<div id="p_container_main">
	<hr size="2" style="color:lightgray">
		<div id="mypage_table_div">
		</div>
		<div id="product_info">
		<table id="product_info_table">
			<tr style="background:orange">
				<th colspan="1">구매후기</th>
				<th>작성자</th>
				<th>작성일</th>
			</tr>
			<tr>
				<td>상품평의 내용이 노출띠</td>
				<td>say***</td>
				<td>2021-05-12 00:00</td>
			</tr>
			<tr>
				<td>상품평의 내용이 노출띠 상품평의 내용이 노출띠<br>
				상품평의 내용이 노출띠 상품평의 내용이 노출띠<br>
				상품평의 내용이 노출띠 상품평의 내용이 노출띠<br>
				상품평의 내용이 노출띠 상품평의 내용이 노출띠</td>
				<td>Kkks***</td>
				<td>2021-05-12 12:00</td>
			</tr>
		</table>
		</div>
		</div><!-- p_container_main end -->	
		<jsp:include page="footer.jsp"></jsp:include>	
	</footer><!-- p_container_withFooter end -->
</body>
</html>