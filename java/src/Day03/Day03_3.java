package Day03;

import java.util.Scanner;

public class Day03_3 {

	public static void main(String[] args) {
		//  입력 -> 저장 -> 출력 
		Scanner scanner = new Scanner(System.in);
		System.out.println("----- 회원가입 페이지 -----");
		System.out.print("아이디 : ");	
		String id = scanner.next(); 
		
		System.out.print("비밀번호 : ");	
		String pw = scanner.next();
		
		System.out.print("성명 : ");	
		String name = scanner.next();
		
		System.out.print("이메일 : ");	
		String email = scanner.next();
		
		System.out.println(">>>>>>> 회원가입 완료 정보 확인 >>>>>>>");
		System.out.printf("%6s\t%6s\t%6s\t%s\n" , "아이디" , "비밀번호","성명","이메일");
		System.out.printf("%6s\t%6s\t%6s\t%s" , id , pw , name , email );
		
	}
}

// 문제2 : 1명의 회원가입 표 만들기 
/* :  
	[입력변수]
	아이디 , 비밀번호 , 성명 , 이메일  입력받아 출력하기
	
	[출력 예]
	>>>>>>>>>> 회원가입 완료 아래 정보를 확인해주세요 >>>>>>>>>
	 아이디		비밀번호		성명			이메일		
	 qwe		1234		유재석		itdanja@kakao.com
*/







