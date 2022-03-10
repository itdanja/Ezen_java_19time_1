package Day10;

public class CellPhone { // 핸드폰 설계도
	// 클래스내 멤버[구성]
	// 1. 필드 : 데이터가 저장되는 곳 
	String model;
	String color;
	// 2. 생성자 : 객체생성시 초기화[초기값]
	
	// 3. 메소드 : 동작 , 행동 	
	void powerOn() { System.out.println("전원을 켭니다."); } // 1. 인수x반환x
	void powerOff() {System.out.println("전원을 끕니다."); } // 2. 인수x반환x
	void bell() {System.out.println("벨이 울립니다.");} 	// 3. 인수x반환x
	void sendVoice(String message) {System.out.println("자기 : "+message);} 		// 4. 인수o반환x
	void receiveVoice(String message) {System.out.println("상대방 : "+message);}	// 5. 인수o반환x
	void hangUp() 	{System.out.println("전화를 끊습니다.");} // 6.인수x반환x
	
	
	
	
}
