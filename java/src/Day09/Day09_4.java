package Day09;

public class Day09_4 {
	
	public static void main(String[] args) {
		
		//p.256~257 �޼ҵ� ��ȯŸ��[return��]
			// 1. void : ���ϰ��� ���� �޼ҵ� 
		
		// 1. ��ü ����  [ �⺻�����ڷ� ��ü ���� ]
		Car2 mycar = new Car2();
		// 2. �޼ҵ� ȣ��  [ �޼ҵ带 ���ؼ� �ʵ� ���� ] [ ������ ]
		mycar.setGas( 5 ); // ��ü�� gas �ʵ忡 5 ���� 
		// * �ʵ带 �̿��� ���� ���� 
		mycar.gas = 5; // �ʵ�� �ٷ� ���� [ ������ ( ����õ ) ]
		
		// 3. �޼ҵ� ȣ�� 
		boolean gasState =  mycar.isLeftGas();
		if( gasState ) {
			System.out.println("����մϴ�.");
			mycar.run();
		}
		
		// 4. �޼ҵ� ȣ�� 
		if( mycar.isLeftGas() ) {
			// ���࿡ isLeftGas �޼ҵ� ��ȯ���� true �̸� 
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		}else {
			System.out.println("gas�� �������ּ���");
		}
		
	}

}




