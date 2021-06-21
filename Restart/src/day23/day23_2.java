package day23;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;

public class day23_2 {

	
	public static void main(String[] args) {
		
		//Runnable : ������ �������̽�
		
		Runnable runnable=()->{
			
			for(int i=0; i<10; i++) {
				System.out.println(i);
			}
			
		};
		
		Thread thread=new Thread(runnable);
		
		thread.start();
		
		//Thread : ���ٽ� [run �޼ҵ带 ���ٽ����� ����]
		Thread thread2= new Thread( ()->{//Thread�ȿ��ִ� �߻�޼ҵ� run �� ���ؼ� ���� =>���� for���� run�� ��.
			
			for(int i=0; i<10; i++) { //
				System.out.println(i);
			}
		});
		
		thread2.start();
		
		
		//consumer �������̽� : �ռ��� �������̽� : �μ� o ��ȯ x
		
		Consumer<String > consumer= t ->System.out.println(t);
		consumer.accept("java");
		
		
		BiConsumer<String, String> biConsumer=(t,u) -> System.out.println(t+u);
		biConsumer.accept("java", "8");
		
		
		DoubleConsumer doubleConsumer= d ->System.out.println(d); //�μ��� �ϳ��̸� ��ȣ ��������.
		doubleConsumer.accept(8.0);
		
		
		�л����.add(new Student("���缮",70,90));
		�л����.add(new Student("��ȣ��",90,80));
		
		System.out.println("[�л��̸�]");
		 
		�л����(t->t.getName());
		
		System.out.println("�����������");
		
		�������(t->t.getMath());
		
		
	}//main ��
	
	private static List<Student> �л����=new ArrayList<>();
	
	public static void �л����(Function<Student, String> function) {
		
		for(Student student: �л����) {
			
			System.out.println(function.apply(student)+"");
		}
		System.out.println();
		
	}
	
	
	public static void �������(Function<Student,Integer> function) {
		
		for(Student student: �л����) {
			
			System.out.println(function.apply(student)+"");
		}
		System.out.println();
		
	}
	
}
