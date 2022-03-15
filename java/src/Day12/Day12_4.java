package Day12;

import java.util.ArrayList;

public class Day12_4 {
	
	public static void main(String[] args) {
		
		// 배열 : 문법 
		String[] 배열 = new String[100];
		
		System.out.println(" 배열 : " + 배열 );
		배열[0] = "유재석";
		System.out.println(" 배열[0] : " + 배열[0] );
		
		// 리스트 : 컬렉션(수집) 프레임워크(미리만들어진클래스)
		ArrayList< String > 리스트 = new ArrayList<>();
		// ArrayList : 배열리스트 클래스 
		// < 리스트에 저장할 클래스 > : 리스트 항목에 넣을 객체의 클래스명
		System.out.println(" 리스트 : " + 리스트 );
		리스트.add("유재석");
		System.out.println(" 리스트[0] : " + 리스트.get(0) );
		
		
		// 리스트 사용방법 
		// 1. 리스트 선언 
		ArrayList< String > arrayList = new ArrayList<>();
	//  ArrayList : 리스트 클래스 
	// < 리스트내 항목 클래스 >
	// arrayList : 리스트 이름[ 아무거나 ] 
	// new : 객체 선언시 메모리할당 
	// ArrayList<>() : 생성자 호출 
		// 2. 리스트내 항목 추가 
		arrayList.add("강호동");
		arrayList.add("유재석");
		arrayList.add("신동엽");
		// 3. 리스트 출력 
		System.out.println(" 리스트 : " + arrayList );
		// 4. 리스트내 항목 출력 
		System.out.println(" 리스트내 0번 호출 : " + arrayList.get(0) );
		System.out.println(" 리스트내 2번 호출 : " + arrayList.get(0) );
		// 5. 리스트내 항목 삭제 
		System.out.println(" 리스트내 1번 삭제 : " + arrayList.remove(1) );
		// 6. 항목 삭제후에 리스트 출력 
		System.out.println(" 리스트 : " + arrayList );
		
		//         배열    						vs  	리스트 
		//구조 : 기본문법									클래스 
		//선언 : String[] 배열명 = new String[100];			ArrayList<String> 리스트명 = new ArrayList<>();
		//길이 : 고정길이 [ 선언후 변경불가 ] 					가변길이[ 데이터 추가하면 자동 길이 추가 ]
		//장점 : 클래스가 아니기때문에 가볍다.					가변길이 이기때문에 메모리 효율적으로 사용가능 
		//추가 : 배열[인덱스] = 객체							리스트.add( 객체 );
		//호출 : 배열[인덱스]								리스트.get( 인덱스 );
		//삭제 : null										리스트.remove( 인덱스 or 객체 );
		//길이 : length 									리스트.size()
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}




