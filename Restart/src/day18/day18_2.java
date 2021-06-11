package day18;

import java.awt.Toolkit;

public class day18_2 {
	
	public static void main(String[] args) {
		
		
		
		
	
		//스레드 : 코드 읽어주는 역할
			//main 메소드에 main 스레드 존재
		
			//멀티스레드 : 여러 코드를 동시 처리
			//코드 병행처리
				//컴퓨터입장 => 병행처리 X 순서대로 처리
		
//		멀티스레드 정의
//		1.implements Runnable -> run 메ㅗ드 @override
//		2. extends Thread => run 메소드 @override
//		3. new Thread(new Runnable() {메소드 @override});
//		
		
		
		//예제 1 단일스레드
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println("==========================예제1 끝");
		
		//예제2 멀티스레드
		Runnable 소리 = new 소리스레드();
		Thread 멀티스레드1=new Thread(소리);
		
		멀티스레드1.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("==========================예제2 끝");

		
		Thread 멀티스레드2=new 소리스레드2();
		
		멀티스레드2.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println("==========================예제3 끝");

		// 예제 4
		
//		Thread 멀티스레드3= new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				
//				for(int i=0; i<5; i++) {
//					System.out.println("띵");
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					
//				}
//				
//				
//				
//			}
//		}); 
//			
//		
		
		
		//예제	1. 영화실행스레드 =>영화실행 5번출력
		//	  	2. 음악 실행스레드 =>음악실행 5번출력
		//    	3. 메일 실행스레드 =>메일실행 5번출력
		
	}

}
