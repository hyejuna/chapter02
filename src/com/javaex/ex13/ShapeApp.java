package com.javaex.ex13;

public class ShapeApp {

	public static void main(String[] args) {
		
		Rectangle r01 = new Rectangle("빨강", "노랑", 5, 5);
		Rectangle r02 = new Rectangle("파랑", "노랑", 10, 20);
		Rectangle r03 = new Rectangle("빨강", "빨강", 55, 77);
		
		//r01.draw();
		//r02.draw();
		//r03.draw();

		Rectangle[] rArray = new Rectangle[3];
		
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		//for(int i=0; i<rArray.length; i++) {
		//	System.out.println(rArray[i].getLineColor());
		//}
//////////////////////////////////////////////////////////////////////
		Circle[] cArray = new Circle[3];
		
		Circle c01 = new Circle("보라", "빨강", 15);
		Circle c02 = new Circle("파랑", "하늘", 5);
		Circle c03 = new Circle("초록", "연두", 7);	
	
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		for(int i=0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		
		Triangle[] tArray = new Triangle[3];
		
		tArray[0] = new Triangle("빨강", "주황", 10, 10);
		tArray[1] = new Triangle("초록", "연두", 5, 7);
		tArray[2] = new Triangle("파랑", "남색", 4, 2);
		
		for(int i=0; i<cArray.length; i++) {
			tArray[i].draw();
		}
		
		
		
	}

}
