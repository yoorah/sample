package Day07.Ex06_UpDownCasting;

public class DownCasting {
	
	public static void main(String[] args) {
		// 다운캐스틴 (강제 형 병환)
		// : 전제 조건 - 업캐스틴
		//  다운캐스틴은 업캐스틴된 부모 객체를 자식 객체로 변환화는 것
		// -업캐스팅   :(부모) ← (자식)
		// -다운캐스팅   :  (자식) ← (부모)
		
		// 업캐스팅
		Person person = new Student("김휴먼", 20, 1, "산업디자인과");
		
		System.out.println(person);
		System.out.println(person.work());
		
		// 다운캐스팅
		Student student = (Student) person;
		
		System.out.println("grade  : " +  student.grade);
		System.out.println("major  : " +  student.major);
		
	}

}
