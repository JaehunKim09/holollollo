<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���ǳ���</title>
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
		<br><span id="mypage_span">����������
		</span>&nbsp;&nbsp;&nbsp; ȫ�浿 ȸ������ ���� ���������� �Դϴ�.
		</div>
</table>
<table id="second_tab" border="1px">
<tr>
	<th>���ų���</th><th>ȸ������</th><th>�� �����ı�</th><th>�� ���ǳ���</th>
</tr>
</table>
<br>
<span id="span">���ǳ���</span>
<br><br>
<hr style="width: 900px;">
<p>�з�&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(�����ͺ��̽�)</p>
<hr style="width: 900px;">
<p>����&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(�����ͺ��̽�)</p>
<hr style="width: 900px;">
<p>����&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(�����ͺ��̽�)</p>
<hr style="width: 900px;">
<p>���ǳ���&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(�����ͺ��̽�)</p>
<hr style="width: 900px;">
<p>�亯����&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;(�����ͺ��̽�)</p>


		<!-- footer -->
<footer>
<jsp:include page="footer.jsp"></jsp:include>
</footer>	
</div>
</body>
</html>