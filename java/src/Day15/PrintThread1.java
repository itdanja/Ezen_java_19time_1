package Day15;

public class PrintThread1 extends Thread {
				// ��Ƽ�����带 ���������
				// Thread Ŭ�����κ��� ��ӹ���
	//1.�ʵ�
	private boolean stop; // ���� ����[ true Ȥ�� false ���� ���� ]
	//2.������
	
	//3.�޼ҵ�
	public void setStop( boolean stop ) {
		this.stop = stop;
	}
	
	//4. ��Ƽ������ ����
	@Override
	public void run() {
		// *���ѷ���
		while( !stop ) { // ! : ����( true->false / false->true )
			System.out.println("------���� ���  ");
			try{ Thread.sleep(1000); } catch( Exception e ) {}
		}
		
		System.out.println("-----���� �������  ");
	}

}
