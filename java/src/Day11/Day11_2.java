package Day11;

public class Day11_2 {
	
	public static void main(String[] args) {
		
		// 1.객체 생성 
		Car car = new Car();
		
		// 2. 객체내 메소드 호출 
		for( int i =1 ; i<=5 ; i++) {
			int problemLocation = car.run(); // 메소드 5회 실행
				// 타이어당 5회 회전 
			// 3. 제어
			switch( problemLocation ) {
				case 1 : 
					System.out.println("앞왼쪽 한국타이어 교체");
					// 타이어내 roll() 메소드에서 false 반환되면 타이어 교체
					car.frontLefTire = new HankookTire("앞왼쪽", 15);
					break;
				case 2 :
					System.out.println("앞오른쪽 금호타이어 교체");
					break;
				case 3 : 
					System.out.println("뒤왼쪽 한국타이어 교체");
					car.backLeftTire = new HankookTire("뒤왼쪽", 14);
					break;
				case 4 :
					System.out.println("뒤오른쪽 금호타이어 교체");
					break;
			}
		
		
		
		} // for문 end 
	} // main end 
} // class end 
