package Day03;

import java.util.Scanner;

public class Day03_3 {

	public static void main(String[] args) {
		//  �Է� -> ���� -> ��� 
		Scanner scanner = new Scanner(System.in);
		System.out.println("----- ȸ������ ������ -----");
		System.out.print("���̵� : ");	
		String id = scanner.next(); 
		
		System.out.print("��й�ȣ : ");	
		String pw = scanner.next();
		
		System.out.print("���� : ");	
		String name = scanner.next();
		
		System.out.print("�̸��� : ");	
		String email = scanner.next();
		
		System.out.println(">>>>>>> ȸ������ �Ϸ� ���� Ȯ�� >>>>>>>");
		System.out.printf("%6s\t%6s\t%6s\t%s\n" , "���̵�" , "��й�ȣ","����","�̸���");
		System.out.printf("%6s\t%6s\t%6s\t%s" , id , pw , name , email );
		
	}
}

// ����2 : 1���� ȸ������ ǥ ����� 
/* :  
	[�Էº���]
	���̵� , ��й�ȣ , ���� , �̸���  �Է¹޾� ����ϱ�
	
	[��� ��]
	>>>>>>>>>> ȸ������ �Ϸ� �Ʒ� ������ Ȯ�����ּ��� >>>>>>>>>
	 ���̵�		��й�ȣ		����			�̸���		
	 qwe		1234		���缮		itdanja@kakao.com
*/







