package Day11.Ex03_Generic;

class A {  }

class B extends A { }
class C extends B { }

// A -> B
// B -> C

// 타입지정이 가능한 클래스 : B, C
class D <T extends B> {
	
	private T t;
	
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}

}

public class LimitedTypeClass {
	public static void main(String[] args) {
		
		D<B> d1 = new D<B>();
		D<C> d2 = new D<C>();
		// D<A> d3 = new D<A>(); // A타입은 제한됨
		// D 클래스의 타입 매개변수를 B 클래스로 체한하고 있기 때문에,
		// D 클래스의 자식 클래스인 B 와 C만 가능하다
		
		d1.setT( new B() );
		
		d2.setT(new C() );
		
		d1.setT( new C() );     // d1<B> <-- 자식객체인 C 대입 가능 (업캐스팅)
		// d2.setT( new B() );     // d2<C> <-- 부보객체인 B 대입 불가 
		
		//
		//
		D d4 = new D();     // D<B> d4 = new D<>();
		d4.setT( new B() );
		d4.setT( new C() );
		
		
	}
}
	



