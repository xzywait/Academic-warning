<%@page contentType="text/html" %>
<%@page pageEncoding="UTF-8" %>
<!DOCTYPE html>

<head>
    <title>登录</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link href="vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="vendors/bootstrap/dist/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css">
    <link href="page/css/templatemo_style.css" rel="stylesheet" type="text/css">
    <link href="build/css/custom.min.css" rel="stylesheet">

    <script type="text/javascript">
        function codes(n) {
            var a = "azxcvbnmsdfghjklqwertyuiopZXCVBNMASDFGHJKLQWERTYUIOP0123456789";
            var b = "";
            for (var i = 0; i < n; i++) {
                var index = Math.floor(Math.random() * 62);
                b += a.charAt(index);

            }
            return b;
        };

        function show() {
            document.getElementById("login").innerHTML = codes(4);

        }

        window.onload = show;
    </script>
</head>

<body class="templatemo-bg-gray">
<div class="container">
    <div class="col-md-4 col-md-offset-3 col-lg-4 col-md-4 col-xs-4">

        <h1 class="margin-bottom-15" style="font-family: '微软雅黑';color: #101010;align-content: center;margin-left: 30%;">
            登录</h1>
        <form action="login" class="form-horizontal templatemo-container templatemo-login-form-1 margin-bottom-30"
              role="form" action="#" method="post">
            <div class="item form-group">
                <div class="col-md-9 col-lg-12 col-md-12 col-xs-12">
                    <div class="control-wrapper">
                        <label for="username" class="control-label fa-label"><i class="fa fa-user"></i></label>
                        <input type="text" class="form-control" id="username" name="username" placeholder="用户名">
                    </div>
                </div>
            </div>
            <div class="item form-group">
                <div class="col-md-9 col-lg-12 col-md-12 col-xs-12">
                    <div class="control-wrapper">
                        <label for="password" class="control-label fa-label"><i class="fa fa-lock"></i></label>
                        <input type="password" class="form-control" name="password" id="password" placeholder="密码">
                    </div>
                </div>
            </div>
            <div class="item form-group">
                <div class="col-md-9 col-lg-12 col-md-12 col-xs-12">
                    <div class="control-wrapper">
                        <label class="control-label fa-label"><i class="fa fa-shield"></i></label>
                        <input type="identifyingcode" class="form-control" placeholder="验证码，点击下图更换">
                    </div>
                </div>
            </div>
            <div class="item form-group">
                <div class="col-md-9 col-lg-12 col-md-12 col-xs-12">
                    <div class="control-wrapper">
                        <div id="login" onclick="show()"
                             style="width:100%;height:40px;line-height:40px;margin:0 auto;background-color:#eee;text-align:center;color:black;font-weight: bold;">
                            <a href="#"> </a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="item form-group">
                <div class="col-md-12 col-lg-12 col-md-12 col-xs-12">
                    <div class="checkbox control-wrapper">
                        <label>
                            <input type="checkbox"> 记住
                        </label>
                    </div>
                </div>
            </div>
            <div class="item form-group">
                <div class="col-md-12 col-lg-12 col-md-12 col-xs-12">
                    <div class="control-wrapper">
                        <input type="submit" value="登录" class="btn btn-success">
                        <!-- <a href="forgot-password.html" class="text-right pull-right">忘记密码?</a> -->
                    </div>
                </div>
            </div>
            <hr>
        </form>
    </div>
</div>
</body>

</html>