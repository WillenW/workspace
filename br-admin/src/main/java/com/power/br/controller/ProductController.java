package com.power.br.controller;

import com.power.br.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="p")
public class ProductController {

	@Autowired
	private ProductService productService;

}
