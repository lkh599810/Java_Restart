package day17;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class day17_1 {

	public static void main(String[] args) {
		
		//�÷��� �����ӿ�ũ : �ڷᱸ�� [ ������ �������� ]
			// Stack Ŭ���� :
					// ��) ctrl + z ��� - LIFO : �Ա�/�ⱸ �����ϹǷ� ���� ���߿� ���� �޸𸮰� ������� ����
		
			// Queue Ŭ���� : 
					// ��) �ټ���� - FIFO :�Ա�/�ⱸ ����. ���� ���� ���� �޸𸮰� ���� ���� ����
		
			// List Ŭ����
		
		
		
		
		//����
		Stack<���� > �������� = new Stack<>();
			//< > : ���׸�. Ŭ���� �ȿ� �� �޸�Ŭ���� ��) Arraylist �ȿ��� Arraylist<�޸�>
		
		��������.add(new ����(100));
		
		��������.add(new ����(200));
		
		��������.add(new ����(300));
		
		System.out.println("���������� ������ : "+��������.size());

		
		
//		Stack<���� > ��������10 = new Stack<>();
//		
//		��������10.push(new ����(100));  ==> push == add
//		
//		System.out.println("��������10�� ������ : "+��������10.size());
//	
		
		//for (int i=0; i<��������.size; i++) {  }
		for(���� temp : ��������) { //������
			
			System.out.println("���� �ݾ�"+temp.����);
		}
		
			//temp�� ����Ʈ�ϸ� �ּҰ��� ������, temp.�������� ����Ʈ�ϸ� �������̳��´�.
		
		
		while(!��������.isEmpty()) { //�������� �������� pop���� ���ÿ��� ����
			���� temp= ��������.pop(); // pop() : ������ ==���� 
			System.out.println("���� ����: "+temp.����);
		}

		
		System.out.println("   ");
		
		
		//ť Queue
		
		Queue<����> ��������2 =new LinkedList<>(); // Queue�� �������̽��̴�.
		
		��������2.offer(new ����(100)); //offer==add
		��������2.offer(new ����(200));
		��������2.offer(new ����(300));
		
		System.out.println("�������� 2: "+��������2.size());
		
		for(���� temp : ��������2) {
			
			System.out.println("���� �ݾ�: "+temp.����);
		}
		
		
		while(!��������2.isEmpty()) {
			
			���� temp=��������2.poll();
			System.out.println("���� �ݾ�: "+temp.����);
		}
		
		
		System.out.println("==== ������ 300 200 100����, ť�� 100 200 300 ����======");
		
		
		
		
		
		
		
		
		
		

	}

}
