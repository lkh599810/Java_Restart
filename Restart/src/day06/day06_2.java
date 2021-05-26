package day06;

public class day06_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//day01: 출력
		//day02: 입력
		//day03: 변수/자료형
		//day04: 연산자/제어문
		//day05: 반복문
		
		//배열: 특성기준[인덱스]로 순서대로 저장된 변수
		
		//배열 사용이유: 변수 여러개를 동시에 관리하기위해서 사용.
		//변수->메모리할당
		//배열 -> 여러개변수 -> 여러개의 메모리할당
		//인덱스 : 변수가 배열에 저장되는 순서
		// ****0번부터 시작 ~~~~
		
		
		int 정수1;
		
		int 정수2;
		
		int 정수3;
		
		//배열 선언
		int[] 배열정수= new int[3]; //int*3 ==> 12바이트 배열
		//배열 호출
		
		System.out.println(배열정수[0]); //배열 호출 ==>변수값 아직 안넣어줫으면 0으로나옴.
		System.out.println(배열정수[1]);
		System.out.println(배열정수[2]);
	//	System.out.println(배열정수[3]); ==> 콘솔에서 오류남.
		
		
		배열정수[0]=10;
		배열정수[1]=20;
		배열정수[2]=30;
		
		System.out.println(배열정수.length);
		System.out.println(배열정수); //주소값나옴
		System.out.println(배열정수.toString()); //얘도 똑같은 주소값
		System.out.println(배열정수[0]); //배열 호출
		System.out.println(배열정수[1]);
		System.out.println(배열정수[2]);
		
		//1차원 배열 : int[] 배열명= new int[]
		//2차원 배열 : int[][] 배열명= new int[행][열]
 		
		int [][] 배열정수2= new int [2][2]; //2행2duf
		
		배열정수2[0][0]=80;
		
		배열정수2[0][1]=90;
		
		배열정수2[1][0]=100;
		
		배열정수2[1][1]=110;
		
		System.out.println(배열정수2.length); //행 길이
		System.out.println(배열정수2[0].length); //열 길이
		
		System.out.println(배열정수2[0][0]);
		System.out.println(배열정수2[1][0]);
		
		
		System.out.println(배열정수2[0]); //주소값
		System.out.println(배열정수2[1]); //주소값
		
	//	System.out.println(배열정수2[3]); //오류
		
		
		
		 //틱택토 만들기
		
		
		
		
		
		
		
	}

}
