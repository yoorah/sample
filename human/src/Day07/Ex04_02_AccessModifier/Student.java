package Day07.Ex04_02_AccessModifier;

import Day07.Ex04_01_AccessModifier.Person;

public class Student extends Person {
	
	public Student() {
		super();
		
	}

	public Student(String name, int height, int age, int weight) {
		super(name, height, age, weight);
		// TODO Auto-generated constructor stub
	}


	public void defaultSetting() {
		name = "이름없음";
		height = 160;
		 // age = 20;     // default 라서 같은 패키지에서 접근 가능
		 // weight = 50;  // private 이라서 해단 클래스에서만 점근 가능
		setAge(20);
		setWeight(50);
	}

}
