package Day16;

import java.util.HashMap;

public class Day16_5 {
	
	public static void main(String[] args) {
		
		// p.574
		// Map : 키(=set) ,값 => 엔트리  
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
		// * 키는 중복이 불가능하다.
		map.put( "홍길동" , 95 ); // 키,값 => 엔트리 추가
		System.out.println("확인 : " + map);
		System.out.println("총 entry 수 : " + map.size() );
		// 객체 찾기 [ .get( 키 ) -> 값 호출 
		System.out.println("\t홍길동 : "+map.get("홍길동") );
		// 호출 [ .keySet() : 모든 키를 호출 ] 
		for( String key : map.keySet() ) {
			System.out.println(" 키 : " + key );
			System.out.println(" 값 : " + map.get(key) );
		}
		// 3. 삭제 [ .remove( 키 ) : 해당 키의 엔트리 삭제 ] 
		map.remove("홍길동");
System.out.println("-------------홍길동 삭제후--------------");
		for( String key : map.keySet() ) {
			System.out.println(" 키 : "+key +"\t 값:"+map.get(key) );
			
		}
		// 4.
		map.clear(); // 모두 비우기[삭제]
System.out.println(" 모두 삭제후 : " + map.size() );



		
		
		
		
		
		
		
		
	}

}


















