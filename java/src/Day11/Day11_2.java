package Day11;

public class Day11_2 {
	
	public static void main(String[] args) {
		
		// 1.��ü ���� 
		Car car = new Car();
		
		// 2. ��ü�� �޼ҵ� ȣ�� 
		for( int i =1 ; i<=5 ; i++) {
			int problemLocation = car.run(); // �޼ҵ� 5ȸ ����
				// Ÿ�̾�� 5ȸ ȸ�� 
			// 3. ����
			switch( problemLocation ) {
				case 1 : 
					System.out.println("�տ��� �ѱ�Ÿ�̾� ��ü");
					// Ÿ�̾ roll() �޼ҵ忡�� false ��ȯ�Ǹ� Ÿ�̾� ��ü
					car.frontLefTire = new HankookTire("�տ���", 15);
					break;
				case 2 :
					System.out.println("�տ����� ��ȣŸ�̾� ��ü");
					break;
				case 3 : 
					System.out.println("�ڿ��� �ѱ�Ÿ�̾� ��ü");
					car.backLeftTire = new HankookTire("�ڿ���", 14);
					break;
				case 4 :
					System.out.println("�ڿ����� ��ȣŸ�̾� ��ü");
					break;
			}
		
		
		
		} // for�� end 
	} // main end 
} // class end 
