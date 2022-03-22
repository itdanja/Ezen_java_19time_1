package Day14;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Day14_1 {
	
	// p.513 
		// Date : Ư�� ������ ��¥�� ǥ���ϴ� Ŭ����
		// Calendar : �޷��� ǥ���� Ŭ���� 
	public static void main(String[] args) {
		
		// p.514 Date Ŭ���� 
		// 1. ���� ��¥/�ð� ���ϱ� 
		Date now = new Date(); // DateŬ������ now��� �̸����� ��ü ����
	// Ŭ������ ��ü�� = new ������() : ��ü ����� ��� 
		String strNow1 = now.toString();
					// ��ü��.�޼ҵ��();  : ��ü�� �޼ҵ� ȣ�� 
		System.out.println( strNow1 );
		
		// 2. ���� ��¥/�ð��� ���(����) ���� 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
	//  SimpleDateFormat ��ü�� = new SimpleDateFormat("����");
										// *���� 
											// y:���� M:�� d:�� h:�� m:�� s:��
											// 2020�� 7:17     -> yyyy�� h:mm
											// 3��22��			-> M��dd��
		// 3. ������ ��縦 now ��ü�� ����
		String strNow2 = sdf.format(now);
						// ���İ�ü��.format( ��¥��ü ) ;
		System.out.println( strNow2 );
		
		
		// p.515 Calendar Ŭ���� 
		Calendar now2 = Calendar.getInstance(); // ����޷� ��������
		// * new ������� �ʴ�����
			// Calendar Ŭ������ �޷� ��ü �����ϱ� ������ 
			// new ������� �ʰ� �޷°�ü ȣ���ϴ� ������� �޷°�ü �����
		System.out.println("���� : " + now2.get( Calendar.YEAR ) );
		System.out.println("��(0~11) : " + (now2.get( Calendar.MONTH )+1) );
										// +1 �ϴ����� : ��ǻ�ʹ� 1�� -> 0�� �ν� 
		System.out.println("�� : " + now2.get( Calendar.DAY_OF_MONTH ) );
		System.out.println("����(1~7) : " + now2.get( Calendar.DAY_OF_WEEK ) );
		// ���(2022-03-22����)�� 3 �� ���� : 1->�Ͽ��� / 2->������ 3->ȭ���� 4->������ 5->����� 6->�ݿ��� 7->�����
		
		// ����(����) -> ���� ��ȯ��� 
		int week = now2.get(Calendar.DAY_OF_WEEK); // ���ڷ� ���� ȣ��
		String strweek = null; // �ѱ۷� ������ �����ϴ� ����
		switch( week ) { // switch( �˻��� ) { case �� : �����ڵ�; case �� : �����ڵ�;  } 
			case 1: strweek ="�Ͽ���"; break; 
			case 2: strweek ="������"; break; // * week������ case ���� �����ϸ� ������ break 
			case 3: strweek ="ȭ����"; break; // * ���࿡ break;�� ������ ��� case ����
			case 4: strweek ="������"; break;
			case 5: strweek ="�����"; break;
			case 6: strweek ="�ݿ���"; break;
			case 7: strweek ="�����"; break;
		}
		System.out.println("����(�ѱ�) : " + strweek );

		// ����,����
		int ampm = now2.get( Calendar.AM_PM ); // ����=0 ����=1
		System.out.println("����(0) ����(1) : " + ampm );
		String strAmPm = null;
		if( ampm == 0 ) { strAmPm ="����"; }
		else { strAmPm ="����"; }
		
		System.out.println("����/����(�ѱ�) : " + strAmPm );
		
		
		
		
		
		
	}

}

























