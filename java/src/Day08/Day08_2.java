package Day08;

import java.util.Scanner;

public class Day08_2 {
	
	// Day01 : �����
	// Day02 : ����
	// Day03 : ����
	// Day04 : if ���
	// Day05 : while �ݺ���
	// Day06 : for �ݺ���
	// Day07 : �迭 
	
	
	public static void main(String[] args) {
		
		// �غ�
		Scanner scanner = new Scanner(System.in); // �Է°�ü
		Member[] memberlist = new Member[100];
		// 100���� member ��ü�� �����Ҽ� �ִ� �迭 ���� 
		// �迭 ���� : �ڷ���/Ŭ������[] �迭�̸� = new �ڷ���/Ŭ������[���尳��];
		while(true) { 	// ���α׷� ���ѷ���
			
			System.out.println(">>>>>>>>>> ȸ���� >>>>>>>>>>");
			System.out.println(" 1.ȸ������ 2.�α��� ");
			System.out.print(">>> ����: ");
			int ch = scanner.nextInt();
			
			if( ch== 1 ) {
				System.out.println(">>>>> ȸ������ ������ >>>>>");
				System.out.print(" ���̵� : ");	String id = scanner.next();
				System.out.print(" ��й�ȣ : ");	String password = scanner.next();
				System.out.print(" �̸� : ");		String name = scanner.next();
				System.out.print(" ����ó : ");	String phone = scanner.next();
				// 4�� ���� ----> ��ü ���� 
				Member member = new Member(id,password,name,phone);
				// ��ü�� �迭�� ������� �����ϱ�
				// 1. �迭�� ������� ã�´�.
				for( int i = 0 ; i<memberlist.length; i++) {
					// i�� 0���� �迭�� ���̸�ŭ 1�������ϸ� �ݺ�ó�� 
					if( memberlist[i] == null ) {
						// 2. ������� ��ü �־��ֱ�
						memberlist[i] = member;
						System.out.println(" �˸�] ȸ������ ���� ");
						break; // ���ο� ��ü�� �־����� �ݺ������� // ȸ������ ���� 
					}
				}
			}
			else if( ch==2 ) {
				System.out.println(">>>>> �α��� ������ >>>>>>");
				System.out.print(" ���̵� : ");	String id = scanner.next();
				System.out.print(" ��й�ȣ : ");	String password = scanner.next();
				// �迭�� ������ id�� password ã�� 
				for( int i = 0 ; i<memberlist.length ; i++) {
					if( memberlist[i] !=null &&
							memberlist[i].id.equals(id) && 
							memberlist[i].password.equals(password) ) {
						// 1. �迭�� i��° �ε��� ��ü�� ������ �ƴϸ� [ ������ ���Ҽ� ����. equals �Ұ� ]
						// 2. �迭�� i��° �ε��� ��ü�� id�� �Է¹��� id�� ������ 
						// 3. �迭�� i��° �ε��� ��ü�� password�� �Է¹��� passowrd�� ������ 
						System.out.println(" �˸�] �α��μ��� ");
						break;
					}
				}
			}
			else {
				System.out.println(" �˸�] �˼����� �ൿ �Դϴ�.");
			}
			
		}// while end 
	}// main end 
} // class end 
















