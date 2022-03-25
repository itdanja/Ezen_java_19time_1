package Day16;

import java.util.HashSet;
import java.util.Iterator;

public class Day16_4 {
	
	public static void main(String[] args) {
		
		// p.565
		// set컬렉션 : 저장순서[인덱스]X , 중복X
		// p.568
		// 1. HashSet 클래스 set객체 선언  
		HashSet<String> set = new HashSet<>();
		// 2. set객체 추가  [ .add( 객체명 ) : set객체내 추가 ] 
		set.add("java");		System.out.println("확인 : "+set );
		set.add("JDBC");		System.out.println("확인 : "+set );
		set.add("Servlet/JSP");	System.out.println("확인 : "+set );
		// *이미 자바라는 문자열이 존재하기 때문에 set객체 중복 허용X
		set.add("java");		System.out.println("확인 : "+set );
		set.add("iBATIS");		System.out.println("확인 : "+set );
		// 3. size() : set객체내 객체수 
		int size = set.size();	System.out.println("총 객체수: "+ size );
		// 4. 호출
		Iterator<String> iterator = set.iterator();
	// Iterator : 순회 인터페이스 [ 순서가 없는 항목들을 순서대로 순회 ]
		while( iterator.hasNext() ) { // 1. hasNext() : 다음 항목이 있는지 여부 판단 
			String element = iterator.next(); // 2. next() : 다음 항목을 호출 
			System.out.println("\t" + element );
		}
		// 5.
		set.remove("JDBC");
		set.remove("iBATIS");
		System.out.println("총 객체수 : " + set.size() );
		// 6. 
		for( String element : set ) { 
			// for( 임시객체 : set ){ } set객체내 요소들을 하나씩 임시객체 대입 반복처리   
			System.out.println("\t"+element);
		}
		// 7. 
		set.clear(); // set객체내 요소들 모두 비우기[삭제]
		//8.
		if( set.isEmpty() ) { System.out.println("비어 있음");}
		// 만약에 set객체내 비어 있으면 true / false
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}




