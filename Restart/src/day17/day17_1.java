package day17;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class day17_1 {

	public static void main(String[] args) {
		
		//컬렉션 프레임워크 : 자료구조 [ 데이터 관리구조 ]
			// Stack 클래스 :
					// 예) ctrl + z 기능 - LIFO : 입구/출구 동일하므로 가장 나중에 들어온 메모리가 가장먼저 삭제
		
			// Queue 클래스 : 
					// 예) 줄세우기 - FIFO :입구/출구 별도. 가장 먼저 들어온 메모리가 가장 먼저 나감
		
			// List 클래스
		
		
		
		
		//스택
		Stack<동전 > 동전상자 = new Stack<>();
			//< > : 제네릭. 클래스 안에 들어갈 메모리클래스 예) Arraylist 안에들어갈 Arraylist<메모리>
		
		동전상자.add(new 동전(100));
		
		동전상자.add(new 동전(200));
		
		동전상자.add(new 동전(300));
		
		System.out.println("동전상자의 동전수 : "+동전상자.size());

		
		
//		Stack<동전 > 동전상자10 = new Stack<>();
//		
//		동전상자10.push(new 동전(100));  ==> push == add
//		
//		System.out.println("동전상자10의 동전수 : "+동전상자10.size());
//	
		
		//for (int i=0; i<동전상자.size; i++) {  }
		for(동전 temp : 동전상자) { //모든출력
			
			System.out.println("동전 금액"+temp.동전);
		}
		
			//temp로 프린트하면 주소값이 나오고, temp.동전으로 프린트하면 동전값이나온다.
		
		
		while(!동전상자.isEmpty()) { //동전상자 빌때까지 pop으로 스택에서 삭제
			동전 temp= 동전상자.pop(); // pop() : 뺴오기 ==삭제 
			System.out.println("꺼낸 동전: "+temp.동전);
		}

		
		System.out.println("   ");
		
		
		//큐 Queue
		
		Queue<동전> 동전상자2 =new LinkedList<>(); // Queue는 인터페이스이다.
		
		동전상자2.offer(new 동전(100)); //offer==add
		동전상자2.offer(new 동전(200));
		동전상자2.offer(new 동전(300));
		
		System.out.println("동전상자 2: "+동전상자2.size());
		
		for(동전 temp : 동전상자2) {
			
			System.out.println("동전 금액: "+temp.동전);
		}
		
		
		while(!동전상자2.isEmpty()) {
			
			동전 temp=동전상자2.poll();
			System.out.println("동전 금액: "+temp.동전);
		}
		
		
		System.out.println("==== 스택은 300 200 100삭제, 큐는 100 200 300 삭제======");
		
		
		
		
		
		
		
		
		
		

	}

}
