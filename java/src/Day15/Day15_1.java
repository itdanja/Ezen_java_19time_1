package Day15;

import java.awt.Toolkit;

public class Day15_1 {
	
	public static void main(String[] args) {
		
		// p.520 : 멀티 스레드 
			// 프로세스 : 운영체제(윈도우) 에서는 실행 중인 하나의 애플케이션(프로그램)
			// 운영체제로 부터 실행에 필요한 메모리를 (CPU에게)할당받아 애플리케이션의 코드를 실행
			// 스레드 : 한 가닥의 실 뜻 [ 유래 : 한 가지 작업을 실행하기 위해 순차적으로 실행할 코드를 실처럼 이어놓았다고 해서 ]
			// 멀티스레드 : 1개 프로세스에 2개 이상의 스레드 존재 
				// 메신저(카카오톡) : 채팅하면 파일전송을 동시에 가능
			// 메인스레드 : 자바를 만든 사람이 main() 메소드에 메인스레드 장착
				// * 애플케이션은 main()메소드 { }괄호안에 있는 코드가 가장 먼저 실행
			// 싱글스레드 : main() 메소드만 존재했을때
			// 멀티스레드 : main() 메소드 외 멀티스레드가 존재했을때
			
		// p.525 : 싱글스레드[main스레드]만 사용했을때
System.out.println(" ---------------------- 싱글스레드(소리따로 출력따로)------------------------");
		// 1. Toolkit클래스의 객체생성 : 소리 관련 메소드 제공
		Toolkit toolkit = Toolkit.getDefaultToolkit(); 
		// 2. 소리 5번 출력 
		for( int i = 0 ; i<5 ; i++ ) {
			toolkit.beep(); //비프음(소리) 호출
			// 소리가 1번 실행되는 도중에 반복문[코드] 5회를 마침
			// 그래서 중간에 일시정지[시간차]
			try {  // try {} 안에서 예외(에러) 가 발생하면 catch 이동 / 에러가 없으면 try{} 만 정상 실행
				Thread.sleep(500);  //밀리초( 1000/1초 ) : 500 -> 0.5초  / 1000 -> 1초
			// Thread.sleep( 밀리초 ) : 밀리초 만큼 현재 스레드를 일시정지[멈춤]
			}catch( Exception e ) { // 만약에 try 에러 발생시 아래 코드 실행 
				System.out.println("에러발생");
			}
		}
		// 3. 출력 5번 
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("띵");
			try { Thread.sleep(500); }catch(Exception e ) {}
		}
System.out.println(" --------------------- 인터페이스 멀티스레드(소리와출력 같이) -------------------------");
		// p.526
			// 1. 구현객체 선언	
//	 인터페이스명  구현객체명 = new 클래스명();
		Runnable beepTask = new BeepTask();
			// 2. 멀티스레드 객체 선언하는데 생성자에 멀티스레드 구현객체 넣기  
		Thread thread = new Thread(beepTask);
			// 3. 멀티스레드 시작 
		thread.start(); // run 메소드 호출 
		
		// 출력 
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("띵");
			try { Thread.sleep(500); }catch(Exception e ) {}
		}
System.out.println("--------------------- 클래스 멀티스레드(소리와출력 같이)--------------");
		// p.529
			// 1. 멀티스레드 객체 선언
		Thread thread2 = new BeepThread();
			// 2. 멀티스레드 실행
		thread2.start(); // start() -> run 메소드 호출
		
		//출력
		for( int i = 0 ; i<5 ; i++ ) {
			System.out.println("띵");
			try { Thread.sleep(500);}catch(Exception e ) {}
		}
		
		
		

















	}

}




