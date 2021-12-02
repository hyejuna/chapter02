package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {
		
		//인터페이스 예제
		//상속할때처럼 섞어쓸경우 자식에 있는 세부항목은 가려짐.
		
		/*
		Point p01 = new Point(5,7);
		p01.draw();
		System.out.println(p01.getX());
		
		Drawable p02 = new Point(114, 117);
		p02.draw();
		System.out.println(((Point)p02).getX()); 
		*/
		
		Drawable[] dArray = new Drawable[4]; 
		
		
		Drawable r01 = new Rectangle("빨강", "빨강", 5, 7);
		Drawable c01 = new Circle("파랑", "파랑", 12);
		Drawable t01 = new Triangle("노랑", "노랑", 22, 55);
		Drawable p01 = new Point(1,1);
		
		dArray[0] = r01;
		dArray[1] = c01;
		dArray[2] = t01;
		dArray[3] = p01;
		
		for(int i=0; i<dArray.length; i++) {
			dArray[i].draw();
		}
		
		for(int i=0; i<dArray.length; i++) {
			if(dArray[i] instanceof Shape ) { // instanceof 연산자: dArray[i]가 Shape틀에서 태어났냐? (Shape, Drawable, Rectangle 모두 만족함) 
				System.out.println(((Shape)dArray[i]).area());
			}
		}
		
	}
}
