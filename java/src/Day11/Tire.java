package Day11;

public class Tire { // 타이어 클래스 // 부모클래스[슈퍼클래스]
	// 1.필드
	public int maxRotation; // 최대 회전가능수[수명]
	public int accumulatedRotation; // 누적회전수
	public String location; // 타이어의 위치
	// 2.생성자
	public Tire(String location ,  int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	// 3.메소드 
	public boolean roll() { // 회전메소드 
		++accumulatedRotation; // 누적회전수 : 누적회전수에 +1 증가
		if( accumulatedRotation < maxRotation ) { // 만약에 누적회전수보다 최대회전가능수가 더 크면 
			// 수명이 남았으면 
			System.out.println(location+" Tire 수명 : " + ( maxRotation-accumulatedRotation)+"회" );
			return true; // 수명 남음 
		}else { // 수명이 남아있지 않으면 [ 누적회전수가 최대회전가능수 더 크거나 작으면 ] 펑크
			System.out.println("*** "+location+" Tire 펑크 ***");
			return false; // 수명 없음 
		}
	}
}





