package Day11;

public class Day11_3 {
	
	public static void main(String[] args) {
	
		// p.370 인터페이스 
			// 오락기[ 버튼 ] 핸드폰[ 버튼 ] 키오스크[ 버튼 ]
			// 개발코드와 객체가 서로 통신하는 접점역할
			// 
		RemoteControl rc; // 인터페이스 객체
		// 인터페이스명 객체명;
		rc = new Television(); // 해당 인터페이스에 텔레비전 클래스 메모리할당
		rc = new Audio(); // 해당 인터페이스에 오디오 클래스 메모리할당 
		// 인터페이스는 여러개의 클래스로부터 메모리할당 가능 
		
		// 클래스를 이용한 객체 생성 
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc2 = tv; // 인터페이스객체에 클래스객체 대입 
		Searchable searchable = tv; // 인터페이스객체에 클래스객에 대입 
		
		
		
	}
}
