package day22;

public class day22_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		box2<Integer> 상자1=연결.<Integer>메소드(100); //들어가는값/반환값 동일하면 <Integer>메소드 Integer 생략가능
		
		int 값=상자1.get();
		System.out.println(값);
		
		//제네릭 역할: 고정적이지않는 자료형들을 대체가능.
		
		box2<String> 상자2=연결.메소드("유재석");
		
		String name=상자2.get();
		
		System.out.println(name);
		
	}

}
