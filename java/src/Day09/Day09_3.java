package Day09;

public class Day09_3 {
	
	public static void main(String[] args) {
		
		// �޼ҵ�  = �Լ� 
			//1.����Ÿ�� 
			//2.�޼ҵ��̸� 
			//3.�Ű��������� 
			//4.�޼ҵ� ������ 
		
		// p.250~251 �����ڵ�1 
		// 1. ��ü ���� [ �μ�0�� �����ϴ� �����ڷ� ��ü ���� ] 
		Calculator myCalc = new Calculator();
		// 2. �޼ҵ� ȣ�� [ . : ���ٿ����� ��� ]
			// ��ü��.�ʵ��Ȥ���޼ҵ��
		System.out.println(" -- ��ü�� �޼ҵ� ȣ���մϴ�. --");
		myCalc.powerOn(); // ��ü��.�޼ҵ��();
			//* myCalc ��ü�� �޼ҵ� ȣ�� 
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1 : "+result1);
	}
}








