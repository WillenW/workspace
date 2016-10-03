package com.power.br.util;

import com.aliyun.oss.OSSClient;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by wanggang on 2016/10/3.
 */
public class OssUploadFileUtil {
    static Logger logger = Logger.getLogger(OssUploadFileUtil.class);
    public static  String ossUploadFile(MultipartFile file) {
        String returnUrl ="";
        try {
            PropertyConfigurator.configure("classpath:log4j.properties");
            logger.info("开始上传");
            String filename=file.getOriginalFilename();
            String type = filename.substring(filename.indexOf("."),filename.length());
            String mykey = "br-power-"+System.currentTimeMillis()+"OofileoO"+type;
            OSSClient ossClient = new OSSClient(AppConfig.endpoint, AppConfig.accessKeyId, AppConfig.accessKeySecret);
            ossClient.putObject(AppConfig.bucketName, mykey, file.getInputStream());
            ossClient.shutdown();
            returnUrl =AppConfig.filesufix+mykey;
            logger.info("上传成功："+returnUrl);
        }catch (Exception e){
            returnUrl="errorfile";
            logger.info("上传失败");
        }
        return returnUrl;
    }
}
