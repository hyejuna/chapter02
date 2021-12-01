package com.javaex.ex08;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods("니콘", 400000);
		camera.showInfo();
		System.out.println(camera.toString());
		
		Goods cup = new Goods("머그컵",2000);
		cup.showInfo();
		System.out.println(cup.toString());
	}

}
