package Day14;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Day14_1 {
	
	// p.513 
		// Date : 특정 시점의 날짜를 표현하는 클래스
		// Calendar : 달력을 표현한 클래스 
	public static void main(String[] args) {
		
		// p.514 Date 클래스 
		// 1. 현재 날짜/시간 구하기 
		Date now = new Date(); // Date클래스로 now라는 이름으로 객체 생성
	// 클래스명 객체명 = new 생성자() : 객체 만드는 방법 
		String strNow1 = now.toString();
					// 객체명.메소드명();  : 객체내 메소드 호출 
		System.out.println( strNow1 );
		
		// 2. 현재 날짜/시간의 모양(형식) 설정 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
	//  SimpleDateFormat 객체명 = new SimpleDateFormat("패턴");
										// *패턴 
											// y:연도 M:월 d:일 h:시 m:분 s:초
											// 2020년 7:17     -> yyyy년 h:mm
											// 3월22일			-> M월dd일
		// 3. 설정한 모양를 now 객체에 적용
		String strNow2 = sdf.format(now);
						// 형식객체명.format( 날짜객체 ) ;
		System.out.println( strNow2 );
		
		
		// p.515 Calendar 클래스 
		Calendar now2 = Calendar.getInstance(); // 현재달력 가져오기
		// * new 사용하지 않는이유
			// Calendar 클래스내 달력 객체 존재하기 때문에 
			// new 사용하지 않고 달력객체 호출하는 방식으로 달력객체 만들기
		System.out.println("연도 : " + now2.get( Calendar.YEAR ) );
		System.out.println("월(0~11) : " + (now2.get( Calendar.MONTH )+1) );
										// +1 하는이유 : 컴퓨터는 1월 -> 0월 인식 
		System.out.println("일 : " + now2.get( Calendar.DAY_OF_MONTH ) );
		System.out.println("요일(1~7) : " + now2.get( Calendar.DAY_OF_WEEK ) );
		// 결과(2022-03-22기준)가 3 인 이유 : 1->일요일 / 2->월요일 3->화요일 4->수요일 5->목요일 6->금요일 7->토요일
		
		// 요일(숫자) -> 문자 변환출력 
		int week = now2.get(Calendar.DAY_OF_WEEK); // 숫자로 요일 호출
		String strweek = null; // 한글로 요일을 저장하는 변수
		switch( week ) { // switch( 검사대상 ) { case 값 : 실행코드; case 값 : 실행코드;  } 
			case 1: strweek ="일요일"; break; 
			case 2: strweek ="월요일"; break; // * week변수가 case 값과 동일하면 실행후 break 
			case 3: strweek ="화요일"; break; // * 만약에 break;가 없으면 모든 case 실행
			case 4: strweek ="수요일"; break;
			case 5: strweek ="목요일"; break;
			case 6: strweek ="금요일"; break;
			case 7: strweek ="토요일"; break;
		}
		System.out.println("요일(한글) : " + strweek );

		// 오전,오후
		int ampm = now2.get( Calendar.AM_PM ); // 오전=0 오후=1
		System.out.println("오전(0) 오후(1) : " + ampm );
		String strAmPm = null;
		if( ampm == 0 ) { strAmPm ="오전"; }
		else { strAmPm ="오후"; }
		
		System.out.println("오전/오후(한글) : " + strAmPm );
		
		
		
		
		
		
	}

}

























