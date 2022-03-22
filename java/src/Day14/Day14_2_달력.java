package Day14;

import java.util.Calendar;
import java.util.Scanner;

public class Day14_2_달력 {
	
	public static void main(String[] args) {
		
		달력보기(); //달력메소드 호출 
		
	} // main end 
	
	public static void 달력보기() { // 달력메소드 start
		
		Scanner scanner = new Scanner(System.in); // 입력객체 
		
		//1.달력 클래스내 현재 달력의 객체 호출
		Calendar 달력 = Calendar.getInstance();
		//2. 연도 , 월
		int year = 달력.get( Calendar.YEAR );
		int month = 달력.get( Calendar.MONTH )+1; // +1 하는이유 : 0->1월 1->2월
		
		while( true ) { // 무한루프 [ 종료조건 : 4 입력시 종료 ] 
	
			//3. 해당 월의 1일의 요일 구하기
				// 1. 해당 연도 / 월에 날짜로 변경
				달력.set(year, month-1, 1 ); // 2022년3월1일 -> 3[화요일]
			int swday = 달력.get( Calendar.DAY_OF_WEEK );
			//4. 해당 월의 마지막 일 구하기 
			int eday = 달력.getActualMaximum( Calendar.DAY_OF_MONTH); // .getActualMaximum( Calendar.DAY_OF_MONTH) : 월기준으로 해당 월에 마지막 일수
		
			
			//5. 출력
			System.out.println("---------------------"+year+"년 "+month+"월 달력------------------");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			
			//* 해당 월에 1일 출력전에 공백 채우기 
				// 만약에 1일이 화요일이면 일(공) 월(공) 
				// 만약에 1일이 목요일이면 일(공) 월(공) 화(공) 수(공) 
			for( int i = 1 ; i<swday ; i++ ) {
				// i는 1부터 해당 월의 1일의 요일전까지 
				System.out.print(" \t");
			}
			
			//6. 일수 출력 
			for( int i = 1 ; i<=eday ; i++ ) { // 1일 ~ 현재 월의 마지막 일까지
				
				System.out.print( i +"\t"); // 일 출력 
				
				// 토요일마다 줄바꿈처리 [ 7배수 ] 
				if( swday % 7 == 0 ) { System.out.println();}
					// i 기준으로 7배수를 하면 1~7 줄바꿈
					// * swday변수 요일 기존으로 7(토요일) 이면 줄바꿈 *
				swday++; // 요일 증가 
			}
			
			// 7. 메뉴 만들기 
			System.out.print("\n\n 메뉴 : 1.이전달(◀) 2.다음달(▶) 3.검색 4.종료 : ");
			int ch = scanner.nextInt();
			if( ch == 1 ) {}
			else if( ch == 2 ) {}
			else if( ch == 3 ) {
				// *추가 [ 입력받아서 출력 ]
				System.out.print(" 검색할 연도 : "); 	year = scanner.nextInt();
				System.out.print(" 검색할 월 : "); 	month = scanner.nextInt();
			}
			else if( ch == 4 ) { System.err.println(" \n\n\t\t*** 달력프로그램 종료 *** "); break; }
			else { System.err.println("알림]] 알수없는 번호입니다. ");}
			
			
		} // while end
	} // 달력메소드 end 
} // class end 








