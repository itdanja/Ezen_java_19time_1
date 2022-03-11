package Day11;

public class SmartTelevision implements RemoteControl , Searchable  {
							// extends 클래스 1개 [ 상속 1번 ] 
							// implements 여러개 인터페이스 [ 구현 여러번]
	private int volume;
	// 메소드 
	@Override
	public void turnOn() {
		System.out.println(" tv 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println(" tv 끕니다.");
	}
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if( volume < RemoteControl.MIN_VOLUME ) {
			this.volume = RemoteControl.MIN_VOLUME;	
		}else {
			this.volume = volume;
		}
		System.out.println(" 현재 tv 볼륨 : " + this.volume);
	}
	@Override
	public void search(String url) {
		System.out.println( url +"을 검색합니다.");
	}
	
	

}
