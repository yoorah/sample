package Day11.Ex04_WildCard;

import java.util.Iterator;

import javax.swing.plaf.FontUIResource;

public class Course<T> {
	
	private String name;    // 과정명
	private T[] students;   // 수강생들
	
	public Course(String name, int capacity) {
		this.name = name;
		// Object 타입의 배열 생성
		//
		students = (T[]) new Object[capacity];
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T[] getStudents() {
		return students;
	}

	public void add(T t) {
		//
	for (int i = 0; i < students.length; i++) {
		if( students[i] == null ) {
			students[i] = t;
			break;
	}
		
	}
		
	}
	}
   
