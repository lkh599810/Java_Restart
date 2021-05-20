package day02; //패키지명

import java.util.Scanner;

public class day02_1 { //클래스

	//클래스 정의
	
	
	public static void main(String[] args) {
						//main 스레드: 코드를 읽어주는 역할
		
	// ========================1일차 복습	
		
		//실행 코드
	//	System.out.println("자바입니다");
		
		
		//컴파일 의미: java ==> 기계어로 번역한다는 의미
		// 그 중에 ascii code, unicode 등이 잇음
		
		//%d: 정수 들어가는자리
		//%s: 문자 들어가는 자리
		
		// \n :줄바꿈
		// \t : 들여쓰기 [tab]
		
	//===============================1일차 복습 끝===========================	
		
		
	//===========================2일차 시작==============================
		
	
	//Scanner : 입력클래스
	Scanner 입력 = new Scanner(System.in); //: 입력클래스를 이용한 입력객체 만들기
	//객체 만들기: 클래스명 객체이름= new 생성자명();
								//new : 객체에 메모리할당
								//System.in : 입력장치
	
	
	
	System.out.println("int값 입력"
			+ "");
	
	int 정수= 입력.nextInt(); //키보드로 부터 값을 빼와서 Scanner 입력으로 int형 변수 '정수'에 저장했음
		
	
	System.out.println("현재 입력한 int값은 : " +정수); //'정수'를 빼옴
	
	
	//변수와 객체의 차이점
	
	//변수 : 저장하는 공간 [변하는 값]  변수의 자료형 int, char 등
	//변수의 자료형 : 미리 만들어진 [크기] ==> 메모리 효율적으로 쓰기 위해서.
	
	
	
	//객체 : 저장하는 공간
	// 클래스 기반으로 만들어진 메모리. ==> new 필요, 이친구는 메모리가 미리 안만들어진 가변적인 [크기]
	
	// 변수와 객체는 컴퓨터 입장에서 동일. 사실 자료형도 클래스이기때문. 하지만 자료형은 object클래스 바로 밑의, 정말 기본적인 원시 친구들이기 때문에
	// 우리는 구별해서 말함.
	
	// 다시, 객체와 변수의 차이1 : 메모리적   : 변수는 메모리 정해져잇고, 객체는 메모리 가변적이다.
	// 		객체와 변수의 차이2 : 문법적: 변수는 자료형 + 변수, 메모리는 클래스 객체= new 클래스
	
	
	
	//변수 
	
	int 변수1; //int형 변수 선언 ==> 컴파일 시 java.lang.error: unresolved compilation 에러 뜸.
	
	int 변수2=10; //int형 변수 선언+데이터 넣어주기
	
	변수1=100; //변수: 데이터변경 가능
		
	//변수 출력: syso("변수") ==> X 
	//변수 출력: syso(변수)==> O
	
	
	
	//자료형
	
	boolean 논리변수= true; // true or false만 저장가능, boolean은 1비트. 1비트는 0과1로 이루어진 가장 작은 메모리  => 8비트 :1바이트 , 1024바이트: 1킬로바이트
	
	System.out.println("boolean형 논리변수:  "+논리변수);
	
	
	char 문자변수= 's'; // char은 작은따옴표 써야함

	char 문자변수2=100; //유니코드 변환하면 199는
	
	System.out.println("문자변수2"+문자변수2);
	
	byte 바이트변수=100;
	
	System.out.println("바이트변수:"+바이트변수);	
	
	short 쇼트변수=300;
	System.out.println("쇼트형 변수:"+쇼트변수);

	
	int 인트변수=100;
	System.out.println("인트형 변수"+1);
	
	long 롱변수=999999999999L; //L이라는걸 써줘야 Long 형을 쓴다는 의미
	
	System.out.println(롱변수);
	
	float 플롯변수=1.2f; //float도 long형 처럼 f붙여야함. [기본실수형은 더블이기 때문]
	
	
	
	double 더블변수=1.072; //
	
	
//	==============================================클래스==================================================
	
	
	//문자열 클래스 String
	
	String 문자열객체=new String();
	
	문자열객체=new String();
	
	String 문자열객체2="ㅇ"; //원래라면 스트링은 클래스이므로 String a= new String(); 을 선언해줘야하지만
	//String 등 몇가지 친구들은 예외 가능.
	
	
	
	//예외 2 Integer
	
	//Integer정수123=new Integer(정수123);  =>오류남
	
	Integer integer정수= 123;
	System.out.println("integer정수:  " + integer정수);
	
	//int와 integer 차이: int는 null값 불가. integer는 null값 사용가능.  ==> db에서 integer 사용시 용이
	
	
	//강제 형변환  => 큰용량에서 작은용량으로 강제로 변환
	
	
	
	
	String ssd="z";
	
	int sdf=13;
	
	ssd=String.valueOf(sdf); // ==> Int를 String에집어넣을 시.
	
	System.out.println(ssd);
	
	
	
	
	
	
	
	
	}

}
