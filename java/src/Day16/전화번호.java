package Day16;

import java.util.Date;

public class 전화번호 {
	// 클래스 [ 객체의 설계도 ]
		// 설계도를 이용한 객체 대량 생성
		// 멤버 : 필드 , 생성자 , 메소드 
	// 1. 필드 
	String 이름;
	String 전화번호;
	Date 등록일;
	// 2. 생성자
	public 전화번호() {}
	
	public 전화번호(String 이름, String 전화번호, Date 등록일) {
		this.이름 = 이름;
		this.전화번호 = 전화번호;
		this.등록일 = 등록일;
	}
	
	// 3. 메소드 [ x ]
	
}
