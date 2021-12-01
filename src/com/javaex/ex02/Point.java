package com.javaex.ex02;

public class Point {
	private int x;
	private int y;
	
	
	
	
	
	public Point() {
		System.out.println("Point()");
	}
	public Point(int x) {
		this.x=x;
		System.out.println("Point(1)");
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point(2)");
	}
	
	
	
	
	
	public void setX(int x) {
		this.x=x;
	}
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	public int getY() {
		return y;
	}
	
	
	
	public void draw() {
		System.out.println("점[x=" +x+ ", y=" +y+"]을 그렸습니다." );
	}
	//메소드 오버로딩
	public void draw(boolean action) {
		if(action==true) {
			System.out.println("점[x=" +x+ ", y=" +y+"]을 그렸습니다." );
		} else if(action==false) {
			System.out.println("점[x=" +x+ ", y=" +y+"]을 지웠습니다." );
		} else {
			System.out.println("잘못된 입력");
		}
		
	}
}
