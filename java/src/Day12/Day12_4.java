package Day12;

import java.util.ArrayList;

public class Day12_4 {
	
	public static void main(String[] args) {
		
		// �迭 : ���� 
		String[] �迭 = new String[100];
		
		System.out.println(" �迭 : " + �迭 );
		�迭[0] = "���缮";
		System.out.println(" �迭[0] : " + �迭[0] );
		
		// ����Ʈ : �÷���(����) �����ӿ�ũ(�̸��������Ŭ����)
		ArrayList< String > ����Ʈ = new ArrayList<>();
		// ArrayList : �迭����Ʈ Ŭ���� 
		// < ����Ʈ�� ������ Ŭ���� > : ����Ʈ �׸� ���� ��ü�� Ŭ������
		System.out.println(" ����Ʈ : " + ����Ʈ );
		����Ʈ.add("���缮");
		System.out.println(" ����Ʈ[0] : " + ����Ʈ.get(0) );
		
		
		// ����Ʈ ����� 
		// 1. ����Ʈ ���� 
		ArrayList< String > arrayList = new ArrayList<>();
	//  ArrayList : ����Ʈ Ŭ���� 
	// < ����Ʈ�� �׸� Ŭ���� >
	// arrayList : ����Ʈ �̸�[ �ƹ��ų� ] 
	// new : ��ü ����� �޸��Ҵ� 
	// ArrayList<>() : ������ ȣ�� 
		// 2. ����Ʈ�� �׸� �߰� 
		arrayList.add("��ȣ��");
		arrayList.add("���缮");
		arrayList.add("�ŵ���");
		// 3. ����Ʈ ��� 
		System.out.println(" ����Ʈ : " + arrayList );
		// 4. ����Ʈ�� �׸� ��� 
		System.out.println(" ����Ʈ�� 0�� ȣ�� : " + arrayList.get(0) );
		System.out.println(" ����Ʈ�� 2�� ȣ�� : " + arrayList.get(0) );
		// 5. ����Ʈ�� �׸� ���� 
		System.out.println(" ����Ʈ�� 1�� ���� : " + arrayList.remove(1) );
		// 6. �׸� �����Ŀ� ����Ʈ ��� 
		System.out.println(" ����Ʈ : " + arrayList );
		
		//         �迭    						vs  	����Ʈ 
		//���� : �⺻����									Ŭ���� 
		//���� : String[] �迭�� = new String[100];			ArrayList<String> ����Ʈ�� = new ArrayList<>();
		//���� : �������� [ ������ ����Ұ� ] 					��������[ ������ �߰��ϸ� �ڵ� ���� �߰� ]
		//���� : Ŭ������ �ƴϱ⶧���� ������.					�������� �̱⶧���� �޸� ȿ�������� ��밡�� 
		//�߰� : �迭[�ε���] = ��ü							����Ʈ.add( ��ü );
		//ȣ�� : �迭[�ε���]								����Ʈ.get( �ε��� );
		//���� : null										����Ʈ.remove( �ε��� or ��ü );
		//���� : length 									����Ʈ.size()
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}




