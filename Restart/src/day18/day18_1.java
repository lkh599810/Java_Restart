package day18;

import java.util.Scanner;

public class day18_1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		//예외처리 문제
		
		Scanner scan= new Scanner(System.in);
		
		String[] 배열= new String[10]; // ==> 대기명단 팀을 입력해야하는줄 알았는데 int 로 선언하는게 나았네.
		
		System.out.println("대기명단 프로그램");
		System.out.println("메뉴 : 1. 대기명단추가 2. 대기명단 삭제");
		System.out.println("선택: ");
		int 선택=scan.nextInt();
		
		if(선택==1) {
			
						for(int i=0; i<=배열.length; i++) { //배열 전체기
				
							if(!배열[i].isEmpty()) {//10개까지 검사를 하고 비어있지않으면(가득 차있으면)
							
								System.out.println("대기명단이 가득 찼습니다.");
								
							}else if(배열[i].isEmpty()){
								System.out.println("명단을 입력해주세요");
								
								String 입력=scan.next();
							
								배열[i]=입력;
								
								System.out.println("현재 대기순위: "+i);
								
							}
						
						}
			
			
			
			
			
		}
		

	}

}
