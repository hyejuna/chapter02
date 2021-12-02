package com.javaex.ex11;

public class Student extends Person {
	
	//필드
	private String schoolName;

	//생성자	
	public Student() {
		System.out.println("Student()");
	}

	public Student(String schoolName) {
		this.schoolName = schoolName;
		System.out.println("Student(1)");
	}
	
	public Student(String name, int age, String schoolName) {
		/* private이라 자식에선 부모 필드 못읽음
		super.name = name;
		super.age = age;
		*/ 
		
		/*
		super(); //부모 생성자 실행. 이 코드 안써줘도 이 값 디폴트로 실행됨!!
		super.setName(name);
		super.setAge(age);
		*/
		
		super(name,age); // 위 세줄 코드랑 동일함
		this.schoolName = schoolName;
		System.out.println("Student(3)");
	}

	//메소드 g/s
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	//메소드 일반
	
	
	public void showInfo() {
		System.out.println("*****************************");
		System.out.println("이름: " +super.getName());
		System.out.println("나이: " +super.getAge());
		System.out.println("학교: " +this.schoolName);
		System.out.println("****************************");
	}

	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}

	


	
	
	
}
