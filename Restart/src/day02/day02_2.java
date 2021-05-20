package day02;

import java.util.Scanner;

public class day02_2 {

	public static Scanner a=new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//출석부 만들기
		
		
		
		//예제1. 총 3명의 이름과 1~3교시 까지의 데이터를 입력받아 출력하기
		System.out.println("학생 1 입력: ");
		
		String 학생1=a.next();
		
		System.out.println("학생 1의 1교시 출석여부 입력: ");

		String 학생1출석1=a.next();
		System.out.println("학생 1의 2교시 출석여부 입력: ");

		String 학생1출석2=a.next();
		
		System.out.println("학생1의 3교시 출석여부 입력: ");
		
		String 학생1출석3=a.next();
		
		
		System.out.println("학생 2 입력: ");
		
		String 학생2=a.next();
		
		System.out.println("학생 2의 1교시 출석여부 입력: ");

		String 학생2출석1=a.next();
		System.out.println("학생 2의 2교시 출석여부 입력: ");

		String 학생2출석2=a.next();
		
		System.out.println("학생 2의 3교시 출석여부 입력: ");
		
		String 학생2출석3=a.next();
		
		
		System.out.println("학생 3 입력: ");
		
		String 학생3=a.next();
		
		System.out.println("학생 3의 1교시 출석여부 입력: ");

		String 학생3출석1=a.next();
		System.out.println("학생 3의 2교시 출석여부 입력: ");

		String 학생3출석2=a.next();
		
		System.out.println("학생 3의 3교시 출석여부 입력: ");
		
		String 학생3출석3=a.next();
		
		
	
	
		
		
		System.out.println("============출석부============");
		
		System.out.println(학생1+"\t"+학생1출석1+"\t"+학생1출석2+"\t"+학생1출석3);
		System.out.println(학생2+"\t"+학생2출석1+"\t"+학생2출석2+"\t"+학생2출석3);
		System.out.println(학생3+"\t"+학생3출석1+"\t"+학생3출석2+"\t"+학생3출석3);

		
		
//		=====================================예제2=====================================
		
		
		//예제2 :학생 2명 국영수 성적 입력받아서 총점 평균 구하기
		
	
		System.out.println("학생a의 국어점수 입력 : " );
		
		int 국1=a.nextInt();
		
		System.out.println("학생a의 영어점수 입력 : " );
		
		int 영1=a.nextInt();
		
		System.out.println("학생a의 수학점수 입력 : " );
		
		int 수1=a.nextInt();
		
		System.out.println("학생b의 국어점수 입력 : " );
		
		int 국2=a.nextInt();
		
		System.out.println("학생b의 영어점수 입력 : " );
		
		int 영2=a.nextInt();
		
		System.out.println("학생b의 수학점수 입력 : " );
		
		int 수2=a.nextInt();
		
		
		
		int 국영수1총점=국1+영1+수1;
		int 국영수1평균=(국1+영1+수1)/3;
		
		int 국영수2총점=국2+영2+수2;
		int 국영수2평균=(국2+영2+수2)/3;
		
		
		System.out.println("==========점수표==========");
		System.out.println("\t국어\t영어\t수학\t총점\t평균");
		System.out.println("학생a :\t"+국1+"\t"+영1+"\t"+수1+"\t"+국영수1총점+"\t"+국영수1평균);
		System.out.println("학생b :\t"+국2+"\t"+영2+"\t"+수2+"\t"+국영수2총점+"\t"+국영수2평균);
		
		
		
		//=====================================예제3=====================================
				
				
				//예제3 :1명의 회원가입 표 만들기
		//아이디 비번 이메일 이름
		
		
		
		System.out.println("\n\n\n");
		
		System.out.println("==========회원가입===========");
		System.out.println("아이디 입력:" );
		
		String id=a.next();

		System.out.println("비번입력: ");
		String pw=a.next();
		
		System.out.println("이메일입력:");
		String email=a.next();
		
		System.out.println("이름입력:");
		
		String name=a.next();
		
		
		System.out.println("==========회원가입 정보===========");
		
		System.out.println("이름:" +name);
		System.out.println("아이디: " +id);
		System.out.println("비번:" +pw);
		System.out.println("이메일:" +email);

		
		
		
		//==과제 1====
		// 지폐 세기
		// 34200 ==> 만원 :3 천원:4 백원:2 등
		
		
		// 1. 배열 쓰기?
		
		
		while(true) {
			
		System.out.println("\n"); 
		
		int 오만;
		
		int 만;
		
		int 오천;
		
		int 천;
		
		int 오백;
		
		int 백;
		
		int 오십;
		
		int 십;
		
		int 일;
		
		int 나머지;
		
		System.out.println("=====지폐세기 프로그램 (1~100만원 사이 입력)======");
		System.out.println("금액 입력:");
		
		int 금액=a.nextInt();
		
		System.out.println(금액);
		
		if(1<=금액&&금액<=1000000) {
			
			오만=금액/50000;
			
			나머지=금액-(오만*50000);
			
			만=나머지/10000;
			
			나머지=나머지-(만*10000);
			
			오천=나머지/5000;
			
			나머지=나머지-(오천*5000);
			
			천=나머지/1000;
			
			나머지=나머지-(천*1000);
			
			오백=나머지/500;
			
			나머지=나머지-(오백*500);
			
			백=나머지/100;
			
			나머지=나머지-(백/100);
			
			오십=나머지/50;
			
			나머지=나머지-(오십/50);
			
			십=나머지/10;
			
			나머지=나머지-(십/10);
			
			일=나머지/1;
			
			나머지=나머지-(일/1);
			
			
			
			System.out.println("오만원권 :" +오만+ "장");
			
			System.out.println("만원권 :" + 만+ "장");
			
			System.out.println("오천원권 :" + 오천+ "장");

			System.out.println("천원권 :" + 천+ "장");

			System.out.println("오백원권 :" + 오백+ "장");

			System.out.println("백원권 :" + 백+ "장");

			System.out.println("오십원권 :" + 오십+ "장");

			System.out.println("십원권 :" + 십+ "장");

			System.out.println("일원권 :" + 일+ "장");

			
			
			
			
		}else {
			
			System.out.println("단위가 너무 커서 계산 불가합니다.");
			
			return;
			
		}
		
		
		
		}
		
	}

}
