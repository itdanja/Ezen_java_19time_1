package Day15;

public class Day15_2 {
	
	public static void main(String[] args) {
					// main �޼ҵ忡�� main�����尡 ���� [ ������ : �ڵ带 �������ִ� �帧 ] 
		// p.531 : ������ �̸�
			// 1. ���ν����� �̸� Ȯ�� 
		Thread mainThread = Thread.currentThread();
						// Thread : ��Ƽ������Ŭ����  // Thread.currentThread() : ����(��������)������ �̸� ȣ��
		System.out.println("���α׷� ���۽� �������̸�(main�޼ҵ峻 main������) : "+ mainThread.getName() );
			// 2. ��Ƽ������ �̸� Ȯ��
		ThreadA threadA = new ThreadA(); // 1. ��Ƽ������ Ŭ������ ��ü ���� 
		System.out.println("�۾� ������ �̸� : " + threadA.getName() ); // 2. ��Ƽ�����尴ü�� ������ �̸� ȣ�� 
		threadA.start(); // 3. ��Ƽ������ ����  // ��Ƽ�����尴ü��.start()  -----> run�޼ҵ� ȣ��Ǹ鼭 ��Ƽ������ ����
			// 3. ��Ƽ������ �̸� Ȯ��
		ThreadB threadB = new ThreadB();
		System.out.println("�۾� ������ �̸� : " + threadB.getName() );
		threadB.start();
		
		
		
	}
}
