package com.javaex.ex20;

import java.io.IOException;

public class FileManager {
	
	//메소드 일반
	public void readFile() throws IOException{
		System.out.println("강제 예외 발생");
		throw new IOException();
	}

}
