package day23;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;

public class day23_2 {

	
	public static void main(String[] args) {
		
		//Runnable : 스레드 인터페이스
		
		Runnable runnable=()->{
			
			for(int i=0; i<10; i++) {
				System.out.println(i);
			}
			
		};
		
		Thread thread=new Thread(runnable);
		
		thread.start();
		
		//Thread : 람다식 [run 메소드를 람다식으로 정의]
		Thread thread2= new Thread( ()->{//Thread안에있는 추상메소드 run 에 대해서 정의 =>밑의 for문이 run이 됨.
			
			for(int i=0; i<10; i++) { //
				System.out.println(i);
			}
		});
		
		thread2.start();
		
		
		//consumer 인터페이스 : 합수적 인터페이스 : 인수 o 반환 x
		
		Consumer<String > consumer= t ->System.out.println(t);
		consumer.accept("java");
		
		
		BiConsumer<String, String> biConsumer=(t,u) -> System.out.println(t+u);
		biConsumer.accept("java", "8");
		
		
		DoubleConsumer doubleConsumer= d ->System.out.println(d); //인수가 하나이면 괄호 생략가능.
		doubleConsumer.accept(8.0);
		
		
		학생목록.add(new Student("유재석",70,90));
		학생목록.add(new Student("강호동",90,80));
		
		System.out.println("[학생이름]");
		 
		학생명단(t->t.getName());
		
		System.out.println("수학점수명단");
		
		점수명단(t->t.getMath());
		
		
	}//main 끝
	
	private static List<Student> 학생목록=new ArrayList<>();
	
	public static void 학생명단(Function<Student, String> function) {
		
		for(Student student: 학생목록) {
			
			System.out.println(function.apply(student)+"");
		}
		System.out.println();
		
	}
	
	
	public static void 점수명단(Function<Student,Integer> function) {
		
		for(Student student: 학생목록) {
			
			System.out.println(function.apply(student)+"");
		}
		System.out.println();
		
	}
	
}
