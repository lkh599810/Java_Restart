package day17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Stack�̿�_���Ǳ⿹������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Stack<String> �ݶ�=new Stack<>();
		Stack<String> ���̴�=new Stack<>();
		Stack<String> ȯŸ=new Stack<>();
		
		List<Stack<String>> ��ǰ���= new ArrayList<>();
		��ǰ���.add(�ݶ�);
		��ǰ���.add(���̴�);
		��ǰ���.add(ȯŸ);
		
		
		Scanner scan= new Scanner(System.in);
		
		
		for(int i=0; i<10; i++) {
			��ǰ���.get(0).push("�ݶ�");
			��ǰ���.get(1).push("���̴�");
			��ǰ���.get(2).push("ȯŸ");
		}
		
		
		while(true) {
			
			System.out.println("�ݾ�:");
			int �ݾ�= scan.nextInt();
			
			
			while(true) {
				
				if(!�ݶ�.isEmpty()) {
					System.out.println("1.�ݶ� [����:200  ���:  " +��ǰ���.get(0).size()+"]");
				}				
				else {
					System.out.println("1.�ݶ� [����:200  ���:  " +"����]");

				}
				
				if(!���̴�.isEmpty()) {
				System.out.println("2.���̴� [����:300  ���:  "+��ǰ���.get(1).size()+"]");
				}else {
					System.out.println("2.���̴� [����:300  ���:  "+"����]");
				}
				if(!ȯŸ.isEmpty()) {
				System.out.println("3.ȯŸ [����:400  ���:  "+��ǰ���.get(2).size()+"]");
				}else {
					
					System.out.println("3.ȯŸ [����:400  ���:  "+"����]");
				}
				
				System.out.println("4.�ݾ׹�ȯ");
				
				
				
				int ����=scan.nextInt();
				
				if(����==1) {
					
					if(�ݾ�<200) {
						System.out.println("�ݾ��� �����մϴ�.");
					}else if(�ݶ�.isEmpty()) {
						System.out.println("��������ϴ�");
					}else {
						System.out.println("�ݶ� ��ȯ");
						��ǰ���.get(0).pop();
						�ݾ�-=200;
					}
					
				}
				
				if(����==2) {
					
					if(�ݾ�<300) {
						System.out.println("�ݾ��� �����մϴ�.");
					}else if(���̴�.isEmpty()) {
						System.out.println("��������ϴ�");
					}else {
						System.out.println("���̴� ��ȯ");
						��ǰ���.get(1).pop();
						�ݾ�-=300;
					}
					
				}			
								
				
				
				if(����==3) {
					if(�ݾ�<400) {
						System.out.println("�ݾ��� �����մϴ�.");
					}else if(���̴�.isEmpty()) {
						System.out.println("��������ϴ�");
					}else {
						System.out.println("ȯŸ ��ȯ");
						��ǰ���.get(2).pop();
						�ݾ�-=400;
					}
					
								
								
				}
				if(����==4) {
					
					System.out.println("�ܵ� ��ȯ: "+�ݾ�);
					break;
				}			
			
			
			
			
			}//while ��
			
			
		}
		
	}

}
