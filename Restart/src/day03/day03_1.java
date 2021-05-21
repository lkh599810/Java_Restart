package day03;

import java.util.Scanner;

public class day03_1 {

	public static void main(String[] args) {

		
		//연산자
		
		//산술연산자 :  +, -, *, /, %
		
		//대입연산자 :  +=,-= ,*=, /=,%= 
		
		//비교연산자 :  >, >=, ==, <, <=,!=   --> 결과: true of false
		
		//논리연산자 :  && : and, || : or, ! : not 
		
		//증감연산자 : [순차적인 증가/감소] : ++변수(선위증가), 변수++(후위증가), --변수(선위감소), 변수--(후위감소)

//=======================================================================================================================================
	
		
		
		
//==========3일차 시작==============================================================================================================================
		
		
		int a=10;
		
		int b=20;
		
		int c=45;
		
		System.out.println("더하기"+a+b); //결과 : 1020 ==> 문자연결연산자로됨
		
		System.out.println("더하기: "+(a+b)); //결과 : 30 ==> 산술연산 정상작동.
		
		// !!!! 산술연산 쓸 때는 괄호 넣어줘야함.
	
		
		a+=5;
		System.out.println("대입 연산자 후: "+a);
		
		
		//비교연산자
		System.out.println("초과: "+(a>b)); //결과: false로 나옴. true/ false중에 하나로 나오는 듯

		
		//논리연산자 => 비교연산자 2개이상
		System.out.println("AND: "+(a>b&&b>c));
		System.out.println("OR:"+(a>b||b<c));
		
		
		//증감연산자
		System.out.println("후위증가: "+(a++));//여기서는 반응없음 똑같이 15
		
		System.out.println("후위증가 확인:" +a);// 이제 결과: a=16
		
		System.out.println("선위증가: "+(++a));//여기선 바로 1증가 -> a=17
		
		System.out.println("후위감소:"+(a--)); //반응없고 똑같이17
		
		System.out.println("후위감소 확인: "+a); //결과 16
		
		System.out.println("선위감소: "+ --a);//결과  15
		
		
		
//===========================================예제===================================================================================
		
		
		//1. 하나ㅡ이 정수를 입력받아 7의배수이면서 홀수인지 확인
		
		Scanner 입력= new Scanner(System.in);
		
		System.out.println("====7의 배수이면서 홀수인지 확인====");
		System.out.println("정수 입력:" );
		
		int qq=입력.nextInt();
		
		System.out.println("확인: "+ (qq%2==1 && qq%7==0));
		
		//2. 키별 표준체중 (키-100*0.9)
		
		System.out.println("===키 별 표준몸무게=====");
		System.out.println("키 입력:" );
		int aaa=입력.nextInt();
		
		System.out.println("표준몸무게: " +(aaa-100)*(0.9));
		
		//3. bmi 구하기 몸무게/ ((키/100) * (키/100))
		
		System.out.println("===BMI 구하기===");
		System.out.println("몸무게 입력:");
		int zzz=입력.nextInt();
		System.out.println("키 입력: ");
		int zzzz=입력.nextInt();
		System.out.println("BMI : "+zzz/ ((zzzz/100)*(zzzz/100)) );
		
		// 키와 몸무게를 int로 받았더니 bmi가 80이 나오더라. 키 179/100이 1.79로 안나오고 1.0으로 떨어져서 그런듯.
		
		
		
		
		System.out.println("===BMI 구하기2===");
		System.out.println("몸무게 입력:");
		double zzz2=입력.nextDouble();
		System.out.println("키 입력: ");
		double zzzz2=입력.nextDouble();
		
		double 키=(zzzz2/100)*(zzzz2/100);
		
		double BMI2=zzz2/키;
		
		
		System.out.println("BMI: "+BMI2);
		
		
		
		
		
		
		
	}

}
