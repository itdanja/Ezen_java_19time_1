package Day11;

public class SmartTelevision implements RemoteControl , Searchable  {
							// extends Ŭ���� 1�� [ ��� 1�� ] 
							// implements ������ �������̽� [ ���� ������]
	private int volume;
	// �޼ҵ� 
	@Override
	public void turnOn() {
		System.out.println(" tv �մϴ�.");
	}
	@Override
	public void turnOff() {
		System.out.println(" tv ���ϴ�.");
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
		System.out.println(" ���� tv ���� : " + this.volume);
	}
	@Override
	public void search(String url) {
		System.out.println( url +"�� �˻��մϴ�.");
	}
	
	

}
