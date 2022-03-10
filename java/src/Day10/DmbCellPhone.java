package Day10;

public class DmbCellPhone extends CellPhone {
					// extends : 연장하다..[ 상속 ] // 핸드폰클래스가 DMB핸드폰에게 상속 주기
	// 1.필드
	int channel;
	// 2.생성자
	DmbCellPhone( String model , String color , int channel) {
		this.model = model;
		this.color = color;
		// 모델,색상 필드 : 현재 클래스에 없는 필드
		// 상속(extends)을 받으면 자식클래스에서 부모클래스내 멤버 사용가능
		this.channel = channel;
	}
	// 3.메소드 
	void turnOnDmb() {
		System.out.println("채널 : " + channel+"번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb( int channel ) {
		this.channel  = channel;
		System.out.println("채널 : " + channel+"번으로 바뀝니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신 멈춥니다.");
	}
	

}
