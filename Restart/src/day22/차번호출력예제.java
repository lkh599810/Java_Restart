package day22;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class 차번호출력예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. 차번호 랜덤으로 0000~9999 사이의 난수를 10개 생성
		// 난수 10개 저장
		//홀수/짝수 나눠서 출력
		
		Random random = new Random();
		
		String [] 차량번호= new String [10];
		
		//난수 생성
		
		for(int i=0; i<10; i++) {
			
			
				//random.nextInt : int범위
				//random.nextInt(10000) : 0~9999
			
				//여기까지는 생각, 자릿수 메꾸기를 못하겠음 예)123 =>0123
			
			차량번호[i]= String.format("%04d", random.nextInt(10000));
				//String값으로 바꾸고, format을 써주면 됨
			
		}
		
		ArrayList<String> 홀수차량 = new ArrayList<>();
		ArrayList<String> 짝수차량 = new ArrayList<>();
		
		//배열출력
		for(int i=0; i<10; i++) {
			
			String 끝번호=차량번호[i].substring(3);
			int 끝번호_int=Integer.parseInt(끝번호);
			
			if(끝번호_int%2==0) {
				짝수차량.add(차량번호[i]);
			}else {
				홀수차량.add(차량번호[i]);
			}
			
			
			
		}
		
		//짝 홀 별 출력
		System.out.println("홀수");
		for(String temp: 홀수차량) {
			
			System.out.println(temp);
		}
		System.out.println("짝수");
		for(String temp: 짝수차량) {
			
			System.out.println(temp);
		}
		
	}

}
