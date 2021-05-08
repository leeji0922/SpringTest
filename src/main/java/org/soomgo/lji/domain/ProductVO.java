package org.soomgo.lji.domain;

public class ProductVO {
	private String name;
	private int price;
	private int stock;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public ProductVO() {
		super();
	}
	public ProductVO(String name, int price, int stock) {
		super();
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "ProductVO [name=" + name + ", price=" + price + ", stock=" + stock + "]";
	}
	
	
}
