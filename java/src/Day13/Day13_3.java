package Day13;

public class Day13_3 {
	
	public static void main(String[] args) {
		
		// ���� ��ϰ˻����� ���α׷�
			// ���� 
				// 1. �Է¹ޱ� scanner ���� system.in ��� 
				// 2. ��� ������ String[] ������� �̶�� �迭�� ���� 
				// 3. �޴� [ 1.������� 2.�����˻� 3.�������� ] 
				// *������� : �������� �Է¹޾� �迭 ���� 
				// *�����˻� : �������� �Ϻθ� �Է¹޾� �迭�� �˻��� �ܾ ���Ե� �������� ��� ��� 
				// *�������� : ������ȣ[�ε���] �Է¹޾� �ش� �������� �������ڿ� ���ο�ڸ� �Է¹޾� ���� 
		
		
		String[] ������� = new String[100]; // String 100���� �����Ҽ� �ִ� �迭 [ ���� 100�� ���� �Ҽ� ���� ] 
		
		while(true) {
			try {
				System.out.print(" 1.������� 2.�����˻� 3.�������� ���� : ");
				// �޴� �Է¹ޱ� [ scanner X ]
					// 1. ����Ʈ �迭 ���� 
					byte[] bytes = new byte[100];
					// 2. Ű����κ���  ����Ʈ�� �Է¹޾� ����Ʈ �迭�� ���� 
					int count =  System.in.read( bytes );
					// 3. ����Ʈ�迭 -> ���ڿ� ��ȯ  // -2�� �ϴ����� : �Է½� ���� ġ��[\n\r����] �� [ ������ ���Ե� \n\r ���� ]
					String ch = new String( bytes , 0 , count-2 );
					
				// *���ڿ� �񱳽ÿ��� equals ����Ѵ�
				if( ch.equals("1") ) { // ������� 
					// 1. ������ �Է�
					System.out.print(" ����� ������ : ");
					count =  System.in.read( bytes ); // Ű����� ���� ����Ʈ�� �Է¹޾� ����Ʈ�迭�� ���� 
					String ������ = new String( bytes , 0 , count-2 ); // ����Ʈ�迭 -> ���ڿ� ��ȯ
					// 2. �迭�� ������� ���� 
					for( int i = 0 ; i<�������.length ; i++ ) {
						if( �������[i] == null ) {  
							�������[i] = ������; 
							System.out.println(" ������ ��ϵǾ����ϴ�.");
							break;  
						}
					}
				}
				else if( ch.equals("2") ) { // �����˻� 
					// 1. �������� �Ϻ� �Է�
					System.out.print(" ������[�Ϻ�/�����Է½� ��絵��] �˻� : ");
					count = System.in.read(bytes); // Ű����κ��� �Է¹��� ����Ʈ�� ����Ʈ�迭�� ���� 
					String �˻��� = new String( bytes , 0 , count-2 );
					// 2. �迭�� �������� �Ϻΰ� ���Ե� ������ ��� 
					for( int i = 0 ; i<�������.length ; i++ ) {
						if( �������[i] !=null && �������[i].indexOf(�˻���) != -1  ) {
						// * �ش��ε����� null[����] �ƴϸ鼭 �ش��ε����� �˻��� �ܾ ���ԵǾ� ������[ != -1 ]
						// * �ε����� 0������ �����ϱ� ������ [ -1 : �ε����� ����( ã�����ڰ� �������� ���� ) ]
							System.out.println("������ȣ : "+i+"   ������ : "+�������[i] );	
						}
					}
					
				}
				else if( ch.equals("3") ) { // �������� 
					// 1. ������ȣ[�ε���] �Է�
					System.out.print( " ������ ������ȣ : ");
					count = System.in.read( bytes ); // Ű����κ��� �Է¹��� ����Ʈ�� ����Ʈ�迭�� ���� 
					String �ε��� = new String( bytes , 0 , count-2 ); // ����Ʈ�迭 -> ���ڿ� ��ȯ
					// 2. �ε���[����] ����ϱ� ������ �ε����� ���������� ��ȯ
					int index =	Integer.parseInt(�ε���); // ���ڿ� --> ������ ��ȯ
					// 3. ������ �������ڿ� ���ο�� �Է¹ޱ� 
					System.out.print(" �������� : "); 		count = System.in.read( bytes );
					String �������� = new String( bytes , 0 , count-2 );
					
					System.out.print(" ���ο�� : ");	count = System.in.read( bytes );
					String ���ο�� = new String( bytes , 0 , count-2 );
					
					// 4. �Է¹��� ������������ ������ �����Ŀ� ������ ���� 
					�������[index] = �������[index].replace(��������, ���ο��);
					System.out.println(" �������� ���� �������� ����Ǿ����ϴ�. ");
					
				}
				else { System.err.println(" �˼� ���� ��ȣ�Դϴ�. ");}
			}catch( Exception e ) { System.out.println(" ���� �߻� [�����ڿ��Թ���] ");}
			
		}
		
		
		
		
	}

}
