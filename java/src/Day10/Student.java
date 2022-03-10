package Day10;

public class Student extends People { // 자식클래스 [ 서브클래스 ]
				// extends:연장하다[상속]
	// 1. 필드 
	public int studentNo;
	// 2. 생성자
	public Student(String name , String ssn , int studentNo) {
		super(name, ssn);	// <-------- 부모클래스 생성자 호출 
		this.studentNo = studentNo;
	}
	// 3. 메소드 
	
}
