package day03;

import java.util.Scanner;

public class day03_2 {

	public static void main(String[] args) {
		
		//제어문
		
		
		//1. if 문: 
		
		//if(논리 t/f){ true면 실행}
		
		//2. switch

		
		
		
		

		
		
		
		
//==========3일차 시작==============================================================================================================================

		
		//예제1.
		
		if(3>1) {
			
			System.out.println("참");
		}
		
		
//		============================if 문 ================================

		
		int a;
		
		int b;
		
		Scanner 입력=new Scanner(System.in);
		
		System.out.println("숫자 1입력:");
		
		a=입력.nextInt();
		
		System.out.println("숫자 2입력:");
		
		b=입력.nextInt();
		
		if(a>b) {
			
			System.out.println("zz");
		
		}
		else {
			
			System.out.println("zzz");
			
		}
		
		
		//예제
		
		//점수 두개 입력받아 평균이 80이상이면 우수, 80~60이면 수료, 50이하면 불합격
		
		int 점1;
		
		int 점2;
		
		System.out.println("=====합격 조회프로그램======");
		System.out.println("점수1입력:");
		점1=입력.nextInt();
		System.out.println("점수2입력:");
		점2=입력.nextInt();
		
		if((점1+점2)/2 >=80) {
			
			System.out.println("우수");
			
		}else if((점1+점2)/2>=60) { //첨 생각은 80이상일때도 수료로 나올까봐 조건(평균>=60 && 평균<=80) 이라고 하려했으나, 어차피80이상의 경우는 위의 if에서 빠져나감.
									//*** if if로 하면 "우수 수료" 둘다 나옴.
			System.out.println("수료");
			
		}else {
			
			System.out.println("불합격");
		}
		
		
		
		
		//if ~~ if~~ 와 if ~~else if의 차이
		
		
//		=============================switch문================================
		
		
		
		
		
		
		
		

	}

}
