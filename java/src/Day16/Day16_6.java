package Day16;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Day16_6 {

	public static void main(String[] args) {
	
		// ��ȭ��ȣ�� ���α׷�  [ +����ó�� +Ŭ���� +����Ʈ ]
			// �̸� , ��ȭ��ȣ , ��ϳ�¥ 
			// �޴� : 1.�߰� 2.���� 
		
		ArrayList<��ȭ��ȣ> ��ȭ��ȣ��� = new ArrayList<>();
		
		// ���Ϻҷ�����[����]
		
		while(true) { // ���ѷ��� 
			// ���
			System.out.println("===============��ȭ��ȣ��===============");
			System.out.println("����\t�̸�\t�����\t\t��ȭ��ȣ");
			int i = 0 ; // �ݺ�ȸ�� üũ [ �ε��� ��� ]
			for(  ��ȭ��ȣ temp : ��ȭ��ȣ��� ) {
				// ��¥ ���� ��ȯ
				SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd");
				System.out.println((i+1)+"\t"+temp.�̸�+"\t"+
								 	 dateFormat.format( temp.����� ) +
								 	 "\t"+temp.��ȭ��ȣ);
				i++ ; // �ε��� ����
			}
			
			Scanner scanner = new Scanner(System.in); // �Է°�ü ���� 
			System.out.print("1.�߰� 2.���� : ");
			int ch = scanner.nextInt();
			if( ch == 1 ) {
				// 1. ���� �Է¹ޱ� 
				System.out.print(" �̸� : ");		String �̸� = scanner.next();
				System.out.print(" ��ȭ��ȣ : ");	String ��ȭ��ȣ = scanner.next();
					Date ��ϳ�¥ = new Date(); // ���糯¥/�ð�
				// 2. 3�� ���� -> 1�� ��üȭ
				��ȭ��ȣ temp = new ��ȭ��ȣ(�̸�, ��ȭ��ȣ, ��ϳ�¥);
				// 3. �������� �����ϱ� ���� ����Ʈ�� ���� 
				��ȭ��ȣ���.add(temp);
				// 4. ����ó�� 
				try {// 1. ���Ͼ��� Ŭ���� [ ������ ����ó�� �ؾ��� = �Ϲݿ��ܹ߻� ]
					FileOutputStream outputStream = new FileOutputStream("d:/java/��ȭ��ȣ��.txt");
					// 2. ����Ʈ�� ��� ��ȭ��ȣ�� �ϳ��� ���Ͽ� ����
					for( ��ȭ��ȣ temp2 : ��ȭ��ȣ��� ) {
						String ���ϳ��� = temp2.�̸� +"\t"+
										temp2.��ȭ��ȣ+"\t"+
										temp2.�����+"\n";
						// ��ȭ��ȣ��[��ü��] ���� : \n			// ��ü�� �ʵ� ���� : \t
						outputStream.write( ���ϳ���.getBytes() ); // ���ڿ�->����Ʈ�� ��ȯ�� ���� ����
						// ��Ʈ���� ����Ʈ�� ������ �����ϴ�.
					}
				}
				catch (Exception e) {}
				
			}else if( ch == 2 ) {
				System.out.println(" ������ ������ȣ : " );
				int ������ȣ = scanner.nextInt();
				try { // ����ó�� : ���࿡ �������� �ʴ� ������ȣ�� �Է½ÿ��� ���� �߻� -> catch �̵�
					��ȭ��ȣ���.remove(������ȣ-1);
				}
				catch (Exception e) {}
			}
		}
	}
}









