package day17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QUEUE��ö���� {

	public static Queue<String> ������= new LinkedList<String>();
	public static Queue<String> ��꿪= new LinkedList<String>();
	public static Queue<String> ���￪= new LinkedList<String>();
	public static Queue<String> ���ο�= new LinkedList<String>();

	public static ArrayList<Queue<String>> ��ö��Ȳ= new ArrayList<>();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//queue
		//1. ��ö �о��
		//2. �� : ��� => ���� => ����
		//3. ������
		//4. 3�ʸ��� �ϳ��� ��ö�̵�
		
		
	
		��ö��Ȳ.add(������);
		��ö��Ȳ.add(��꿪);
		��ö��Ȳ.add(���ο�);
		��ö��Ȳ.add(���￪);
		
		��ö��Ȳ.get(0).offer("��ö1");
		��ö��Ȳ.get(0).offer("��ö2");
		��ö��Ȳ.get(0).offer("��ö3");
		
		Scanner scan= new Scanner(System.in);
		
		while(true) {
			System.out.println("========���� ��ö�� ��Ȳ =========");
			��ö����Ȳ();
			System.out.println("��ö ��� ��ȣ 1.���� 2. ��� 3. ���� 4.����");
			int ����= scan.nextInt();
			
			if(����==1) {
				���������();
			}
			if(����==2) {
				��꿪���();
			}
			if(����==3) {
				���￪���();
			}
			if(����==4) {
				���ο����();
			}
			
		}
	
	
	}//���� ��

	
	
	
	//��ö�� ��Ȳ �޼ҵ�
	public static void ��ö����Ȳ() {
		
		System.out.println("���� �������� ��ö ��: "+��ö��Ȳ.get(0));
		System.out.println("���� ��꿪�� ��ö ��: "+��ö��Ȳ.get(1));
		System.out.println("���� ���￪�� ��ö ��: "+��ö��Ȳ.get(2));
		System.out.println("���� ���ο��� ��ö ��: "+��ö��Ȳ.get(3));
		
	}
	
	//������ ��� �޼ҵ�
	public static void ���������() {
	
		try {
			
			System.out.println("3����~~~");
			Thread.sleep(3000); //3������
			if(��ö��Ȳ.get(0).isEmpty()) {
				System.out.println("����� ��ö�̾���");
				System.out.println();
				return;
			}
			
			String temp= ��ö��Ȳ.get(0).poll();
			��ö��Ȳ.get(1).offer(temp);
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	public static void ��꿪���() {
		
		try {
			
			System.out.println("3����~~~");
			Thread.sleep(3000); //3������
			if(��ö��Ȳ.get(1).isEmpty()) {
				System.out.println("����� ��ö�̾���");
				return;
			}
			String temp= ��ö��Ȳ.get(1).poll();
			��ö��Ȳ.get(2).offer(temp);
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	public static void ���￪���() {
		
		try {
			
			System.out.println("3����~~~");
			Thread.sleep(3000); //3������
			if(��ö��Ȳ.get(2).isEmpty()) {
				System.out.println("����� ��ö�̾���");
				return;
			}
			String temp= ��ö��Ȳ.get(2).poll();
			��ö��Ȳ.get(3).offer(temp);
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	public static void ���ο����() {
		
		try {
			
			System.out.println("3����~~~");
			Thread.sleep(3000); //3������
			if(��ö��Ȳ.get(3).isEmpty()) {
				System.out.println("����� ��ö�̾���");
				return;
			}
			String temp= ��ö��Ȳ.get(3).poll();
			��ö��Ȳ.get(0).offer(temp);
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
	
	
	
}
