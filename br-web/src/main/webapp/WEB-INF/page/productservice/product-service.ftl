<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<@admin.head />
<style type="text/css">
    body {
        background-image: url(<@admin.ctx/>/static/style/index_23_8578.jpg);
    }
</style>
<body>
<div class="wrap994">
    <@admin.top />
    <div class=" banner_230"><img src="<@admin.ctx />/static/images/cpzs_52970.jpg" width="960" height="230" /></div>
    <div class="main">
        <div class="ejym_left">
            <div class="mun">
                <div class="title">
                    <div class="dz">技术服务项目</div>
                </div>
                <ul class="glossymenu">
                    <#list list as ser>
                         <li><a href="javascript:" onclick="showCon('${ser.content}')" >${ser.title}</a></li>
                    </#list>
                </ul>
            </div>
            <div class="mian-right" style="margin-top:10px;">  <a href="contact.html"><img src="<@admin.ctx />/static/images/index_06_7226.jpg" width="222" height="65" /></a>

                <a href="video.html"><img src="<@admin.ctx />/static/images/index_07_6385.jpg" width="222" height="65" style=" margin-top:10px;"/></a>

                <a href="products.html"><img src="<@admin.ctx />/static/images/index_08_6366.jpg" width="222" height="65" style=" margin-top:10px;"/></a>

            </div>

        </div>

        <div class=" ejym_right">

            <div class="title">

                您现在的位置： 首页 >>  <b>技术服务项目</b>

            </div>
            <ul class="cpzs_nr">
                <div id="con"></div>
                <div class="clear"></div>

            </ul>

        </div>

        <div class="clear"></div>

    </div>

</div>
<script type="application/javascript">
    function showCon(con) {
        $('#con').html(con);
    }
</script>
<@admin.footer />
</body>
</html>

