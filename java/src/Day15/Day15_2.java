package Day15;

public class Day15_2 {
	
	public static void main(String[] args) {
					// main 메소드에는 main스레드가 포함 [ 스레드 : 코드를 실행해주는 흐름 ] 
		// p.531 : 스레드 이름
			// 1. 메인스레드 이름 확인 
		Thread mainThread = Thread.currentThread();
						// Thread : 멀티스레드클래스  // Thread.currentThread() : 현재(실행중인)스레드 이름 호출
		System.out.println("프로그램 시작시 스레드이름(main메소드내 main스레드) : "+ mainThread.getName() );
			// 2. 멀티스레드 이름 확인
		ThreadA threadA = new ThreadA(); // 1. 멀티스레드 클래스로 객체 선언 
		System.out.println("작업 스레드 이름 : " + threadA.getName() ); // 2. 멀티스레드객체내 스레드 이름 호출 
		threadA.start(); // 3. 멀티스레드 실행  // 멀티스레드객체명.start()  -----> run메소드 호출되면서 멀티스레드 실행
			// 3. 멀티스레드 이름 확인
		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름 : " + threadB.getName() );
		threadB.start();
		
		
		
	}
}
