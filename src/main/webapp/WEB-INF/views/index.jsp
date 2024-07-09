<%@page language="java" contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>인덱스</title>
</head>
<body>
    <form action="/user/auth" method="post">
        <input type="text" name="username" placeholder="아이디를 입력하세요"/>
        <input type="password" name="password" placeholder="비밀번호를 입력하세요">
        <input type="submit" value="로그인">
    </form>
    <div>
        <button onclick="javascript:location.href='/user/register'">회원가입</button>
    </div>
</body>
</html>