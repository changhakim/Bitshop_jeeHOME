<%@page import="domain.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div>
<% 
MemberBean member = (MemberBean)request.getAttribute("member");
%>

아이디:<%=member.getId() %>
이름:<%=member.getName() %>
비밀번호:<%=member.getPass() %>
주민등록번호:<%=member.getSsn() %>
</div>