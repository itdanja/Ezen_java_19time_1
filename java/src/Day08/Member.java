package Day08;

public class Member {
	// ȸ�� Ŭ����[���赵]
	
	// 1. �ʵ� = �����ϴ°���
	String id;
	String password;
	String name;
	String phone;
	
	// 2. ������ [ ������ �̸��� Ŭ�����̸��� ���� �ϰ�]
		// 1. �������
	Member(){}
		// 2. 2�� �ʵ带 �޴� ������ 
	public Member(String id, String password) {
		this.id = id;
		this.password = password;
	}
		// 3. ��� �ʵ带 �޴� ������
	public Member(String id, String password, String name, String phone) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
	}
	
	
	// 3. �޼ҵ� 
}




