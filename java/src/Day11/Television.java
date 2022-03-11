package Day11;

public class Television implements RemoteControl {
					// extends 클래스 : 상속[연장하다]
					// implements 인터페이스 : 구현하다
	// 필드
	private int volume; // tv 소리;
	
	// 메소드  // ctrl+스페이바
	@Override // 생략 가능 
	public void turnOn() {
		System.out.println(" tv를 켭니다. ");
	}
	@Override
	public void turnOff() {
		System.out.println(" tv를 끕니다.");
	}
	@Override
	public void setVolume(int volume) {
		if( volume > RemoteControl.MAX_VOLUME ) { // 볼륨이 10초과이면 
			// 볼륨이 리모콘인터페이스의 최대소음보다 크면 
			this.volume = RemoteControl.MAX_VOLUME;
			// 볼륨은 리모콘인테페이스의 최대소음으로 설정 [ 10초과 불가능 ]
		}else if( volume< RemoteControl.MIN_VOLUME ) { // 볼륨이 0 미만이면 
			// 볼륨이 리모콘인테페이스의 최대소음보다 작으면 
			this.volume = RemoteControl.MIN_VOLUME;
			// 볼륨은 리모콘인터페이스의 최소소음으로 설정 [ 0미만 불가능 ] 
		}else { // 그외
			this.volume = volume;
		}
		System.out.println(" 현재 tv 볼륨 : " + this.volume);
	}
	
	
	
	
	
}
