package Day16;

import java.util.HashMap;

public class Day16_5 {
	
	public static void main(String[] args) {
		
		// p.574
		// Map : 키,값 => 엔트리  
		// 1. Map 객체 선언 
		HashMap<String, Integer> map = new HashMap<>();
			//  key   ,  value => 엔트리
		// 2. 객체를 map 저장 
		map.put( "신용권" , 85 ); //  키 = "신용권"  // 값 = 85
		System.out.println("확인 : " + map );
		map.put( "홍길동" , 90 ); // 키,값 => 엔트리 추가 
		System.out.println("확인 : " + map );
		map.put( "동장군" , 80 ); // 키,값 => 엔트리 추가 
		System.out.println("확인 : " + map );
		map.put( "홍길동" , 95 ); // 키,값 => 엔트리 추가
		System.out.println("확인 : " + map);
	}

}


















