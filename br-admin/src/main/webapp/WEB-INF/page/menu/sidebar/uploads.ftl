
<div>
    <form action="/uploads" method="post" enctype="multipart/form-data">
        <input type="file" name="uploadFile">

        <input type="submit" value="上传">

    </form>
    <#if url=="errorfile">
        <span>上传失败</span>
    <#elseif url??>
        <span>已成功上传到阿里云服务器</span>
        <a href="${url}">点击查看</a>
    </#if>
</div>