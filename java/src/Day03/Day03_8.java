package Day03;

import java.util.Scanner;

public class Day03_8 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	//문제3 : 하나의 정수를 입력받아 7의 배수인지 출력[ true , false ]
		System.out.print(" 문제3 : ");
		int 문제3 = scanner.nextInt();	// 숫자를 입력받아 문제3변수에 저장 
		System.out.println(" 7의 배수 확인 : " + ( 문제3%7 == 0 ) );
			// 배수찾기 : 값 나누기 수를 했을때 나머지가 0 이면 값은 그 수의 배수 
				// 값%수 == 0 

	//문제4 : 하나의 정수를 입력받아 홀수 인지 확인 [ true , false ]
		System.out.print(" 문제4 : ");
		int 문제4 = scanner.nextInt();
		System.out.println(" 홀수 확인 : " + ( 문제4%2 == 1 ) );
			// 홀짝찾기 = 값 나누기 2를 했을때 나머지가 1이면 홀수 0이면 짝수 
				// 값%2 == 0  혹은 == 1 

	//문제5 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 확인 [ true , false ]
		System.out.print(" 문제5 : ");
		int 문제5 = scanner.nextInt();
		System.out.println(" 7의 배수 이면서 짝수 인지 확인 : " + ( 문제5%7==0 && 문제5%2==0 )  );

	//문제6 : 두개의 정수를 입력받아 더 큰지 출력  [ true , false ]
		System.out.print(" 문제6 첫번째 수 : ");
		int 문제6_1 = scanner.nextInt();
		System.out.print(" 문제6 두번째 수 : ");
		int 문제6_2 = scanner.nextInt();
		System.out.println(" 첫번째 수가 두번째 수보다 큰지 확인 :  " + ( 문제6_1 > 문제6_2 ) );

	//문제7 : 반지름을 입력받아 원 넓이 출력하기 
		// 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]
		System.out.print(" 문제7 반지름 : ");
		float 반지름 = scanner.nextFloat();
		System.out.println(" 원 넓이 : " + ( 반지름 * 반지름 * 3.14 ) );

	//문제8 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇% 인지 출력하기
		// 예) 54.5   84.3 이면    64.285714%

	//문제9 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기]
		//사다리꼴 계산식 = > (윗변 * 밑변) * 높이 / 2

	//문제10: 키를 정수를 입력받아 표준체중 출력하기
		//표준체중 계산식 = > (키 - 100) * 0.9

	//문제11: 키와 몸무게를 입력받아 BMI 출력하기
		//BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))

	//문제12: inch 를 입력받아 cm 로 변환하기 [ 1 inch -> 2.54cm ] 

	//문제13:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하기
			//소수 둘째 자리 까지 점수 출력하기
			//중간고사 반영비율 => 30 %
			//기말고사 반영비율 => 30 %
			//수행평가 반영비율 => 40 %

	//문제14 :  연산 순서 나열 하고 x와 y값 예측하기
		 	//int x = 10;
			//int y = x-- + 5 + --x;
			//printf(" x의 값 : %d , y의값 :  %d ", x, y)
	}
}


