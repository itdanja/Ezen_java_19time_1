package Day10;

public class 국민은행 extends 은행 {
			// 은행클래스로부터 상속받기 
	// 1.필드
	final String 은행코드 = "A-10";
		// final : 변수->상수만들기
		// final 변수는 변경(수정)불가 [ 고정값 ]
	// 2. 생성자
	public 국민은행( String 계좌번호 , String 비밀번호) {
		super(계좌번호, 비밀번호, 0); // 부모클래스내 생성자 호출 
	}
}
