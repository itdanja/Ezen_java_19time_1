package Day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Bank { // Ŭ��������
	//1.�ʵ�
	private String ���¹�ȣ;
	private String ��й�ȣ;
	private String ������;
	private int ���ݾ�;
	//2.������
	public Bank() {}
	public Bank(String ���¹�ȣ, String ��й�ȣ, String ������, int ���ݾ�) {
		super();
		this.���¹�ȣ = ���¹�ȣ;
		this.��й�ȣ = ��й�ȣ;
		this.������ = ������;
		this.���ݾ� = ���ݾ�;
	}
	//3.�޼ҵ�

	public void ���Ϻҷ�����() {
		try {
			FileInputStream inputStream = new FileInputStream("D:/java/�ڹ�����.txt"); // 1. �����Է�Ŭ����
			byte[] bytes = new byte[1000]; // 2. �迭 ����
			inputStream.read( bytes ); // 3. ����Ʈ�� �о�ͼ� �迭�� ����
			String ���ϳ��� = new String(bytes); // 4. ����Ʈ�� -> ���ڿ� ��ȯ 
			String[] ���¸�� =  ���ϳ���.split("\n"); 	// 5. ���º��� �ڸ��� [  ���ڿ�.split("���ع���") : ���ع��� �������� �ڸ���[����]
			for( int i = 0 ; i<���¸��.length ; i++ ) { 
				String[] �ʵ��� = ���¸��[i].split(",");  // 6. ���º��� �ʵ� �ڸ��� 
				Bank bank = new Bank(�ʵ���[0], �ʵ���[1],  // 7. �� �ʵ带 �־ ��üȭ 
						�ʵ���[2], Integer.parseInt( �ʵ���[3] ) );
									// Integer.parseInt( "���ڿ�" )  : ���ڿ� -> ������ ��ȯ
				Day12_5.banklist.add(bank); // 9. �ش� ��ü�� ����Ʈ�� ���� 
			}
		}catch( Exception e ) {}
	}
	public void ��������() {
		try {
			// 1. �������Ŭ����
			FileOutputStream outputStream = new FileOutputStream("D:/java/�ڹ�����.txt");
			// 2. �ۼ��� ���� [ ����Ʈ ]
			for( int i = 0 ; i<Day12_5.banklist.size() ; i++ ) {
				Bank bank = Day12_5.banklist.get(i); // ����Ʈ�� i��° ȣ�� 
				String �ۼ����� = bank.���¹�ȣ +","+bank.��й�ȣ+","+bank.������+","+bank.���ݾ�+"\n";
				outputStream.write( �ۼ�����.getBytes() ); // 3. �������� 
			}
		}catch( Exception e ) {
		}
	}
	public void ���µ��() { 		// 1. ���µ��
		Scanner scanner = new Scanner(System.in); // 1. �Է¹ޱ� 
		System.out.println(" *** ���µ�� ***"); 
		System.out.print(" ���¹�ȣ : ");	String ���¹�ȣ = scanner.next();
		System.out.print(" ��й�ȣ : "); String ��й�ȣ = scanner.next();
		System.out.print(" ������ : ");	String ������ = scanner.next();
		Bank bank = new Bank(���¹�ȣ, ��й�ȣ, ������, 0); // 2. ��üȭ [ ����4�� ---> 1�� ��ü ]
		Day12_5.banklist.add(bank); //  // 3. ����Ʈ�� ���� [ ����Ʈ�� �������ε����ڿ� �ڵ� �߰� ]
		System.out.println(" *** ���µ���� �Ϸ�Ǿ����ϴ�. *** ");
		��������(); // 4.����ó�� 
	}
		// 2. �Ա�
	public void �Ա�() {
		System.out.println(" *** �Ա� *** ");
	}
		// 3. ���
	public void ���() {
		System.out.println(" *** ��� *** ");
	}
		// 4. �ܰ� / �����¸��
	public void �ܰ�() {
		System.out.println(" *** �ܰ� *** ");
	}
	

	
	
	
	
	
	
	
}
