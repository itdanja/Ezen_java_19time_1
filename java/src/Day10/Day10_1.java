package Day10;

public class Day10_1 {
	
	public static void main(String[] args) {
		
		// p.310 상속 
			// 1. 상속 : 부모가 자식에게 물려주는 행위 
			// 부모 클래스 = 상위 클래스 
			// 자식 클래스 = 하위 클래스 
			// 부모클래스의 멤버를 자식 클래스에게 물려주는 행위
			// 2. 목적 : 이미 잘 개발된 클래스를 재사용해서 새로운 클래스 
			// *중복되는 코드를 줄여준다.
			// 3. 현실 : 부모->자식 선택    // 프로그램 : 자식->부모 선택 
			// 4.선언 : 자식[서브]클래스 extends 부모[슈퍼]클래스 
			// 5.활용
				// 자식클래스객체.부모멤버 접근가능 
		
		// p311~p313 예제
		
		// 1. 자식클래스로 객체 생성 
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		// 2. 자식클래스 객체로 부모클래스내 필드 호출 
		System.out.println(" 모델 : " + dmbCellPhone.model );
		System.out.println(" 색상 : " + dmbCellPhone.color );
			// * 자식클래스로 객체 생성시 해당 객체는 부모클래스내 멤버도 사용가능 
		// 3. 자식클래스 객체로 본인클래스의 필드 호출 
		System.out.println(" 채널 : "+dmbCellPhone.channel );
		
		// 4. 자식클래스 객체로 부모클래스내 메소드 호출 
		dmbCellPhone.powerOn(); // 부모클래스 메소드 이지만 상속받았기때문에 가능
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요~");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		dmbCellPhone.sendVoice("아~ 예 반값습니다.");
		dmbCellPhone.hangUp();
		
		// 5. 자식클래스 객체로 본인클래스의 메소드 호출 
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}









