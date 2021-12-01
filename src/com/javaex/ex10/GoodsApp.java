package com.javaex.ex10;

public class GoodsApp {

	public static void main(String[] args) {

		Goods[] goodsArray = new Goods[3];
	
		Goods camera = new Goods("니콘",400000);
		goodsArray[0] = camera;
		// 둘다 같은 주소 저장해서 camera.이랑 goodsArray[0].이랑 같아짐
		
		Goods cup = new Goods("머그컵",2000);
		goodsArray[1] = cup;
		
		
		Goods computer = new Goods("LG그램",900000);
		goodsArray[2] = computer;
	
		
		System.out.println(camera.toString());
		System.out.println(goodsArray[0].toString());
		System.out.println(goodsArray[1].toString());
		System.out.println(goodsArray[2].toString());
		
		int count=0;
		for(int i=0; i<goodsArray.length; i++) {
			if(goodsArray[i] != null) { //-> 빈 배열 넘기는거
				System.out.println(goodsArray[i].toString());
				count++;		
			}
			
		}
		
		System.out.println(count);
		
		//이름만 출력
		for(int i=0; i<goodsArray.length; i++) {
			System.out.println(goodsArray[i].getName());
		}
		
	}

}
