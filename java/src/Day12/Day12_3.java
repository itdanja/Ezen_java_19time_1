package Day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Day12_3 {
	
	// console 사용한 메모리[저장] 프로그램 종료되면서 사라짐[초기화]
	// console 사용한 메모리 -> 영구저장 -> 파일처리 
	public static void main(String[] args) {
	
		// 파일처리
		try { // 만일 예외가 없으면 try 그대로 실행 만약에 try중 오류가 발생하면 catch 이동 
			// 1. FileOutputStream : 파일출력 클래스 [ 일반예외 발생 ( 무조건처리 ) ] 
			FileOutputStream outputStream = new FileOutputStream("D:/java/자바파일.txt");
			// 2. 파일에 작성할 내용 												// 파일경로/파일명.확장자 
			String 내보내기 = "자바에서 쓴 내용";
			// 3. 파일쓰기 
			outputStream.write( 내보내기.getBytes() ); // 문자열.getBytes() : 문자열 --> 바이트열 변환
			// * 파일처리시 스트림 사용
			// 스트림[ stream ] : 프로그램[자바] ------> 스트림(통신) -----> 외부[키보드,파일,네트워크 등]
			// 스트림[ 통신단위 : 바이트 ] // bit -> byte -> kbyte -> mb -> gb
		}
		catch( Exception e ) {
			// Exception : 예외중 슈퍼클래스 [ 모든 예외를 저장할수 있는 클래스 ] 
			System.out.println(" 파일 저장중 오류 발생 : "+e);
		}
		
		// 파일 입력 [ 파일 ---> 자바 ]
		try {
			// 1. 파일입력클래스 객체 선언 
			FileInputStream inputStream = new FileInputStream("D:/java/자바파일.txt");
			// 2. 배열 선언 
			byte[] bytes = new byte[1000]; // 1000개 바이트를 저장할수 있는 배열 
			// 3. 파일 읽어와서 배열에 저장 
			inputStream.read( bytes );
			// 4. 바이트 -> 문자열 변환 
			System.out.println("파일내 내용 : " + new String(bytes) );
		}
		catch( Exception e ) {
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}



