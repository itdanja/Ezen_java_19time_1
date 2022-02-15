package Day04;

import java.util.Scanner;

public class Day04_1 { // c s 

	public static void main(String[] args) { // m s 
	
		//  연산자의 종류 
			// 1. 부호연산자 + -
				// +100   /  -100
		
			// 2. 증감연산자 [ 순차적인 처리 ] 
				// ++변수명  : 선위증가    변수명++ : 후위증가
				// --변수명 : 선위감소		변수명-- : 후위감소
				// ++ : 1증가
				// -- : 1감소 
		
			// 3. 논리 부정 연산자 [ 참[t] -> 거짓[f]  / 거짓[f] -> 참[t] ]
				// !
		
			// 4. 산술연산자
				// + : 더하기 - : 빼기 * : 곱하기 /:나누기 %:나머지
		
			// 5. 비교연산자 [ 결과는 true / false ] 
				// > 초과 >=이상 <미만 <=이하 ==같다 !=같지않다 
			
			// 6. 논리연산자 [ 비교연산자가 2개이상일때 ] 
				// && : 이면서 면서 그리고 모두 	[ 비교연산자 결과가 모두 true 이면 true ] 
				// || : 이거나 거나 또는 하나라도 [ 비교연산자 결과가 하나라도 true 이면 true ] 
		
			// 7. 대입연산자 
				//  a = a + 3    		=>    a+=3
				//  변수명 = 변수명=값	  	=>	  변수명+=값
				// += : 오른쪽값을 왼쪽값에 더한후 왼쪽에 대입 
				// -= : 오른쪽을 왼쪽에 빼기후에 왼쪽에 대입 
				// *= : 오른쪽을 왼쪽에 곱하기후에 왼쪽에 대입 
				// /=   %=
		
			// 8. 조건연산자[ 삼항연산자 ]
				// 조건식 ? 참[true] : 거짓[false]
				// 나이>20 ? 성인 : 미성년자
		
			// 예1_p112
			int x = 10 ; // int형 x 변수에 10 초기화[저장]
			int y = 10;  // int형 y 변수에 10 초기화[저장]
			int z;		// int형 z 변수에 선언[초기화x]
			
			System.out.println("------------------------------");
			x++; // x변수에 1증가
			++x; // x변수에 1증가
			System.out.println(" x= " + x); // 12 
			
			System.out.println("선위증가 : "+ (++x) );	// 증가후에 출력
			System.out.println("후위증가 : "+ (x++) );	// 출력후에 증가 
			System.out.println("확인 : "+ (x) ); // 14 
			
			System.out.println("-------------------------------");
			y--;	// y변수에 1감소
			--y;	// y변수에 1감소 
			System.out.println(" y= " + y); // 8 
			System.out.println("선위감소 : " + (--y) ); // 7 [ 감소후에 출력 ] 
			System.out.println("후위감소 : " + (y--) ); // 7 [ 출력후에 감소 ]
			System.out.println("확인 : " + (y) );  // 6 
			
			z = ++x  + y++;   //   15+6 = 21
				// 1. x변수호출
				// 2. x변수에 1증가
				// 3. y변수호출
				// 4. y변수 변화없음 [ 후위증가 ]
				// 5. x변수와 y변수 더하기 
				// 6. 더하기 한 결과를 z변수에 대입 
				// 7. [후위증가] y변수에 1증가 
			System.out.println( " z : " + z );
		
			
			// 예2_p.114
			boolean play = true;	//   boolean  true 혹은 false 저장할수 있는 1바이트 상자
			System.out.println( " play " +  play );
			play = !play;	// ! : 반대로 
			System.out.println( " play 반대 "+ play );
			System.out.println( " play 반대 "+ !play );
			
			// 예3_p.124
			int result = 0;
			result += 10;	// result = result + 10
			System.out.println(" 대입연산자 : " + result );
			// 사용목적 : 코드를 줄일수 있다. 

			// 문제1 : 나이를 입력받아 나이가 10세이상이면 학생 , 20세이상이면 성인 , 40세이상이면 중년 
				
				// 1.입력 -> 2.변수[저장] -> 3.조건[비교] -> 4.출력 
			 	Scanner scanner = new Scanner(System.in);
			 	// 2. 저장
			 	System.out.println(" 나이 입력 : ");
			 	int 나이 = scanner.nextInt(); // 키보드에 입력된 값을 int형으로 가져와서 나이 변수에 저장
			 	// 3. 조건[비교]
			 	String 비교결과 = 나이>=40 ? "중년" : 나이>=20 ? "성인" : 나이>=10 ? "학생" : "유아";
			 				//    조건1 ? 참 : 조건2 ? 참 : 조건3 ? 참 : 거짓 
			 	// 4. 출력
			 	System.out.println(" 결과 : " + 비교결과 );
			
			
	} //  m e 
} // c e 




