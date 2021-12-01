package com.javaex.ex10;

public class Goods {
	//필
	private String name;
	private int price;
	
	//생
	public Goods() {
		
	}
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//메 g/s
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	//일반
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
	

}
