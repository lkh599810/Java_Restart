package day21;

import java.util.Scanner;

public class day21_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//�������� chatAt() : String���� Ư�� ��ġ ���ڿ� ������ ����
		
		String ���ڿ�4="�ڹ� ���α׷���";
		System.out.println(���ڿ�4.charAt(0));
		System.out.println(���ڿ�4.charAt(1));
		System.out.println(���ڿ�4.charAt(2));
		System.out.println(���ڿ�4.charAt(3));

		String �ֹε�Ϲ�ȣ="981015-1111111";
		
		char �����Ǻ�= �ֹε�Ϲ�ȣ.charAt(7);
		System.out.println(�����Ǻ�);
		
		
		//switch : ���� �ȵ�.=> case�� < > <= �񱳿����� ���Ұ�.
		switch(�����Ǻ�) { //switch (����/������)
		
		case '1' : //������ 1�̸�
		case '3' : // ������ 3�̸�
			System.out.println("����");
				break; //switch�� break �Ⱦ��� ���� ���� �ٳ���.
		case '2' :
		case '4' :
			System.out.println("����");
				break;
			
		}
		
		
		//���ڿ��� : .equals() '��ü ��ü���� ����.'
			// �⺻�ڷ����� �񱳿����ڰ� ��밡�� ��) int ��
		
		String �̸�1= new String("���缮"); //��ü ����
		//Ŭ���� ��ü�� = new �����ڸ�(); Ŭ������� �����ڸ��� ����. new�� �ʱⰪ. �޸𸮳־��ִ°�.
		
		String �̸�2= "���缮"; //String�� ��쿡�� �ٷ� ���ڿ��� �־��൵ ��. [����]
		
//		if(�̸�1==�̸�2) {System.out.println("����");} //: String�̶� �񱳿����� �Ұ�
		
		
		// ==������ : �ּҰ� ���ؼ� ��, equals() : ��ü�� ���� ��ü�� ��
		
		
		//getBytes : ���ڿ� => ����Ʈ���� ��ȯ
		
		String ���ڿ�1="�ȳ�";
		byte[] ����Ʈ�迭= ���ڿ�1.getBytes();
		System.out.println(����Ʈ�迭.length);
		String ��ȯ1= new String(����Ʈ�迭);
		System.out.println(��ȯ1);
		
		
		//indexOf : ���� ã��
		
		String ���ڿ�2 ="�ڹ� ���α׷���";
		
		int location= ���ڿ�2.indexOf("���α׷���");
		
		System.out.println(location); // -> 3. ã���� �ϴ� ���ڿ� ù������ ��ġ
		
		Scanner scan= new Scanner(System.in);
		
		String �˻���= scan.next();
		
		if(���ڿ�2.indexOf(�˻���)!= -1) { //index�� 0�����̹Ƿ� -1�̸� �˻��� �ƴٴ� ��
			System.out.println("�ش� ���õ� �����Դϴ�.");
			
		}else {
			System.out.println("�ش� ���� ������ �ƴմϴ�.");
		}
		
		//length : ������ ��
		System.out.println(���ڿ�2.length()); //���⵵ ����.
		
		//replace : ���ڱ�ü
		String �������� = "�ڹٴ� ��ü���� ����Դϴ�.";
		String ��ü���� = ��������.replace("�ڹ�", "c���");
		
		System.out.println(��������);
		System.out.println(��ü����);
				
		
	}

}
