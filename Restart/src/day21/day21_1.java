package day21;

import java.io.IOException;

public class day21_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//APIŬ���� : �̸� ������� Ŭ����
		
		//1. Class Ŭ���� : Ŭ������ ���õ� ����
		
		Car car= new Car();
		Class class1= car.getClass();
						//��ü��.getClass() : �ش� ��ü�� Ŭ���������� ��ȯ
		
			System.out.println(class1.getName()); //������.Ŭ������
			System.out.println(class1.getSimpleName()); //�׳� Ŭ������
			System.out.println(class1.getPackageName()); //��Ű����
			System.out.println(class1.getPackage().getName()); //3���̶� �Ȱ���
			
			
		try {
			
			Class class2= Class.forName("day21.Car");  // forName���� ��� �ش�Ŭ������ �������ų� �̸��� �ٲ� ���� ��쵵 �����Ƿ� ������ ����ó������.
			
			System.out.println(class1.getSuperclass()); //������ �ְ� ����Ŭ������ Object.
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
		//2. String Ŭ���� : ����Ʈ�� ���ڷ� �ٲ��ִ� Ŭ������ String.
		// ��ǻ�Ͱ� ���ڿ� ó���ϴ� ���
		// 0,1 ����Ʈ =>8��Ʈ, 1����Ʈ
		
		byte[] ����Ʈ�迭 = { 72 , 101 , 108 , 108 , 111 , 32 , 74 , 97 , 118 , 97 };
		
		String ���ڿ�= new String(����Ʈ�迭);
		System.out.println("����Ʈ => ���ڿ�: "+���ڿ�);
		//�ƽ�Ű �ڵ�

		String ���ڿ�2= new String(����Ʈ�迭,6,4);
		System.out.println("�پ�Ʈ => ���ڿ�: "+���ڿ�2);
		
		byte[] ����Ʈ�迭2= new byte[100];
		
		System.out.println("�Է�: " );
		
		int ����=System.in.read(����Ʈ�迭2);
			//system.in : �Է���ġ�κ��� read: �о���� �迭�� ���� //Scanner ���� = new Scanner(system.in) ==> system.in : Ű���忡�� �о�ͼ� Scanner Ŭ���� ��ü '����'�� ����
		
		System.out.println(����);
			
		String ���ڿ�3 = new String(����Ʈ�迭2 , 0 , 4);
		
		System.out.println("���ڿ�: "+���ڿ�3);
		
	
		
		
		
		
		
	}

}
