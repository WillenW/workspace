package com.power.br.controller;

import com.power.br.pojo.ProductServicePOJO;
import com.power.br.service.ProductServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wanggang on 2016/10/6.
 */
@Controller
public class ProductServiceController {
    @Autowired
    private ProductServiceService productServiceService;

    @RequestMapping(value = "product-service-add",method = {RequestMethod.GET})
    public String add(){
        return "productservice/product-service-add";
    }

    @RequestMapping(value = "product-service-add",method = {RequestMethod.POST})
    public String add(ProductServicePOJO pojo){
        productServiceService.add(pojo);
        return "productservice/product-service-add";
    }
}
