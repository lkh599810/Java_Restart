package day06;

import java.util.Random;
import java.util.Scanner;

public class day06_tictactoe {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//��ĳ��
		
		Scanner scan=new Scanner(System.in);
		
		
		//1������ �ᱹ ����� ��������� ƽ���� �絵��.
		
		//1.������ ����
		
		String[] ������=new String[9];
		
		������[0]="[ ]";
		������[1]="[ ]";
		������[2]="[ ]";
		������[3]="[ ]";
		������[4]="[ ]";
		������[5]="[ ]";
		������[6]="[ ]";
		������[7]="[ ]";
		������[8]="[ ]";
		
		//�ٸ����
		//String[] ������={"[]","[]","[]","[]","[]","[]","[]","[]","[]"}; �̷��� �ص���

		
		
		
		//2.������ ���
		
	while(true) {
		
	for(int i=0; i<������.length; i++) {
			//
			System.out.print(������[i]);
			
			if(i%3==2)  //�迭�ε����� 2, 5, 8 �϶� ���ιٲٱ�
			System.out.println();
			
			
		}
		
		//3. �÷��̾� �Է¹޾Ƽ� �� ��� �ٲٱ�		
		while(true) {
					System.out.println("��ȣ ���� [0-8] ����: ");
					int ����=scan.nextInt();
					
					if(������[����].equals("[ ]")) {
					
						������[����]="[o]";
					
						
						break;
					
						}else {
						
						System.out.println("�̹� �� �ڸ��Դϴ�.[ �ٸ��� ����]");
						
						}
				
				
					}
		
		//4. ��ǻ���÷��̾�
		
			System.out.println("��ǻ�� �����Դϴ�.");
			
			Random random= new Random();
				
			while(true) {
				
				
					int ����=random.nextInt(9);  //???? 9�� �ǹ�
				
					if(������[����].equals("[ ]")) {
					
						������[����]="[x]";
						break;
					} // ???? else �Ƚ��൵ random�� �˾Ƽ� ���ڸ� �ɷ��ִ°ǰ���?
		
			
				}
	
			//5.�̱�� ����� ��
				
				String �¸���="0"; //�ƹ����̳� �ϴ� ����
				//5-1: ���η� �̱�¼�
				for(int i=0; i<=6; i+=3) {
					
					if(������[i].equals(������[i+1]) && ������[i+1].equals(������[i+2])) {
						
					if(!������[i].equals("[ ]"))	�¸���=������[i];
						
					}
				}
				
				//5-2:���η� �̱�¼�
				for(int i=0; i<=2; i+=1) {
					
					if(������[i].equals(������[i+3]) && ������[i+3].equals(������[i+6])){
						
					if(!������[i].equals("[ ]"))	�¸���=������[i];
						
					}
				}
				
				
				//5-3: �밢������ �̱�¼�
				
					if(������[0].equals(������[4])&&������[4].equals(������[8])) {
						
					if(!������[0].equals("[ ]"))	�¸���=������[0];
						
					}
					if(������[2].equals(������[4])&&������[4].equals(������[6])) {
						
					if(!������[2].equals("[ ]"))	�¸���=������[2];
							
					}
					
				
				
					
				
				//6.�¸� �Ǵ�
				if(�¸���.equals("[o]")) { 
					System.out.println("�÷��̾� �¸�"); 
					break;
				}
				
				if(�¸���.equals("[x]")) { 
					System.out.println("��ǻ�� �¸�");
					break;
				}
				
				
			
		}//ó�� while	
		
		
	
	
	
	
	
	
	
	}

}
