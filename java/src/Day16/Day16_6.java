package Day16;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Day16_6 {

	public static void main(String[] args) {
	
		// 전화번호부 프로그램  [ +파일처리 +클래스 +리스트 ]
			// 이름 , 전화번호 , 등록날짜 
			// 메뉴 : 1.추가 2.삭제 
		
		ArrayList<전화번호> 전화번호목록 = new ArrayList<>();
		
		// 파일불러오기[과제]
		
		while(true) { // 무한루프 
			// 출력
			System.out.println("===============전화번호부===============");
			System.out.println("순서\t이름\t등록일\t\t전화번호");
			int i = 0 ; // 반복회수 체크 [ 인덱스 사용 ]
			for(  전화번호 temp : 전화번호목록 ) {
				// 날짜 형식 변환
				SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd");
				System.out.println((i+1)+"\t"+temp.이름+"\t"+
								 	 dateFormat.format( temp.등록일 ) +
								 	 "\t"+temp.전화번호);
				i++ ; // 인덱스 증가
			}
			
			Scanner scanner = new Scanner(System.in); // 입력객체 선언 
			System.out.print("1.추가 2.삭제 : ");
			int ch = scanner.nextInt();
			if( ch == 1 ) {
				// 1. 변수 입력받기 
				System.out.print(" 이름 : ");		String 이름 = scanner.next();
				System.out.print(" 전화번호 : ");	String 전화번호 = scanner.next();
					Date 등록날짜 = new Date(); // 현재날짜/시간
				// 2. 3개 변수 -> 1개 객체화
				전화번호 temp = new 전화번호(이름, 전화번호, 등록날짜);
				// 3. 여러명을 저장하기 위해 리스트에 저장 
				전화번호목록.add(temp);
				// 4. 파일처리 
				try {// 1. 파일쓰기 클래스 [ 무조건 예외처리 해야함 = 일반예외발생 ]
					FileOutputStream outputStream = new FileOutputStream("d:/java/전화번호부.txt");
					// 2. 리스트내 모든 전화번호를 하나씩 파일에 쓰기
					for( 전화번호 temp2 : 전화번호목록 ) {
						String 파일내용 = temp2.이름 +"\t"+
										temp2.전화번호+"\t"+
										temp2.등록일+"\n";
						// 전화번호별[객체별] 구분 : \n			// 객체내 필드 구분 : \t
						outputStream.write( 파일내용.getBytes() ); // 문자열->바이트열 변환후 파일 쓰기
						// 스트림는 바이트만 전송이 가능하다.
					}
				}
				catch (Exception e) {}
				
			}else if( ch == 2 ) {
				System.out.println(" 삭제할 순서번호 : " );
				int 삭제번호 = scanner.nextInt();
				try { // 예외처리 : 만약에 존재하지 않는 순서번호를 입력시에는 에러 발생 -> catch 이동
					전화번호목록.remove(삭제번호-1);
				}
				catch (Exception e) {}
			}
		}
	}
}









