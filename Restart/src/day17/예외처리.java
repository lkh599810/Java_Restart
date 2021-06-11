package day17;

public class 예외처리 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		//예외처리 : 예외 발생했을 시 처리코드 =>코드상 오류 제외, 오류를 수정하는게아니고 사용가능코드로 대체하는것
		// if로 오류처리 할수 없나 ? ==> if로 잡으려면 예상이 가능한 오류여야한다.
		
		//1. 예상되지 않는 오류 처리
		//2. 경우의수가 많은 오류처리
		//3. try{오류가 발생할거같은 코드}catch{대체 코드}
		
		//try catch 사용이유 : 프로그램의 정상화
		
		
//		String a="100";
//
//		String b="200a";
//		
//		System.out.println("문자열 -> 숫자 :" +Integer.parseInt(a)); //이상없음. integer가 해줌
//		
//		
//		
//		try {
//			System.out.println("문자열 -> 숫자 :" +Integer.parseInt(b)); //이렇게 해도 숫자200a 가 말이안되므로 그냥 얘를 무시하고 프로그램 안꺼지게 다음코드로 넘어가줌.
//
//		} catch (NumberFormatException e) {
//			// TODO: handle exception
//		}
//
//		
		//예외처리 -> 오류가 떴을 시 '프로그램이 안 꺼지게' 해줌.
		
		//예외 던지기 : throws exception => try/catch와 큰 다를 바 없지만 메소드 내에 여러 오류들이 있을 시 간편하게 한줄로 끝남.
		
		
		메소드(); // ==> 밑의 메소드에서 처음 throw하면 여기서 빨간줄. 얘를 다시 메인에서 던지면 Object(슈퍼클래스)에서 예외처리
		
		
		// finally => try catch finally 예외와 관계없이 무조건 처리.
		
		
	}
	
	//예외 던지기
	public static void 메소드() throws Exception{ //예외던지기 throws Exception, 만약 main에서 예외던지면 Object에서 처리
		
		Class 클래스찾기=Class.forName("문자열.class");
			// 혹시나 클래스가 없을 경우에대한 예외처리를 무조건 해야하는 하나의 예시.
			
		
		
	}
	

}
