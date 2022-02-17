package Day05;

import java.util.Scanner;

public class Day05_1 { //cs 
	public static void main(String[] args) { // ms
		// p.134 : if문
			// 1. 제어문[ 경우의수 ]
			// 2. 형태
				// 1. if( 조건 ) true실행문; 
				// 2. if( 조건 ) true실행문;
		 		//    else false실행문;
				// 3. if( 조건1 ) true실행문;
				// 	  else if( 조건2 ) true실행문;
				//    else if( 조건3 ) true실행문;
				//    else false실행문;
			// 3. 조건이 true[참]이면 { } 안으로 들어간다.
		// 예1_p136
		int score = 80;	// int형 score변수에 93값을 초기화
			// int : 4바이트 만큼 저장할수 있는 상자의크기 [ 기본자료형 ]
				// score : 변수명 [ 아무거나 : 상자 이름 정하기 ] 
		if( score >= 90 ) {  // 만약에 score변수가 90점이상이면 
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} // ie
		if( score<90 ) { // 만약에 score변수가 90미만이면 
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		} // ie
	
		// 예2_p.137
		int score2 = 85;	// 동일한 클래스내 동일한 변수명은 사용불가.
		
		if( score2 >= 90 ) { //  만약에 변수가 90점이상이면 
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}else { // (아니면) 변수가 90점이상이 아니면 
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
		
		// 예3_P.138
		int score3 = 75;
		if( score3>=90 ) { // 1. 만약에 변수가 90점 이상이면 
			System.out.println("점수가 100~90입니다.");
		}else if( score3>=80 ) { // 2. 아니고 만약에 변수가 80점 이상이면  
			System.out.println("점수가 80~89입니다.");
		}else if( score3>=70) { // 3. 아니고 만약에 변수가 70점 이상이면 
			System.out.println("점수가 70~79입니다."); 
		}else { // 4. 그외 나머지
			System.out.println("점수가 70미만입니다.");
		}

		// 문제6 : 로그인페이지
		// [ 입력 ] : 아이디와 비밀번호를 입력받기
		// [ 조건 ] : 회원아이디가 admin 이고 
		//           비밀번호가 1234 일 경우에는 
		//          로그인 성공 아니면 로그인 실패 출력
		
		// 아이디와 비밀번호 입력받아 조건에 따른 출력 
		// 1. 입력받기.
		Scanner scanner = new Scanner(System.in); // ??  입력객체 [입력시 필수]
		// 2. 저장한다.
		System.out.print("아이디 : ");
		String id = scanner.next(); // 입력객체에서 읽어온 값을 변수에 저장한다.
		System.out.print("비밀번호 : ");
		String password = scanner.next();
		// 3. 조건[비교].
		if( id.equals("admin") ) { // is1
			// 만약에 입력받은 id가 admin 이면
				// 문자열[String]은 비교연산자를 사용할수가 없다 -> 미리 만들어진 함수 .equals
			if( password.equals("1234") ) { // is2
				//만약에 입력받은 password가 1234이면 
				System.out.println("로그인 성공");
			} // ie2
		} // ie1
		System.out.println("로그인 실패");
		// 4. 출력한다.
		
		
		// p.141 switch문
			// 1. 경우에따른 선택
			// 2. 형태
			//    switch( 변수 ){
			//			case 값1 : 실행문; break;
			//			case 값2 : 실행문; break;
			//			default : 실행문; break;
			//	  }
		
			// 3.      if(논리조건) : 경우의수 다수일때 
			//     vs switch(선택조건) : 경우의수 소수로 정해져 있을떄 
		
		// 예1_ p142
		int num = (int) (Math.random() *6 )+1;	 // 1~6까지 난수 생성 
		System.out.println(" 난수 생성[1~6사이] : " + num );
		switch( num ) {
			case 1 : System.out.println("1번이 나왔습니다."); 	break;
			case 2 : System.out.println("2번이 나왔습니다.");	break;
			case 3 : System.out.println("3번이 나왔습니다."); 	break;
			case 4 : System.out.println("4번이 나왔습니다."); 	break;
			case 5 : System.out.println("5번이 나왔습니다."); 	break;
			default : System.out.println("6번이 나왔습니다.");
		}
		
		// break : 가장 가까운 { } 종료[나가기]
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // me
} // ce 





