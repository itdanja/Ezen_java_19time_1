package Day10;

import java.util.Scanner;

public class Day10_3 {
	
	// ���� ���α׷� [ Ŭ���� , ��� ] 
		// ���� Ŭ���� : ���µ�� , ���� , ��� , ��ü , �ܰ� �� 
		// �������� extends ����
		// �������� extends ����
		// �ϳ����� extends ����
	
	// main ���� �迭�� �����ϴ� ����  : main�޼ҵ� �� ���α׷� �������� ��� ���� 
		// �������� <----> ��������( {} ��ȣ������ ����� ������ {} �ۿ��� ���Ұ��� ) 
		// static : ���� ���� ����� 
			// ���α׷� ���۽� �޸��Ҵ�--> ���α׷� ����� �޸��ʱ�ȭ
		// final : ���� ���� ����� 
	static ����[] ���¸���Ʈ = new ����[1000];
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("1.���»��� 2.���� 3.��� 4.��ü 5.�ܰ�Ȯ��");
			int ch = scanner.nextInt();
				// �޼ҵ� ȣ���ϴ� ���
				���� bank = new ����(); // 1.��ü ���� 
			if( ch == 1 ) { bank.���µ��(); }// 2.�޼ҵ� ȣ��
			else if( ch == 2 ) { bank.����(); }
			else if( ch == 3 ) { bank.���(); }
			else if( ch == 4 ) { bank.��ü(); }
			else if( ch == 5 ) { bank.�ܰ�(); }
			else { System.out.println("�˸�]] �˼����� ��ȣ�Դϴ�.");}
			
		}
	} // main end
} // class end 

















