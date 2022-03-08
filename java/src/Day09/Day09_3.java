package Day09;

public class Day09_3 {
	
	public static void main(String[] args) {
		
		// 메소드  = 함수 
			//1.리턴타입 
			//2.메소드이름 
			//3.매개변수선언 
			//4.메소드 실행블록 
		
		// p.250~251 예제코드1 
		// 1. 객체 생성 [ 인수0개 전달하는 생성자로 객체 선언 ] 
		Calculator myCalc = new Calculator();
		// 2. 메소드 호출 [ . : 접근연산자 사용 ]
			// 객체명.필드명혹은메소드명
		System.out.println(" -- 객체내 메소드 호출합니다. --");
		myCalc.powerOn(); // 객체명.메소드명();
			//* myCalc 객체내 메소드 호출 
		
		// 3. plus 메소드 호출 
		int result1 = myCalc.plus( 5 , 6);
		System.out.println("result1 : "+result1);
		
		// 4. divide 메소드 호출 
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2 : " + result2 );
		
		// 5. powerOff 메소드 호출 
		myCalc.powerOff();
		
	}
}








