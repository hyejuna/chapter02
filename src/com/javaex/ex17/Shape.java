package com.javaex.ex17;

public abstract class Shape {
	
	private String lineColor;
	private String fillColor;
	
	
	
	public Shape() {
	}
	public Shape(String lineColor, String fillColor) {
		this.lineColor = lineColor;
		this.fillColor = fillColor;
	}
	
	
	
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
	
	
	@Override
	public String toString() {
		return "Shape [lineColor=" + lineColor + ", fillColor=" + fillColor + "]";
	}
	
	public void draw() {
		System.out.println("선색:" + lineColor + " 면색:" + fillColor +  " 도형을 그렸습니다.");
	}
	
	/*
	public double area() {
		return 0.0;
	}  오버라이딩 위해 부모에 껍데기만 만들었는데 자식에서 얘 빠지면 오류 확인 안 됨..
	*/
	
	public abstract double area(); //부모클래스에서 자식에게 필요하지만 부모는 넣을 내용이 없는 메소드 껍데기만 만드는 명령어 abstract -> 자식에서 이 코드 빠지면 자식 클래스 오류냄.
	                               //얘만 있으면 메인에서 Shape생성자 사용했을때 문제 생김. -> 메모리에 단독으로 올라가면 안되는 미완성 클래스임 -> 클래스에도 abstract
	

}
