package Day12;

import java.util.ArrayList;
import java.util.Scanner;

public class Day12_5 {
	
	// ���������� [ ��� ���� ] 
		// private : ���� Ŭ���������� ��� ���� 
		// public : ������Ʈ�� ��� Ŭ���������� ��� ���� 
	
	// main�ۿ� �����ϴ� ���� : �ٸ� Ŭ���� ����ϱ� ���ؼ� 
	public static ArrayList<Bank> banklist = new ArrayList<>();
// ���������� ��������  Ŭ������ < Ŭ������> ��ü�� = new �����ڸ�<>();
	// static : main�޼ҵ�� ���þ��� ���α׷� ���۽� �޸��Ҵ� / ���α׷� ����� �޸� �ʱ�ȸ��
	public static void main(String[] args) {
		
		Bank call = new Bank(); // ������ڷ� ��ü ���� [ �޼ҵ�ȣ��� ]
		// ���Ϻҷ����� 
		call.���Ϻҷ�����();
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			try { // ����ó�� 
				System.out.println(" **** �������α׷� **** ");
				System.out.print(" 1.���µ�� 2.�Ա� 3.��� 4.�ܰ� ���� : ");
				int ch = scanner.nextInt(); // �����Է¹޴¸޼ҵ�
				// ���� �����Է½� ����[����]ó�� �߻� 
				if( ch == 1 ) { call.���µ��(); }
				else if( ch ==2 ) { call.�Ա�(); }
				else if( ch == 3 ) { call.���(); }
				else if( ch == 4 ) { call.�ܰ�(); }
				else { System.err.println(" �˸�]] �˼� ���� ��ȣ�Դϴ�.");}
			}catch( Exception e ) { // ���࿡ try{} ���� �߻��ϸ�
				System.err.println(" �˸�]] ���� �Է¸� �����մϴ�. ");
				scanner = new Scanner(System.in); // ���� ���빰 �ʱ�ȭ
			}
		}
		
	}
}
