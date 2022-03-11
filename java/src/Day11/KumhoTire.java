package Day11;

public class KumhoTire extends Tire {
					// Tire 클래스로부터 상속받기 
	// 필드
	// 생성자
	public KumhoTire(String location , int maxRotation) {
		super(location, maxRotation); // 부모클래스내 생성자호출
	}
	
	// 메소드
		// override : 오버라이드 [ 부모클래스내 메소드 재정의 ]
	@Override
	public boolean roll() {
		++accumulatedRotation; // 누적회전수 : 누적회전수에 +1 증가
		if( accumulatedRotation < maxRotation ) { // 만약에 누적회전수보다 최대회전가능수가 더 크면 
			// 수명이 남았으면 
			System.out.println(location+" 금호타이어 수명 : " + ( maxRotation-accumulatedRotation)+"회" );
			return true; // 수명 남음 
		}else { // 수명이 남아있지 않으면 [ 누적회전수가 최대회전가능수 더 크거나 작으면 ] 펑크
			System.out.println("*** "+location+" 금호타이어 펑크 ***");
			return false; // 수명 없음 
		}
	}
	

}
