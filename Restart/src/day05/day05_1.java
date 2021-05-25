package day05;

import java.util.Scanner;

public class day05_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//예제1. 369게임
		//1. 하나의 정수를 입력받아 해당 정수까지 숫자출력
		//2. 3,6,9  포함된 숫자는 박수 출력 예) 3->박수 33->박수박수
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("하나의 정수:" );
		int 정수=scan.nextInt();
		
		int i=1;
		
		while(true) {
			
			int j=i/10;
			
			if(i%10==3|| i%10==6||i%10==9) {
				
				System.out.println("박수");
				
			
				if(j%10==3|| j%10==6 ||j%10==9) {
					
					System.out.println("박수");
					
					}
			
			}else {
				
				System.out.println(i);
			}
			
			i++;
			if((정수+1)==i) {
				
				break;
			}
			
			
		}

	}

}
