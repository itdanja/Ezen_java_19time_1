package Day08;

import java.util.Scanner;

public class Day08_3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Board[] boardlist = new Board[1000];
		// board 객체를 1000개 저장할수 있는 배열 선언 
		
		while(true) {
			System.out.println(">>>>> 비회원 커뮤니티 >>>>>");
			System.out.println("글번호\t제목\t작성자\t내용");
				// 모든 배열내 객체 출력하기  [ 모든 글 출력하기 ]
				for( int i = 0 ; i<boardlist.length; i++ ) {
					// 공백을 제외한 객체 출력하기 
					if( boardlist[i] !=null ) { // 배열내 i번째 객체가 null 아니면 
						System.out.println( i +"\t"+boardlist[i].title +"\t"+  
											boardlist[i].writer +"\t"+  
											boardlist[i].content );
					}
				}
				
			System.out.println("1. 글쓰기 2. 글삭제");
			System.out.print("선택 : ");
			int ch = scanner.nextInt();
			if( ch ==1 ) {
				System.out.println(">>>>>>>> 글쓰기 페이지 >>>>>>>");
				scanner.nextLine(); // next 다음 nextline 사용하면 하나로 취급되는 문제발생 -> 해결방안
				System.out.print(" 제목 : "); String title = scanner.nextLine();
				System.out.print(" 내용 : "); String content = scanner.nextLine();
				System.out.print(" 작성자 : "); String writer = scanner.next();
				// 3개변수 ---> 객체화 선언 [ 1개 ]
				Board board = new Board( title , content , writer ); 
				// 배열내 공백 찾아서 배열에 저장하기 
				for( int i = 0 ; i<boardlist.length ; i++ ) {
					// * i는 0부터 배열 길이만큼 1씩 증가하면서 실행 반복처리
					if( boardlist[i] == null ) { // 배열내 i번째 인덱스에 객체가 null 이면 
						boardlist[i] = board; // 배열내 i번째 인덱스에 새로운 객체를 넣어주기 
						System.out.println(" 알림] 새로운 글이 작성 되었습니다.");
						break;
					}
				}
			}else if( ch == 2 ) {
				// 글 번호 를 입력받아 해당 글번호에 게시물 객체를 삭제 [ null 대입 ]
				System.out.println("삭제할 글번호 입력 : "); int 삭제번호 = scanner.nextInt();
				boardlist[삭제번호] = null;
					// 과제 : 삭제시 삭제인덱스 뒤로 모든 인덱스 값들은 한칸씩 당기기
				System.out.println(" 알림] 해당 게시글 삭제 되었습니다. ");
				
			}else {
				System.out.println("알림)알수없는 번호입니다.");
			}
		}// while end 
	}// main end 	
} // class end 








