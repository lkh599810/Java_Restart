package day05;

import java.util.Scanner;

public class day05_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	//�ݺ���
		
		//for�� (����)
			//for(int i=0; i<10; i+=3)
			//for(���۰� ; ���ǹ� ; ������;)
		
		//while�� (��)
			//int i=0;
			
		//while(){ 
		
		//		i++; ������
		
		//		}
		
		//do~while �� : ���� ���� �� �˻縦 ��. ==> ���� �ѹ� �����ؾ��ϴ°��.
		
		
		
//		==================================================================================
		
	
		for(int i=0; i<10; i++) {
			//i�� 0���� 10 �̸����� 1�� �����ϸ鼭 �ݺ�
			
			System.out.println(i);
			
		}
		System.out.println("==========================================");

		//���� 1. 1~50���� ���
		
		for(int i=5; i<51; i+=3) {
			
			System.out.println(i);
		}
		
		System.out.println("==========================================");
		
		int sum=0;
		//����2. 1~50���� 3����հ�
		for(int i=0; i<51; i+=3) {
			
			sum+=i;
			 
		}
		System.out.println(sum); //==> sum�� for�� �ȿ� �־������ 3�� �����ذ��� �ٳ���. for���� 50������ ���ѷ����̴ϱ�.
		
		
		
		System.out.println("==========================================");

		//���� 3. ������ ���
		
		for(int ��=2; ��<10; ��++) {
			
			for(int ��=1; ��<10; ��++) {
				
				System.out.println(��*��);
			}
			
		}
		
		System.out.println("==========================================");
	
		//����4. �Է��� �� ����ŭ ��[*]���.
		
		Scanner �Է�= new Scanner(System.in);
		System.out.println("�� �Է�:");
		int ����=�Է�.nextInt();
		
		for(int i=1; i<=����; i++) 	{
			
			
			System.out.print("*");
			if(i%5==0)System.out.println();
				
			
			
		}
	

		System.out.println("==========================================");
			
		//����5. ũ��������Ʈ�� ���
		
		System.out.println("Ʈ�� �� �Է�:");
		
		int ��=�Է�.nextInt();
		
		for(int i=0; i<��; i++) {
			
			for(int j=1; j<��-i; j++) {
				
				 System.out.print(" ");
			}
			
			
			for(int k=0; k<i*2+1; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("==========================================");
		
		//����6. ���̾Ƹ�� ���
		
		
		
		//����7. �Է¾��� x�� ���
		
	
	
	
	
	}

}
