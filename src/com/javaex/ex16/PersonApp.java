package com.javaex.ex16;

public class PersonApp {

	public static void main(String[] args) {
		
		Person p01 = new Person("정우성", 41);
		p01.showInfo();
		
		Student s01 = new Student("이정재", 46, "서울고등학교");
		s01.showInfo();
		
		Person ps01 = new Student("강호동", 51, "마산고등학교"); //따라가면 Person이라 Student 가려져서 ps01.하면 Student에만 있는 메소드는 안보임
		ps01.showInfo(); // 같은 이름 가진 메소드는 자식꺼가 적용됨!!!(부모꺼에 overriding 되어서)

	}

}
