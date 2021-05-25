package day05;

import java.util.Scanner;

public class day05_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	//반복문
		
		//for문 (조건)
			//for(int i=0; i<10; i+=3)
			//for(시작값 ; 조건문 ; 증감식;)
		
		//while문 (논리)
			//int i=0;
			
		//while(){ 
		
		//		i++; 증감식
		
		//		}
		
		//do~while 문 : 먼저 실행 후 검사를 함. ==> 먼저 한번 실행해야하는경우.
		
		
		
//		==================================================================================
		
	
		for(int i=0; i<10; i++) {
			//i가 0부터 10 미만까지 1씩 증가하면서 반복
			
			System.out.println(i);
			
		}
		System.out.println("==========================================");

		//예제 1. 1~50까지 출력
		
		for(int i=5; i<51; i+=3) {
			
			System.out.println(i);
		}
		
		System.out.println("==========================================");
		
		int sum=0;
		//예제2. 1~50까지 3배수합계
		for(int i=0; i<51; i+=3) {
			
			sum+=i;
			 
		}
		System.out.println(sum); //==> sum을 for문 안에 넣어놓으면 3씩 더해준값이 다나옴. for문은 50전까지 무한루프이니까.
		
		
		
		System.out.println("==========================================");

		//예제 3. 구구단 출력
		
		for(int 단=2; 단<10; 단++) {
			
			for(int 곱=1; 곱<10; 곱++) {
				
				System.out.println(곱*단);
			}
			
		}
		
		System.out.println("==========================================");
	
		//예제4. 입력한 줄 수만큼 별[*]출력.
		
		Scanner 입력= new Scanner(System.in);
		System.out.println("줄 입력:");
		int 정수=입력.nextInt();
		
		for(int i=1; i<=정수; i++) 	{
			
			
			System.out.print("*");
			if(i%5==0)System.out.println();
				
			
			
		}
	

		System.out.println("==========================================");
			
		//예제5. 크리스마스트리 출력
		
		System.out.println("트리 줄 입력:");
		
		int 줄=입력.nextInt();
		
		for(int i=0; i<줄; i++) {
			
			for(int j=1; j<줄-i; j++) {
				
				 System.out.print(" ");
			}
			
			
			for(int k=0; k<i*2+1; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("==========================================");
		
		//예제6. 다이아몬드 출력
		
		
		
		//예제7. 입력없이 x자 출력
		
	
	
	
	
	}

}
