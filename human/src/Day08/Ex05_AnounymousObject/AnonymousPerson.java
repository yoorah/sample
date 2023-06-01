package Day08.Ex05_AnounymousObject;

public class AnonymousPerson {

	// 
	Person preson1 = new Person();
	
	void work(; ) {
		System.out.println();
		System.out.println("프로그래밍을 합니다.");
		System.out.println();
	}
} ;

Person person2 = new Person( ) {
	void work( ) {
		System.out.println(name +"(" + age +")");
		System.out.println("요리를 합니다");
		System.out.println();
	}
};

   void method( ) {
	   person1.name = "김휴먼";
	   person1 = 20;
	   person1.work();
	   
	   person2.name = "백종원";
	   person2.age = 40;
	   person2.work();
	   
   }   

}
