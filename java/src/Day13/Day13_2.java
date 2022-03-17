package Day13;

public class Day13_2 {
	
	public static void main(String[] args) {
	
		// p.490 문자열.getBytes() : 해당 문자열을 바이트열 변환
		String str = "안녕하세요"; // 영문/특수:1바이트   ,  한글:2바이트
		// 문자열 -> 바이트열 
		byte[] bytes = str.getBytes(); // 문자열 -> 바이트열 변환
		System.out.println("안녕하세요 [바이트길이] : " + bytes.length);
		// 바이트열 -> 문자열 
		String str1 = new String( bytes );
		System.out.println("바이트열 -> 문자열 : " + str1 );
		
		// 문자로 인코딩 방법 : 1. EUC-KR[ 영문/한글 로 변환 가능 ] , 2.UTF-8[ 전세계용어 변환 가능 ]
						//		한글 : 2바이트							한글 : 3바이트
		try { // 예외처리 : 만약에 try 괄호 내에서 에러 발생시 catch로 이동 
			
			byte[] bytes2 = str.getBytes("EUC-KR"); // 일반예외[무조건 예외발생]
			System.out.println(" EUC-KR 길이 : "+bytes2.length); // 한글1개당 : 2바이트 
			String str2 = new String( bytes2 , "EUC-KR");
			System.out.println(" 바이트열 -> 문자열 : " + str2 );
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println(" UTF-8 길이 : " + bytes3.length ); // 한글1개당 : 3바이트
			String str3 = new String( bytes3 , "UTF-8");
			System.out.println(" 바이트열 -> 문자열 : " + str3 );
			
		}catch( Exception e ) { System.out.println(" 예외발생 "+e);}
		
System.out.println("-----------------------------------------------------");
		// p.491~492 문자열.indexOf(찾을문자) : 해당 문자열내에서 찾을문자의 위치[인덱스] 찾기
											// 만약에 찾을문자가 존재하지 않으면 -1 있으면 해당위치[인덱스] 반환
		String subject = "자바 프로그래밍";
		int location = subject.indexOf("프로그래밍");// subject 에서 프로그래밍 단어 위치 찾기
		System.out.println(" 검색 결과 : " + location );
		
		if( subject.indexOf("자바") != -1 ) {
			// 인덱스는 0부터 시작하기 때문에 -1은 인덱스에서 존재하지 않는 수
			// 문자열.indexOf("찾을문자") 만약에 -1 반환되면 해당 문자열에 찾을문자가 존재하지 않음.
			System.out.println("*자바와 관련된 책 ");
		}else { // 만약에 반환된 값이 -1 이면 
			System.out.println("*자바와 관련 없는 책 ");
		}
System.out.println("-----------------------------------------------------");
		// p.492 문자열.length() : 해당 문자열내 문자수[길이]
		String ssn = "7306241230123";
		int length = ssn.length(); // 문자열내 문자수[길이]구하기 
		if( length == 13 ) { // 만약에 길이가 13이면 
			System.out.println("주민번호 자리수가 맞습니다. ");
		}else {
			System.out.println("주민번호 자리수가 틀립니다. ");
		}
System.out.println("---------------------------------------------------------");
		// p.493~494 문자열.replace("기존문자","새로운문자") : 해당 문자열내 특정문자를 새로운문자로 교체
		String oldstr = "자바는 객체지향언어 입니다. 자바는 풍부한 API를 지원합니다.";
		String newstr = oldstr.replace("자바", "JAVA");
								// 문자열내 자바 -> JAVA 변경 
		System.out.println(" 변경 전 : " + oldstr );
		System.out.println(" 변경 후 : " + newstr );
		
System.out.println("---------------------------------------------------------");
		// p.494~495 문자열.substring(인덱스) : 해당 문자열내 인덱스만큼 문자추출[자르기]
		String ssn2 = "880815-1234567";
		String 앞자리 = ssn2.substring(0,6); // 시작인덱스 , 마지막인덱스 전 
		System.out.println("주민등록번호 앞자리[0~6] : " + 앞자리);
		String 뒷자리 = ssn2.substring(7); // 인덱스 : 해당 인덱스부터 마지막인덱스까지
		System.out.println("주민등록번호 뒷자리[7~마지막] : "+뒷자리);
System.out.println("---------------------------------------------------------");
		// p.495~496 :
			// 문자열.toLowerCase() : 해당 문자열을 소문자로 변환 
			// 문자열.toUpperCase() : 해당 문자열을 대문자로 변환
		// p.497
			// 문자열.trim() : 해당 문자열내 앞뒤 공백 제거 
		// p.498 : 문자열.valueOf( 기본자료형데이터 ) : 기본자료형데이터 --> 문자열 변환
		String str2 = String.valueOf(10); // int형 10 -> 문자열 10 변환 
		String str3 = String.valueOf(10.5); // double형 10.5 -> 문자열 10.5 변환 
		String str4 = String.valueOf(true);	// boolean형 true -> 문자열 true 변환
		
		System.out.println(" 정수 -> 문자열 [ 문자열 연산불가] : " + ( str2+10 ) );
		System.out.println(" 실수 -> 문자열 [ 문자열 연산불가] : " + ( str3+10.5 ) );
		System.out.println(" 논리 -> 문자열 [ 문자열 논리불가] ");
		/// if( str4 ) {}   str4에 true 저장 되어 있지만 문자열 이므로 if에서 사용불가
		
		// * 기본자료형을 빠르게 문자열 변환하는 방법 
		String str5 = 10+"";	// 기본자료형데이터+""
		System.out.println(" 기본자료형데이터+\"\"  사용시 빠르게 문자열 변환 가능  ");

System.out.println("---------------------------------------------------------");	
		// 교재 외 String 클래스 에서 많이 사용하는 메소드
		// 1. 문자열.split("기준문자") : 문자열을 특정기준으로 분리해서 배열로 반환
		// 2. 문자열.contains("찾을문자") : 문자열내 찾을문자가 존재하면 true 없으면 false 반환
		// 3. String.format("형식",문자열) : 해당 문자열을 형식[꾸미기]으로 변환 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
