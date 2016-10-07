<form method="post" action="<@admin.ctx/>/product-service-add" class="pageForm required-validate">
    <h2 class="contentTitle">产品技术服务名称</h2>
    <div style="padding:0 15px;"><input name="title" style="width: 300px;height: 30px;font-size: 16px"/></div>
    <h2 class="contentTitle">产品技术服务详细介绍</h2>
    <div style="padding:0 10px;">
        <div class="pageFormContent">
            <div class="unit">
							<textarea class="editor" name="content" rows="20" cols="150"
                                      upLinkUrl="upload.php" upLinkExt="zip,rar,txt"
                                      upImgUrl="upload.php" upImgExt="jpg,jpeg,gif,png">
                </textarea>
            </div>
        </div>
    </div>
    <div class="formBar">
        <button style="margin-left: 15px" type="submit">提交</button>
    </div>
</form>