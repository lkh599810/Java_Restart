package day21;

import java.util.Scanner;

public class 클래스예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문제 : 1.도서검색프로그램 도서3개 지정 후 단어 검색 시 해당 도서명 을 출력
		
		String [] 도서= new String [3];
		
		도서[0]="알고리즘 기초";
		도서[1]="자바 기초";
		도서[2]="자바 심화";
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("도서를 검색하시오");
		
		String 검색어= scan.next();
		
	//	System.out.println(도서[0].contains(검색어) );
//		
		for(int i=0; i<도서.length; i++) {
			
			if(도서[i].contains(검색어)) {
				
				System.out.println(도서[i]);
			}
		}
		
//		for(String temp: 도서) {
//			
//			if(temp.indexOf(검색어)!=-1) {
//				
//				System.out.println(temp);
//				
//			}
//			
//		}

	}

}
