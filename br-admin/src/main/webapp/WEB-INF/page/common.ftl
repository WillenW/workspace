<#macro ctx>${request.getContextPath()}</#macro>

<#macro head>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>后台管理</title>
    <link href="<@admin.ctx/>/static/themes/default/style.css" rel="stylesheet" type="text/css" media="screen"/>
    <link href="<@admin.ctx/>/static/themes/css/core.css" rel="stylesheet" type="text/css" media="screen"/>
    <link href="<@admin.ctx/>/static/themes/css/print.css" rel="stylesheet" type="text/css" media="print"/>
    <link href="<@admin.ctx/>/static/uploadify/css/uploadify.css" rel="stylesheet" type="text/css" media="screen"/>
    <link href="<@admin.ctx/>/static/themes/css/ieHack.css" rel="stylesheet" type="text/css" media="screen"/>
    <style type="text/css">
        #header{height:85px}
        #leftside, #container, #splitBar, #splitBarProxy{top:90px}
    </style>

    <script src="<@admin.ctx/>/static/js/speedup.js" type="text/javascript"></script>
    <script src="<@admin.ctx/>/static/js/jquery-1.11.3.min.js" type="text/javascript"></script><![endif]-->
    <script src="<@admin.ctx/>/static/js/jquery-2.1.4.min.js" type="text/javascript"></script>
    <script src="<@admin.ctx/>/static/js/jquery.cookie.js" type="text/javascript"></script>
    <script src="<@admin.ctx/>/static/js/jquery.validate.js" type="text/javascript"></script>
    <script src="<@admin.ctx/>/static/js/jquery.bgiframe.js" type="text/javascript"></script>
    <script src="<@admin.ctx/>/static/xheditor/xheditor-1.2.2.min.js" type="text/javascript"></script>
    <script src="<@admin.ctx/>/static/xheditor/xheditor_lang/zh-cn.js" type="text/javascript"></script>
    <script src="<@admin.ctx/>/static/uploadify/scripts/jquery.uploadify.min.js" type="text/javascript"></script>

    <script src="<@admin.ctx/>/static/bin/dwz.min.js" type="text/javascript"></script>
    <script src="<@admin.ctx/>/static/js/dwz.regional.zh.js" type="text/javascript"></script>


    <script type="text/javascript">
        $(function(){
            DWZ.init("<@admin.ctx/>/static/dwz.frag.xml", {
                loginUrl:"login_dialog.html", loginTitle:"登录",	// 弹出登录对话框
//		loginUrl:"login.html",	// 跳到登录页面
                statusCode:{ok:200, error:300, timeout:301}, //【可选】
                keys: {statusCode:"statusCode", message:"message"}, //【可选】
                pageInfo:{pageNum:"pageNum", numPerPage:"numPerPage", orderField:"orderField", orderDirection:"orderDirection"}, //【可选】
                debug:false,	// 调试模式 【true|false】
                callback:function(){
                    initEnv();
                    $("#themeList").theme({themeBase:"themes"});
                }
            });
        });
    </script>
</head>
</#macro>