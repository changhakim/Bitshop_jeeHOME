<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=application.getContextPath()%>/resources/css/style.css" />
</head>
<body>
	<table id ="wrapper">
		<tr id = "first">
			<td colspan="2">
				<h1>비트 쇼핑몰</h1>
			</td>
			
		</tr>
		<tr>
			<td colspan="2">
				<ul id="navi-bar">
					<li ><a href="home.do">홈으로</a></li>
					<li ><a href="member.do">회원관리</a></li>
					<li ><a href="account.do">계좌관리</a></li>
					<li style="background-color: blue"><a href="article.do">게시판</a></li>
					<li ><a href="admin.do">관리자</a></li>
					
				</ul>
			
			</td>
			
		</tr>
		<tr style="height :300px">
			<td id="side-menu">
				<table>
					<tr>
						<td>계좌목록</td>
					</tr>
					<tr>
						<td>Writer로 찾기</td>
					</tr>
					<tr>
						<td>글번호로 찾기</td>
					</tr>
					<tr>
						<td>전체글갯수</td>
					</tr>
					<tr>
						<td>글수정</td>
					</tr>
					<tr>
						<td>글삭제</td>
					</tr>
					
				</table>
			</td>
			<td></td>
		</tr>
	</table>
	
	
</html>