package Day09;

public class Day09_4 {
	
	public static void main(String[] args) {
		
		//p.256~257 메소드 반환타입[return문]
			// 1. void : 리턴값이 없는 메소드 
		
		// 1. 객체 생성  [ 기본생성자로 객체 생성 ]
		Car2 mycar = new Car2();
		// 2. 메소드 호출  [ 메소드를 통해서 필드 변경 ] [ 간접적 ]
		mycar.setGas( 5 ); // 객체내 gas 필드에 5 저장 
		// * 필드를 이용한 변수 저장 
		mycar.gas = 5; // 필드로 바로 저장 [ 직접적 ( 비추천 ) ]
		
		// 3. 메소드 호출 
		boolean gasState =  mycar.isLeftGas();
		if( gasState ) {
			System.out.println("출발합니다.");
			mycar.run();
		}
		
		// 4. 메소드 호출 
		if( mycar.isLeftGas() ) {
			// 만약에 isLeftGas 메소드 반환값이 true 이면 
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입해주세요");
		}
		
	}

}




