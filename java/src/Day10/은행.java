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
					System.out.println(" ** ���µ�� �Ϸ� **"); return;
				}
			}
			
		}else if( Ÿ�� == 2 ) {
			�������� bank = new ��������( ���¹�ȣ , ��й�ȣ );
			for( int i = 0 ; i<Day10_3.���¸���Ʈ.length ; i++ ) {
				if( Day10_3.���¸���Ʈ[i] == null ) {
					Day10_3.���¸���Ʈ[i] = bank;
					System.out.println(" ** ���µ�� �Ϸ� **"); return;
				}
			}
			
		}else if( Ÿ�� == 3 ) {
			�ϳ����� bank = new �ϳ�����( ���¹�ȣ , ��й�ȣ );
			for( int i = 0 ; i<Day10_3.���¸���Ʈ.length ; i++ ) {
				if( Day10_3.���¸���Ʈ[i] == null ) {
					Day10_3.���¸���Ʈ[i] = bank;
					System.out.println(" ** ���µ�� �Ϸ� **"); return;
				}
			}
		}
	}
		// 2. ���� �޼ҵ� 
	public void ����() {
	}
		// 3. ��� �޼ҵ�
	public void ���() {
	}
		// 4. ��ü �޼ҵ� 
	public void ��ü() {
	}
		// 5. �ܰ� �޼ҵ� 
	public void �ܰ�() {
	}
	

}


