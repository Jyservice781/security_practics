<%@page language="java" contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title> user | register</title>
</head>
<body>
<form action="/user/register" method="post">
    <input type="text" name="username" placeholder="아이디를 입력해주세요">
    <input type="password" name="password" placeholder="비밀번호를 입력해주세요">
    <input type="text" name="nickname" placeholder="닉네임을 입력해주세요">
    <input type="submit" value="회원가입">
</form>
</body>
</html>