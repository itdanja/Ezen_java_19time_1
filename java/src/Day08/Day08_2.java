package Day08;

import java.util.Scanner;

public class Day08_2 {
	
	// Day01 : 입출력
	// Day02 : 변수
	// Day03 : 연산
	// Day04 : if 제어문
	// Day05 : while 반복문
	// Day06 : for 반복문
	// Day07 : 배열 
	
	
	public static void main(String[] args) {
		
		// 준비
		Scanner scanner = new Scanner(System.in); // 입력객체
		Member[] memberlist = new Member[100];
		// 100개의 member 객체를 저장할수 있는 배열 선언 
		// 배열 선언 : 자료형/클래스명[] 배열이름 = new 자료형/클래스명[저장개수];
		while(true) { 	// 프로그램 무한루프
			
			System.out.println(">>>>>>>>>> 회원제 >>>>>>>>>>");
			System.out.println(" 1.회원가입 2.로그인 ");
			System.out.print(">>> 선택: ");
			int ch = scanner.nextInt();
			
			if( ch== 1 ) {
				System.out.println(">>>>> 회원가입 페이지 >>>>>");
				System.out.print(" 아이디 : ");	String id = scanner.next();
				System.out.print(" 비밀번호 : ");	String password = scanner.next();
				System.out.print(" 이름 : ");		String name = scanner.next();
				System.out.print(" 연락처 : ");	String phone = scanner.next();
				// 4개 변수 ----> 객체 선언 
				Member member = new Member(id,password,name,phone);
				// 객체를 배열내 빈공간에 저장하기
				// 1. 배열내 빈공간을 찾는다.
				for( int i = 0 ; i<memberlist.length; i++) {
					// i는 0부터 배열내 길이만큼 1씩증가하면 반복처리 
					if( memberlist[i] == null ) {
						// 2. 빈공간에 객체 넣어주기
						memberlist[i] = member;
						System.out.println(" 알림] 회원가입 성공 ");
						break; // 새로운 객체를 넣었으면 반복문종료 // 회원가입 성공 
					}
				}
			}
			else if( ch==2 ) {
				System.out.println(">>>>> 로그인 페이지 >>>>>>");
				System.out.print(" 아이디 : ");	String id = scanner.next();
				System.out.print(" 비밀번호 : ");	String password = scanner.next();
				// 배열내 동일한 id와 password 찾기 
				for( int i = 0 ; i<memberlist.length ; i++) {
					if( memberlist[i] !=null &&
							memberlist[i].id.equals(id) && 
							memberlist[i].password.equals(password) ) {
						// 1. 배열내 i번째 인덱스 객체가 공백이 아니면 [ 공백은 비교할수 없다. equals 불가 ]
						// 2. 배열내 i번째 인덱스 객체가 id가 입력받은 id와 같으면 
						// 3. 배열내 i번째 인덱스 객체가 password가 입력받은 passowrd와 같으면 
						System.out.println(" 알림] 로그인성공 ");
						break;
					}
				}
			}
			else {
				System.out.println(" 알림] 알수없는 행동 입니다.");
			}
			
		}// while end 
	}// main end 
} // class end 
















