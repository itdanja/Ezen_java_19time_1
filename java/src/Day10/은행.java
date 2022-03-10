package Day10;

import java.util.Scanner;

public class 은행 { // 슈퍼클래스[부모클래스]
	// 1. 필드
	String 계좌번호;
	String 비밀번호;
	int 예금액;
	// 2. 생성자
	public 은행() {} // [인수0개] 빈생성자
	
	public 은행(String 계좌번호, String 비밀번호, int 예금액) { // [인수3개]생성자 
		this.계좌번호 = 계좌번호;
		this.비밀번호 = 비밀번호;
		this.예금액 = 예금액;
	}
	// 3. 메소드 
		// 1. 계좌등록 메소드 
	public void 계좌등록() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" *** 계좌등록 *** ");
		System.out.print(" 1.국민 2.신한 3.하나 선택 : "); int 타입 = scanner.nextInt();
		System.out.print(" 계좌번호 : "); String 계좌번호 = scanner.next();
		System.out.print(" 비밀번호 : "); String 비밀번호 = scanner.next();
		
		if( 타입 == 1 ) { 
			국민은행 bank = new 국민은행( 계좌번호 , 비밀번호 );
			for( int i = 0 ; i<Day10_3.계좌리스트.length ; i++ ) {
				if( Day10_3.계좌리스트[i] == null ) {
					Day10_3.계좌리스트[i] = bank;
					System.out.println(" ** 국민은행으로 계좌등록 완료 **"); return;
				}
			}
		}else if( 타입 == 2 ) {
			신한은행 bank = new 신한은행( 계좌번호 , 비밀번호 );
			for( int i = 0 ; i<Day10_3.계좌리스트.length ; i++ ) {
				if( Day10_3.계좌리스트[i] == null ) {
					Day10_3.계좌리스트[i] = bank;
					System.out.println(" ** 신한은행으로 계좌등록 완료 **"); return;
				}
			}
		}else if( 타입 == 3 ) {
			하나은행 bank = new 하나은행( 계좌번호 , 비밀번호 );
			for( int i = 0 ; i<Day10_3.계좌리스트.length ; i++ ) {
				if( Day10_3.계좌리스트[i] == null ) {
					Day10_3.계좌리스트[i] = bank;
					System.out.println(" ** 하나은행으로 계좌등록 완료 **"); return;
				}
			}
		}
	}
		// 2. 예금 메소드 
	public void 예금() {
		Scanner scanner = new Scanner(System.in);
		System.out.print(" 예금할 계좌번호 : "); 	String 계좌번호 = scanner.next();
		System.out.print(" 예금액 : ");			int 예금액 = scanner.nextInt();
		
		// 동일한 계좌번호 
		for( int i = 0 ; i<Day10_3.계좌리스트.length ; i++) {
			// 동일한 계좌번호가 있으면 해당 객체에 예금액 더하기 후 메소드 종료  
			if( Day10_3.계좌리스트[i].계좌번호.equals(계좌번호) ) { 
				// i번째 객체내 계좌번호와 입력받은 계좌번호가 동일하면 
				Day10_3.계좌리스트[i].예금액 += 예금액;
				// i번째 객체내 예금액에 입력받은 예금액을 더해주기 
				System.out.println(" 알림]] 현 계좌번호에 예금액을 입금했습니다. ");
				return; // 메소드 종료 
			}
		}
		// 동일한 계좌번호가 없으면 메소드 종료
		System.out.println(" 알림]] 동일한 계좌번호가 존재하지 않습니다. [ 실패 ] ");
	}
		// 3. 출금 메소드
	public void 출금() {
	}
		// 4. 이체 메소드 
	public void 이체() {
	}
		// 5. 잔고 메소드 
	public void 잔고() {
	}
	

}


