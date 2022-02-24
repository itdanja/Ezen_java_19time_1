package Day07;

import java.util.Scanner;

public class Day07_3 {
	
	/*
	 * 회원제 프로그램 [ 최대 회원 100명 ]
		1. 메뉴 [ 1.회원가입 2.로그인 ]
		2. 회원가입 선택했을때
			1.아이디와 비밀번호 입력받아 배열에 저장 
		3. 로그인 선택했을때 
			1.아이디와 비밀번호가 기존에 존재하면 로그인성공
			2.존재하지 않으면 로그인 실패 
		
		[ 과제 ]
		1. 회원가입 아이디 중복체크
		2. 로그인 성공시 메뉴 출력
			[ 로그인메뉴 ]
			1. 회원목록
			2. 회원탈퇴
			3. 로그아웃 
	 */
	
	public static void main(String[] args) {
		
		// 0.설정
		Scanner scanner = new Scanner(System.in);
		String[] idlist = new String[100]; // 문자열 100개를 저장할수 있는 배열 
		String[] pwlist = new String[100];
		
		// 1. 프로그램 돌리기 [ 무한루프 ]
		while(true) { // 무한루프   [ 종료 조건 : break 실행되는 경우 ]
			
			System.out.println(" ------ 회원제 페이지 ------");// 0. 메뉴 
			System.out.println(" 1. 회원가입 2. 로그인 3.종료");
			System.out.print("선택 : "); int ch = scanner.nextInt();
			if( ch == 1 ) { // 1. 회원가입 
				System.out.println(" ------ 회원가입 페이지 -------");
				System.out.print(" signup id :");			String id = scanner.next();
				System.out.print(" signup password : ");	String pw = scanner.next();
				// 1. 배열에 빈자리를 찾아서 저장하기 
				for( int i = 0 ; i<idlist.length; i++ ) {
					if( idlist[i] == null ) { idlist[i] = id; pwlist[i] = pw; }
					// i번째 인덱스 배열에 null 이면 입력받은 id를 해당 i번째 인덱스에 저장 
				}
				// 2. id는 기존에 존재하면 불가 [ id 재입력 ] 
			} 
			else if( ch == 2 ) { // 2. 로그인 
				System.out.println(" ------ 로그인 페이지 ------- ");
				System.out.print(" login id : ");		String id = scanner.next();
				System.out.print(" login password : ");	String pw = scanner.next();
				// 배열에 동일한 아이디,패스워드 찾기 
				boolean login = false; // 로그인 성공 여부 저장 하는 변수 
				for( int i = 0 ; i<idlist.length; i++ ) {
					// 아이디 검증 
					if( idlist[i] != null && idlist[i].equals(id) ) {
						// 공백이 아니면서 입력받은 아이디와 동일하면 
						// 패스워드 검증 
						if( pwlist[i] !=null && pwlist[i].equals(pw) ) {
							login = true;
							// 로그인 성공 
							System.out.println(" >> 로그인 성공 >> ");
								// 로그인 성공시 실행할 코드 [ 추후에 코드 추가 ] 
							break; // 찾았으면 반복문 종료
						}
					}
				}		
				if( login==false) System.out.println(" >> 로그인 실패 >>");
				
			} 
			else if( ch == 3 ) { System.out.println(" >> 프로그램 종료"); break; } // 3. 종료 
			else { System.out.println(" >> 알수 없는 번호 입니다."); } // 4. 그외 
			
		} // while end 
	} // main end 
} // class end 










