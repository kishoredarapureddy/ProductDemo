package com.product.productdemo.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.product.productdemo.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

	
	//@Query(value = "select * from Product p where p.productname like %:keyword% or p.productdescription like %:keyword%", nativeQuery = true)
	 
 //Custom query
 @Query(value = "select * from Product p where p.productname like %:keyword% ", nativeQuery = true)
 List<Product> findByKeyword(@Param("keyword") String keyword);
}