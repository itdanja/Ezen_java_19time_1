package Day14;

public class Day14_3 {
	
	public static void main(String[] args) {
		
		// p.504 Math클래스 : 수학 계산 메소드 제공 
		
		//1. Math.abs(수) : 해당 수의 절대값 
		System.out.println(" 절대값 : " 	+ Math.abs(-5) ); // 5
		System.out.println(" 절대값 : " 	+ Math.abs(-3.14) ); // 3.14
		//2. Math.ceil(수) : 가까운 정수로 올림
		System.out.println(" 올림 : "	+Math.ceil(5.3) ); // 6.0
		System.out.println(" 올림 : "	+Math.ceil(-5.3) ); // -5.0
		//3. Math.floor(수) : 가까운 정수로 내림
		System.out.println(" 내림 : "	+Math.floor(5.3) ); // 5.0
		System.out.println(" 내림 : "	+Math.floor(-5.3) ); // -6.0
		//4. Math.max( 수1 , 수2 ) : 두 수 중의 더 큰수 
		System.out.println(" 최댓값 : " 	+Math.max(5, 9) ); // 9
		System.out.println(" 최댓값 : " 	+Math.max(5.3, 2.5)); // 5.3
		//5. Math.min( 수1 , 수2 ) : 두 수 중의 더 작은수 
		System.out.println(" 최솟값 : " 	+Math.min(5, 9) ); // 5 
		System.out.println(" 최솟값 : " 	+Math.min(5.3, 2.5 )); // 2.5
		//6. Math.random() : 0~1 사이의 (double)형 난수 발생 
		System.out.println(" 난수 : " 	+Math.random() ); // 0~1 사이의 난수
		//7. Math.rint(수) : 가까운 정수의 실수값으로 반올림( .5이상 1의자릿수 +1 )
		System.out.println(" 가까운 정수의 실수값으로 반올림 : "+Math.rint(5.3) ); // 5.0
		System.out.println(" 가까운 정수의 실수값으로 반올림 : "+Math.rint(5.7) ); // 6.0
		//8. Math.round(수) : 가까운 정수의 정수값으로 반올림( .5이상 1의자릿수 +1 )
		System.out.println(" 가까운 정수의 정수값으로 반올림 : "+Math.round(5.3) ); // 5
		System.out.println(" 가까운 정수의 정수값으로 반올림 : "+Math.round(5.7) ); // 6
		
		//9. Math.round() : 소수 첫째자리만 반올림 => 만일 소수 셋째자리에서 반올림 하고 싶으면??
		double value = 12.3456; // 소수 세번째자리에서 반올림 => 12.35
		double temp = Math.round( value*100 ); // 12.3456 *100 => 1234.56 -> 1235.0
		System.out.println(" 결과 : " + temp/100 ); // 1235.0 -> 12.35
		// 해결 방안 : 자릿수 변경 -> 반올림후 -> 자릿수 변경
		
	}

}










