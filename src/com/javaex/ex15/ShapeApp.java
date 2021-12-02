package com.javaex.ex15;

public class ShapeApp {

	public static void main(String[] args) {
		
		//자식 세부 항목 사용 안해도 되고 묶어서 하나로 관리하는게 더 중요할때 오버라이딩 사용!!(이름같은 메소드 있어야 함)
		Shape[] sArray = new Shape[3];
		
		Shape r01 = new Rectangle("빨강", "빨강", 5, 5);
		//r01.draw();
		
		Shape c01 = new Circle("노랑", "노랑", 100);
		//c01.draw();
		
		Shape t01 = new Triangle("파랑", "파랑", 20, 20);
		//t01.draw();
		
		sArray[0] = r01;
		sArray[1] = c01;
		sArray[2] = t01;
		
		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw();
		}
		
		//자식 세부항목 필요할때 -> 강제 형변환:다운캐스팅  (업캐스팅은 자동형변환)
		((Circle)c01).getRadius();
		
		
		
		

	}
}
