package Day08;

public class Day08_1 {

	public static void main(String[] args) {
	
		// p.212 : Ŭ���� [ ��ü���� ���α׷��� ] 
			// ��ü��? ���������� �����ϰų� �߻������� ���� �Ҽ� �ִ� �� 
			//		  �߿��� �ڽ��� �Ӽ��� ������ �����鼭 �ĺ� ������ ��
			// ��) ��� ��ü 
			//			�̸� , ���� => �Ӽ� -> �ʵ�
			//			���� , �ȴ� => ���� -> �޼ҵ�
			// ��) �ڵ��� ��ü
			//			���� , �ӵ� => �Ӽ� -> �ʵ�
			//			�޸���,�����=> ���� -> �޼ҵ� 
		
		// p.215
			// ������[�ۼ�] ---> Ŭ����[���赵] ----> �ν��Ͻ�[��ü]
		
		// p.219 ��1) Ŭ���� ���� , ��ü ���� 
		
		// ��ü ����� [ 4���� ]
		Student s1 = new Student();
		// 1. Student : Ŭ���� �̸� [ ���赵 ]
		// 2. s1 : ��ü�� [ �ƹ��ų� ]
		// 3. new : �޸��Ҵ� [ ��ü ����� �ʼ� ]
		// 4. Studnet() : ������ [ ��ü ������ �⺻�� ]
		System.out.println(" s1 ������ Student ��ü�� �����մϴ�.");
		
		Student s2 = new Student();
		System.out.println(" s2 ������ Student ��ü�� �����մϴ�.");
		
		//* Student Ŭ������ �̿��ؼ� s1 ��ü ���� 
		//* Student Ŭ������ �̿��ؼ� s2 ��ü ���� 
		// s1�� s2 Ŭ����[����] ���������� ���� �ٸ���.
		
		// p.227 ��ü ����
		Car mycar = new Car();
		// 1. Car : Ŭ�����̸�[���赵]
		// 2. mycar : ��ü�̸�[�ƹ��ų�]
		// 3. new : �޸� �Ҵ� [ ��ü������ �ʼ�]
		// 4. Car() : ������[ ��ü������ �ʱ�ȭ ]
		
		// ��ä�� �ʵ忡 �����ϱ� [ ��ü��.�ʵ�� -> �ʵ� ȣ�� ] 
		System.out.println(" mycar ����ȸ�� : " + mycar.company );		
		System.out.println(" mycar �𵨸� : " + mycar.model);
		System.out.println(" mycar ���� : " + mycar.color );
		System.out.println(" mycar �ְ�ӵ� : " + mycar.maxSpeed);
		System.out.println(" mycar ����ӵ� : " + mycar.speed );
		
		// �ʵ� �� ���� 
		mycar.speed = 60;
		System.out.println(" mycar ������ ����ӵ� : " + mycar.speed);
		
		Car yourcar = new Car();
		System.out.println(" yourcar ����ӵ� : " + yourcar.speed);
		
		// �����ڷ� ��ü ����� 
		Car car1 = new Car(); // 1�������� 
		Car car2 = new Car("����",3000); // 2��������
		
		System.out.println(" 1�� ������ car1 : " + car1.cc );
		System.out.println(" 2�� ������ car2 : " + car2.cc );
		
		
		
		
		
		
		
		
	}
}





