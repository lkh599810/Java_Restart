package day21;

import java.util.Scanner;

public class day21_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//문자추출 chatAt() : String에서 특정 위치 문자열 빼오기 가능
		
		String 문자열4="자바 프로그래밍";
		System.out.println(문자열4.charAt(0));
		System.out.println(문자열4.charAt(1));
		System.out.println(문자열4.charAt(2));
		System.out.println(문자열4.charAt(3));

		String 주민등록번호="981015-1111111";
		
		char 남여판별= 주민등록번호.charAt(7);
		System.out.println(남여판별);
		
		
		//switch : 논리가 안됨.=> case에 < > <= 비교연산자 사용불가.
		switch(남여판별) { //switch (변수/데이터)
		
		case '1' : //변수가 1이면
		case '3' : // 변수가 3이면
			System.out.println("남자");
				break; //switch는 break 안쓰면 남자 여자 다나옴.
		case '2' :
		case '4' :
			System.out.println("여자");
				break;
			
		}
		
		
		//문자열비교 : .equals() '객체 자체끼리 비교함.'
			// 기본자료형은 비교연산자가 사용가능 예) int 등
		
		String 이름1= new String("유재석"); //객체 생성
		//클래스 객체명 = new 생성자명(); 클래스명과 생성자명은 동일. new는 초기값. 메모리넣어주는것.
		
		String 이름2= "유재석"; //String의 경우에는 바로 문자열로 넣어줘도 됨. [예외]
		
//		if(이름1==이름2) {System.out.println("같다");} //: String이라 비교연산자 불가
		
		
		// ==연산자 : 주소값 통해서 비교, equals() : 객체의 내용 자체를 비교
		
		
		//getBytes : 문자열 => 바이트열로 변환
		
		String 문자열1="안녕";
		byte[] 바이트배열= 문자열1.getBytes();
		System.out.println(바이트배열.length);
		String 변환1= new String(바이트배열);
		System.out.println(변환1);
		
		
		//indexOf : 문자 찾기
		
		String 문자열2 ="자바 프로그래밍";
		
		int location= 문자열2.indexOf("프로그래밍");
		
		System.out.println(location); // -> 3. 찾고자 하는 문자열 첫글자의 위치
		
		Scanner scan= new Scanner(System.in);
		
		String 검색어= scan.next();
		
		if(문자열2.indexOf(검색어)!= -1) { //index는 0부터이므로 -1이면 검색이 됐다는 뜻
			System.out.println("해당 관련된 도서입니다.");
			
		}else {
			System.out.println("해당 관련 도서가 아닙니다.");
		}
		
		//length : 문자의 수
		System.out.println(문자열2.length()); //띄어쓰기도 포함.
		
		//replace : 문자교체
		String 기존문자 = "자바는 객체지향 언어입니다.";
		String 교체문자 = 기존문자.replace("자바", "c언어");
		
		System.out.println(기존문자);
		System.out.println(교체문자);
				
		
	}

}
