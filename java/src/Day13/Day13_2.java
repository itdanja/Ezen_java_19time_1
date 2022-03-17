package Day13;

public class Day13_2 {
	
	public static void main(String[] args) {
	
		// p.490 ���ڿ�.getBytes() : �ش� ���ڿ��� ����Ʈ�� ��ȯ
		String str = "�ȳ��ϼ���"; // ����/Ư��:1����Ʈ   ,  �ѱ�:2����Ʈ
		// ���ڿ� -> ����Ʈ�� 
		byte[] bytes = str.getBytes(); // ���ڿ� -> ����Ʈ�� ��ȯ
		System.out.println("�ȳ��ϼ��� [����Ʈ����] : " + bytes.length);
		// ����Ʈ�� -> ���ڿ� 
		String str1 = new String( bytes );
		System.out.println("����Ʈ�� -> ���ڿ� : " + str1 );
		
		// ���ڷ� ���ڵ� ��� : 1. EUC-KR[ ����/�ѱ� �� ��ȯ ���� ] , 2.UTF-8[ �������� ��ȯ ���� ]
						//		�ѱ� : 2����Ʈ							�ѱ� : 3����Ʈ
		try { // ����ó�� : ���࿡ try ��ȣ ������ ���� �߻��� catch�� �̵� 
			
			byte[] bytes2 = str.getBytes("EUC-KR"); // �Ϲݿ���[������ ���ܹ߻�]
			System.out.println(" EUC-KR ���� : "+bytes2.length); // �ѱ�1���� : 2����Ʈ 
			String str2 = new String( bytes2 , "EUC-KR");
			System.out.println(" ����Ʈ�� -> ���ڿ� : " + str2 );
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println(" UTF-8 ���� : " + bytes3.length ); // �ѱ�1���� : 3����Ʈ
			String str3 = new String( bytes3 , "UTF-8");
			System.out.println(" ����Ʈ�� -> ���ڿ� : " + str3 );
			
		}catch( Exception e ) { System.out.println(" ���ܹ߻� "+e);}
		
System.out.println("-----------------------------------------------------");
		// p.491~492 ���ڿ�.indexOf(ã������) : �ش� ���ڿ������� ã�������� ��ġ[�ε���] ã��
											// ���࿡ ã�����ڰ� �������� ������ -1 ������ �ش���ġ[�ε���] ��ȯ
		String subject = "�ڹ� ���α׷���";
		int location = subject.indexOf("���α׷���");// subject ���� ���α׷��� �ܾ� ��ġ ã��
		System.out.println(" �˻� ��� : " + location );
		
		if( subject.indexOf("�ڹ�") != -1 ) {
			// �ε����� 0���� �����ϱ� ������ -1�� �ε������� �������� �ʴ� ��
			// ���ڿ�.indexOf("ã������") ���࿡ -1 ��ȯ�Ǹ� �ش� ���ڿ��� ã�����ڰ� �������� ����.
			System.out.println("*�ڹٿ� ���õ� å ");
		}else { // ���࿡ ��ȯ�� ���� -1 �̸� 
			System.out.println("*�ڹٿ� ���� ���� å ");
		}
System.out.println("-----------------------------------------------------");
		// p.492 ���ڿ�.length() : �ش� ���ڿ��� ���ڼ�[����]
		String ssn = "7306241230123";
		int length = ssn.length(); // ���ڿ��� ���ڼ�[����]���ϱ� 
		if( length == 13 ) { // ���࿡ ���̰� 13�̸� 
			System.out.println("�ֹι�ȣ �ڸ����� �½��ϴ�. ");
		}else {
			System.out.println("�ֹι�ȣ �ڸ����� Ʋ���ϴ�. ");
		}
System.out.println("---------------------------------------------------------");
		// p.493~494 ���ڿ�.replace("��������","���ο��") : �ش� ���ڿ��� Ư�����ڸ� ���ο�ڷ� ��ü
		String oldstr = "�ڹٴ� ��ü������ �Դϴ�. �ڹٴ� ǳ���� API�� �����մϴ�.";
		String newstr = oldstr.replace("�ڹ�", "JAVA");
								// ���ڿ��� �ڹ� -> JAVA ���� 
		System.out.println(" ���� �� : " + oldstr );
		System.out.println(" ���� �� : " + newstr );
		
System.out.println("---------------------------------------------------------");
		// p.494~495 ���ڿ�.substring(�ε���) : �ش� ���ڿ��� �ε�����ŭ ��������[�ڸ���]
		String ssn2 = "880815-1234567";
		String ���ڸ� = ssn2.substring(0,6); // �����ε��� , �������ε��� �� 
		System.out.println("�ֹε�Ϲ�ȣ ���ڸ�[0~6] : " + ���ڸ�);
		String ���ڸ� = ssn2.substring(7); // �ε��� : �ش� �ε������� �������ε�������
		System.out.println("�ֹε�Ϲ�ȣ ���ڸ�[7~������] : "+���ڸ�);
System.out.println("---------------------------------------------------------");
		// p.495~496 :
			// ���ڿ�.toLowerCase() : �ش� ���ڿ��� �ҹ��ڷ� ��ȯ 
			// ���ڿ�.toUpperCase() : �ش� ���ڿ��� �빮�ڷ� ��ȯ
		// p.497
			// ���ڿ�.trim() : �ش� ���ڿ��� �յ� ���� ���� 
		// p.498 : ���ڿ�.valueOf( �⺻�ڷ��������� ) : �⺻�ڷ��������� --> ���ڿ� ��ȯ
		String str2 = String.valueOf(10); // int�� 10 -> ���ڿ� 10 ��ȯ 
		String str3 = String.valueOf(10.5); // double�� 10.5 -> ���ڿ� 10.5 ��ȯ 
		String str4 = String.valueOf(true);	// boolean�� true -> ���ڿ� true ��ȯ
		
		System.out.println(" ���� -> ���ڿ� [ ���ڿ� ����Ұ�] : " + ( str2+10 ) );
		System.out.println(" �Ǽ� -> ���ڿ� [ ���ڿ� ����Ұ�] : " + ( str3+10.5 ) );
		System.out.println(" �� -> ���ڿ� [ ���ڿ� ���Ұ�] ");
		/// if( str4 ) {}   str4�� true ���� �Ǿ� ������ ���ڿ� �̹Ƿ� if���� ���Ұ�
		
		// * �⺻�ڷ����� ������ ���ڿ� ��ȯ�ϴ� ��� 
		String str5 = 10+"";	// �⺻�ڷ���������+""
		System.out.println(" �⺻�ڷ���������+\"\"  ���� ������ ���ڿ� ��ȯ ����  ");

System.out.println("---------------------------------------------------------");	
		// ���� �� String Ŭ���� ���� ���� ����ϴ� �޼ҵ�
		// 1. ���ڿ�.split("���ع���") : ���ڿ��� Ư���������� �и��ؼ� �迭�� ��ȯ
		// 2. ���ڿ�.contains("ã������") : ���ڿ��� ã�����ڰ� �����ϸ� true ������ false ��ȯ
		// 3. String.format("����",���ڿ�) : �ش� ���ڿ��� ����[�ٹ̱�]���� ��ȯ 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
