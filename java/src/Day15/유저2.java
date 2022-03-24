package Day15;

public class 유저2 extends Thread {
	
	private 계산기 my계산기;
	
	public void set계산기( 계산기 my계산기 ) {
		this.setName("유저2");
		this.my계산기 = my계산기;
	}
	@Override
	public void run() {
		my계산기.set메모리(50);
	}

}
