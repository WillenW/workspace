package com.power.br.controller;


import com.power.br.pojo.ProductServicePOJO;
import com.power.br.service.ProductServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ProuductServiceController {
    @Autowired
    private ProductServiceService productServiceService;
    @RequestMapping(value = "product-service",method = {RequestMethod.GET})
    public String productService(Model model) {
        List<ProductServicePOJO> list = productServiceService.query(1);
        model.addAttribute("list",list);
        return "productservice/product-service";
    }
}
