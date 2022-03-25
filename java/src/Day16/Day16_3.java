package Day16;

import java.util.ArrayList;
import java.util.LinkedList;

public class Day16_3 {
	
	public static void main(String[] args) {
		
		// p.564
		// LinkedList 클래스 
		// 1. Arraylist 클래스 객체 선언 
		ArrayList<String> list1 = new ArrayList<>();
		// 2. LinkedList 클래스 객체 선언 
		LinkedList<String> list2 = new LinkedList<>();
		// 3. 시간 변수
		long startTime;
		long endTime;
		// 4. 처리 
		startTime = System.nanoTime(); // 현재시간을 나노시간으로 호출 
								// 나노초 : 10억/1초
		for( int i = 0 ; i<10000 ; i++ ) {
			list1.add( 0 , i+"" );	// 리스트1에 i번째 저장 
			// 정수를 문자열로 변환하는 방법 : 1. String.valueOf(정수);  2.정수+"" 
		}
		endTime = System.nanoTime();	// 현재시간을 나노시간으로 호출 
		// 5. 걸리는 시간 
		System.out.println(" Arraylist 가 10000개 저장하는 걸리는 시간 : "
		                                  +(endTime-startTime)+"ns");
		// 4. 처리
		startTime = System.nanoTime();
		for( int i = 0 ; i<10000 ; i++ ) {
			list2.add( 0 , i+""); // 리스트2에 i번째 저장 
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 가 10000개 저장하는 걸리는 시간 : "
										+(endTime-startTime)+"ns");
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}






