package day02;

import java.util.Scanner;

public class day02_2 {

	public static Scanner a=new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//�⼮�� �����
		
		
		
		//����1. �� 3���� �̸��� 1~3���� ������ �����͸� �Է¹޾� ����ϱ�
		System.out.println("�л� 1 �Է�: ");
		
		String �л�1=a.next();
		
		System.out.println("�л� 1�� 1���� �⼮���� �Է�: ");

		String �л�1�⼮1=a.next();
		System.out.println("�л� 1�� 2���� �⼮���� �Է�: ");

		String �л�1�⼮2=a.next();
		
		System.out.println("�л�1�� 3���� �⼮���� �Է�: ");
		
		String �л�1�⼮3=a.next();
		
		
		System.out.println("�л� 2 �Է�: ");
		
		String �л�2=a.next();
		
		System.out.println("�л� 2�� 1���� �⼮���� �Է�: ");

		String �л�2�⼮1=a.next();
		System.out.println("�л� 2�� 2���� �⼮���� �Է�: ");

		String �л�2�⼮2=a.next();
		
		System.out.println("�л� 2�� 3���� �⼮���� �Է�: ");
		
		String �л�2�⼮3=a.next();
		
		
		System.out.println("�л� 3 �Է�: ");
		
		String �л�3=a.next();
		
		System.out.println("�л� 3�� 1���� �⼮���� �Է�: ");

		String �л�3�⼮1=a.next();
		System.out.println("�л� 3�� 2���� �⼮���� �Է�: ");

		String �л�3�⼮2=a.next();
		
		System.out.println("�л� 3�� 3���� �⼮���� �Է�: ");
		
		String �л�3�⼮3=a.next();
		
		
	
	
		
		
		System.out.println("============�⼮��============");
		
		System.out.println(�л�1+"\t"+�л�1�⼮1+"\t"+�л�1�⼮2+"\t"+�л�1�⼮3);
		System.out.println(�л�2+"\t"+�л�2�⼮1+"\t"+�л�2�⼮2+"\t"+�л�2�⼮3);
		System.out.println(�л�3+"\t"+�л�3�⼮1+"\t"+�л�3�⼮2+"\t"+�л�3�⼮3);

		
		
//		=====================================����2=====================================
		
		
		//����2 :�л� 2�� ������ ���� �Է¹޾Ƽ� ���� ��� ���ϱ�
		
	
		System.out.println("�л�a�� �������� �Է� : " );
		
		int ��1=a.nextInt();
		
		System.out.println("�л�a�� �������� �Է� : " );
		
		int ��1=a.nextInt();
		
		System.out.println("�л�a�� �������� �Է� : " );
		
		int ��1=a.nextInt();
		
		System.out.println("�л�b�� �������� �Է� : " );
		
		int ��2=a.nextInt();
		
		System.out.println("�л�b�� �������� �Է� : " );
		
		int ��2=a.nextInt();
		
		System.out.println("�л�b�� �������� �Է� : " );
		
		int ��2=a.nextInt();
		
		
		
		int ������1����=��1+��1+��1;
		int ������1���=(��1+��1+��1)/3;
		
		int ������2����=��2+��2+��2;
		int ������2���=(��2+��2+��2)/3;
		
		
		System.out.println("==========����ǥ==========");
		System.out.println("\t����\t����\t����\t����\t���");
		System.out.println("�л�a :\t"+��1+"\t"+��1+"\t"+��1+"\t"+������1����+"\t"+������1���);
		System.out.println("�л�b :\t"+��2+"\t"+��2+"\t"+��2+"\t"+������2����+"\t"+������2���);
		
		
		
		//=====================================����3=====================================
				
				
				//����3 :1���� ȸ������ ǥ �����
		//���̵� ��� �̸��� �̸�
		
		
		
		System.out.println("\n\n\n");
		
		System.out.println("==========ȸ������===========");
		System.out.println("���̵� �Է�:" );
		
		String id=a.next();

		System.out.println("����Է�: ");
		String pw=a.next();
		
		System.out.println("�̸����Է�:");
		String email=a.next();
		
		System.out.println("�̸��Է�:");
		
		String name=a.next();
		
		
		System.out.println("==========ȸ������ ����===========");
		
		System.out.println("�̸�:" +name);
		System.out.println("���̵�: " +id);
		System.out.println("���:" +pw);
		System.out.println("�̸���:" +email);

		
		
		
		//==���� 1====
		// ���� ����
		// 34200 ==> ���� :3 õ��:4 ���:2 ��
		
		
		// 1. �迭 ����?
		
		
		while(true) {
			
		System.out.println("\n"); 
		
		int ����;
		
		int ��;
		
		int ��õ;
		
		int õ;
		
		int ����;
		
		int ��;
		
		int ����;
		
		int ��;
		
		int ��;
		
		int ������;
		
		System.out.println("=====���󼼱� ���α׷� (1~100���� ���� �Է�)======");
		System.out.println("�ݾ� �Է�:");
		
		int �ݾ�=a.nextInt();
		
		System.out.println(�ݾ�);
		
		if(1<=�ݾ�&&�ݾ�<=1000000) {
			
			����=�ݾ�/50000;
			
			������=�ݾ�-(����*50000);
			
			��=������/10000;
			
			������=������-(��*10000);
			
			��õ=������/5000;
			
			������=������-(��õ*5000);
			
			õ=������/1000;
			
			������=������-(õ*1000);
			
			����=������/500;
			
			������=������-(����*500);
			
			��=������/100;
			
			������=������-(��/100);
			
			����=������/50;
			
			������=������-(����/50);
			
			��=������/10;
			
			������=������-(��/10);
			
			��=������/1;
			
			������=������-(��/1);
			
			
			
			System.out.println("�������� :" +����+ "��");
			
			System.out.println("������ :" + ��+ "��");
			
			System.out.println("��õ���� :" + ��õ+ "��");

			System.out.println("õ���� :" + õ+ "��");

			System.out.println("������� :" + ����+ "��");

			System.out.println("����� :" + ��+ "��");

			System.out.println("���ʿ��� :" + ����+ "��");

			System.out.println("�ʿ��� :" + ��+ "��");

			System.out.println("�Ͽ��� :" + ��+ "��");

			
			
			
			
		}else {
			
			System.out.println("������ �ʹ� Ŀ�� ��� �Ұ��մϴ�.");
			
			return;
			
		}
		
		
		
		}
		
	}

}
