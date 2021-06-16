package day19;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class day19_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//console 프로그램
		
		//클래스 사용, 상속 인터페이스, 파일처리 사용
		
		//프로그램 만들기
		
		// 주제: 키오스크
		// 필요: 버거/음료/사이드를 담은 객체1 하나 생성 -> 주문 어레이리스트에 하나 담기 
		// 						객체1에는 버거/음료/사이드가 하나는 담겨야한다.
		
		
		
		//시도1. 버거/음료/사이드 Stack 만들기 ==> Stack을 담고있는 Arraylist '장바구니'에 담아주기  ==> 실패 : why? Stack->arraylist로 담아주기에는 가격과 수량을 선택못함
		// 결국 food라는 클래스를 만든후 burger/drink/side를 지정해주어야할듯. 하던대로.
		
//		Stack<String> burger=new Stack<>();
//		Stack<String> drink=new Stack<>();
//		Stack<String> side=new Stack<>();

		
		ArrayList<Stack<String>> 장바구니 =new ArrayList<>();
		
//		장바구니.add(burger);
//		장바구니.add(drink);
//		장바구니.add(side);
//		
		
		
		Scanner scan= new Scanner(System.in);
		
		int menuchoose=scan.nextInt();
		
		int burgerchoose=scan.nextInt();
		
	while(true) {	
		
		System.out.println("===Burger king===");
		System.out.println("메뉴");
		System.out.println("1. 버거류 2. 음료 3. 사이드");
		
		
				if(menuchoose==1) {
		
					System.out.println("제품 골라주세요");
					System.out.println("1. 싸이버거 2. 치즈버거 3. 불고기버거 4. 치킨버거");
					
					if(burgerchoose==1) {
						
						장바구니.get(0).push("싸이버거");
						System.out.println("싸이버거를 장바구니에 담았습니다.");
		
						
					}else if(burgerchoose==2) {
						장바구니.get(0).push("치즈버거");
						System.out.println("치즈버거를 장바구니에 담았습니다.");
					}else if(burgerchoose==3) {
						
					}else if(burgerchoose==4) {
						
					}
					
				
				}
				else if(menuchoose==2) {
				
					System.out.println("제품 골라주세요");
					System.out.println("1. 사이다 2. 콜라 3. 환타 4. 레몬에이드");
						
					
				}	
				else if(menuchoose==3) {
				
					System.out.println("제품 골라주세요");
					System.out.println("1. 치킨너겟 2. 감자튀김 3. 치즈볼 4. 소프트아이스크림");
						
					
				}else {
					
					System.out.println("숫자입력이 잘못됨.");
					
					return;
				}
				
	
	
		}//while끝
	
	
	
	}

}
