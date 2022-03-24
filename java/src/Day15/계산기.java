package Day15;

public class 계산기 {
	
	// 1.필드
	private int 메모리;
	// 2.생성자
	
	// 3.메소드 
	public int get메모리() {
		return 메모리;
	}
	// 3. 메소드 
	// 2개이상의 스레드가 동일한 메소드의 호출했을때 문제발생
	// 해결책 : synchronized : 동기화
	// [ 2개이상의 스레드가 동일한 메소드 호출시 1개의 
	//  스레드가 순차적으로 처리할수 있게 대기줄 만들기 ] 
	
	public synchronized void set메모리( int 메모리 ) {
		this.메모리 = 메모리; // 외부로 인수로 받은 메모리를 저장 
		
		try { Thread.sleep(2000); } // 2초간 일시정지
		catch( Exception e ) {}
		
		System.out.println(Thread.currentThread().getName()
				+": "+this.메모리); // 메모리 출력
	}
}
