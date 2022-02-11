package Day03;

public class Day03_5 {
	
	//p.102 연산자
	/* 
	  	1. 산술연산자 : +(더) -(빼) *(곱) /(나누기몫) %(나머지)
				   +(연결연산자)
	 	2. 비교연산자 : 결과 true 혹은 false
	 			>= 이상[ 크거나같다 ]		> 초과 [ 크다 ]
	 			<= 이하[ 작거나같다 ]		< 미만 [ 작다 ] 
	 			== 같다					!= 같지않다
	 	3. 논리연산자 : 비교연산자가 2개 이상일때 사용
	 			&& : and [ 이면서 면서 이고 그리고 모두 ] 
	 			|| : or [ 이거나 거나 또는 하나라도 ] 
	 			! : not [ 부정(반대) ]
	 	4. 대입연산자 
	 			= 	[ 오른쪽값이 왼쪽에 대입 ]
	 			+=	[ 오른쪽값을 왼쪽에 더한후에 왼쪽에 대입 ] 
	 			*= /= -= %=
	 	5. 증감연산자 
	 			++ [ 1증가 ]
	 			-- [ 1감소 ] 
	 	6. 조건연산자
	 			조건식 ? true : false
	 	
	 */
	
	public static void main(String[] args) {
		
		// 1.산술연산자
		int 정수1 = 10;	int 정수2 = 20;
		
		System.out.println(" 더하기(연결) : " + 정수1+정수2); // 연결연산자
		System.out.println(" 더하기 : " + (정수1+정수2));	// 더하기연산자
		System.out.println(" 빼기 : " + (정수1-정수2) );		// 빼기 연산자
		System.out.println(" 곱하기 : " + (정수1*정수2) );		// 곱하기 연산자
		System.out.println(" 나누기 : " + (정수1/정수2) );		// 나누기 연산자
		System.out.println(" 나머지 : " + (정수1%정수2) );		// 나머지 연산자 
		
		// 2. 비교연산자 
		System.out.println(" 이상 " + ( 정수1 >= 정수2 ) ); 	// false
		System.out.println(" 이하 " + ( 정수1 <= 정수2 ) );		// true
		System.out.println(" 초과 " + ( 정수1 > 정수2 ) );		// false
		System.out.println(" 미만 " + ( 정수1 < 정수2 ) ); 		// true
		System.out.println(" 같다 " + ( 정수1 == 정수2 ) );		// false
		System.out.println(" 같지않다 " + ( 정수1 != 정수2 ) ); 	// true
		
		// 3. 논리연산자 
		int 정수3 = 30; int 정수4 = 40; 
		System.out.println(" and : " + ( 정수1>=정수2 && 정수4>=정수3 )  ); // false true => true;
			// and 는 조건이 모두 true이면 결과도 true 하나라도 false 결과도 false
		System.out.println(" or : " + ( 정수1>=정수2 || 정수4>=정수3 ) );   	// false true => true;
			// or 는 조건이 하나라도 true이면 결과도 true 
		System.out.println(" not : " + !(정수1>=정수2 || 정수4>=정수3 ) );  // false true => true => ! => false 
			// ! 는 조건을 반대로 
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
