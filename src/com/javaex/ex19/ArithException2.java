package com.javaex.ex19;

import java.util.Scanner;

public class ArithException2 {

	public static void main(String[] args) {

		double result;
		int num;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		try {
			result = 100/num; // 문제 생길 코드
			System.out.println(result);
		} catch(ArithmeticException e) { // java에서 미리 만들어 놓은 예외처리 클래스
			System.out.println("catch 영역"); // 예외 발생시 오는 영역
		} finally {
			System.out.println("finally 영역"); // 예외 발생하든, 안발생하든 오는 영역
		}
		
		
		
		
		sc.close();

	}

}
