package Day07;

import java.util.Arrays;
import java.util.Scanner;

public class Day07_1 {
	
	public static void main(String[] args) {
		
		// [변수] : 저장 => 메모리에 값 넣기 
			// 1.변수 하나에 하나의 값 저장가능 [ 여러개 불가 ] 
			// 2.여러개 저장시 변수가 많아짐 -> 관리 불편
			// 예)단독주택 ( 하나의 가정 )
		
		// [배열] : 저장 => 여러개의 메모리를 관리 
			// 기준으로 나열 -> 배열 
			// 1. 기준 => 인덱스(번호)
			// 2. 여러개 변수를 순서(인덱스번호)대로 저장한다
			// 3. 조건( 동일한 자료형 ) : int , char 동시에 한 배열에 저장 X 
			// 예) 아파트 ( 여러 가정 )
				// 1. 배열 생성 : 자료형[] 배열명 = { 값1 , 값2, 값3 , 값4 }
				// 2. new 연산자를 이용한 배열 생성 : 자료형[] 배열명 = new 자료형[ 길이 ] 
					// new : 메모리할당 연산자
		
		// 예제1_P.180 배열
		// 배열 생성 : 자료형[] 배열명 = { 값1 , 값2 , 값3 , 값4 };
		int[] scores = { 89 , 90 , 87};
				//인덱스:  0  , 1  , 2 
		// 출력 
		System.out.println(" scores[0] : " + scores[0] );
			// 인덱스 : 배열내 저장되는 순서번호 [ 0번 시작 ] 
		System.out.println(" scores[1] : " + scores[1] );
		System.out.println(" scores[2] : " + scores[2] );
		
		// 총합
		int sum = 0;
		for( int i=0 ; i<3; i++ ) {
			// i는 0부터 3미만까지 1씩증가하면서 반복처리
			sum += scores[i];
		}
		
		System.out.println(" 총합 : " + sum );
		System.out.println(" 평균 : " + (sum/3) );
		
		// 예제2_184
		int[] arr1 = new int[3]; // int형 변수 3개를 저장할수 있는 배열
		
		// 선언후 값 대입 하기전에 출력 
		for( int i = 0 ; i<3 ; i++ ) {
			System.out.println("arr["+i+"] : " + arr1[i] );
											// 값이 없을경우 0 혹은 null
		}
		// 각 인덱스에 값을 넣기 
		arr1[0] = 10; arr1[1] = 20; arr1[2] = 30;
		
		for( int i = 0 ; i<3 ; i++ ) {
			System.out.println("arr1["+i+"] : " + arr1[i] );
		}
		
		String[] arr3 = new String[3]; // String 객체 3개를 저장할수 있는 배열 
		
		for( int i = 0 ; i<3 ; i++ ) {
			System.out.println("arr3["+i+"] : " + arr3[i] );
		}
		
		arr3[0]="1월"; arr3[1]="2월"; arr3[2]="3월";
		
		for( int i = 0 ; i<3 ; i++ ) {
			System.out.println("arr3["+i+"] : " + arr3[i] );
		}
		
		// 배열 길이 구하기 .length
		System.out.println(" 배열길이 : " + arr3.length );
		System.out.println(" 배열이름 출력 : " + arr3 ); // 메모리주소 
		System.out.println(" 배열 인덱스 : " + arr3[0] ); // 배열내 해당인덱스에 값
		System.out.println(" 배열 모든 값 출력 : " + Arrays.toString(arr3) );
		
		// 배열을 이용한 점수관리 프로그램
			// 1. 학생수를 입력받아 학생수만큼 배열의길이 할당 
			// 2. 메뉴[ 1. 학생수 2.점수입력 3.분석( 점수내림차순 ) , 평균 ] 4. 종료 ]
		
		Scanner scanner = new Scanner(System.in); // 입력객체 
		int[] 학생점수목록 = null; // 선언시 배열의 길이를 정하지 않음
		
		while(true) {  // 무한루프 
			System.out.println("1.학생수 2.점수입력 3.분석 4.종료");
			System.out.print("선택 : "); int 선택 = scanner.nextInt();
			if( 선택 == 1 ) {
				System.out.print(" >> 학생수 입력 : ");
				int 학생수 =  scanner.nextInt();
				학생점수목록 = new int[ 학생수 ]; // 입력받은 수 만큼 배열에 메모리 넣어주기 
				// 입력받은 수 만큼 배열의 길이 생성 => 입력받은 수만큼 저장이 가능 
			}else if( 선택 == 2 ) {
				System.out.println(" 학생수 : " + 학생점수목록.length ); // 배열의 길이 // 배열명.length
				for( int i = 0 ; i<학생점수목록.length ; i++ ) {
					// i는 0부터 배열의길이[입력받은수]까지 1씩증가 반복처리
					System.out.print( i +"번째 학생 점수 입력 : ");
					학생점수목록[i] = scanner.nextInt(); // i 번째 인덱스에 점수를 저장하기.
				}
			}else if( 선택 == 3 ) {
				// 배열 정렬 [ 내림차순 ] 
				for( int i =0 ; i<학생점수목록.length ; i++) {
						// i : 비교기준 
					for( int j = i+1 ; j<학생점수목록.length ; j++ ) {
						// j : 비교대상[ 비교기준의 다음과 비교 시작 ] 
						
						if( 학생점수목록[i] < 학생점수목록[j] ) {
							// 비교기준 < 비교대상   => 스왑[교체]
							int temp = 학생점수목록[i];
							학생점수목록[i] = 학생점수목록[j];
							학생점수목록[j] = temp;
						}
					}
				}
				// 출력
				int 총합 = 0;
				for( int i = 0 ; i<학생점수목록.length ; i++ ) {
					System.out.println( i+"등 점수 : " + 학생점수목록[i] );
					총합 += 학생점수목록[i];
				}
				System.out.println(" 총합 점수 : " + 총합);
				System.out.println(" 평균 점수 : " + (총합/학생점수목록.length) );
				
				
			}else if( 선택 == 4 ) {
				System.out.println(" >> 종료 ");
				break; // 가장 가까운 반복문 괄호 탈출 
			}else {
			}
		} // while end 
	} // main end 
} // class end 






