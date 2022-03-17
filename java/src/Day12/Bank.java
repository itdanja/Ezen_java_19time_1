package Day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Bank { // 클래스선언
	//1.필드
	private String 계좌번호;
	private String 비밀번호;
	private String 계좌주;
	private int 예금액;
	//2.생성자
	public Bank() {}
	public Bank(String 계좌번호, String 비밀번호, String 계좌주, int 예금액) {
		super();
		this.계좌번호 = 계좌번호;
		this.비밀번호 = 비밀번호;
		this.계좌주 = 계좌주;
		this.예금액 = 예금액;
	}
	//3.메소드

	public void 파일불러오기() {
		try {
			FileInputStream inputStream = new FileInputStream("D:/java/자바은행.txt"); // 1. 파일입력클래스
			byte[] bytes = new byte[1000]; // 2. 배열 선언
			inputStream.read( bytes ); // 3. 바이트를 읽어와서 배열에 저장
			String 파일내용 = new String(bytes); // 4. 바이트열 -> 문자열 변환 
			String[] 계좌목록 =  파일내용.split("\n"); 	// 5. 계좌별로 자르기 [  문자열.split("기준문자") : 기준문자 기준으로 자르기[분해]
			for( int i = 0 ; i<계좌목록.length ; i++ ) { 
				String[] 필드목록 = 계좌목록[i].split(",");  // 6. 계좌별로 필드 자르기 
				Bank bank = new Bank(필드목록[0], 필드목록[1],  // 7. 각 필드를 넣어서 객체화 
						필드목록[2], Integer.parseInt( 필드목록[3] ) );
									// Integer.parseInt( "문자열" )  : 문자열 -> 정수형 변환
				Day12_5.banklist.add(bank); // 9. 해당 객체를 리스트에 저장 
			}
		}catch( Exception e ) {}
	}
	public void 파일저장() {
		try {
			// 1. 파일출력클래스
			FileOutputStream outputStream = new FileOutputStream("D:/java/자바은행.txt");
			// 2. 작성할 내용 [ 리스트 ]
			for( int i = 0 ; i<Day12_5.banklist.size() ; i++ ) {
				Bank bank = Day12_5.banklist.get(i); // 리스트내 i번째 호출 
				String 작성내용 = bank.계좌번호 +","+bank.비밀번호+","+bank.계좌주+","+bank.예금액+"\n";
				outputStream.write( 작성내용.getBytes() ); // 3. 내보내기 
			}
		}catch( Exception e ) {
		}
	}
	public void 계좌등록() { 		// 1. 계좌등록
		Scanner scanner = new Scanner(System.in); // 1. 입력받기 
		System.out.println(" *** 계좌등록 ***"); 
		System.out.print(" 계좌번호 : ");	String 계좌번호 = scanner.next();
		System.out.print(" 비밀번호 : "); String 비밀번호 = scanner.next();
		System.out.print(" 계좌주 : ");	String 계좌주 = scanner.next();
		Bank bank = new Bank(계좌번호, 비밀번호, 계좌주, 0); // 2. 객체화 [ 변수4개 ---> 1개 객체 ]
		Day12_5.banklist.add(bank); //  // 3. 리스트에 저장 [ 리스트내 마지막인덱스뒤에 자동 추가 ]
		System.out.println(" *** 계좌등록이 완료되었습니다. *** ");
		파일저장(); // 4.파일처리 
	}
		// 2. 입금
	public void 입금() {
		System.out.println(" *** 입금 *** ");
	}
		// 3. 출금
	public void 출금() {
		System.out.println(" *** 출금 *** ");
	}
		// 4. 잔고 / 내계좌목록
	public void 잔고() {
		System.out.println(" *** 잔고 *** ");
	}
	

	
	
	
	
	
	
	
}
