package day21;

import java.util.Scanner;

public class Ŭ�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� : 1.�����˻����α׷� ����3�� ���� �� �ܾ� �˻� �� �ش� ������ �� ���
		
		String [] ����= new String [3];
		
		����[0]="�˰��� ����";
		����[1]="�ڹ� ����";
		����[2]="�ڹ� ��ȭ";
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("������ �˻��Ͻÿ�");
		
		String �˻���= scan.next();
		
	//	System.out.println(����[0].contains(�˻���) );
//		
		for(int i=0; i<����.length; i++) {
			
			if(����[i].contains(�˻���)) {
				
				System.out.println(����[i]);
			}
		}
		
//		for(String temp: ����) {
//			
//			if(temp.indexOf(�˻���)!=-1) {
//				
//				System.out.println(temp);
//				
//			}
//			
//		}

	}

}
