package Day16;

import java.util.ArrayList;

public class Day16_1 {
	
	public static void main(String[] args) {
		
	
		// p.556
			// 컬렉션[수집] 프레임워크
			// 컬렉션은 객체의 저장
			// 프레임워크은 사용방법을 정해놓은 라이브러리
		// p.560 : ArrayList 클래스 
		// 1. 리스트 객체 선언 
		// 1. Arraylist : 리스트 클래스 // 2. <제네릭> : 리스트내 들어가는 클래스  // 3. list : 객체명 ( 아무거나 ) // 4. new : 객체생성시 메모리할당 // 5. ArrayList<>() : 생성자
		ArrayList<String> list = new ArrayList<>();
		// 2. 리스트에 요소 추가 [ 리스트객체명.add(객체) : 리스트내 객체 추가 ] 
		list.add("java");			System.out.println(" 리스트내 요소들 확인1 : "+ list );
		list.add("JDBC");			System.out.println(" 리스트내 요소들 확인2 : "+ list );
		list.add("Servlet/JSP");	System.out.println(" 리스트내 요소들 확인3 : "+ list);
		list.add( 2 , "Database"); 	System.out.println(" 리스트내 요소들 확인4 : "+ list );
		list.add("iBATIS");			System.out.println(" 리스트내 요소들 확인5 : "+ list );
		// 3. 리스트내 객체 수 [ 길이 ] : .size()
		int size = list.size();		System.out.println(" 리스트 안에 들어있는 총 객체수 : "+size );
		// 4. 리스트내 특정 인덱스의 객체 호출 .get()
		String skill = list.get(2);	System.out.println(" 리스트 안에 2번인덱스 호출 : " + skill );
		// 5. 리스트내 모든 인덱스 호출 
		for( int i = 0 ; i<list.size() ; i++ ) { // i가 0부터 리스트의길이 전 까지 1씩 증가하면 반복처리
			String str = list.get(i); // 리스트내 i번째 인덱스 호출
			System.out.println( i + " : " + str );
		}
		// 6. 리스트내 특정 인덱스를 삭제 : .remove( 인덱스번호/객체명 ) : 해당 인덱스/객체 삭제
		System.out.println(" 리스트 안에 삭제 전 확인 : " + list );
		list.remove(2);	// 2번 인덱스 삭제 [ 리스트내 Database 삭제 ]
		System.out.println(" 리스트 안에 2번인덱스 삭제 후 확인 : " + list );
		list.remove(2); // 2번 인덱스 삭제 [ 리스트내 Servlet/jsp 삭제 ]
		System.out.println(" 리스트 안에 2번인덱스 삭제 후 확인 : " + list );
		list.remove("iBATIS");
		System.out.println(" 리스트 안에 특정 인덱스 삭제 후 확인 " + list );
		
	}

}












