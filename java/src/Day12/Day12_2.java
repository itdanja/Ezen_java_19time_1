package Day12;

public class Day12_2 {
	
	public static void main(String[] args) {
		
		// p.454 ����ó��
		/*
		 *    try{  
		 *    
		 *     		/����[����]�� �߻��Ұ� ���� �ڵ� 	
		 *   
		 *     }catch( ����Ŭ���� ��ü�� ){
		 * 			/���࿡ ���� �߻��� �����ڵ� 
		 * 	   }
		 * 	   finally{
		 * 			/���ܰ� �ֵ� ���� �����ڵ� 
		 * 	   }
		 */
		// p.455
		try { // try{}�� ���ܰ� �߻��ϸ� catch�̵� �ƴϸ� try{} ����
			// �Ϲݿ��� : �����Ϸ�[����]���� �����ڿ��� ���������� ����ó��
			Class clazz = Class.forName("java.lang.String2");
			// ���� �߻� ���� : �ش� Ŭ������ ã���� �������� �ֱ⶧���� 
		}catch( ClassNotFoundException e ) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
		// p.456
	}
}
