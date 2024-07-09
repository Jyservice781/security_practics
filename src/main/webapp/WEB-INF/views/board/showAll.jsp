<%@page language="java" contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title> board | showAll </title>
</head>
<body>
<table>
    <tr>
        <td>영화 제목 : </td>
        <td>${list.title}</td>
    </tr>
    <tr>
        <td>영화 상영일 : </td>
        <td>${list.entryDate}</td>
    </tr>
    <tr>
        <td>영화 줄거리 : </td>
        <td>${list.content}</td>
    </tr>
</table>
</body>
</html>