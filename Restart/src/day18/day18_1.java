package day18;

import java.util.Scanner;

public class day18_1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		//����ó�� ����
		
		Scanner scan= new Scanner(System.in);
		
		String[] �迭= new String[10]; // ==> ����� ���� �Է��ؾ��ϴ��� �˾Ҵµ� int �� �����ϴ°� ���ҳ�.
		
		System.out.println("����� ���α׷�");
		System.out.println("�޴� : 1. ������߰� 2. ����� ����");
		System.out.println("����: ");
		int ����=scan.nextInt();
		
		if(����==1) {
			
						for(int i=0; i<=�迭.length; i++) { //�迭 ��ü��
				
							if(!�迭[i].isEmpty()) {//10������ �˻縦 �ϰ� �������������(���� ��������)
							
								System.out.println("������� ���� á���ϴ�.");
								
							}else if(�迭[i].isEmpty()){
								System.out.println("����� �Է����ּ���");
								
								String �Է�=scan.next();
							
								�迭[i]=�Է�;
								
								System.out.println("���� ������: "+i);
								
							}
						
						}
			
			
			
			
			
		}
		

	}

}
