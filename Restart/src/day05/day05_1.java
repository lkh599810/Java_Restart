package day05;

import java.util.Scanner;

public class day05_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����1. 369����
		//1. �ϳ��� ������ �Է¹޾� �ش� �������� �������
		//2. 3,6,9  ���Ե� ���ڴ� �ڼ� ��� ��) 3->�ڼ� 33->�ڼ��ڼ�
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("�ϳ��� ����:" );
		int ����=scan.nextInt();
		
		int i=1;
		
		while(true) {
			
			int j=i/10;
			
			if(i%10==3|| i%10==6||i%10==9) {
				
				System.out.println("�ڼ�");
				
			
				if(j%10==3|| j%10==6 ||j%10==9) {
					
					System.out.println("�ڼ�");
					
					}
			
			}else {
				
				System.out.println(i);
			}
			
			i++;
			if((����+1)==i) {
				
				break;
			}
			
			
		}

	}

}
