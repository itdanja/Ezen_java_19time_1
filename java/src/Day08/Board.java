package Day08;

public class Board {
	// 게시판 설계 
	
	// 1. 필드 = 데이터 저장하는 공간 
	String title ; 	// 제목
	String content; // 내용
	String writer; 	// 작성자
	
	// 2. 생성자 = 객체 생성시 초기값
	public Board() { // 빈생성자 
	}
	// 모든 필드를 받는 생성자
	public Board(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	
	// 3. 메소드 = 객체 동작
	
}
