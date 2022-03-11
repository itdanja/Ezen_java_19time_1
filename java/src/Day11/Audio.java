package Day11;

public class Audio implements RemoteControl {
				// 구현하다
	//필드
	private int volume;
	
	// 메소드 
	@Override
	public void turnOn() {
		System.out.println(" audio 켭니다. ");
	}
	
	@Override
	public void turnOff() {
		System.out.println(" audio 끕니다. ");
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
		System.out.println(" 현재 audio 볼륨 : " + this.volume);
	}
	

}
