<%--
  Created by IntelliJ IDEA.
  User: yu
  Date: 2018/4/28
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>子书少卿之家</title>
    <meta charset="UTF-8">
    <style>
        body{background-color: #2D2D2D}
    </style>
    <link rel="stylesheet" href="../css/style.css" media="screen" type="text/css" />
</head>
<body>
<script type="text/javascript">
    window.onload = function() {
        //配置
        var config = {
            vx: 4,	//小球x轴速度,正为右，负为左
            vy: 4,	//小球y轴速度
            height: 2,	//小球高宽，其实为正方形，所以不宜太大
            width: 2,
            count: 100,		//点个数
            color: "121, 162, 185", 	//点颜色
            stroke: "130,255,255", 		//线条颜色
            dist: 6000, 	//点吸附距离
            e_dist: 20000, 	//鼠标吸附加速距离
            max_conn: 10 	//点到点最大连接数
        }

        //调用
        CanvasParticle(config);
    }
</script>
<script type="text/javascript" src="../js/canvas-particle.js"></script>
<!-- 背景div -->
<div id="mydiv" >
    <div id="window" style="">
        <div class="page page-front">
            <div class="page-content">
                <div class="input-row">
                    <label class="label fadeIn">用户名</label>
                    <input id="username" type="text" data-fyll="用户名" class="input fadeIn delay1" />
                </div>
                <div class="input-row">
                    <label class="label fadeIn delay2">密码</label>
                    <input id="password" type="password" data-fyll="密码" class="input fadeIn delay3" />
                </div>
                <div class="input-row perspective">
                    <button id="submit" class="button load-btn fadeIn delay4"> <span class="default"><i class="ion-arrow-right-b"></i>登录</span>
                    </button>
                </div>
            </div>
        </div>

    </div>
</div>

</body>
</html>
