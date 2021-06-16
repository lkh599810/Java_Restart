package day21;

import java.io.IOException;

public class day21_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//API클래스 : 미리 만들어진 클래스
		
		//1. Class 클래스 : 클래스의 관련된 정보
		
		Car car= new Car();
		Class class1= car.getClass();
						//객체명.getClass() : 해당 객체의 클래스정보를 반환
		
			System.out.println(class1.getName()); //도메인.클래스명
			System.out.println(class1.getSimpleName()); //그냥 클래스명
			System.out.println(class1.getPackageName()); //패키지명
			System.out.println(class1.getPackage().getName()); //3번이랑 똑같음
			
			
		try {
			
			Class class2= Class.forName("day21.Car");  // forName같은 경우 해당클래스가 지워지거나 이름이 바뀌어서 없는 경우도 있으므로 무조건 예외처리가뜸.
			
			System.out.println(class1.getSuperclass()); //무조건 최고 슈퍼클래스는 Object.
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
		//2. String 클래스 : 바이트를 문자로 바꿔주는 클래스가 String.
		// 컴퓨터가 문자열 처리하는 방법
		// 0,1 바이트 =>8비트, 1바이트
		
		byte[] 바이트배열 = { 72 , 101 , 108 , 108 , 111 , 32 , 74 , 97 , 118 , 97 };
		
		String 문자열= new String(바이트배열);
		System.out.println("바이트 => 문자열: "+문자열);
		//아스키 코드

		String 문자열2= new String(바이트배열,6,4);
		System.out.println("바아트 => 문자열: "+문자열2);
		
		byte[] 바이트배열2= new byte[100];
		
		System.out.println("입력: " );
		
		int 쓰기=System.in.read(바이트배열2);
			//system.in : 입력장치로부터 read: 읽어오기 배열에 저장 //Scanner 쓰기 = new Scanner(system.in) ==> system.in : 키보드에서 읽어와서 Scanner 클래스 객체 '쓰기'에 저장
		
		System.out.println(쓰기);
			
		String 문자열3 = new String(바이트배열2 , 0 , 4);
		
		System.out.println("문자열: "+문자열3);
		
	
		
		
		
		
		
	}

}
