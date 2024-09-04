package com.product.productdemo.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.product.productdemo.model.Product;
import com.product.productdemo.service.ProductService;
@Controller
public class ProductController {

 @Autowired
 private ProductService service;
 @RequestMapping(path = {"/","/search"})
 public String home(Product product, Model model, String keyword) {
  if(keyword!=null) {
   List<Product> list = service.getByKeyword(keyword);
   model.addAttribute("list", list);
  }else {
  List<Product> list = service.getAllProducts();
  model.addAttribute("list", list);}
  return "index";
 }
}