package Day10;

public class Day10_2 {
	
	public static void main(String[] args) {
		
		// 1. 자식클래스로 학생객체 만들기
		Student student = new Student("홍길동", "123456-123456", 1);
		
		// 2. 자식클래스로 만든 학생객체가 부모클래스내 필드 호출 
		System.out.println(" name : " + student.name );
		System.out.println(" ssn : "+student.ssn );
		
		// 3. 자식클래스로 만든 학생객체가 본인클래스내 필드호출 
		System.out.println(" studentNo : " + student.studentNo );
		
		
	}

}








