package Day16;

import java.util.HashMap;

public class Day16_5 {
	
	public static void main(String[] args) {
		
		// p.574
		// Map : Ű(=set) ,�� => ��Ʈ��  
		// 1. Map ��ü ���� 
		HashMap<String, Integer> map = new HashMap<>();
			//  key   ,  value => ��Ʈ��
		// 2. ��ü�� map ���� 
		map.put( "�ſ��" , 85 ); //  Ű = "�ſ��"  // �� = 85
		System.out.println("Ȯ�� : " + map );
		map.put( "ȫ�浿" , 90 ); // Ű,�� => ��Ʈ�� �߰� 
		System.out.println("Ȯ�� : " + map );
		map.put( "���屺" , 80 ); // Ű,�� => ��Ʈ�� �߰� 
		System.out.println("Ȯ�� : " + map );
		// * Ű�� �ߺ��� �Ұ����ϴ�.
		map.put( "ȫ�浿" , 95 ); // Ű,�� => ��Ʈ�� �߰�
		System.out.println("Ȯ�� : " + map);
		System.out.println("�� entry �� : " + map.size() );
		// ��ü ã�� [ .get( Ű ) -> �� ȣ�� 
		System.out.println("\tȫ�浿 : "+map.get("ȫ�浿") );
		// ȣ�� [ .keySet() : ��� Ű�� ȣ�� ] 
		for( String key : map.keySet() ) {
			System.out.println(" Ű : " + key );
			System.out.println(" �� : " + map.get(key) );
		}
		// 3. ���� [ .remove( Ű ) : �ش� Ű�� ��Ʈ�� ���� ] 
		map.remove("ȫ�浿");
System.out.println("-------------ȫ�浿 ������--------------");
		for( String key : map.keySet() ) {
			System.out.println(" Ű : "+key +"\t ��:"+map.get(key) );
			
		}
		// 4.
		map.clear(); // ��� ����[����]
System.out.println(" ��� ������ : " + map.size() );



		
		
		
		
		
		
		
		
	}

}


















