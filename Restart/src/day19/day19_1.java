package day19;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class day19_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//console ���α׷�
		
		//Ŭ���� ���, ��� �������̽�, ����ó�� ���
		
		//���α׷� �����
		
		// ����: Ű����ũ
		// �ʿ�: ����/����/���̵带 ���� ��ü1 �ϳ� ���� -> �ֹ� ��̸���Ʈ�� �ϳ� ��� 
		// 						��ü1���� ����/����/���̵尡 �ϳ��� ��ܾ��Ѵ�.
		
		
		
		//�õ�1. ����/����/���̵� Stack ����� ==> Stack�� ����ִ� Arraylist '��ٱ���'�� ����ֱ�  ==> ���� : why? Stack->arraylist�� ����ֱ⿡�� ���ݰ� ������ ���ø���
		// �ᱹ food��� Ŭ������ ������ burger/drink/side�� �������־���ҵ�. �ϴ����.
		
//		Stack<String> burger=new Stack<>();
//		Stack<String> drink=new Stack<>();
//		Stack<String> side=new Stack<>();

		
		ArrayList<Stack<String>> ��ٱ��� =new ArrayList<>();
		
//		��ٱ���.add(burger);
//		��ٱ���.add(drink);
//		��ٱ���.add(side);
//		
		
		
		Scanner scan= new Scanner(System.in);
		
		int menuchoose=scan.nextInt();
		
		int burgerchoose=scan.nextInt();
		
	while(true) {	
		
		System.out.println("===Burger king===");
		System.out.println("�޴�");
		System.out.println("1. ���ŷ� 2. ���� 3. ���̵�");
		
		
				if(menuchoose==1) {
		
					System.out.println("��ǰ ����ּ���");
					System.out.println("1. ���̹��� 2. ġ����� 3. �Ұ����� 4. ġŲ����");
					
					if(burgerchoose==1) {
						
						��ٱ���.get(0).push("���̹���");
						System.out.println("���̹��Ÿ� ��ٱ��Ͽ� ��ҽ��ϴ�.");
		
						
					}else if(burgerchoose==2) {
						��ٱ���.get(0).push("ġ�����");
						System.out.println("ġ����Ÿ� ��ٱ��Ͽ� ��ҽ��ϴ�.");
					}else if(burgerchoose==3) {
						
					}else if(burgerchoose==4) {
						
					}
					
				
				}
				else if(menuchoose==2) {
				
					System.out.println("��ǰ ����ּ���");
					System.out.println("1. ���̴� 2. �ݶ� 3. ȯŸ 4. �����̵�");
						
					
				}	
				else if(menuchoose==3) {
				
					System.out.println("��ǰ ����ּ���");
					System.out.println("1. ġŲ�ʰ� 2. ����Ƣ�� 3. ġ� 4. ����Ʈ���̽�ũ��");
						
					
				}else {
					
					System.out.println("�����Է��� �߸���.");
					
					return;
				}
				
	
	
		}//while��
	
	
	
	}

}
