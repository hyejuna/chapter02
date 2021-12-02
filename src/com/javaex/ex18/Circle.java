package com.javaex.ex18;

public class Circle extends Shape implements Drawable {
	
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
	
	public double area() {
		double result = radius * radius * 3.14;
		return result;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getLineColor()=" + getLineColor() + ", getFillColor()=" + getFillColor()
				+ "]";
	}
	
	

}
