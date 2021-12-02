package com.javaex.ex15;

public class Circle extends Shape {
	
	private int radius;

	
	
	public Circle() {
		super();
	}

	public Circle(String lineColor, String fillColor, int radius) {
		super(lineColor, fillColor);
		this.radius = radius;
	}

	
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	
	
	
	public void draw() {
		System.out.println("선색:" + super.getLineColor() + " 면색:" + super.getFillColor() + " 반지름:" + this.radius + " 원을 그렸습니다.");
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getLineColor()=" + getLineColor() + ", getFillColor()=" + getFillColor()
				+ "]";
	}
	
	

}
