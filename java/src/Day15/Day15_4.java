package Day15;

import java.awt.Toolkit;
import java.util.Scanner;

public class Day15_4 {
	
	public static void main(String[] args) {
		
		// ��Ƽ������ ���� 
		// p.544 
			// 1. Thread.sleep( �и��� ) : �� ������ �Ͻ�����
				// �и��� : 1000/1��
				// ������ �Ϲݿ��ܰ� �߻� �ϹǷ� try{}catch( Exception e ){} ���� ���
//		Toolkit toolkit = Toolkit.getDefaultToolkit();
//		for( int i = 0 ; i<10 ; i++ ) {
//			//*i�� 0���� 10�̸����� 1�������ݺ� [ 0~9 =>10ȸ�ݺ�]
//			toolkit.beep(); // ������ ȣ��
//			// ������ ��� �Ͻ����� ����
//			try { Thread.sleep(3000); }catch( Exception e ) {}
//				// 3000�и��� => 3��
//		}
		// p.545 
			// 2. ������ �����ϰ� ���� 
		// 1. ������Ŭ���� ��ü ���� 
		PrintThread1 printThread = new PrintThread1();
		
		while( true ) { // ���ѷ��� 
			Scanner scanner = new Scanner(System.in);
			System.out.println(" 1.��Ƽ��������� 2.��Ƽ���������� ");
			int ch = scanner.nextInt();
			if( ch == 1 ) {
				printThread.start();// 2. �����尴ü�� ��Ƽ������ ����
			}else if( ch == 2 ) {
				printThread.setStop(true); // 3. �����带 �����ϰ� ����
			}
		}
		
	}

}









