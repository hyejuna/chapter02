package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {

		Point p1 = new Point(3,6);
        p1.draw();
		
		Point p2 = new Point();
		p2.setX(10);
		p2.setY(23);
		p2.draw();
		
		Point p3 = new Point(55,65);
		p3.draw(true);
		p3.draw(false);
		p3.draw();
		

	}

}
