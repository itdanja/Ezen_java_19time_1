package Day03;

import java.util.Scanner;

public class Day03_2 {
	
	// 1. main 메소드
	public static void main(String[] args) {
	
		// 2. 이름 입력받기
			// 1. 입력 객체 선언 
			Scanner scanner = new Scanner(System.in);
			// 2. 출력
			System.out.print(" 이름 입력 : ");
			// 3. 입력 받은 값을 저장  [ 입력객체에 입력된 값을 이름 객체에 저장 ] 
			String 이름 = scanner.next();  
			
		// 3. 1~3 입력받기 
			System.out.print(" 1교시 출석여부 입력 : ");	
			String 교시1	= scanner.next();
			System.out.print(" 2교시 출석여부 입력 : ");	
			String 교시2 = scanner.next();
			System.out.print(" 3교시 출석여부 입력 : ");	
			String 교시3 = scanner.next();
			
		// 4. 저장된 변수/객체 출력하기 
			System.out.println("\t\t[ 출석부 ] ");
			System.out.println("--------------------------------------------");
			System.out.println("이름\t1교시\t2교시\t3교시\t비고");
			System.out.println(이름+"\t"+교시1+"\t"+교시2+"\t"+교시3);
			System.out.println("--------------------------------------------");
	}
}


	// 문제1 : 
	/* 학생 한명의 이름과 1~3교시의 출석 여부를 입력받아 입력받은 값을 아래와 같이 출력
	* 	/*  출력결과 
	* 				[[ 출석부 ]]
	* --------------------------------------
	* 이름		1교시		2교시		3교시		비고
	* 강호동		출석			결석			출석
	* --------------------------------------
	*/












