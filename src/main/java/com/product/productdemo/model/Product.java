package com.product.productdemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@Table(name = "product")
public class Product {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer id;
 private String productname;
 private String productdescription;
 private int productstock;
 private String productsize;
 private String productcolor;
 private String productprice;
 
 public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public String getProductdescription() {
	return productdescription;
}
public void setProductdescription(String productdescription) {
	this.productdescription = productdescription;
}
public int getProductstock() {
	return productstock;
}
public void setProductstock(int productstock) {
	this.productstock = productstock;
}
public String getProductsize() {
	return productsize;
}
public void setProductsize(String productsize) {
	this.productsize = productsize;
}
public String getProductcolor() {
	return productcolor;
}
public void setProductcolor(String productcolor) {
	this.productcolor = productcolor;
}
public String getProductprice() {
	return productprice;
}
public void setProductprice(String productprice) {
	this.productprice = productprice;
}


@Override
public String toString() {
	return "Product [id=" + id + ", productname=" + productname + ", productdescription=" + productdescription
			+ ", productstock=" + productstock + ", productsize=" + productsize + ", productcolor=" + productcolor
			+ ", productprice=" + productprice + "]";
}
 
 
//@Override
//public String toString() {
//	return "Shop [id=" + id + ", ownername=" + ownername + ", shopno=" + shopno + ", shoptype=" + shoptype
//			+ ", address=" + address + ", country=" + country + ", getId()=" + getId() + ", getOwnername()="
//			+ getOwnername() + ", getShopno()=" + getShopno() + ", getShoptype()=" + getShoptype() + ", getAddress()="
//			+ getAddress() + ", getCountry()=" + getCountry() + ", getClass()=" + getClass() + ", hashCode()="
//			+ hashCode() + ", toString()=" + super.toString() + "]";
//}

}