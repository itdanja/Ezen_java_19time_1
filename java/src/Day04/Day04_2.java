package Day04;

import java.util.Scanner;

public class Day04_2 { // c s

	public static void main(String[] args) { // m s 
		
		// ���ǹ� [ ��� / �Ǵܷ� / ����Ǽ� ]
			// �л����� 1000���ְ� ���������� �ݶ� ��Ͷ� �ɺθ�
				// 1. �л� ���������� �ݶ�[1200]�� ���� -> ���źҰ�[ �� ���� ]
				//    ����[�Ǵܷ�]
				// ���࿡ A�������� �ݶ� 1000������ �ʰ��̸� = B���������� ����
				// ���࿡ B�������� �ݶ� 1000������ ���ϸ�  = �����ϰ� ����
		
					// Ȱ��
						/*
						 *  if(  1000 >= a�������ݶ� ) ������ ���� 
						 *  else if( 1000 >= b�������ݶ� ) ������ ����
						 *  else if( 1000 >= c�������ݶ� ) ������ ���� 
						 *  else ���Ž��� ���� 
						 * 
						 */
		
			// 1. ���ǽ� ? �� : ���� 
			// 2. if
				// 1. if( ���� ) ���ϰ�� �����ڵ�;
				// 2. if( ���� ) ���ϰ�� �����ڵ�
				//    else �����ϰ�� �����ڵ�;
				// 3. if( ����1 ) {  ��1 }
				//    else if( ����2 ) { ��2 }
				//    else if( ����3 ) { ��3 } 
				//	  else if( ����4 ) { ��3 }
				//    else { ����  }
		
		
		// ��1) ���� ����� true �̸� ���� o 
		if( 3>1 ) System.out.println("��1) 3�� 1���� ũ�� ");
		
		// ��2) ���� ����� false �̸� ����Ұ� x  
		if( 3>5 ) System.out.println("��2) 3�� 5���� ũ��");
		
		// ��3) ���� ����� true �̸� ���� false �̸� else ���� 
		if( 3>5 ) System.out.println("��3) 3�� 5���� ũ��.");
		else System.out.println("��3) 3�� 5���� �۴�!.");
		
		// ��4) { } �� ���Ǵ� ��� => �����ڵ尡 2���̻��ϰ�� Ȥ�� ; 2���̻��ϰ��
		if( 3>2 ) { // if s 
			System.out.println("��4) true�̸� ����"); 
			System.out.println("��4) 3�� 2���� ũ��.");
		} // if e
		else { // e s 
			System.out.println("��4) false�̸� ����");
			System.out.println("��4) 3�� 2���� �۴�.");
		} // e e
		
		// ��5) �پ��� ����Ǽ��� ���� ���� 
		if( 3>5 ) System.out.println(" ��5) 3�� 5���� ũ�� ");
		else if( 3>4 ) System.out.println(" ��5) 3�� 4���� ũ�� ");
		else if( 3>3 ) System.out.println(" ��5) 3�� 3���� ũ�� ");
		else if( 3>2 ) System.out.println(" ��5) 3�� 2���� ũ�� ");
		else System.out.println( "��5) true ����.");
		
		// ��5) 2
		if( 3>5 ) System.out.println(" ��5) 3�� 5���� ũ�� ");
		if( 3>4 ) System.out.println(" ��5) 3�� 4���� ũ�� ");
		if( 3>3 ) System.out.println(" ��5) 3�� 3���� ũ�� ");
		if( 3>2 ) System.out.println(" ��5) 3�� 2���� ũ�� ");
		else System.out.println( "��5) true ����.");
		
		// ����1) ����1�� �Է¹޾� ������ 90�� �̻��̸� �հ� �ƴϸ� ���հ� ��� 
			// 1. Ű����κ��� �Է¹޴´�. 
		Scanner scanner = new Scanner(System.in); // 1. �Է°�ü
			// 2. �Է¹��� ���� �����ͼ� ������ ���� 
		System.out.print("���� �Է� : "); // �Է� �ȳ�
		int ����1 = scanner.nextInt(); // 2. �Է°��� ������ ���� 
			// 3. ��/����
		if( ����1 >= 90 ) System.out.println("�հ��Դϴ�."); // 3. �񱳰�� ���ϰ�� 
		else { System.out.println("���հ��Դϴ�."); }   // 3.�񱳰�� �����ϰ��
			// 4. ����Ѵ�
		
		// ����2) ����2�� �Է¹޾� ������ 90�� �̻��̸� A���
		//						������ 80�� �̻��̸� B���
		//						������ 70�� �̻��̸� C���
		//						�׿� �����
			// 1. Ű����κ��� �Է¹޴´�. [ ���� scanner ��ü�� �����ϴ� ���� ] 
			// 2. �Է¹��� ���� �����ͼ� ������ ���� 
		System.out.print("���� �Է� : "); // �Է��� ������ �������� �ȳ���� 
		int ����2 = scanner.nextInt(); // 2.�Է°��� ������ �����Ѵ�.
			// 3. �� / ���� �� ���
		if( ����2 >= 90 ) { System.out.println("A���"); }
		else if( ����2 >=80 ) {System.out.println("B���");}
		else if( ����2 >=70 ) {System.out.println("C���");}
		else { System.out.println("�����"); }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // m e 
} // c e 
