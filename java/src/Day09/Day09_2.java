package Day09;

public class Day09_2 {
	public static void main(String[] args) {
		
		// p.236~237 예제코드2
		// 생성자로부터 필드 초기화
		
		// 1. 인수0개 전달하는 생성자로 객체 생성
		Korean k1 = new Korean();
			// k1은 국적o이름x주민등록x
		System.out.println(" k1 국적 : " + k1.nation);
		System.out.println(" k1 이름 : " + k1.name );
		System.out.println(" k1 주민등록번호 : " + k1.ssn );
		
		// 2. 인수2개 전달하는 생성자로 객체 생성 
		Korean k2 = new Korean("박자바","123456-123456");
			// k2은 국적o이름o주민등록o 
					// 이름과 주민등록번호를 생성자로부터 인수로 전달 
		System.out.println(" k2 국적 : " + k2.nation );
		System.out.println(" k2 이름 : " + k2.name);
		System.out.println(" k2 주민등록번호 : " + k2.ssn );
		
		// 3. 인수3개 전달하는 생성자로 객체 생성 
		Korean k3 = new Korean("일본","김자바","123456-123456");
		
		System.out.println(" k3 국적 : "+k3.nation);
		System.out.println(" k3 이름 : "+k3.name );
		System.out.println(" k3 주민등록번호 : "+k3.ssn);
		
		
		
		
		
		
		
		
		
		
		
	}
}
