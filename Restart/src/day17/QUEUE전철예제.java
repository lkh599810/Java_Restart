package day17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QUEUE전철예제 {

	public static Queue<String> 종점역= new LinkedList<String>();
	public static Queue<String> 용산역= new LinkedList<String>();
	public static Queue<String> 서울역= new LinkedList<String>();
	public static Queue<String> 구로역= new LinkedList<String>();

	public static ArrayList<Queue<String>> 전철현황= new ArrayList<>();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//queue
		//1. 전철 밀어내기
		//2. 역 : 용산 => 서울 => 구로
		//3. 종점역
		//4. 3초마다 하나씩 전철이동
		
		
	
		전철현황.add(종점역);
		전철현황.add(용산역);
		전철현황.add(구로역);
		전철현황.add(서울역);
		
		전철현황.get(0).offer("전철1");
		전철현황.get(0).offer("전철2");
		전철현황.get(0).offer("전철3");
		
		Scanner scan= new Scanner(System.in);
		
		while(true) {
			System.out.println("========현재 전철역 상황 =========");
			전철역현황();
			System.out.println("전철 출발 신호 1.종점 2. 용산 3. 서울 4.구로");
			int 선택= scan.nextInt();
			
			if(선택==1) {
				종점역출발();
			}
			if(선택==2) {
				용산역출발();
			}
			if(선택==3) {
				서울역출발();
			}
			if(선택==4) {
				구로역출발();
			}
			
		}
	
	
	}//메인 끝

	
	
	
	//전철역 현황 메소드
	public static void 전철역현황() {
		
		System.out.println("현재 종점역의 전철 수: "+전철현황.get(0));
		System.out.println("현재 용산역의 전철 수: "+전철현황.get(1));
		System.out.println("현재 서울역의 전철 수: "+전철현황.get(2));
		System.out.println("현재 구로역의 전철 수: "+전철현황.get(3));
		
	}
	
	//종점역 출발 메소드
	public static void 종점역출발() {
	
		try {
			
			System.out.println("3초후~~~");
			Thread.sleep(3000); //3초지연
			if(전철현황.get(0).isEmpty()) {
				System.out.println("출발할 전철이없음");
				System.out.println();
				return;
			}
			
			String temp= 전철현황.get(0).poll();
			전철현황.get(1).offer(temp);
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	public static void 용산역출발() {
		
		try {
			
			System.out.println("3초후~~~");
			Thread.sleep(3000); //3초지연
			if(전철현황.get(1).isEmpty()) {
				System.out.println("출발할 전철이없음");
				return;
			}
			String temp= 전철현황.get(1).poll();
			전철현황.get(2).offer(temp);
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	public static void 서울역출발() {
		
		try {
			
			System.out.println("3초후~~~");
			Thread.sleep(3000); //3초지연
			if(전철현황.get(2).isEmpty()) {
				System.out.println("출발할 전철이없음");
				return;
			}
			String temp= 전철현황.get(2).poll();
			전철현황.get(3).offer(temp);
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	public static void 구로역출발() {
		
		try {
			
			System.out.println("3초후~~~");
			Thread.sleep(3000); //3초지연
			if(전철현황.get(3).isEmpty()) {
				System.out.println("출발할 전철이없음");
				return;
			}
			String temp= 전철현황.get(3).poll();
			전철현황.get(0).offer(temp);
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	
	
	
}
