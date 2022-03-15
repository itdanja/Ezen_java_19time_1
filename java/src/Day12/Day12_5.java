package Day12;

import java.util.ArrayList;
import java.util.Scanner;

public class Day12_5 {
	
	// 접근제한자 [ 사용 범위 ] 
		// private : 현재 클래스내에서 사용 가능 
		// public : 프로젝트내 모든 클래스내에서 사용 가능 
	
	// main밖에 선언하는 이유 : 다른 클래스 사용하기 위해서 
	public static ArrayList<Bank> banklist = new ArrayList<>();
// 접근제한자 정적변수  클래스명 < 클래스명> 객체명 = new 생성자명<>();
	// static : main메소드와 관련없이 프로그램 시작시 메모리할당 / 프로그램 종료시 메모리 초기회ㅏ
	public static void main(String[] args) {
		
		Bank call = new Bank(); // 빈생성자로 객체 선언 [ 메소드호출용 ]
		// 파일불러오기 
		call.파일불러오기();
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			try { // 예외처리 
				System.out.println(" **** 계좌프로그램 **** ");
				System.out.print(" 1.계좌등록 2.입금 3.출금 4.잔고 선택 : ");
				int ch = scanner.nextInt(); // 정수입력받는메소드
				// 만일 문자입력시 예외[오류]처리 발생 
				if( ch == 1 ) { call.계좌등록(); }
				else if( ch ==2 ) { call.입금(); }
				else if( ch == 3 ) { call.출금(); }
				else if( ch == 4 ) { call.잔고(); }
				else { System.err.println(" 알림]] 알수 없는 번호입니다.");}
			}catch( Exception e ) { // 만약에 try{} 예외 발생하면
				System.err.println(" 알림]] 숫자 입력만 가능합니다. ");
				scanner = new Scanner(System.in); // 기존 내용물 초기화
			}
		}
		
	}
}
