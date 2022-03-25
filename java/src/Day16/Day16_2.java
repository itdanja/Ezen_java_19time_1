package Day16;

import java.util.Vector;

public class Day16_2 {
	
	public static void main(String[] args) {
		
		//1.Vetor 클래스로 리스트 객체 선언 
			// 리스트내 Board 객체 저장 
		Vector<Board> list = new Vector<>();
		//2.리스트에 추가
		list.add( new Board("제목1","내용1","글쓴이1") );
		list.add( new Board("제목2","내용2","글쓴이2") );
		list.add( new Board("제목3","내용3","글쓴이3") );
		list.add( new Board("제목4","내용4","글쓴이4") );
		list.add( new Board("제목5","내용5","글쓴이5") );
			System.out.println(" 확인 : "+list );
		//3.출력
		System.out.println("번호\t제목\t내용\t작성자");
		
		for( int i = 0 ; i<list.size() ; i++ ) {
			// i(인덱스)가 0 부터 리스트길이 전까지 1씩증가 반복처리 
			// 리스트내 i번째 인덱스의 객체 필드 호출 
			System.out.println( i+"\t"+ list.get(i).제목 +"\t" 
					+ list.get(i).제목+"\t"
					+ list.get(i).작성자 ) ;
		}
		
		
		
		
	}

}
