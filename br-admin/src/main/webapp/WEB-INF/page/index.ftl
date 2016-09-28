<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<@admin.head />
<body scroll="no">
<div id="layout">
    <div id="header">
        <div class="headerNav">
            <a class="logo" href="<@admin.ctx />/index">标志</a>
            <ul class="nav">
                <li><a href="login.html">退出</a></li>
            </ul>
            <ul class="themeList" id="themeList">
                <li theme="default"><div class="selected">蓝色</div></li>
                <li theme="green"><div>绿色</div></li>
                <!--<li theme="red"><div>红色</div></li>-->
                <li theme="purple"><div>紫色</div></li>
                <li theme="silver"><div>银色</div></li>
                <li theme="azure"><div>天蓝</div></li>
            </ul>
        </div>

        <div id="navMenu">
            <ul>
                <li class="selected"><a href="<@admin.ctx/>/menu/1"><span>企业首页管理</span></a></li>
                <li><a href="<@admin.ctx/>/menu/2"><span>技术服务项目管理</span></a></li>
                <li><a href="<@admin.ctx/>/menu/3"><span>行业信息管理</span></a></li>
                <li><a href="<@admin.ctx/>/menu/4"><span>数据远程监控</span></a></li>
                <li><a href="<@admin.ctx/>/menu/5"><span>视频远程监控</span></a></li>
                <li><a href="<@admin.ctx/>/menu/6"><span>电站设备信息</span></a></li>
                <li><a href="<@admin.ctx/>/menu/7"><span>会员管理</span></a></li>
                <li><a href="<@admin.ctx/>/menu/8"><span>企业管理</span></a></li>
                <li><a href="<@admin.ctx/>/menu/9"><span>服务申请管理</span></a></li>
            </ul>
        </div>
    </div>

    <div id="leftside">
        <div id="sidebar_s">
            <div class="collapse">
                <div class="toggleCollapse"><div></div></div>
            </div>
        </div>
        <div id="sidebar">
            <div class="toggleCollapse"><h2>主菜单</h2><div>收缩</div></div>
            <div class="accordion" fillSpace="sideBar">
                <div class="accordionHeader">
                    <h2><span>Folder</span>典型页面</h2>
                </div>
                <div class="accordionContent">
                    <ul class="tree treeFolder">
                        <li><a href="demo_upload.html" target="navTab" rel="demo_upload">文件上传表单提交示例</a></li>
                        <li><a href="demo_page1.html" target="navTab" rel="demo_page1">查询我的客户</a></li>
                        <li><a href="demo_page1.html" target="navTab" rel="demo_page2">表单查询页面</a></li>
                        <li><a href="demo_page4.html" target="navTab" rel="demo_page4">表单录入页面</a></li>
                        <li><a href="demo_page5.html" target="navTab" rel="demo_page5">有文本输入的表单</a></li>
                    </ul>
                </div>
                <div class="accordionHeader">
                    <h2><span>Folder</span>流程演示</h2>
                </div>
                <div class="accordionContent">
                    <ul class="tree">
                        <li><a href="newPage1.html" target="dialog" rel="dlg_page">列表</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <div id="container">
        <div id="navTab" class="tabsPage">
            <div class="tabsPageHeader">
                <div class="tabsPageHeaderContent"><!-- 显示左右控制时添加 class="tabsPageHeaderMargin" -->
                    <ul class="navTab-tab">
                        <li tabid="main" class="main"><a href="javascript:;"><span><span class="home_icon">我的主页</span></span></a></li>
                    </ul>
                </div>
                <div class="tabsLeft">left</div><!-- 禁用只需要添加一个样式 class="tabsLeft tabsLeftDisabled" -->
                <div class="tabsRight">right</div><!-- 禁用只需要添加一个样式 class="tabsRight tabsRightDisabled" -->
                <div class="tabsMore">more</div>
            </div>
            <ul class="tabsMoreList">
                <li><a href="javascript:;">我的主页</a></li>
            </ul>
            <div class="navTab-panel tabsPageContent layoutBox">
                <div class="page unitBox">
                    <div class="accountInfo">
                        <div class="alertInfo">
                            <h2><a href="doc/dwz-user-guide.pdf" target="_blank">DWZ框架使用手册(PDF)</a></h2>
                            <a href="doc/dwz-user-guide.swf" target="_blank">DWZ框架演示视频</a>
                        </div>
                        <div class="right">
                            <p><a href="doc/dwz-user-guide.zip" target="_blank" style="line-height:19px">DWZ框架使用手册(CHM)</a></p>
                            <p><a href="doc/dwz-ajax-develop.swf" target="_blank" style="line-height:19px">DWZ框架Ajax开发视频教材</a></p>
                        </div>
                        <p><span>DWZ富客户端框架</span></p>
                        <p>DWZ官方微博:<a href="http://weibo.com/dwzui" target="_blank">http://weibo.com/dwzui</a></p>
                    </div>
                    <div class="pageFormContent" layoutH="80">
                        <iframe width="100%" height="430" class="share_self"  frameborder="0" scrolling="no" src="http://widget.weibo.com/weiboshow/index.php?width=0&height=430&fansRow=2&ptype=1&speed=300&skin=1&isTitle=0&noborder=1&isWeibo=1&isFans=0&uid=1739071261&verifier=c683dfe7"></iframe>
                    </div>
                </div>

            </div>
        </div>
    </div>

</div>

<div id="footer">Copyright &copy; 2010 <a href="demo_page2.html" target="dialog">DWZ团队</a></div>

</body>
</html>