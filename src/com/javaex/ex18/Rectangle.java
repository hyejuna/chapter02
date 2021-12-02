package com.javaex.ex18;

public class Rectangle extends Shape implements Drawable {

	private int width;
	private int height;
	
	
	
	public Rectangle() {
		super();
	}
	public Rectangle(String lineColor, String fillColor, int width, int height) {
		super(lineColor, fillColor);
		this.width = width;
		this.height = height;
	}
	
	
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
	//부모쪽에 있는거 못쓰게 하려고 같은 이름으로 재정의
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", getLineColor()=" + getLineColor()
				+ ", getFillColor()=" + getFillColor() + "]";
	}
	
	public void draw() {
		System.out.println("선색:" + super.getLineColor() + " 면색:" + super.getFillColor() + " 가로:" + this.width + " 세로:" + this.height + " 사각형을 그렸습니다.");
	}
	
	public double area() {
		double result = width * height;
		return result;
	}
	
	
	
	
}
