package Day08;

public class Member {
	// 회원 클래스[설계도]
	
	// 1. 필드 = 저장하는공간
	String id;
	String password;
	String name;
	String phone;
	
	// 2. 생성자 [ 생성자 이름은 클래스이름과 동일 하게]
		// 1. 빈생성자
	Member(){}
		// 2. 2개 필드를 받는 생성자 
	public Member(String id, String password) {
		this.id = id;
		this.password = password;
	}
		// 3. 모든 필드를 받는 생성자
	public Member(String id, String password, String name, String phone) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}
	
	
	// 3. 메소드 
}




