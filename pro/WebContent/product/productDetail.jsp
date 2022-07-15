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
}
#p_container{
border:2px solid blue;
position:relative;
width:1500px;
height:100%;
top:20px;
margin:0 auto;
}
#product_img{
position:absolute;
left:400px;
width:300px;
height:270px;
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
left:400px;
top:300px;
width:300px;
height:87px;
background-color:lightgray;
}
#purchase_button{
position:absolute;
background-color:black;
color:white;
width:100px;
height:30px;
top:110px;
right:1px;
}
#option_tab{
border-collapse:collapse;
}
#product_price{
top:85px;
position:absolute;
width:200px;
height:20px;
left:190px;
font-weight:bold;
color:red;
size:20px;
}
p{
font-size:13px;
}
ul li{
font-size:13px;
}
#details{
border:2px solid gray;
position:absolute;
left:400px;
top:470px;
width:900px;
height:440px;
}
</style>
</head>
<body>

<jsp:include page="../header_notlogin.jsp"></jsp:include>
<footer>
<div id="p_container">
	<div id="product_img">
		<img src="..." >상품 이미지 및 상세설명
	</div>
	<div id="product_detail">
	<span id="product_name">상품명</span>
	<hr size="2" color="gray">
	가격 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span style="font-weight:bold">35000원</span>
	<hr style="border:1px dotted lightgray">
	<p>
	<b>배송 안내</b><br>
	배송비 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span style="font-weight:bold">무료배송</span><br>
	배송기간  &nbsp;&nbsp; 평균 입금완료일 기준 2~4영업일이 소요됩니다<br>
	배송지역  &nbsp;&nbsp; 전국 (일부지역 제외)
	</p>
	<p>
	<b>교환, 반품 안내</b><br>
	교환/반품 기간  &nbsp;&nbsp; 상품 수령후, 2주 이내)<br>
	(단, 상품 오배송 및 상품하자의 경우 수령일로부터 3개월 이내<br>혹은 그 사실을 안 날로부터 30일 이내)
	교환/반품 절차  &nbsp;&nbsp; 배송완료 후 2주 이내 마이페이지에서 신청할 수 있습니다.<br>
	반품 배송비  &nbsp;&nbsp; 단순변심에 의한 교환/반품시 배송료가 부과됩니다.<br>
	교환/반품 반송지  &nbsp;&nbsp; 서울시 송파구 가락시장역<br>
	<ul>
		<li>교환/반품 가능 기간 초과하였을 경우
		<li>고객님의 요청에 의해 제품 사양이 변경된 경우
		<li>제품을 이미 사용하였거나, 제품을 일부 소비한 경우
		<li>고객님의 귀책사유 등으로 회수가 지연된 경우
		<li>제품을 세탁하거나 수선하는 등 타업체에서 선 처리한경우
	</ul>
	</p>
	
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
	&nbsp;&nbsp;&nbsp;&nbsp;총 금액<div id="product_price">35,000원(가격)</div>
	<br><br>
		<div align="right">
		<input id="purchase_button" type="submit" value="구매하기">
		</div>
	</div>
	
	<article id="details">
		***본 상품에 대한 상세설명 구역입니다***<br>
		상품에 대한 정보를 읽어보세요
	</article>
</div>

<jsp:include page = "../footer.jsp"></jsp:include>
</footer>
</body>
</html>