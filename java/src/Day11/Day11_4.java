package Day11;

public class Day11_4 {
	
	// p.383 �������̽� ��� 
	public static void main(String[] args) {
		
		System.out.println(" 1)-------------");
		// 1. ��ü ���� [ �ڷ����� �������̽� ]
		Myclass myclass1 = new Myclass();
		// 2. ��ü�� �������̽� �޼ҵ� ȣ�� 
		myclass1.rc.turnOn();
		myclass1.rc.setVolume(5);
		
		System.out.println(" 2)--------------");
		// 1. ��ü ���� [ �����ڿ� ����� Ŭ������ �μ��� ���� ] 
		Myclass myclass2 = new Myclass( new Audio() );
		
		System.out.println(" 3)---------------");
		
		// 1. ��ü ����
		Myclass myclass3 = new Myclass();
		myclass3.methodA(); // ����� Ŭ����
		
		System.out.println(" 4)-------------------");
		
		// 1. ��ü ���� 
		Myclass myclass4 = new Myclass();
		myclass4.methodB( new Television() ); // �ڷ����� �������̽� 
		
	}

}
