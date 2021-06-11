package day18;

public class 스레드예제 {

	
	//예제	1. 영화실행스레드 =>영화실행 5번출력
	//	  	2. 음악 실행스레드 =>음악실행 5번출력
	//    	3. 메일 실행스레드 =>메일실행 5번출력
	
	public static void main(String[] args) {
		
		Thread 영화실행 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
			
				for(int i=0; i<5; i++) {
					
					System.out.println("영화실행중");
					
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		
			Thread 음악실행 = new Thread(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
					
						for(int i=0; i<5; i++) {
							
							System.out.println("음악실행중");
							
							try {
								Thread.sleep(2000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						
					}
				});

			Thread 메일실행 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
			
				for(int i=0; i<5; i++) {
					
					System.out.println("메일실행중");
					
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		
		영화실행.start();
		음악실행.start();
		메일실행.start();
		
	}
	
}
