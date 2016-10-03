package com.power.br.controller;

import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.model.BucketInfo;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayInputStream;
import java.io.InputStream;


@Controller
public class IndexController {
    static Logger logger = Logger.getLogger(IndexController.class);

    @RequestMapping(value = "/index", method = {RequestMethod.GET})
    public String index() {
        System.out.println("1");
        return "index";
    }

    @RequestMapping(value = "/menu/{index}", method = {RequestMethod.POST})
    public String menu(@PathVariable("index") String index) {
        return "menu/sidebar" + index;
    }

    @RequestMapping(value = "/menu/sidebar", method = {RequestMethod.GET})
    public String Upload() {
        System.out.println("页面跳转成功");
        return "menu/sidebar/uploads";
    }

    @RequestMapping(value = "uploads", method = {RequestMethod.GET})
    public void Uploads(@RequestParam(value = "uploadFile", required = false) MultipartFile uploadFile, HttpServletRequest request, Model model) {
        String endpoint = "http://oss-cn-shanghai.aliyuncs.com";
        String accessKeyId = "<LTAITs0jkNKJjw67>";
        String accessKeySecret = "<eXzJmF7Gg7iduhCP8UoNTei3Rztxqo>";
        String bucketName = "br-power-img";
        String firstKey = "/Users/apple/Desktop/git密码";
        // 日志配置，OSS Java SDK使用log4j记录错误信息。示例程序会在工程目录下生成“oss-demo.log”日志文件，默认日志级别是INFO。
        // 日志的配置文件是“conf/log4j.properties”，如果您不需要日志，可以没有日志配置文件和下面的日志配置。
        PropertyConfigurator.configure("conf/log4j.properties");
        logger.info("Started");

        // 创建OSSClient实例
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);

        try {
            // 判断Bucket是否存在。
            if (ossClient.doesBucketExist(bucketName)) {
                System.out.println("您已经创建Bucket：" + bucketName + "。");
            } else {
                System.out.println("您的Bucket不存在，创建Bucket：" + bucketName + "。");
                // 创建Bucket。
                ossClient.createBucket(bucketName);
            }
            // 查看Bucket信息。
            BucketInfo info = ossClient.getBucketInfo(bucketName);
            System.out.println("Bucket " + bucketName + "的信息如下：");
            System.out.println("\t数据中心：" + info.getBucket().getLocation());
            System.out.println("\t创建时间：" + info.getBucket().getCreationDate());
            System.out.println("\t用户标志：" + info.getBucket().getOwner());
            // 把字符串存入OSS，Object的名称为firstKey。
            InputStream is = new ByteArrayInputStream("Hello OSS".getBytes());
            ossClient.putObject(bucketName, firstKey, is);
            System.out.println("Object：" + firstKey + "存入OSS成功。");
        } catch (OSSException oe) {
            oe.printStackTrace();
        } catch (ClientException ce) {
            ce.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ossClient.shutdown();
        }

    }
}
