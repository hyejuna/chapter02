package com.javaex.ex08;

public class Goods {
	
	private String name;
	private int price;
	//private static int totalCount;
	
	
	public Goods() {
		//totalCount++;
	}
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		//totalCount++;
	}
	
	
	
	
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
	/*
	 public static int getTotalCounts() {
		return totalCount;
	}
	public static void setTotalCounts(int totalCounts) {
		Goods.totalCount = totalCounts;
	}
	*/
	public void showInfo() {
		System.out.println("상품명: "+ this.name);
		System.out.println("가격:" + this.price);
	}
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price +"]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	


}
