package Day11;

public class Day11_4 {
	
	// p.383 인터페이스 사용 
	public static void main(String[] args) {
		
		System.out.println(" 1)-------------");
		// 1. 객체 생성 [ 텔레비전 인터페이스 ]
		Myclass myclass1 = new Myclass();
		// 2. 객체내 인터페이스 메소드 호출 
		myclass1.rc.turnOn();
		myclass1.rc.setVolume(5);
		
		System.out.println(" 2)--------------");
		// 1. 객체 생성 [ 생성자에 오디오 클래스를 인수로 전달 ] 
		Myclass myclass2 = new Myclass( new Audio() );
		
		System.out.println(" 3)---------------");
		
		// 1. 객체 생성
		Myclass myclass3 = new Myclass();
		myclass3.methodA(); // 오디오 클래스
		
		System.out.println(" 4)-------------------");
		
		// 1. 객체 생성 
		Myclass myclass4 = new Myclass();
		myclass4.methodB( new Television() ); // 텔레비전 인테페이스 
		
	}

}
