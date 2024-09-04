package com.product.productdemo.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.productdemo.model.Product;
import com.product.productdemo.repository.ProductRepository;
@Service
public class ProductService {
 @Autowired
 private ProductRepository repository;
 
 /*
  * TODO: Get the List of Shops
  */
 public List<Product> getAllProducts(){
  List<Product> list =  (List<Product>)repository.findAll();
  return list;
 }
 
 /*
  * TODO: Get Shop By keyword
  */
 public List<Product> getByKeyword(String keyword){
  return repository.findByKeyword(keyword);
 }
}