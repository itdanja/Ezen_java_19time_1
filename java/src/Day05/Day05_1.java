package Day05;

import java.util.Scanner;

public class Day05_1 { //cs 
	public static void main(String[] args) { // ms
		// p.134 : if��
			// 1. ���[ ����Ǽ� ]
			// 2. ����
				// 1. if( ���� ) true���๮; 
				// 2. if( ���� ) true���๮;
		 		//    else false���๮;
				// 3. if( ����1 ) true���๮;
				// 	  else if( ����2 ) true���๮;
				//    else if( ����3 ) true���๮;
				//    else false���๮;
			// 3. ������ true[��]�̸� { } ������ ����.
		// ��1_p136
		int score = 80;	// int�� score������ 93���� �ʱ�ȭ
			// int : 4����Ʈ ��ŭ �����Ҽ� �ִ� ������ũ�� [ �⺻�ڷ��� ]
				// score : ������ [ �ƹ��ų� : ���� �̸� ���ϱ� ] 
		if( score >= 90 ) {  // ���࿡ score������ 90���̻��̸� 
			System.out.println("������ 90���� Ů�ϴ�.");
			System.out.println("����� A�Դϴ�.");
		} // ie
		if( score<90 ) { // ���࿡ score������ 90�̸��̸� 
			System.out.println("������ 90���� �۽��ϴ�.");
			System.out.println("����� B�Դϴ�.");
		} // ie
	
		// ��2_p.137
		int score2 = 85;	// ������ Ŭ������ ������ �������� ���Ұ�.
		
		if( score2 >= 90 ) { //  ���࿡ ������ 90���̻��̸� 
			System.out.println("������ 90���� Ů�ϴ�.");
			System.out.println("����� A�Դϴ�.");
		}else { // (�ƴϸ�) ������ 90���̻��� �ƴϸ� 
			System.out.println("������ 90���� �۽��ϴ�.");
			System.out.println("����� B�Դϴ�.");
		}
		
		// ��3_P.138
		int score3 = 75;
		if( score3>=90 ) { // 1. ���࿡ ������ 90�� �̻��̸� 
			System.out.println("������ 100~90�Դϴ�.");
		}else if( score3>=80 ) { // 2. �ƴϰ� ���࿡ ������ 80�� �̻��̸�  
			System.out.println("������ 80~89�Դϴ�.");
		}else if( score3>=70) { // 3. �ƴϰ� ���࿡ ������ 70�� �̻��̸� 
			System.out.println("������ 70~79�Դϴ�."); 
		}else { // 4. �׿� ������
			System.out.println("������ 70�̸��Դϴ�.");
		}

		// ����6 : �α���������
		// [ �Է� ] : ���̵�� ��й�ȣ�� �Է¹ޱ�
		// [ ���� ] : ȸ�����̵� admin �̰� 
		//           ��й�ȣ�� 1234 �� ��쿡�� 
		//          �α��� ���� �ƴϸ� �α��� ���� ���
		
		// ���̵�� ��й�ȣ �Է¹޾� ���ǿ� ���� ��� 
		// 1. �Է¹ޱ�.
		Scanner scanner = new Scanner(System.in); // ??  �Է°�ü [�Է½� �ʼ�]
		// 2. �����Ѵ�.
		System.out.print("���̵� : ");
		String id = scanner.next(); // �Է°�ü���� �о�� ���� ������ �����Ѵ�.
		System.out.print("��й�ȣ : ");
		String password = scanner.next();
		// 3. ����[��].
		if( id.equals("admin") ) { // is1
			// ���࿡ �Է¹��� id�� admin �̸�
				// ���ڿ�[String]�� �񱳿����ڸ� ����Ҽ��� ���� -> �̸� ������� �Լ� .equals
			if( password.equals("1234") ) { // is2
				//���࿡ �Է¹��� password�� 1234�̸� 
				System.out.println("�α��� ����");
			} // ie2
		} // ie1
		System.out.println("�α��� ����");
		// 4. ����Ѵ�.
		
		
		// p.141 switch��
			// 1. ��쿡���� ����
			// 2. ����
			//    switch( ���� ){
			//			case ��1 : ���๮; break;
			//			case ��2 : ���๮; break;
			//			default : ���๮; break;
			//	  }
		
			// 3.      if(������) : ����Ǽ� �ټ��϶� 
			//     vs switch(��������) : ����Ǽ� �Ҽ��� ������ ������ 
		
		// ��1_ p142
		int num = (int) (Math.random() *6 )+1;	 // 1~6���� ���� ���� 
		System.out.println(" ���� ����[1~6����] : " + num );
		switch( num ) {
			case 1 : System.out.println("1���� ���Խ��ϴ�."); 	break;
			case 2 : System.out.println("2���� ���Խ��ϴ�.");	break;
			case 3 : System.out.println("3���� ���Խ��ϴ�."); 	break;
			case 4 : System.out.println("4���� ���Խ��ϴ�."); 	break;
			case 5 : System.out.println("5���� ���Խ��ϴ�."); 	break;
			default : System.out.println("6���� ���Խ��ϴ�.");
		}
		
		// break : ���� ����� { } ����[������]
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // me
} // ce 





