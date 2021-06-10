package day17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Stack이용_자판기예제답안지 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Stack<String> 콜라=new Stack<>();
		Stack<String> 사이다=new Stack<>();
		Stack<String> 환타=new Stack<>();
		
		List<Stack<String>> 제품재고= new ArrayList<>();
		제품재고.add(콜라);
		제품재고.add(사이다);
		제품재고.add(환타);
		
		
		Scanner scan= new Scanner(System.in);
		
		
		for(int i=0; i<10; i++) {
			제품재고.get(0).push("콜라");
			제품재고.get(1).push("사이다");
			제품재고.get(2).push("환타");
		}
		
		
		while(true) {
			
			System.out.println("금액:");
			int 금액= scan.nextInt();
			
			
			while(true) {
				
				if(!콜라.isEmpty()) {
					System.out.println("1.콜라 [가격:200  재고:  " +제품재고.get(0).size()+"]");
				}				
				else {
					System.out.println("1.콜라 [가격:200  재고:  " +"매진]");

				}
				
				if(!사이다.isEmpty()) {
				System.out.println("2.사이다 [가격:300  재고:  "+제품재고.get(1).size()+"]");
				}else {
					System.out.println("2.사이다 [가격:300  재고:  "+"매진]");
				}
				if(!환타.isEmpty()) {
				System.out.println("3.환타 [가격:400  재고:  "+제품재고.get(2).size()+"]");
				}else {
					
					System.out.println("3.환타 [가격:400  재고:  "+"매진]");
				}
				
				System.out.println("4.금액반환");
				
				
				
				int 선택=scan.nextInt();
				
				if(선택==1) {
					
					if(금액<200) {
						System.out.println("금액이 부족합니다.");
					}else if(콜라.isEmpty()) {
						System.out.println("재고가없습니다");
					}else {
						System.out.println("콜라 반환");
						제품재고.get(0).pop();
						금액-=200;
					}
					
				}
				
				if(선택==2) {
					
					if(금액<300) {
						System.out.println("금액이 부족합니다.");
					}else if(사이다.isEmpty()) {
						System.out.println("재고가없습니다");
					}else {
						System.out.println("사이다 반환");
						제품재고.get(1).pop();
						금액-=300;
					}
					
				}			
								
				
				
				if(선택==3) {
					if(금액<400) {
						System.out.println("금액이 부족합니다.");
					}else if(사이다.isEmpty()) {
						System.out.println("재고가없습니다");
					}else {
						System.out.println("환타 반환");
						제품재고.get(2).pop();
						금액-=400;
					}
					
								
								
				}
				if(선택==4) {
					
					System.out.println("잔돈 반환: "+금액);
					break;
				}			
			
			
			
			
			}//while 끝
			
			
		}
		
	}

}
