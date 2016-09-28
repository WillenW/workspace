package com.power.br.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class IndexController {

    @RequestMapping(value = "/index", method = {RequestMethod.GET})
    public String index() {
        System.out.println("1");
        return "index";
    }
    @RequestMapping(value = "/menu/{index}", method = {RequestMethod.POST})
    public String menu(@PathVariable("index") String index) {
        return "menu/sidebar"+index;
    }
}
