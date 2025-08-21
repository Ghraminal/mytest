<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	*{
		margin: 0;
		padding: 0;
		list-style: none;
		text-decoration: none;
		box-sizing: border-box;
	}
	section{
		width: 100%;
		height: calc(100vh - 160px);
		background-color: lightgray;
	}
	h2{
		justify-content: center;
		text-align: center;
		padding: 20px;
	}
	form{
		display: flex;	
		justify-content: center;
	}
</style>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<jsp:include page="nav.jsp"></jsp:include>
<section>

<h2>차량조회</h2>

<form action="s_action.jsp" method="post" name="frm">
	<table border="1">
		<tr>
			<th>차량번호를 입력하시오</th>
			<td><input type="text" name="car_number"></td>
		</tr>
		<tr>
			<th colspan="2">
				<input type="button" value="차량조회" onclick="serch()">
				<input type="button" value="홈으로" onclick="location.href='index.html'">
			</th>
		</tr>
	</table>
</form>

</section>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>