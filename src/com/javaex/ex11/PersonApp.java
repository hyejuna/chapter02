package com.javaex.ex11;

public class PersonApp {

	public static void main(String[] args) {
		Person p01 = new Person("정우성",45);
		
		Person p02 = new Person();
		p02.setName("이정재");
		p02.setAge(46);
		
		//System.out.println(p01.toString());
		//System.out.println(p02.toString());
		
		p01.showInfo();
		p02.showInfo();
		
		Student s01 = new Student();
		s01.setName("강호동");
		s01.setAge(55);
		s01.setSchoolName("서울고등학교");
		
		s01.showInfo();
		
		Student s02 = new Student("서장훈", 50, "강남고등학교");
		s02.showInfo();	
		System.out.println(s02.toString());
	}

}
