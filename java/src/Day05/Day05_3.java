package Day05;

import java.util.Scanner;

public class Day05_3 { // c s
	
	// �н����� :  1.��� // 2.����(����) // 3.�Է� // 4.���� // 5.�ݺ�
	
	public static void main(String[] args) { // m s 
		
		// �ֿܼ� Ű����ũ[���Ǳ�] ���α׷� 
			// ���� 
			// 1. �޴� [ 1.�ݶ�[300] 2.ȯŸ[200] 3.���̴�[100] 4.���� ]
			// 2. ��ǰ���� �����ؼ� ��ٱ��Ͽ� ���� ���� �������� �ѹ��� ����
			// 3. �ʱ� ���[ 10���� ] // �� �ǸŽ� ��� ���� // ����� ������ ���źҰ�
			// 4. ������ �ݾ��� �����ϸ� �����Ұ� Ȥ�� �����ݾ׺��� �ݾ��� �� ũ�� �ܵ� ��� 
		
		// 1. �������� ���� ����[����� ]
			Scanner scanner = new Scanner(System.in);	// 1. �Է°�ü 
			int �ݶ���� = 10;		int ȯŸ��� = 10; 	int ���̴���� = 10; // 2. �� ��ǰ�� ��� ���� 
			int �ݶ�ٱ��� = 0;		int ȯŸ�ٱ��� = 0;		int ���̴ٹٱ��� = 0;	// 3. �� ��ǰ�� ��ٱ��� ���� 
			
		// 2. ���α׷� 24�ð� ����
			while( true ) {	// ���ѷ��� 
				System.out.println("============= �Ե����� Ű����ũ ============= ");
				System.out.println(" 1.�ݶ�[300] 2.ȯŸ[200] 3.���̴�[100] 4.���� ");
				System.out.print(" >>>>>>> ���� : ");	
				int ���� = scanner.nextInt(); // ������ �Է¹ޱ� 
				// ���� 
				if( ���� == 1 ) { // ���࿡ �Է��� ���� 1�̸� 
					if( �ݶ���� == 0 ) {  // 1. ���࿡ ����� ������ ���źҰ� 
						System.out.println("[�˸�] �ݶ� ����� �����ϴ�. [�غ���]");
					}else { // �ƴϸ�  // ����� ������ 
						System.out.println("[�˸�] �ݶ��� ��ٱ��Ͽ� ����ϴ�."); 
						�ݶ�ٱ���++;	// ��ٱ��Ͽ� �ݶ� 1�� �߰�
						�ݶ����--;	// ������� �ݶ� 1�� ���� 
					}
				}				
				else if(���� == 2 ) { System.out.println("ȯŸ�� ��ٱ��Ͽ� ����ϴ�."); } 			// ���࿡ �Է��� ���� 2�̸� 
				else if( ���� == 3 ) { System.out.println("���̴��� ��ٱ��Ͽ� ����ϴ�."); } 		// ���࿡ �Է��� ���� 3�̸� 
				else if( ���� == 4 ) {
					System.out.println("============ ���� ������ ============"); 
					if( �ݶ�ٱ��� == 0 && ȯŸ�ٱ��� == 0 && ���̴ٹٱ��� == 0 ) {// ���࿡ ��� ��ǰ�� �ٱ��ϰ� 0�̸�  
						System.out.println("[�˸�] ������ ��ǰ�� �����ϴ�. ��ǰ �߰��� ���� ���ּ���!!!. ");
					}else {
						int �ѱݾ� = (�ݶ�ٱ���*300) + (ȯŸ�ٱ���*200) + (���̴ٹٱ���*100) ;	
						System.out.println("��ǰ��\t���ż���\t������");
						if( �ݶ�ٱ��� > 0 ) {  System.out.println(" �ݶ�\t"+�ݶ�ٱ���+"\t"+�ݶ�ٱ���*300); }
						System.out.println(" >>>>>>> �� ������ : " + �ѱݾ� );
					}
				} // ���࿡ �Է��� ���� 4�̸� 
				else { System.out.println("[�˸�] �˼����� ��ȣ �Դϴ�. �ٽ� �Է����ּ��� "); } // �׿� 
			}
	} // m e 
} // c e 








