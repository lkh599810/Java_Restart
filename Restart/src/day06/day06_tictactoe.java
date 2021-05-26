package day06;

import java.util.Random;
import java.util.Scanner;

public class day06_tictactoe {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//스캐너
		
		Scanner scan=new Scanner(System.in);
		
		
		//1차에서 결국 제대로 못만들었던 틱택토 재도전.
		
		//1.게임판 선언
		
		String[] 게임판=new String[9];
		
		게임판[0]="[ ]";
		게임판[1]="[ ]";
		게임판[2]="[ ]";
		게임판[3]="[ ]";
		게임판[4]="[ ]";
		게임판[5]="[ ]";
		게임판[6]="[ ]";
		게임판[7]="[ ]";
		게임판[8]="[ ]";
		
		//다른방법
		//String[] 게임판={"[]","[]","[]","[]","[]","[]","[]","[]","[]"}; 이렇게 해도됨

		
		
		
		//2.게임판 출력
		
	while(true) {
		
	for(int i=0; i<게임판.length; i++) {
			//
			System.out.print(게임판[i]);
			
			if(i%3==2)  //배열인덱스가 2, 5, 8 일때 라인바꾸기
			System.out.println();
			
			
		}
		
		//3. 플레이어 입력받아서 판 모양 바꾸기		
		while(true) {
					System.out.println("번호 선택 [0-8] 사이: ");
					int 선택=scan.nextInt();
					
					if(게임판[선택].equals("[ ]")) {
					
						게임판[선택]="[o]";
					
						
						break;
					
						}else {
						
						System.out.println("이미 둔 자리입니다.[ 다른곳 선택]");
						
						}
				
				
					}
		
		//4. 컴퓨터플레이어
		
			System.out.println("컴퓨터 순서입니다.");
			
			Random random= new Random();
				
			while(true) {
				
				
					int 선택=random.nextInt(9);  //???? 9의 의미
				
					if(게임판[선택].equals("[ ]")) {
					
						게임판[선택]="[x]";
						break;
					} // ???? else 안써줘도 random이 알아서 둔자리 걸러주는건가요?
		
			
				}
	
			//5.이기는 경우의 수
				
				String 승리패="0"; //아무값이나 일단 대입
				//5-1: 가로로 이기는수
				for(int i=0; i<=6; i+=3) {
					
					if(게임판[i].equals(게임판[i+1]) && 게임판[i+1].equals(게임판[i+2])) {
						
					if(!게임판[i].equals("[ ]"))	승리패=게임판[i];
						
					}
				}
				
				//5-2:세로로 이기는수
				for(int i=0; i<=2; i+=1) {
					
					if(게임판[i].equals(게임판[i+3]) && 게임판[i+3].equals(게임판[i+6])){
						
					if(!게임판[i].equals("[ ]"))	승리패=게임판[i];
						
					}
				}
				
				
				//5-3: 대각선으로 이기는수
				
					if(게임판[0].equals(게임판[4])&&게임판[4].equals(게임판[8])) {
						
					if(!게임판[0].equals("[ ]"))	승리패=게임판[0];
						
					}
					if(게임판[2].equals(게임판[4])&&게임판[4].equals(게임판[6])) {
						
					if(!게임판[2].equals("[ ]"))	승리패=게임판[2];
							
					}
					
				
				
					
				
				//6.승리 판단
				if(승리패.equals("[o]")) { 
					System.out.println("플레이어 승리"); 
					break;
				}
				
				if(승리패.equals("[x]")) { 
					System.out.println("컴퓨터 승리");
					break;
				}
				
				
			
		}//처음 while	
		
		
	
	
	
	
	
	
	
	}

}
