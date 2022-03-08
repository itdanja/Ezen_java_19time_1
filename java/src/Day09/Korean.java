package Day09;

public class Korean {
	// Korean 클래스 선언 
	
	// 1. 필드 
	String nation ="대한민국"; // 국적 변수에 대한민국 데이터 미리 대입 
	String name; // 이름 변수 선언만 초기화[x] => null 
	String ssn; // 주민등록번호 변수 선언만 초기화[x] => null
	// 2. 생성자
		// 1. 생성자의 이름은 클래스의 이름과 동일 선언 
		// 2. 인수 개수에 따라 여러개 생성자 선언 가능 
		// 3. 외부로부터 생성자 호출시 인수 개수에따라 자동 호출 
		// 4. 외부로부터 인수를 전달받아 내부변수에 저장
	// 1.인수0개를 받는 생성자 
	public Korean() {
		// 내용물x
	}
	// 2.인수2개를 받는 생성자 
	public Korean( String n , String s ) {
				// 외부변수 n , s 전달받기
		name = n;
		ssn = s;
		// 내부변수 => 현재 클래스내 선언된 변수
		// 외부변수 => 생성자 호출시 전달된 변수
		// 내부변수 = 외부변수 
	}
	// 3.인수3개를 받는 생성자 
	public Korean( String nation , 
			String name , String ssn ) {
				// 외부로부터 전달받은 변수 = 인수 
				// nation , name , ssn 
		
		this.nation = nation;
		this.name = name;
		this.ssn = ssn;
		// 현재 클래스내 필드에도 nation, name,ssn
		// * 외부변수 = 내부변수 이름 충돌 
		//	this.필드명 = 내부변수 호출 방법
	}
	
	// 3. 메소드 
	
	
}


