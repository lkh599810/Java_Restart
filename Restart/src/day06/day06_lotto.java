package day06;

import java.util.Random;
import java.util.Scanner;

public class day06_lotto {

	
	public static void main(String[] args) {
		
		//로또 판별기
		
		//준비: 배열 생성
		//6개짜리 배열생성 본인하나 추첨번호 하나
		int[] 로또=new int[6];
		int[] 추첨번호=new int[6];
		Scanner scan=new Scanner(System.in);
		
		//1. 입력받기
		
		for(int i =0; i<=5; i++) {
			
			
			while(true) {
			
			int 스위치=0;
			System.out.println((i+1)+"~45사이의 숫자입력");
			int temp=scan.nextInt();
		
			
			if(temp<=0 ||temp>45) {
				
				System.out.println("다시입력. 1-45사이만 가능");
				스위치=1;
			}
			
			//중복값 제거 [기존 배열에 이미 숫자가 있는 수 제거]		
			for(int j=0; j<로또.length; j++) {
				
				if(로또[j]==temp) {
					System.out.println("이미 존재하는 수입니다.");
					스위치=1;
				
				}
					
			}
			
			
			if(스위치==0) { 로또[i]=temp; break;}	
			
			}//while 끝
		}
		
		//확인
		System.out.println("확인: ");
		for(int i=0; i<=5; i++) {
			
			System.out.print(로또[i]+" ");
			
		}
		
		//추첨번호 => 난수 6개 생성;
		for(int i =0; i<=5; i++) {
			
			
			while(true) {
			
			int 스위치=0;
			
			Random random= new Random();
			
			int temp=random.nextInt(45)+1; //0~44==> +1해서 1부터 45까지
		
			
			if(temp<0 ||temp>45) {
				
				
				스위치=1;
			}
			
			
			//중복값 제거 [기존 배열에 이미 숫자가 있는 수 제거]		
			for(int j=0; j<로또.length; j++) {
				
				if(로또[j]==temp) {
					System.out.println("이미 존재하는 수입니다.");
					스위치=1;
				
				}
					
			}
			
			
			if(스위치==0) { 로또[i]=temp; break;}	
			
			}//while 끝
		}
		
		System.out.println("\n 로또추첨 당첨번호");
		for(int i=0; i<=5; i++) {
			
			System.out.println(추첨번호[i]+" ");
		}
		
		
		
		//추첨 결과: [배열 비교]
		
		int 당첨개수=0;
		
		for(int i=0; i<=5; i++) {
			
			for(int j=0; j<=5; j++) {
				
				if(로또[i]==추첨번호[j]) 당첨개수++;
				
				
			}
		}
		
		
		
		if( 당첨개수 == 6 ) System.out.println(" 당첨결과 : 1등 ");
		if( 당첨개수 == 5 ) System.out.println(" 당첨결과 : 2등 ");
		if( 당첨개수 == 4 ) System.out.println(" 당첨결과 : 3등 ");
		if( 당첨개수 == 3 ) System.out.println(" 당첨결과 : 4등 ");
		if( 당첨개수 == 2 ) System.out.println(" 당첨결과 : 5등 ");
		if( 당첨개수 == 1 ) System.out.println(" 당첨결과 : 꽝 ");
		if( 당첨개수 == 0 ) System.out.println(" 당첨결과 : 꽝 ");
		
		
	}
}
