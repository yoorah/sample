package Day12.Ex02_Comparable;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StudentList {

	public static void main(String[] args) {
		List<Student> studentList = new LinkedList<>();
		
		Student s1 = new Student("김휴먼", 20);
		Student s2 = new Student("이휴먼", 30);
		Student s3 = new Student("나휴먼", 40);
		Student s4 = new Student("황휴먼", 15);
		Student s5 = new Student("박휴먼", 23);
		Student s6 = new Student("윤휴먼", 45);
		Student s7 = new Student("구휴먼", 55);
		Student s8 = new Student("김휴먼", 50);
		Student s9 = new Student("안휴먼", 55);
		Student s10 = new Student("정휴먼", 18);
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		studentList.add(s6);
		studentList.add(s7);
		studentList.add(s8);
		studentList.add(s9);
		studentList.add(s10);

		
		// 이름순
		Collections.sort(studentList);
		
		for (Student student : studentList) {
			System.out.println(student.name + " : " + student.age);
		}
	
	}
}
