package Day10;

public class Student extends People { // �ڽ�Ŭ���� [ ����Ŭ���� ]
				// extends:�����ϴ�[���]
	// 1. �ʵ� 
	public int studentNo;
	// 2. ������
	public Student(String name , String ssn , int studentNo) {
		super(name, ssn);	// <-------- �θ�Ŭ���� ������ ȣ�� 
		this.studentNo = studentNo;
	}
	// 3. �޼ҵ� 
	
}
