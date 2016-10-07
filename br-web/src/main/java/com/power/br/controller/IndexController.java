package com.power.br.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class IndexController {
    static Logger logger = Logger.getLogger(IndexController.class);

    @RequestMapping(value="index",method = {RequestMethod.GET})
    public String index(){
        return "index";
    }
}
