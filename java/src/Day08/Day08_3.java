package Day08;

import java.util.Scanner;

public class Day08_3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Board[] boardlist = new Board[1000];
		// board ��ü�� 1000�� �����Ҽ� �ִ� �迭 ���� 
		
		while(true) {
			System.out.println(">>>>> ��ȸ�� Ŀ�´�Ƽ >>>>>");
			System.out.println("�۹�ȣ\t����\t�ۼ���\t����");
				// ��� �迭�� ��ü ����ϱ�  [ ��� �� ����ϱ� ]
				for( int i = 0 ; i<boardlist.length; i++ ) {
					// ������ ������ ��ü ����ϱ� 
					if( boardlist[i] !=null ) { // �迭�� i��° ��ü�� null �ƴϸ� 
						System.out.println( i +"\t"+boardlist[i].title +"\t"+  
											boardlist[i].writer +"\t"+  
											boardlist[i].content );
					}
				}
				
			System.out.println("1. �۾��� 2. �ۻ���");
			System.out.print("���� : ");
			int ch = scanner.nextInt();
			if( ch ==1 ) {
				System.out.println(">>>>>>>> �۾��� ������ >>>>>>>");
				scanner.nextLine(); // next ���� nextline ����ϸ� �ϳ��� ��޵Ǵ� �����߻� -> �ذ���
				System.out.print(" ���� : "); String title = scanner.nextLine();
				System.out.print(" ���� : "); String content = scanner.nextLine();
				System.out.print(" �ۼ��� : "); String writer = scanner.next();
				// 3������ ---> ��üȭ ���� [ 1�� ]
				Board board = new Board( title , content , writer ); 
				// �迭�� ���� ã�Ƽ� �迭�� �����ϱ� 
				for( int i = 0 ; i<boardlist.length ; i++ ) {
					// * i�� 0���� �迭 ���̸�ŭ 1�� �����ϸ鼭 ���� �ݺ�ó��
					if( boardlist[i] == null ) { // �迭�� i��° �ε����� ��ü�� null �̸� 
						boardlist[i] = board; // �迭�� i��° �ε����� ���ο� ��ü�� �־��ֱ� 
						System.out.println(" �˸�] ���ο� ���� �ۼ� �Ǿ����ϴ�.");
						break;
					}
				}
			}else if( ch == 2 ) {
				// �� ��ȣ �� �Է¹޾� �ش� �۹�ȣ�� �Խù� ��ü�� ���� [ null ���� ]
				System.out.println("������ �۹�ȣ �Է� : "); int ������ȣ = scanner.nextInt();
				boardlist[������ȣ] = null;
					// ���� : ������ �����ε��� �ڷ� ��� �ε��� ������ ��ĭ�� ����
				System.out.println(" �˸�] �ش� �Խñ� ���� �Ǿ����ϴ�. ");
				
			}else {
				System.out.println("�˸�)�˼����� ��ȣ�Դϴ�.");
			}
		}// while end 
	}// main end 	
} // class end 








