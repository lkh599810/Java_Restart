package day03;

import java.util.Scanner;

public class day03_2 {

	public static void main(String[] args) {
		
		//���
		
		
		//1. if ��: 
		
		//if(�� t/f){ true�� ����}
		
		//2. switch

		
		
		
		

		
		
		
		
//==========3���� ����==============================================================================================================================

		
		//����1.
		
		if(3>1) {
			
			System.out.println("��");
		}
		
		
//		============================if �� ================================

		
		int a;
		
		int b;
		
		Scanner �Է�=new Scanner(System.in);
		
		System.out.println("���� 1�Է�:");
		
		a=�Է�.nextInt();
		
		System.out.println("���� 2�Է�:");
		
		b=�Է�.nextInt();
		
		if(a>b) {
			
			System.out.println("zz");
		
		}
		else {
			
			System.out.println("zzz");
			
		}
		
		
		//����
		
		//���� �ΰ� �Է¹޾� ����� 80�̻��̸� ���, 80~60�̸� ����, 50���ϸ� ���հ�
		
		int ��1;
		
		int ��2;
		
		System.out.println("=====�հ� ��ȸ���α׷�======");
		System.out.println("����1�Է�:");
		��1=�Է�.nextInt();
		System.out.println("����2�Է�:");
		��2=�Է�.nextInt();
		
		if((��1+��2)/2 >=80) {
			
			System.out.println("���");
			
		}else if((��1+��2)/2>=60) { //÷ ������ 80�̻��϶��� ����� ���ñ�� ����(���>=60 && ���<=80) �̶�� �Ϸ�������, ������80�̻��� ���� ���� if���� ��������.
									//*** if if�� �ϸ� "��� ����" �Ѵ� ����.
			System.out.println("����");
			
		}else {
			
			System.out.println("���հ�");
		}
		
		
		
		
		//if ~~ if~~ �� if ~~else if�� ����
		
		
//		=============================switch��================================
		
		
		
		
		
		
		
		

	}

}
