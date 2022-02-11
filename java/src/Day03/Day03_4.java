package Day03;

import java.util.Scanner;

public class Day03_4 {
	
	public static void main(String[] args) {
		// 1.입력을 받는다 2.저장한다 3.출력한다 
		Scanner scanner = new Scanner(System.in); // 입력객체
		System.out.print(" 작성자 : ");	String 작성자 = scanner.next();
		System.out.print(" 내용 : ");	String 내용 = scanner.next();
		System.out.print(" 날짜 : ");	String 날짜 = scanner.next();
		System.out.println("-------------------방문록------------------");
		System.out.println("| 순번 | 작성자 |\t내용\t| 날짜 |");
		System.out.println("|  1  | "+작성자+"  |"+내용+"|"+"|"+날짜);
		System.out.println("------------------------------------------");
	}

}
	/*
	  //문제3 : 하나의 방문록 입력받아 출력하기 
		/*[입력받기] : 작성자 , 내용 , 날짜 
		 *[ 출력 ] 
		 *	---------------방문록--------------------
		 *  | 순번 | 작성자 | 	내용 	| 날짜  |
		 *  |  1    | 강호동 |         안녕하세요   | 09-28|
		 *  ----------------------------------------
		 */
 