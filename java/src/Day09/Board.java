package Day09;

import java.util.Scanner;

public class Board {
	// Board �Խ��� Ŭ���� ���� 
	
	// 1. �ʵ� [ �����Ͱ� ����Ǵ� �� ]
	String title;
	String content;
	String wrier;
	
	// 2. ������
		// 1. �������
	public Board() {}
		// 2. ��� �ʵ带 �޴� ������ 
	public Board(String title, String content, String wrier) {
		super();
		this.title = title;
		this.content = content;
		this.wrier = wrier;
	}
	// 3. �޼ҵ� 
		// 1. ��� �� ��� �޼ҵ�
	public void getboardlist( Board[] boardlist ) { // �μ�o=>�迭 ��ȯx
		System.out.println("�۹�ȣ\t����\t�ۼ���\t����");
		for( int i = 0 ; i<boardlist.length ; i++) {
			if( boardlist[i] != null ) { // i��° �ε����� null �̸� �Խù� ����.
				System.out.println(i+"\t"+boardlist[i].title+"\t"+
							boardlist[i].wrier+"\t"+boardlist[i].content );
			}
		}
	} // ��� �� ��� �޼ҵ� end 

	// 2. �۾��� �޼ҵ� 
	public void write( Board[] boardlist ) {
		// 1. 3���� �Է¹޾� 3���� ���� ���� 
		Scanner scanner = new Scanner(System.in);
		System.out.println("---------------- �۾��� ������ -------------");
		System.out.print(" ���� : ");	String title = scanner.next();
		System.out.print(" ���� : ");  String content = scanner.next();
		System.out.print(" �ۼ��� : "); String writer = scanner.next();
		// 2. 3���� ������ ��ü�� ���� 
		Board board = new Board(title, content, writer);
		// 3. �迭�� ������� ã�Ƽ� ��ü�� ���� 
		for( int i = 0 ; i<boardlist.length ; i++) {
			if( boardlist[i] == null ) { // i��° �ε����� null �̸� �Խù� ����.
				boardlist[i] = board; // �ش� i��° �ε����� ���ο� �Խù� �ֱ�
				break; // �Խù� �־����� �ݺ�������
			}
		}
	} // �۾��� �޼ҵ� end 
	
		// 3. �ۻ��� �޼ҵ� 
	public void delete( Board[] boardlist ) {
		//1. ������ ��ȣ �Է¹ޱ� [ �����ҹ�ȣ == �ε��� ]
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �� ��ȣ : "); 
		int ������ȣ = scanner.nextInt();
		// 2. �ش� ������ȣ[�ε���]�� �迭������ null ���� 
		boardlist[������ȣ] = null; // �ش� �ε����� null ���� => ����ó�� 
		System.out.println(" �˸�]] ���� �Ǿ����ϴ�.");
	} // �ۻ��� �޼ҵ� end 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
