package Day09;

import java.util.Scanner;

public class Day09_6 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Board[] boardlist = new Board[100];
		
		while(true) {
			System.out.println("------ ��ȸ�� Ŀ�´�Ƽ -------");
				// ��� �� ��� �޼ҵ� 
				Board board = new Board(); // 1.������ڷ� ��ü�� ����� 
				board.getboardlist(boardlist); // 2. getboardlist �޼ҵ� ȣ�� [ �μ� = �迭 ]

			System.out.println("1.�۾��� 2.�ۻ���");
			System.out.print(" ���� :");
			int ch = scanner.nextInt();
			
			if( ch == 1 ) {
				board.write(boardlist); // 3.write�޼ҵ� ȣ��
			}
			else if( ch == 2 ) {
				board.delete(boardlist); // 4. delete�޼ҵ� ȣ�� 
			}
			else {
				System.out.println(" �˸�] �˼����� ��ȣ�Դϴ�.");
			}
			
		} // while end 
	} // main end 
} // class end 
