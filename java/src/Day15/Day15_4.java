package Day15;

import java.awt.Toolkit;
import java.util.Scanner;

public class Day15_4 {
	
	public static void main(String[] args) {
		
		// 멀티스레드 제어 
		// p.544 
			// 1. Thread.sleep( 밀리초 ) : 현 스레드 일시정지
				// 밀리초 : 1000/1초
				// 무조건 일반예외가 발생 하므로 try{}catch( Exception e ){} 같이 사용
//		Toolkit toolkit = Toolkit.getDefaultToolkit();
//		for( int i = 0 ; i<10 ; i++ ) {
//			//*i는 0부터 10미만까지 1씩증가반복 [ 0~9 =>10회반복]
//			toolkit.beep(); // 비프음 호출
//			// 스레드 잠깐 일시정지 하자
//			try { Thread.sleep(3000); }catch( Exception e ) {}
//				// 3000밀리초 => 3초
//		}
		// p.545 
			// 2. 스레드 안전하게 종료 
		// 1. 스레드클래스 객체 선언 
		PrintThread1 printThread = new PrintThread1();
		
		while( true ) { // 무한루프 
			Scanner scanner = new Scanner(System.in);
			System.out.println(" 1.멀티스레드실행 2.멀티스레드종료 ");
			int ch = scanner.nextInt();
			if( ch == 1 ) {
				printThread.start();// 2. 스레드객체내 멀티스레드 실행
			}else if( ch == 2 ) {
				printThread.setStop(true); // 3. 스레드를 안전하게 중지
			}
		}
		
	}

}









