package Day10;

import java.util.Scanner;

public class ���� { // ����Ŭ����[�θ�Ŭ����]
	// 1. �ʵ�
	String ���¹�ȣ;
	String ��й�ȣ;
	int ���ݾ�;
	// 2. ������
	public ����() {} // [�μ�0��] �������
	
	public ����(String ���¹�ȣ, String ��й�ȣ, int ���ݾ�) { // [�μ�3��]������ 
		this.���¹�ȣ = ���¹�ȣ;
		this.��й�ȣ = ��й�ȣ;
		this.���ݾ� = ���ݾ�;
	}
	// 3. �޼ҵ� 
		// 1. ���µ�� �޼ҵ� 
	public void ���µ��() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" *** ���µ�� *** ");
		System.out.print(" 1.���� 2.���� 3.�ϳ� ���� : "); int Ÿ�� = scanner.nextInt();
		System.out.print(" ���¹�ȣ : "); String ���¹�ȣ = scanner.next();
		System.out.print(" ��й�ȣ : "); String ��й�ȣ = scanner.next();
		
		if( Ÿ�� == 1 ) { 
			�������� bank = new ��������( ���¹�ȣ , ��й�ȣ );
			for( int i = 0 ; i<Day10_3.���¸���Ʈ.length ; i++ ) {
				if( Day10_3.���¸���Ʈ[i] == null ) {
					Day10_3.���¸���Ʈ[i] = bank;
					System.out.println(" ** ������������ ���µ�� �Ϸ� **"); return;
				}
			}
		}else if( Ÿ�� == 2 ) {
			�������� bank = new ��������( ���¹�ȣ , ��й�ȣ );
			for( int i = 0 ; i<Day10_3.���¸���Ʈ.length ; i++ ) {
				if( Day10_3.���¸���Ʈ[i] == null ) {
					Day10_3.���¸���Ʈ[i] = bank;
					System.out.println(" ** ������������ ���µ�� �Ϸ� **"); return;
				}
			}
		}else if( Ÿ�� == 3 ) {
			�ϳ����� bank = new �ϳ�����( ���¹�ȣ , ��й�ȣ );
			for( int i = 0 ; i<Day10_3.���¸���Ʈ.length ; i++ ) {
				if( Day10_3.���¸���Ʈ[i] == null ) {
					Day10_3.���¸���Ʈ[i] = bank;
					System.out.println(" ** �ϳ��������� ���µ�� �Ϸ� **"); return;
				}
			}
		}
	}
		// 2. ���� �޼ҵ� 
	public void ����() {
		Scanner scanner = new Scanner(System.in);
		System.out.print(" ������ ���¹�ȣ : "); 	String ���¹�ȣ = scanner.next();
		System.out.print(" ���ݾ� : ");			int ���ݾ� = scanner.nextInt();
		
		// ������ ���¹�ȣ 
		for( int i = 0 ; i<Day10_3.���¸���Ʈ.length ; i++) {
			// ������ ���¹�ȣ�� ������ �ش� ��ü�� ���ݾ� ���ϱ� �� �޼ҵ� ����  
			if( Day10_3.���¸���Ʈ[i].���¹�ȣ.equals(���¹�ȣ) ) { 
				// i��° ��ü�� ���¹�ȣ�� �Է¹��� ���¹�ȣ�� �����ϸ� 
				Day10_3.���¸���Ʈ[i].���ݾ� += ���ݾ�;
				// i��° ��ü�� ���ݾ׿� �Է¹��� ���ݾ��� �����ֱ� 
				System.out.println(" �˸�]] �� ���¹�ȣ�� ���ݾ��� �Ա��߽��ϴ�. ");
				return; // �޼ҵ� ���� 
			}
		}
		// ������ ���¹�ȣ�� ������ �޼ҵ� ����
		System.out.println(" �˸�]] ������ ���¹�ȣ�� �������� �ʽ��ϴ�. [ ���� ] ");
	}
		// 3. ��� �޼ҵ�
	public void ���() {
		Scanner scanner = new Scanner(System.in);
		System.out.print(" ����� ���¹�ȣ : ");		String ���¹�ȣ =scanner.next();
		System.out.print(" ����� ���º�й�ȣ : "); 	String ��й�ȣ =scanner.next();
		System.out.print(" ��ݾ�: "); 				int ��ݾ� = scanner.nextInt();
		// 1. �迭�� ������ ���¹�ȣ ã��
		for( int i =0 ; i<Day10_3.���¸���Ʈ.length ;i++) {
			// 2. �ش� ���°� ������ ��й�ȣ �´��� Ȯ��
			if( Day10_3.���¸���Ʈ[i].���¹�ȣ.equals(���¹�ȣ) ) {
				// 3. ��й�ȣ�� ������ ���
				if( Day10_3.���¸���Ʈ[i].��й�ȣ.equals(��й�ȣ) ){
					if( Day10_3.���¸���Ʈ[i].���ݾ� < ��ݾ� ) { 	// 1. ���³� ���ݾ׺��� ����� �� ũ�� ��� �Ұ� 
						System.out.println(" �˸�]] �ܾ��� �����մϴ�. �ܾ� : " + Day10_3.���¸���Ʈ[i].���ݾ� );
						return;
					}else {										// 2. ���³� ���ݾ׺��� ����� �� �۰ų� ������ ��� ���� 
						System.out.println(" �˸�]] ��� �Ϸ�!! ");
						Day10_3.���¸���Ʈ[i].���ݾ� -= ��ݾ�;
						System.out.println(" �˸�]] ��� �� �ܾ� : " + Day10_3.���¸���Ʈ[i].���ݾ�);
						return;
					}
				}else {
					System.out.println(" �˸�]] ��й�ȣ�� �ٸ��ϴ�. [����]");
					return;
				}
			}
			
		}
		// �׿� ��� ����
		System.out.println(" �˸�]] ������ ���¹�ȣ ������ �����ϴ�.");
		
	}
		// 4. ��ü �޼ҵ� [ �ٸ� ���·� �Ա�ó�� ]
	public void ��ü() {
		Scanner scanner = new Scanner(System.in);
		System.out.print(" ���� ���¹�ȣ : "); 	String ���¹�ȣ = scanner.next();
		System.out.print(" ���� ��й�ȣ : "); 	String ��й�ȣ = scanner.next();
		System.out.print(" ���� ���¹�ȣ : "); 	String ��ü���¹�ȣ = scanner.next();
		System.out.print(" ��ü�� �ݾ� : "); 		int ��ü�ݾ� = scanner.nextInt();
		
		for( int i = 0 ; i<Day10_3.���¸���Ʈ.length ; i++ ) {
			if( Day10_3.���¸���Ʈ[i].���¹�ȣ.equals(���¹�ȣ) ) { // 1. �迭�� ������ ������ ���¹�ȣ�� ã�� 
				if( Day10_3.���¸���Ʈ[i].��й�ȣ.equals(��й�ȣ) ) { // 2. ������ ���¹�ȣ�� ã������ ��й�ȣ Ȯ�� 
					
					for( int j = 0 ; j<Day10_3.���¸���Ʈ.length ; j++ ) { 
						if( Day10_3.���¸���Ʈ[j].���¹�ȣ.equals(��ü���¹�ȣ) ) {  // 3. ���� ���¹�ȣ�� ã��
							if( Day10_3.���¸���Ʈ[i].���ݾ� < ��ü�ݾ� ) {
								System.out.println(" �˸�]] �ܾ��� �����մϴ�. [��ü����] "); return;
							}else {
								// 4. ���� ���¹�ȣ�� ã������ ���� ���¹�ȣ�� �ݾ��� �ְ� �� ���¿��� �ݾ� ���� 
								Day10_3.���¸���Ʈ[i].���ݾ� -= ��ü�ݾ�; // ���ΰ��� �ݾ� ���� 
								Day10_3.���¸���Ʈ[j].���ݾ� += ��ü�ݾ�; // ������� �ݾ� �߰� 
								System.out.println(" �˸�]] �ش� ���·� ��ü ���� "); return;
							}
						}
					}
					System.out.println(" �˸�]] ��ü�Ҽ� ���� ���¹�ȣ �Դϴ�. "); return;
				}else { System.out.println(" �˸�]] ��й�ȣ�� �ٸ��ϴ�."); return; }
			}
		}
		System.out.println(" �˸�]] ���¹�ȣ ������ �����ϴ�. [����]] "); //�׿�
		
	}
		// 5. �ܰ� �޼ҵ� 
	public void �ܰ�() {
		
		
		
	}
	

}





















