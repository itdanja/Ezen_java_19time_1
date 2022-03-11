package Day11;

public class HankookTire extends Tire {

	// 필드
	// 생성자
	public HankookTire( String location , int maxRotation) {
		super(location, maxRotation); //부모생성자 호출
	}
	// 메소드 
		// ctrl+스페이바 -> 오버라이드 메소드
		// Override : 부모클래스내 메소드 재정의[다시 작성]
		// 부모클래스에게 물려받은 메소드를 다시 정의
	
	@Override // 부모클래스에 이미존재하는 메소드를 다시 정의
	public boolean roll() {
		++accumulatedRotation; // 누적회전수 : 누적회전수에 +1 증가
		if( accumulatedRotation < maxRotation ) { // 만약에 누적회전수보다 최대회전가능수가 더 크면 
			// 수명이 남았으면 
			System.out.println(location+" 한국타이어 수명 : " + ( maxRotation-accumulatedRotation)+"회" );
			return true; // 수명 남음 
		}else { // 수명이 남아있지 않으면 [ 누적회전수가 최대회전가능수 더 크거나 작으면 ] 펑크
			System.out.println("*** "+location+" 한국타이어 펑크 ***");
			return false; // 수명 없음 
		}
	}
	
	
	
}
