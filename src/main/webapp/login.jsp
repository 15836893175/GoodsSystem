<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="res/js/jquery-1.11.3.min.js"></script>
    <script>
        function login() {
            $.ajax({
                type: 'post',
                url: '/login',
                data: $("#form1").serialize(),
                datatype: 'json',
                async: true,//异步刷新
                success:function (data) {
                    if (null!=data){
                        alert("登陆成功，正在跳转...")
                        window.location.href='/goodslist';
                    }else {
                        alert("登录失败");
                    }
                }

            })
        }
    </script>
</head>
<body>
<FORM id="form1">
    <TABLE>
        <TR>
            <p>登录页面</p>
        </TR>
        <TR>
            <TD>账户：</TD>
            <TD>
                <input type="text" name="username">
            </TD>
        </TR>
        <TR>
            <TD>密码：</TD>
            <TD>
                <input type="text" name="password">
            </TD>
        </TR>
        <TR>
            <TD>
                <input type="reset" value="重置">
            </TD>
            <TD>
                <input type="button" value="登录" onclick="login()">
            </TD>
        </TR>
    </TABLE>
</FORM>
</body>
</html>
