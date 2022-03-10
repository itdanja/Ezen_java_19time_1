package Day10;

import java.util.Scanner;

public class Day10_3 {
	
	// 계좌 프로그램 [ 클래스 , 상속 ] 
		// 은행 클래스 : 계좌등록 , 예금 , 출금 , 이체 , 잔고 등 
		// 국민은행 extends 은행
		// 신한은행 extends 은행
		// 하나은행 extends 은행
	
	// main 위에 배열을 선언하는 이유  : main메소드 외 프로그램 모든곳에서 사용 변수 
		// 전역변수 <----> 지역변수( {} 괄호내에서 선언된 변수는 {} 밖에서 사용불가능 ) 
		// static : 전역 변수 만들기 
			// 프로그램 시작시 메모리할당--> 프로그램 종료시 메모리초기화
		// final : 고정 변수 만들기 
	static 은행[] 계좌리스트 = new 은행[1000];
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("1.계좌생성 2.예금 3.출금 4.이체 5.잔고확인");
			int ch = scanner.nextInt();
				// 메소드 호출하는 방법
				은행 bank = new 은행(); // 1.객체 생성 
			if( ch == 1 ) { bank.계좌등록(); }// 2.메소드 호출
			else if( ch == 2 ) { bank.예금(); }
			else if( ch == 3 ) { bank.출금(); }
			else if( ch == 4 ) { bank.이체(); }
			else if( ch == 5 ) { bank.잔고(); }
			else { System.out.println("알림]] 알수없는 번호입니다.");}
			
		}
	} // main end
} // class end 

















