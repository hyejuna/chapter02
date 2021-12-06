package com.javaex.ex19;

public class NullPointException {

	public static void main(String[] args) {
		String str = new String("안녕하세요");
		str = null; //주소 없앰
		
		try {
			System.out.println(str.toString());
		} catch(Exception e) {
			System.out.println("주소값이 없습니다.");
		}
		

	}

}
