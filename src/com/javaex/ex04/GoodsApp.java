package com.javaex.ex04;

public class GoodsApp {

	public static void main(String[] args) {


		Goods camera = new Goods("니콘",400000);
		camera.showInfo();
		
		Goods computer = new Goods();
		computer.setName("LG그램");
		computer.setPrice(900000);
		computer.showInfo();
		
		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);
		cup.showInfo();
		
		

	}

}
