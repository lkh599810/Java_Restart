package day03;

import java.util.Scanner;

public class day03_1 {

	public static void main(String[] args) {

		
		//������
		
		//��������� :  +, -, *, /, %
		
		//���Կ����� :  +=,-= ,*=, /=,%= 
		
		//�񱳿����� :  >, >=, ==, <, <=,!=   --> ���: true of false
		
		//�������� :  && : and, || : or, ! : not 
		
		//���������� : [�������� ����/����] : ++����(��������), ����++(��������), --����(��������), ����--(��������)

//=======================================================================================================================================
	
		
		
		
//==========3���� ����==============================================================================================================================
		
		
		int a=10;
		
		int b=20;
		
		int c=45;
		
		System.out.println("���ϱ�"+a+b); //��� : 1020 ==> ���ڿ��Ῥ���ڷε�
		
		System.out.println("���ϱ�: "+(a+b)); //��� : 30 ==> ������� �����۵�.
		
		// !!!! ������� �� ���� ��ȣ �־������.
	
		
		a+=5;
		System.out.println("���� ������ ��: "+a);
		
		
		//�񱳿�����
		System.out.println("�ʰ�: "+(a>b)); //���: false�� ����. true/ false�߿� �ϳ��� ������ ��

		
		//�������� => �񱳿����� 2���̻�
		System.out.println("AND: "+(a>b&&b>c));
		System.out.println("OR:"+(a>b||b<c));
		
		
		//����������
		System.out.println("��������: "+(a++));//���⼭�� �������� �Ȱ��� 15
		
		System.out.println("�������� Ȯ��:" +a);// ���� ���: a=16
		
		System.out.println("��������: "+(++a));//���⼱ �ٷ� 1���� -> a=17
		
		System.out.println("��������:"+(a--)); //�������� �Ȱ���17
		
		System.out.println("�������� Ȯ��: "+a); //��� 16
		
		System.out.println("��������: "+ --a);//���  15
		
		
		
//===========================================����===================================================================================
		
		
		//1. �ϳ����� ������ �Է¹޾� 7�ǹ���̸鼭 Ȧ������ Ȯ��
		
		Scanner �Է�= new Scanner(System.in);
		
		System.out.println("====7�� ����̸鼭 Ȧ������ Ȯ��====");
		System.out.println("���� �Է�:" );
		
		int qq=�Է�.nextInt();
		
		System.out.println("Ȯ��: "+ (qq%2==1 && qq%7==0));
		
		//2. Ű�� ǥ��ü�� (Ű-100*0.9)
		
		System.out.println("===Ű �� ǥ�ظ�����=====");
		System.out.println("Ű �Է�:" );
		int aaa=�Է�.nextInt();
		
		System.out.println("ǥ�ظ�����: " +(aaa-100)*(0.9));
		
		//3. bmi ���ϱ� ������/ ((Ű/100) * (Ű/100))
		
		System.out.println("===BMI ���ϱ�===");
		System.out.println("������ �Է�:");
		int zzz=�Է�.nextInt();
		System.out.println("Ű �Է�: ");
		int zzzz=�Է�.nextInt();
		System.out.println("BMI : "+zzz/ ((zzzz/100)*(zzzz/100)) );
		
		// Ű�� �����Ը� int�� �޾Ҵ��� bmi�� 80�� ��������. Ű 179/100�� 1.79�� �ȳ����� 1.0���� �������� �׷���.
		
		
		
		
		System.out.println("===BMI ���ϱ�2===");
		System.out.println("������ �Է�:");
		double zzz2=�Է�.nextDouble();
		System.out.println("Ű �Է�: ");
		double zzzz2=�Է�.nextDouble();
		
		double Ű=(zzzz2/100)*(zzzz2/100);
		
		double BMI2=zzz2/Ű;
		
		
		System.out.println("BMI: "+BMI2);
		
		
		
		
		
		
		
	}

}
