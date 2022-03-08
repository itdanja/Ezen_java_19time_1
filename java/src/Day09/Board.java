package Day09;

import java.util.Scanner;

public class Board {
	// Board 게시판 클래스 선언 
	
	// 1. 필드 [ 데이터가 저장되는 곳 ]
	String title;
	String content;
	String wrier;
	
	// 2. 생성자
		// 1. 빈생성자
	public Board() {}
		// 2. 모든 필드를 받는 생성자 
	public Board(String title, String content, String wrier) {
		super();
		this.title = title;
		this.content = content;
		this.wrier = wrier;
	}
	// 3. 메소드 
		// 1. 모든 글 출력 메소드
	public void getboardlist( Board[] boardlist ) { // 인수o=>배열 반환x
		System.out.println("글번호\t제목\t작성자\t내용");
		for( int i = 0 ; i<boardlist.length ; i++) {
			if( boardlist[i] != null ) { // i번째 인덱스에 null 이면 게시물 없다.
				System.out.println(i+"\t"+boardlist[i].title+"\t"+
							boardlist[i].wrier+"\t"+boardlist[i].content );
			}
		}
	} // 모든 글 출력 메소드 end 

	// 2. 글쓰기 메소드 
	public void write( Board[] boardlist ) {
		// 1. 3가지 입력받아 3개의 변수 저장 
		Scanner scanner = new Scanner(System.in);
		System.out.println("---------------- 글쓰기 페이지 -------------");
		System.out.print(" 제목 : ");	String title = scanner.next();
		System.out.print(" 내용 : ");  String content = scanner.next();
		System.out.print(" 작성자 : "); String writer = scanner.next();
		// 2. 3개의 변수를 객체에 저장 
		Board board = new Board(title, content, writer);
		// 3. 배열내 빈공간을 찾아서 객체를 저장 
		for( int i = 0 ; i<boardlist.length ; i++) {
			if( boardlist[i] == null ) { // i번째 인덱스에 null 이면 게시물 없다.
				boardlist[i] = board; // 해당 i번째 인덱스에 새로운 게시물 넣기
				break; // 게시물 넣었으면 반복문종료
			}
		}
	} // 글쓰기 메소드 end 
	
		// 3. 글삭제 메소드 
	public void delete( Board[] boardlist ) {
		//1. 삭제할 번호 입력받기 [ 삭제할번호 == 인덱스 ]
		Scanner scanner = new Scanner(System.in);
		System.out.println("삭제할 글 번호 : "); 
		int 삭제번호 = scanner.nextInt();
		// 2. 해당 삭제번호[인덱스]에 배열내에서 null 변경 
		boardlist[삭제번호] = null; // 해당 인덱스를 null 변경 => 삭제처리 
		System.out.println(" 알림]] 삭제 되었습니다.");
	} // 글삭제 메소드 end 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
