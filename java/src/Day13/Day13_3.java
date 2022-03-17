package Day13;

public class Day13_3 {
	
	public static void main(String[] args) {
		
		// 도서 등록검색수정 프로그램
			// 조건 
				// 1. 입력받기 scanner 말고 system.in 사용 
				// 2. 모든 도서는 String[] 도서목록 이라는 배열에 저장 
				// 3. 메뉴 [ 1.도서등록 2.도서검색 3.도서수정 ] 
				// *도서등록 : 도서명을 입력받아 배열 저장 
				// *도서검색 : 도서명의 일부를 입력받아 배열내 검색한 단어가 포함된 도서들을 모두 출력 
				// *도서수정 : 도서번호[인덱스] 입력받아 해당 도서명의 기존문자와 새로운문자를 입력받아 수정 
		
		
		String[] 도서목록 = new String[100]; // String 100개를 저장할수 있는 배열 [ 도서 100개 저장 할수 있음 ] 
		
		while(true) {
			try {
				System.out.print(" 1.도서등록 2.도서검색 3.도서수정 선택 : ");
				// 메뉴 입력받기 [ scanner X ]
					// 1. 바이트 배열 선언 
					byte[] bytes = new byte[100];
					// 2. 키보드로부터  바이트를 입력받아 바이트 배열에 저장 
					int count =  System.in.read( bytes );
					// 3. 바이트배열 -> 문자열 변환  // -2를 하는이유 : 입력시 엔터 치면[\n\r포함] 들어감 [ 엔터의 포함된 \n\r 제외 ]
					String ch = new String( bytes , 0 , count-2 );
					
				// *문자열 비교시에는 equals 사용한다
				if( ch.equals("1") ) { // 도서등록 
					// 1. 도서명 입력
					System.out.print(" 등록할 도서명 : ");
					count =  System.in.read( bytes ); // 키보드로 부터 바이트를 입력받아 바이트배열에 저장 
					String 도서명 = new String( bytes , 0 , count-2 ); // 바이트배열 -> 문자열 변환
					// 2. 배열내 빈공간에 저장 
					for( int i = 0 ; i<도서목록.length ; i++ ) {
						if( 도서목록[i] == null ) {  
							도서목록[i] = 도서명; 
							System.out.println(" 도서가 등록되었습니다.");
							break;  
						}
					}
				}
				else if( ch.equals("2") ) { // 도서검색 
					// 1. 도서명의 일부 입력
					System.out.print(" 도서명[일부/공백입력시 모든도서] 검색 : ");
					count = System.in.read(bytes); // 키보드로부터 입력받은 바이트를 바이트배열에 저장 
					String 검색어 = new String( bytes , 0 , count-2 );
					// 2. 배열내 도서명중 일부가 포함된 도서명 출력 
					for( int i = 0 ; i<도서목록.length ; i++ ) {
						if( 도서목록[i] !=null && 도서목록[i].indexOf(검색어) != -1  ) {
						// * 해당인덱스내 null[공백] 아니면서 해당인덱스내 검색어 단어가 포함되어 있으면[ != -1 ]
						// * 인덱스는 0번부터 시작하기 때문에 [ -1 : 인덱스가 없다( 찾을문자가 존재하지 않음 ) ]
							System.out.println("도서번호 : "+i+"   도서명 : "+도서목록[i] );	
						}
					}
					
				}
				else if( ch.equals("3") ) { // 도서수정 
					// 1. 도서번호[인덱스] 입력
					System.out.print( " 수정할 도서번호 : ");
					count = System.in.read( bytes ); // 키보드로부터 입력받은 바이트를 바이트배열에 저장 
					String 인덱스 = new String( bytes , 0 , count-2 ); // 바이트배열 -> 문자열 변환
					// 2. 인덱스[정수] 사용하기 때문에 인덱스를 정수형으로 변환
					int index =	Integer.parseInt(인덱스); // 문자열 --> 정수형 변환
					// 3. 수정할 기존문자와 새로운문자 입력받기 
					System.out.print(" 기존문자 : "); 		count = System.in.read( bytes );
					String 기존문자 = new String( bytes , 0 , count-2 );
					
					System.out.print(" 새로운문자 : ");	count = System.in.read( bytes );
					String 새로운문자 = new String( bytes , 0 , count-2 );
					
					// 4. 입력받은 수정사항으로 도서명 변경후에 원본에 저장 
					도서목록[index] = 도서목록[index].replace(기존문자, 새로운문자);
					System.out.println(" 도서명이 수정 내용으로 변경되었습니다. ");
					
				}
				else { System.err.println(" 알수 없는 번호입니다. ");}
			}catch( Exception e ) { System.out.println(" 에러 발생 [관리자에게문의] ");}
			
		}
		
		
		
		
	}

}
