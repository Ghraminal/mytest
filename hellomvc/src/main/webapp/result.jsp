<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
<title>결과</title>
<style>
	*{
		margin : 0;
		padding : 0;
	}
	
	
	section{
		width: 100%;
		height: calc(100vh - 160px);
		background-color: lightgray;
	}
	section h2{
		text-align: center;
		padding: 20px;
	}
	section form{
		display: flex;
		justify-content: center;
	}

</style>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<section>
	<%-- <h2>${message}</h2> --%>
	<h2>예약확인</h2>
	<form name="frm" method="post" action="hello">
			<table border="1">
				<tr>
					<td>예약번호</td>
					<td>${message1}</td>
				</tr>
				<tr>
					<td>고객번호</td>
					<td>${message2}</td>
				</tr>
				<tr>
					<td>예약일자</td>
					<td>${message3}</td>
				</tr>
				<tr>
					<td>코트번호</td>
					<td>${message4}</td>
				</tr>
				</table>
		</form>
		<form>
			<table>
				<tr>
					<td colspan="2" style="text-align:center">
						<input type="button" value="돌아가기" onclick="window.location.href = 'insert.jsp'">
					</td>
				</tr>
			</table>
		</form>
</section>
  <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
