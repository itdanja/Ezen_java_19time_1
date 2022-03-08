package Day09;

import java.util.Scanner;

public class Day09_6 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Board[] boardlist = new Board[100];
		
		while(true) {
			System.out.println("------ 비회원 커뮤니티 -------");
				// 모든 글 출력 메소드 
				Board board = new Board(); // 1.빈생성자로 객체를 만들기 
				board.getboardlist(boardlist); // 2. getboardlist 메소드 호출 [ 인수 = 배열 ]

			System.out.println("1.글쓰기 2.글삭제");
			System.out.print(" 선택 :");
			int ch = scanner.nextInt();
			
			if( ch == 1 ) {
				board.write(boardlist); // 3.write메소드 호출
			}
			else if( ch == 2 ) {
				board.delete(boardlist); // 4. delete메소드 호출 
			}
			else {
				System.out.println(" 알림] 알수없는 번호입니다.");
			}
			
		} // while end 
	} // main end 
} // class end 
