package day06;

import java.util.Random;
import java.util.Scanner;

public class day06_lotto {

	
	public static void main(String[] args) {
		
		//�ζ� �Ǻ���
		
		//�غ�: �迭 ����
		//6��¥�� �迭���� �����ϳ� ��÷��ȣ �ϳ�
		int[] �ζ�=new int[6];
		int[] ��÷��ȣ=new int[6];
		Scanner scan=new Scanner(System.in);
		
		//1. �Է¹ޱ�
		
		for(int i =0; i<=5; i++) {
			
			
			while(true) {
			
			int ����ġ=0;
			System.out.println((i+1)+"~45������ �����Է�");
			int temp=scan.nextInt();
		
			
			if(temp<=0 ||temp>45) {
				
				System.out.println("�ٽ��Է�. 1-45���̸� ����");
				����ġ=1;
			}
			
			//�ߺ��� ���� [���� �迭�� �̹� ���ڰ� �ִ� �� ����]		
			for(int j=0; j<�ζ�.length; j++) {
				
				if(�ζ�[j]==temp) {
					System.out.println("�̹� �����ϴ� ���Դϴ�.");
					����ġ=1;
				
				}
					
			}
			
			
			if(����ġ==0) { �ζ�[i]=temp; break;}	
			
			}//while ��
		}
		
		//Ȯ��
		System.out.println("Ȯ��: ");
		for(int i=0; i<=5; i++) {
			
			System.out.print(�ζ�[i]+" ");
			
		}
		
		//��÷��ȣ => ���� 6�� ����;
		for(int i =0; i<=5; i++) {
			
			
			while(true) {
			
			int ����ġ=0;
			
			Random random= new Random();
			
			int temp=random.nextInt(45)+1; //0~44==> +1�ؼ� 1���� 45����
		
			
			if(temp<0 ||temp>45) {
				
				
				����ġ=1;
			}
			
			
			//�ߺ��� ���� [���� �迭�� �̹� ���ڰ� �ִ� �� ����]		
			for(int j=0; j<�ζ�.length; j++) {
				
				if(�ζ�[j]==temp) {
					System.out.println("�̹� �����ϴ� ���Դϴ�.");
					����ġ=1;
				
				}
					
			}
			
			
			if(����ġ==0) { �ζ�[i]=temp; break;}	
			
			}//while ��
		}
		
		System.out.println("\n �ζ���÷ ��÷��ȣ");
		for(int i=0; i<=5; i++) {
			
			System.out.println(��÷��ȣ[i]+" ");
		}
		
		
		
		//��÷ ���: [�迭 ��]
		
		int ��÷����=0;
		
		for(int i=0; i<=5; i++) {
			
			for(int j=0; j<=5; j++) {
				
				if(�ζ�[i]==��÷��ȣ[j]) ��÷����++;
				
				
			}
		}
		
		
		
		if( ��÷���� == 6 ) System.out.println(" ��÷��� : 1�� ");
		if( ��÷���� == 5 ) System.out.println(" ��÷��� : 2�� ");
		if( ��÷���� == 4 ) System.out.println(" ��÷��� : 3�� ");
		if( ��÷���� == 3 ) System.out.println(" ��÷��� : 4�� ");
		if( ��÷���� == 2 ) System.out.println(" ��÷��� : 5�� ");
		if( ��÷���� == 1 ) System.out.println(" ��÷��� : �� ");
		if( ��÷���� == 0 ) System.out.println(" ��÷��� : �� ");
		
		
	}
}
