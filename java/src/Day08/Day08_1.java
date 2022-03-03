package Day08;

public class Day08_1 {

	public static void main(String[] args) {
	
		// p.212 : 클래스 [ 객체지향 프로그래밍 ] 
			// 객체란? 물리적으로 존재하거나 추상적으로 생각 할수 있는 것 
			//		  중에서 자신의 속성을 가지고 있으면서 식별 가능한 것
			// 예) 사람 객체 
			//			이름 , 나이 => 속성 -> 필드
			//			웃다 , 걷다 => 동작 -> 메소드
			// 예) 자동차 객체
			//			색깔 , 속도 => 속성 -> 필드
			//			달린다,멈춘다=> 동작 -> 메소드 
		
		// p.215
			// 개발자[작성] ---> 클래스[설계도] ----> 인스턴스[객체]
		
		// p.219 예1) 클래스 선언 , 객체 선언 
		
		// 객체 선언시 [ 4가지 ]
		Student s1 = new Student();
		// 1. Student : 클래스 이름 [ 설계도 ]
		// 2. s1 : 객체명 [ 아무거나 ]
		// 3. new : 메모리할당 [ 객체 선언시 필수 ]
		// 4. Studnet() : 생성자 [ 객체 생성시 기본값 ]
		System.out.println(" s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println(" s2 변수가 Student 객체를 참조합니다.");
		
		//* Student 클래스를 이용해서 s1 객체 생성 
		//* Student 클래스를 이용해서 s2 객체 생성 
		// s1과 s2 클래스[설계] 동일하지만 서로 다르다.
		
		// p.227 객체 선언
		Car mycar = new Car();
		// 1. Car : 클래스이름[설계도]
		// 2. mycar : 객체이름[아무거나]
		// 3. new : 메모리 할당 [ 객체생성시 필수]
		// 4. Car() : 생성자[ 객체생성시 초기화 ]
		
		// 객채내 필드에 접근하기 [ 객체명.필드명 -> 필드 호출 ] 
		System.out.println(" mycar 제작회사 : " + mycar.company );		
		System.out.println(" mycar 모델명 : " + mycar.model);
		System.out.println(" mycar 색깔 : " + mycar.color );
		System.out.println(" mycar 최고속도 : " + mycar.maxSpeed);
		System.out.println(" mycar 현재속도 : " + mycar.speed );
		
		// 필드 값 변경 
		mycar.speed = 60;
		System.out.println(" mycar 수정된 현재속도 : " + mycar.speed);
		
		Car yourcar = new Car();
		System.out.println(" yourcar 현재속도 : " + yourcar.speed);
		
		// 생성자로 객체 만들기 
		Car car1 = new Car(); // 1번생성자 
		Car car2 = new Car("검정",3000); // 2번생성자
		
		System.out.println(" 1번 생성자 car1 : " + car1.cc );
		System.out.println(" 2번 생성자 car2 : " + car2.cc );
		
		
		
		
		
		
		
		
	}
}





