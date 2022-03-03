package Day08;

public class Car { // 클래스선언 
	
	//1. 필드(속성) : 데이터 저장하는곳
	String company ="현대자동차";
	String model ="그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed; 
	int cc;
	// int 초기 값 안했을경우 0
	// String 초기 값 안했을경우 null
	// boolean 초기 값 안했을경우 false
	// double 초기 값 안했을경우 0.0
	
	//2. 생성자 : 객체 생성시 초기화 곳 
	
	// 1.빈 생성자
	Car(){}
	// 2. 2개의 필드값을 받는 생성자 
	Car( String color , int cc){
		this.color = color;
		this.cc = cc;
		// this.필드명 : 현재 필드명 접근가능
	}
	
	
	//3. 메소드 : 객체 동작

}








