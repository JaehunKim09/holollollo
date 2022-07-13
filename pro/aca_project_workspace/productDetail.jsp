<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
footer{
position:absolute;
width:100%;
height:100%;
margin:0 auto;
}
#p_container{
position:relative;
width:1500px;
height:100%;
top:50px;
margin:0 auto;
}
#product_img{
position:absolute;
left:400px;
width:300px;
height:300px;
border:1px solid black;
}
#product_detail{
position:absolute;
left:800px;
width:400px;
height:300px;

}
#product_name{
font-weight:bold;
font-size:20px;
}
#product_option{
position:absolute;
left:800px;
top:300px;
width:400px;
height:87px;
background-color:lightgray;
}
#purchase_button{
position:absolute;
background-color:black;
color:white;
width:100px;
height:50px;
right:1px;
}
#option_tab{
border-collapse:collapse;
}
#product_price{
display:inline-block;
position:absolute;
left:290px;
font-weight:bold;
color:red;
size:20px;
}
</style>
</head>
<body>

<jsp:include page="header_notlogin.jsp"></jsp:include>
<footer>
<div id="p_container">
	<div id="product_img">
		<img src="..." >상품 이미지 넣는 곳...
	</div>
	<div id="product_detail">
	<span id="product_name">상품명</span>
	<hr size="2" color="gray">
	가격 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span style="font-weight:bold">35000원</span>
	<hr style="border:1px dotted lightgray">
	배송비 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span style="font-weight:bold">무료</span>
	</div>
	<br><br><br><br><br>
	
	<div id="product_option">
	[옵션선택]<br>
	수량
	<hr>
	<table id=option_tab>
		<tr>
			<td style="border:1px solid black" width="15" align="center">-</td>
			<td style="border:1px solid black">1(수량)</td>
			<td style="border:1px solid black" width="15" align="center">+</td>
		</tr>
	</table>
	<br><br>
	총 금액
	<div id="product_price">35,000원(가격)</div>
	<br><br>
		<div align="right">
		<input id="purchase_button" type="submit" value="구매하기">
		</div>
	</div>
</div>

<jsp:include page = "footer.jsp"></jsp:include>
</footer>
</body>
</html>