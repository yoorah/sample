package Day11.Ex03_Generic;


class Student { }
class Developer { }

class Person  { 

   private Object object = new Object();
   
   public Object getObject( ) {
	   return object;
   }
   
   public void setObject(Object object) {
     }
 	   
   }


public class ObjectProduct {
	
          public static void main(String[] args) {
        	  
        	  Person person1 = new Person();
        	  
        	  person1.setObject( new Student());
        	  person1.setObject( new Developer());
        	  
        	  Student student = (Student) person1.getObject();
        	  
              // 다양한 타입을 사용하기 위해서
        	  // Object 타입으로 이느
        	  //
        	  //
        	  
			
		}
	

}


