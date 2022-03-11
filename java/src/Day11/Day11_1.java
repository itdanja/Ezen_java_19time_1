package Day11;

class A{}	// 부모클래스 
class B extends A{} // A가 B에게 상속
class C extends A{} // A가 C에게 상속

class D extends B{} // B가 D에게 상속 
class E extends C{} // C가 E에게 상속

public class Day11_1 {
	public static void main(String[] args) {
		
		// p.332 다형성
			// 클래스도 기본자료형 처럼 클래스변환이 가능
			// 사용방법은 동일하지만 다양한 객체를 이용해서 다양한 실행결과
			// 상속 : 부모클래스 ---> 자식클래스    extends
			// 자식 ---> 부모 변환
		
		// p.335 자동 타입 변환
		
		B b = new B(); // A에게 상속받은 B 객체 
		C c = new C(); // A에게 상속받은 C 객체
		D d = new D(); // B에게 상속받은 D 객체 
		E e = new E(); // C에게 상속받은 E 객체
		
		A a1 = b; // 자동타입 변환 B->A 변환
		A a2 = c; // C->A변환
		A a3 = d; // D->A변환
		A a4 = e; // E->A변환
		
		B b1 = d; // D->B변환
		C c1 = e; // E->C변환 
		
		// B b3 = e; // x 부모가 아니기때문에 불가능 
		// C c2 = d; // x 부모가 아니기때문에 불가능 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
