package Day02;

public class Day02_2 { // c s 
	public static void main(String[] args) { // m s 
		
		// 변수의 기본타입
			// 변수 = 하나의 값 저장할수 있는 상자
				// 다이소 : 상자 크기별로
			// 변수 크기별로 구분
				// 왜???? 메모리 아껴쓰자.. 저장할 만큼만 쓰자
				// 용량 증가하면 속도 감소  용량 감소하면 속도 증가
		
		// 정수타입
			// 1. byte	1바이트	+-128
			// 2. short 2바이트	+-3만정도
			// 3. char	2바이트	유니코드[문자 1개]
				// 여러 문자 저장불가 => 여러문자 저장[ String 클래스 사용 ]
			// 4. int 	4바이트	+-20억정도[ 정수기본타입(자료형 생략시) ]
			// 5. long	8바이트	+-20억이상[ 값뒤에 L 붙이기 ]
		
		// 예제1_p.61~64
			int var1 = 365;	// int형(정수) var1 라는 변수 선언 
			System.out.println("int 만큼 저장할수 있는 변수 : " + var1 );
			// int var3 = 2000000000000000000000000000000000000000; //불가
			
			byte var2 = 127;
			System.out.println("byte만큼 저장할수 있는 변수 : "+var2);
			// byte var3 = 300;	// 불가
			
			long var3 = 2000000000000000000L; // 19자리
			System.out.println("long만큼 저장할수 있는 변수 : "+var3);
			
			char c1 = 'A'; 	// 문자 저장가능
			System.out.println("유니코드를 저장할수 있는 변수 : "+c1);
			short s1 = 'A';	// 문자 저장가능 -> 숫자
			System.out.println("short만큼 저장할수 있는 변수 : "+s1);
			
			char c2 = 66;	// 정수 저장 -> 문자
			System.out.println("유니코드를 저장할수 있는 변수 : "+c2);
			short s2 = 66;	// 정수 저장 
			System.out.println("short만큼 저장할수 있는 변수 : "+s2);
			
			System.out.println("-------------------------------");
		// 예제2_p.61~65	
			// char c3 = "java"; // char크기는 하나의 문자만 저장가능
			String name = "홍길동";	// 자료형x 클래스o
			System.out.println("String클래스로 name 객체 선언 : " + name);
			String job = "프로그래머";
			System.out.println("String클래스로 job 객체 선언 : " + job);
				// 클래스 [ 설계도 ]   객체 [ 설계 기반으로 만들어진 형태 ]
				// 붕어빵틀			붕어빵1 붕어빵2 붕어빵3
				// String클래스		문자열객체1 문자열객체2 문자열객체3
			
		// 예제3_p.66 이스케이프 문자 [ 제어문자(화면에 출력되지 않음 ] 
				//  \ : 엔터 위에 원화기호 [ 백슬래시 ] 
				// \t : 들여쓰기 [ 4칸 띄어쓰기 ] 
				// \n : 줄바꿈 
				// \r : 개행 [ 맨 앞으로 이동 ] 
				// \\ : \ 백슬래시 출력 
			System.out.println("번호\t이름\t직업");
			System.out.println("번호\n이름\n직업");
			System.out.println("\"" + "\\");
			
		// 예제4_p.66 실수형 
			// 1.float 	4바이트	소수점7자리 [ 값 뒤에 f 붙이기 ] 
			// 2.double	8바이트	소수점15자리[ 실수기본타입 : 자료형 생략시 ]
			
			float var4 = 3.14f;
			System.out.println(" float 크기만큼 저장할수 있는 변수 : " + var4 );
			float var5 = 3.144444444444444444444444f; 
			// 소수 8자리부터 잘림
			System.out.println(" float 크기만큼 저장할수 있는 변수 : " + var5 );
			
			double var6 = 3.1444444444444444444444444444444444444444444444; 
			// 소수 16자리부터 잘림
			System.out.println(" double 크기만큼 저장할수 있는 변수 : " + var6 );
		
		// 예제5_p.69 논리형 [ 맞는지(TRUE) 틀린지(FALSE) 판단 ] 
			// boolean 1바이트	true 혹은 false
//			boolean stop = 60; 	//불가
//			boolean stop2 = 'a';	//불가
			boolean stop3 = true; // 가능 
			System.out.println(" boolean 크기만큼 저장할수 있는 변수 : " + stop3 );
			
			
	} // m e 
} // c e 







