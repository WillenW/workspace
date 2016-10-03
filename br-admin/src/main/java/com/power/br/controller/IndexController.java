package com.power.br.controller;

import com.aliyun.oss.ClientException;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSException;
import com.aliyun.oss.model.BucketInfo;
import com.power.br.util.OssUploadFileUtil;
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
import java.io.File;
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

    @RequestMapping(value = "uploads", method = {RequestMethod.POST})
    public String Uploads(@RequestParam(value = "uploadFile") MultipartFile uploadFile, Model model) {
        String url = OssUploadFileUtil.ossUploadFile(uploadFile);
        model.addAttribute("url",url);
        return "menu/sidebar/uploads";
    }
}
