package Day07;

import java.util.Random;
import java.util.Scanner;

public class Day07_2 {
	
	/*
	 * 
	 * 로또 판별기 프로그램
		1. 사용자 6 개 수를 입력받아 배열에 저장 
			1. 1~45 사이만 입력받기 [ 그외 입력시 재입력 ]
			1. 중복 불가 [ 중복 입력시 재입력 ]
		2. 추첨번호 : 컴퓨터 6개 수를 난수 생성해서 배열에저장 
			1. 중복 불가 
		3. 사용자가 입력한 수와 추첨번호와 동일한 개수 체크 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		// 설정 [ 전역으로 사용할 변수 선언 ] 
		int[] number = new int[6]; // int형 6개 변수를 저장 할 수 있는 배열선언
		int[] random = new int[6];
		Scanner scanner = new Scanner(System.in); // 입력객체 
		
		// 1. 사용자에게 6개를 수를 입력받아 배열에 저장.
		System.out.println("----------- 구매하실 번호를 선택 --------------");
		for( int i = 0 ; i<6; i++ ) {
			// i는 0 부터 6 미만까지 1씩증가하면서 반복처리
			System.out.print( (i+1) + "번째 번호[1~45] 입력 : "); // 출력 
			int num = scanner.nextInt(); // 입력->저장 
			
			boolean 통과 = true; // 저장[true] or 재입력[false]
			// 재 입력을 받아야 하는 경우
				// 1. 1~45 가 아닌 경우 
				if( num < 1 || num > 45 ) {
					// 입력받은 값이 1보다 작거나 45보다 크면 
					System.out.println(">>재입력:[ 1~45사이만 입력해주세요 ]");
					통과 = false;
					i--; // 재입력시에는 현재 순서[i] 차감
				}
				// 2. 입력받은 수가 기존 배열에 존재하면
				for( int j = 0 ; j<number.length ; j++) {
					if( num == number[j] ) {
						//입력값 과 배열내 j번째 값이 동일하면
						System.out.println(">>재입력:[ 이미 입력한 수 입니다 ]");
						통과 = false;
						i--; // 재입력시에는 현재 순서 차감 
						break; // 가장 가까운 for문 종료 
					}
				}
			// 통과가 true 인 경우에만 배열에 저장 
			if( 통과 == true ) number[i] = num; // 입력->저장-> i번째 인덱스 에 저장 
		}
		
		// 1-1. 확인 
		System.out.println("---------- 고객이 선택한 번호 목록 ---------");
		for( int i = 0 ; i<number.length ; i++ ) {
			System.out.println( (i+1) +" 번째 번호 : " + number[i] );
		}
		
		// 2. 컴퓨터가 6개에 수를 난수생성 해서 배열에 저장.
		System.out.println("----------- 추첨 번호 생성 목록 ----------");
		for( int i = 0 ; i<random.length; i++) { //  1번 for 
			Random ran = new Random();	// 랜덤 객체 
			// random[i] = ran.nextInt(45); // 0 ~ 44 까지 난수 생성 
			int randomnum = ran.nextInt(45)+1;	// 1 ~ 45 까지 난수 생성 
			
			boolean 통과 = true;
			for( int j = 0 ; j<random.length; j++ ) { // 2번 for 
				if( randomnum == random[j] ) {
					// 새로운 난수 == j번쨰 난수와 같으면
					i--;
					통과 = false;
					break; // break 기준으로 가장 가까운 반복문 {} 탈출
				}
			}
			if( 통과 ) random[i] = randomnum;
		}
		
		// 2-1 확인 
		for( int i = 0 ; i<random.length; i++ ) {
			System.out.println( (i+1) + " 번째 당첨번호 : "+ random[i]);
		}
		
		// 3. 두 배열을 비교해서 동일한 수 개수 체크.
		int 당첨번호수 = 0;
		for( int i = 0 ; i<number.length ; i++) {
			// i : 비교기준
			for( int j = 0 ; j<random.length ; j++) {
				// j : 비교대상
				if( number[i] == random[j] ) {
					// 비교기준 과 비교대상이 동일하면 
					당첨번호수++; // 당첨번호수 를 1 증가 
				}
			}
		}
		// 4. 결과 
		System.out.println(" ---------------- 추첨 결과 -------------");
		System.out.println(" 총 당첨된 번호 개수 : " + 당첨번호수 );
		
	} // main end 
} // class end 






