<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<!--상대경로 사용, [현재 url이 속한 계층 경로 + /save] -->
<!--보통은 절대경로로 해주는게 좋으-->
<form action="save" method="post">
    username: <input type="text" name="username" />
    age: <input type="text" name="age" />
    <button type="submit">전송</button>
</form>
</body>
</html>