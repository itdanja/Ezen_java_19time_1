package Day07;

import java.util.Scanner;

public class Day07_3 {
	
	/*
	 * ȸ���� ���α׷� [ �ִ� ȸ�� 100�� ]
		1. �޴� [ 1.ȸ������ 2.�α��� ]
		2. ȸ������ ����������
			1.���̵�� ��й�ȣ �Է¹޾� �迭�� ���� 
		3. �α��� ���������� 
			1.���̵�� ��й�ȣ�� ������ �����ϸ� �α��μ���
			2.�������� ������ �α��� ���� 
		
		[ ���� ]
		1. ȸ������ ���̵� �ߺ�üũ
		2. �α��� ������ �޴� ���
			[ �α��θ޴� ]
			1. ȸ�����
			2. ȸ��Ż��
			3. �α׾ƿ� 
	 */
	
	public static void main(String[] args) {
		
		// 0.����
		Scanner scanner = new Scanner(System.in);
		String[] idlist = new String[100]; // ���ڿ� 100���� �����Ҽ� �ִ� �迭 
		String[] pwlist = new String[100];
		
		// 1. ���α׷� ������ [ ���ѷ��� ]
		while(true) { // ���ѷ���   [ ���� ���� : break ����Ǵ� ��� ]
			
			System.out.println(" ------ ȸ���� ������ ------");// 0. �޴� 
			System.out.println(" 1. ȸ������ 2. �α��� 3.����");
			System.out.print("���� : "); int ch = scanner.nextInt();
			if( ch == 1 ) { // 1. ȸ������ 
				System.out.println(" ------ ȸ������ ������ -------");
				System.out.print(" signup id :");			String id = scanner.next();
				System.out.print(" signup password : ");	String pw = scanner.next();
				// 1. �迭�� ���ڸ��� ã�Ƽ� �����ϱ� 
				for( int i = 0 ; i<idlist.length; i++ ) {
					if( idlist[i] == null ) { idlist[i] = id; pwlist[i] = pw; }
					// i��° �ε��� �迭�� null �̸� �Է¹��� id�� �ش� i��° �ε����� ���� 
				}
				// 2. id�� ������ �����ϸ� �Ұ� [ id ���Է� ] 
			} 
			else if( ch == 2 ) { // 2. �α��� 
				System.out.println(" ------ �α��� ������ ------- ");
				System.out.print(" login id : ");		String id = scanner.next();
				System.out.print(" login password : ");	String pw = scanner.next();
				// �迭�� ������ ���̵�,�н����� ã�� 
				boolean login = false; // �α��� ���� ���� ���� �ϴ� ���� 
				for( int i = 0 ; i<idlist.length; i++ ) {
					// ���̵� ���� 
					if( idlist[i] != null && idlist[i].equals(id) ) {
						// ������ �ƴϸ鼭 �Է¹��� ���̵�� �����ϸ� 
						// �н����� ���� 
						if( pwlist[i] !=null && pwlist[i].equals(pw) ) {
							login = true;
							// �α��� ���� 
							System.out.println(" >> �α��� ���� >> ");
								// �α��� ������ ������ �ڵ� [ ���Ŀ� �ڵ� �߰� ] 
							break; // ã������ �ݺ��� ����
						}
					}
				}		
				if( login==false) System.out.println(" >> �α��� ���� >>");
				
			} 
			else if( ch == 3 ) { System.out.println(" >> ���α׷� ����"); break; } // 3. ���� 
			else { System.out.println(" >> �˼� ���� ��ȣ �Դϴ�."); } // 4. �׿� 
			
		} // while end 
	} // main end 
} // class end 










