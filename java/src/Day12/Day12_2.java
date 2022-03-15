package Day12;

public class Day12_2 {
	
	public static void main(String[] args) {
		
		// p.454 예외처리
		/*
		 *    try{  
		 *    
		 *     		/오류[예외]가 발생할것 같은 코드 	
		 *   
		 *     }catch( 예외클래스 객체명 ){
		 * 			/만약에 예외 발생시 실행코드 
		 * 	   }
		 * 	   finally{
		 * 			/예외가 있든 없든 실행코드 
		 * 	   }
		 */
		// p.455
		try { // try{}내 예외가 발생하면 catch이동 아니면 try{} 실행
			// 일반예외 : 컴파일러[실행]전에 개발자에게 강제적으로 예외처리
			Class clazz = Class.forName("java.lang.String2");
			// 오류 발생 이유 : 해당 클래스를 찾을수 없을수도 있기때문에 
		}catch( ClassNotFoundException e ) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
		// p.456
	}
}
