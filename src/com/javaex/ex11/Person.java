package com.javaex.ex11;

public class Person {
	//필드
	private String name;
	private int age;
	
	//생성자
	public Person() {
		System.out.println("Person()");
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person(2)");
	}
	
	//메소드 g/s
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		if(age<1) {
			return 1;
		} else {
			return age;
		}
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//메소드 일반
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public void showInfo() {
		System.out.println("=======================");
		// name this.name getName() this.getName() 다 가능
		System.out.println("이름: " +this.name);
		System.out.println("나이: " +this.getAge());
		System.out.println("=======================");
		System.out.println("");
	}
	
	
	
	

	

}
