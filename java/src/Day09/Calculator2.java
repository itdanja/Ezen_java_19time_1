package Day09;

public class Calculator2 {

	// 1. �ʵ� 
	// 2. ������
	// 3. �޼ҵ� 
		// 1. ������ �޼ҵ� // �μ�x ��ȯx
	void execute() {
		double result = avg( 7 , 10);
		println("������ : "+result );
	}
		// 2. ��հ�� �޼ҵ� // �μ�o ��ȯo
	double avg( int x , int y) {
		double sum = plus(x,y);
		double result = sum / 2;
		return result;
	}
		// 3. �հ��� �޼ҵ� // �μ�o��ȯo
	int plus ( int x , int y ) {
		int result = x + y;
		return result;
	}
		// 4. ������ �޼ҵ� // �μ�o��ȯx
	void println( String message ) {
		System.out.println( message );
	}
}








