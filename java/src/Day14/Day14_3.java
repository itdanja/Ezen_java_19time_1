package Day14;

public class Day14_3 {
	
	public static void main(String[] args) {
		
		// p.504 MathŬ���� : ���� ��� �޼ҵ� ���� 
		
		//1. Math.abs(��) : �ش� ���� ���밪 
		System.out.println(" ���밪 : " 	+ Math.abs(-5) ); // 5
		System.out.println(" ���밪 : " 	+ Math.abs(-3.14) ); // 3.14
		//2. Math.ceil(��) : ����� ������ �ø�
		System.out.println(" �ø� : "	+Math.ceil(5.3) ); // 6.0
		System.out.println(" �ø� : "	+Math.ceil(-5.3) ); // -5.0
		//3. Math.floor(��) : ����� ������ ����
		System.out.println(" ���� : "	+Math.floor(5.3) ); // 5.0
		System.out.println(" ���� : "	+Math.floor(-5.3) ); // -6.0
		//4. Math.max( ��1 , ��2 ) : �� �� ���� �� ū�� 
		System.out.println(" �ִ� : " 	+Math.max(5, 9) ); // 9
		System.out.println(" �ִ� : " 	+Math.max(5.3, 2.5)); // 5.3
		//5. Math.min( ��1 , ��2 ) : �� �� ���� �� ������ 
		System.out.println(" �ּڰ� : " 	+Math.min(5, 9) ); // 5 
		System.out.println(" �ּڰ� : " 	+Math.min(5.3, 2.5 )); // 2.5
		//6. Math.random() : 0~1 ������ (double)�� ���� �߻� 
		System.out.println(" ���� : " 	+Math.random() ); // 0~1 ������ ����
		//7. Math.rint(��) : ����� ������ �Ǽ������� �ݿø�( .5�̻� 1���ڸ��� +1 )
		System.out.println(" ����� ������ �Ǽ������� �ݿø� : "+Math.rint(5.3) ); // 5.0
		System.out.println(" ����� ������ �Ǽ������� �ݿø� : "+Math.rint(5.7) ); // 6.0
		//8. Math.round(��) : ����� ������ ���������� �ݿø�( .5�̻� 1���ڸ��� +1 )
		System.out.println(" ����� ������ ���������� �ݿø� : "+Math.round(5.3) ); // 5
		System.out.println(" ����� ������ ���������� �ݿø� : "+Math.round(5.7) ); // 6
		
		//9. Math.round() : �Ҽ� ù°�ڸ��� �ݿø� => ���� �Ҽ� ��°�ڸ����� �ݿø� �ϰ� ������??
		double value = 12.3456; // �Ҽ� ����°�ڸ����� �ݿø� => 12.35
		double temp = Math.round( value*100 ); // 12.3456 *100 => 1234.56 -> 1235.0
		System.out.println(" ��� : " + temp/100 ); // 1235.0 -> 12.35
		// �ذ� ��� : �ڸ��� ���� -> �ݿø��� -> �ڸ��� ����
		
	}

}










