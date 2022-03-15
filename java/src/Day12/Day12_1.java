package Day12;

public class Day12_1 {
	
	public static void main(String[] args) {

		// p.444 : 예외처리 
			// 예외 : 사용자조작 혹은 개발자 가 프로그램 오류 발생 
			// 목적 : 프로그램 오류 발생시 프로그램 종료 되기때문에 안전성문제
			// 해결책 : 오류발생 하더라도 프로그램 정상실행 
			// 방법 : try{ } catch( 예외클래스 객체명 ){}
			// 종류 : 1.일반예외 2.실행예외
				//     일반예외검사 --> 컴파일[실행] --> 실행예외검사
				//	일반예외 : 오류가 발생 가능성 높은 코드 -> 개발자에게 강제적으로 예외처리
				//  실행예외 : 실행문제가 없지만 사용시에 예상치 못한 오류 -> 개발자가 판단 예외처리 
		// p.446 
		try {  // 예외가 발생할것 같은 코드  [ 만일 예외발생O -> catch / 예외발생x -> try{}코드 모두실행
			String data = null; // 문자열에 null 대입 
			System.out.println( data.toString() ); // null 정보 출력
			// NullPointerException 오류 발생이유 : null 정보가 없기때문에 출력 불가능
		} catch( NullPointerException 객체명 ) { // 만약에 예외이면
			//  예외클래스명[ 예외처리할 클래스명] 
			System.out.println(" 오류 발생 사유 : "+ 객체명);
		}
		
		// p.447
		try { // 예외가 발생하면 catch로 이동 아니면 try{} 실행 
			String data1 = args[0];
			String data2 = args[1];
			System.out.println("args[0] : " + data1 );
			System.out.println("args[1] : " + data2 );
				// ArrayIndexOutOfBoundsException 오류 발생이유 : 인덱스가 없기때문에 
		}catch( Exception e  ) {
			System.out.println(" 오류 발생 사유 : " +  e );
		}
		
		// p.449
		try { // 만약에 예외[오류]가 있으면 catch로 이동 // 아니면 try{} 실행 
			String data1 = "100";
			String data2 = "a100";
			int value1 = Integer.parseInt(data1); // Integer.parseInt( 문자열 ) : 문자열 -> 숫자열 변환
			int value2 = Integer.parseInt(data2); // a100 -> 숫자열 변환 불가능 // 예외발생
			// 오류 발생 사유 :  "100" 문자열은 숫자열로 변환이 가능 하지만 "a100"문자열은 숫자열로 변환이 불가능 
			int result = value1 + value2;
			System.out.println( data1 +"+"+data2+"="+result);
		}
		catch( NumberFormatException e ) {
			System.out.println(" 오류 발생 사유 : " + e) ;
		}
		
		// p.453
		
	}
}







