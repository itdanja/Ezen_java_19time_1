package Day03;

import java.util.Scanner;

public class Day03_4 {
	
	public static void main(String[] args) {
		// 1.�Է��� �޴´� 2.�����Ѵ� 3.����Ѵ� 
		Scanner scanner = new Scanner(System.in); // �Է°�ü
		System.out.print(" �ۼ��� : ");	String �ۼ��� = scanner.next();
		System.out.print(" ���� : ");	String ���� = scanner.next();
		System.out.print(" ��¥ : ");	String ��¥ = scanner.next();
		System.out.println("-------------------�湮��------------------");
		System.out.println("| ���� | �ۼ��� |\t����\t| ��¥ |");
		System.out.println("|  1  | "+�ۼ���+"  |"+����+"|"+"|"+��¥);
		System.out.println("------------------------------------------");
	}

}
	/*
	  //����3 : �ϳ��� �湮�� �Է¹޾� ����ϱ� 
		/*[�Է¹ޱ�] : �ۼ��� , ���� , ��¥ 
		 *[ ��� ] 
		 *	---------------�湮��--------------------
		 *  | ���� | �ۼ��� | 	���� 	| ��¥  |
		 *  |  1    | ��ȣ�� |         �ȳ��ϼ���   | 09-28|
		 *  ----------------------------------------
		 */
 