package Day14;

import java.util.Calendar;

public class Day14_2_달력 {
	
	public static void main(String[] args) {
	
		//1.달력 클래스내 현재 달력의 객체 호출
		Calendar 달력 = Calendar.getInstance();
		//2. 연도 , 월
		int year = 달력.get( Calendar.YEAR );
		int month = 달력.get( Calendar.MONTH )+1;
			// +1 하는이유 : 0->1월 1->2월
		//3. 해당 월의 1일의 요일 구하기 
		//4. 해당 월의 마지막 일 구하기 
		
		//5. 출력
		System.out.println("-------"+year+"년 "+month+"월 달력-----------------");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		//6. 일수 출력 
		for( int i = 1 ; i<=31 ; i++ ) { // 1~31일까지
			
			System.out.print( i +"\t"); // 일 출력 
			
			// 토요일마다 줄바꿈처리 [ 7배수 ] 
			if( i % 7 == 0 ) { System.out.println();}
			
		}
		
	}
}
