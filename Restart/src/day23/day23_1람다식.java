package day23;

public class day23_1람다식 {

	public static void main(String[] args) {
	
		//람다식 : 이름이 없는 익명함수. ->pubic static 같은거 없음.
		//함수의 단순화.
		//멅티스레드에서 많이씀.
		//(인수) -> {실행코드; return;}; or ()->실행코드 ;
		
		함수인터페이스 fi; //인터페이스 객체
		
		
		
		fi=()->{String str="메소드실행1";
			
		System.out.println(str); //추상메소드 정의
		
		};
		
		fi.메소드(); //실행
		
		fi=() ->{System.out.println("메소드실행2");};
		
		fi.메소드();
		
		fi=() ->{System.out.println("메소드실행3");};
		fi.메소드();
		
		
		
		함수인터페이스2 fi2;
		
		fi2= (x)-> {
			int 결과=x*5;
			System.out.println("결과: "+결과);
		};
		fi2.메소드(3);
	
		fi2=(x)->{System.out.println(x*5);};
		fi2.메소드(3);
	
		//인수 o 반환 o
		함수인터페이스3 fi3;
		
		fi3=(x,y) ->{
			int 결과=x+y;
			return 결과;
		};
		
		System.out.println(fi3.메소드(3, 5));
	
		fi3=(x,y)->{return x+y;};
		System.out.println(fi3.메소드(3, 5));
		
		fi3=(x,y)->x+y;
		System.out.println(fi3.메소드(3, 5));
		
		fi3=(x,y)->sum(x,y); //다른함수 사용
		System.out.println(fi3.메소드(3, 5));
		
		
		
		
		
		
		
		
		
	
	
	}
	
	
	public static int sum(int x, int y) {
		return (x+y);
	}
}
