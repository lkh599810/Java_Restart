package day04;

import java.util.Scanner;

public class day04_2 {

public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		// ����1. 3���� ������ �Է¹޾� ���� ���� �� ���
		/*
		 * System.out.print("����1 �Է� : "); int ����1 = scan.nextInt();
		 * System.out.print("����2 �Է� : "); int ����2 = scan.nextInt();
		 * System.out.print("����3 �Է� : "); int ����3 = scan.nextInt(); 
		 * int min = ����1; // ���� ���� ���� �����ϴ� ������ ���� ������ if( min > ����2 ) min = ����2; if( min > ����3 ) min = ����3;
		 * System.out.println(" ���� ���� ���� : " + min );
		 */
		
		// ����2. 3���� ������ �Է¹޾� ������������ �ٽ� �����ϱ�
		/*
		 System.out.print("����1 �Է� : "); int ����1 = scan.nextInt();
		 System.out.print("����2 �Է� : "); int ����2 = scan.nextInt();
		 System.out.print("����3 �Է� : "); int ����3 = scan.nextInt(); 
		 
		 if( ����1 > ����2 ) { // ù��° ��  / �ι�°�� �� => ��ȯ
			 int �ӽ� = ����1;
			 ����1 = ����2;
			 ����2 = �ӽ�;
		 }
		 if( ����2 > ����3 ) {	 // �ι�° ��  / ����° �� �� => ��ȯ
			 int �ӽ� = ����2;
			 ����2 = ����3;
			 ����3 = �ӽ�;
		 }
		 if( ����1 > ����2 ) { // ù��° �� / �ι�° �� ��  => ��ȯ
			 int �ӽ� = ����1;
			 ����1 = ����2;
			 ����2 = �ӽ�;
		 }
		 System.out.println(" �������� ������ : " + ����1 +"\t"+ ����2+"\t" + ����3 + " �� �Դϴ� " );
		*/
		
		// ����3. ���̵� qwe405060 ��й�ȣ�� 1234 ȸ�� �Ѹ��� ���������� 
			// 1. �α��� ������ ���̵�� ��й�ȣ�� ������ ��쿡�� �α��� ���� ��� 
			// 2. ������ ���̵� �� ��й�ȣ�� �ƴҰ�� �α��� �Է�â �ݺ����� 
		
		/*
		while( true ) { // ���ѹݺ��ϱ� 
			System.out.println(" �α��� â ");
			System.out.print(" ���̵� : "); String loginID = scan.next();
			System.out.print(" ��й�ȣ : "); String loginPassword = scan.next();
			
			if( loginID.equals("qwe405060") && loginPassword.equals("1234") ) {
				// �Է��� ���̵�� �н����尡 �����Ѱ��
				System.out.println("--->�α��� ����");
			}else {
				System.out.println("--->������ ȸ���� �����ϴ�. [ �ٽ� �Է����ּ��� ] ");
			}
		}
		*/
		
		// ����4 : ���Ǳ� ����� [ �ݶ�[ ���:10��]=>500��  , ���̴�[ ���:5��] => 600�� , ȯŸ[ ���: 7��] => 700�� ]
			// 1. ���Ǳ� ���α׷� ���ѷ��� 
			// 2. ����ڿ��� �ݾ��� �Է� �ޱ� 
			// 3. �Է¹��� �ݾ����� ��ǰ ����
					// 1. ��ǰ ��ȣ�� ���� �Է¹޾� ���� 
			// 4. ���� ���� => ��� ���� , ���� ���� 
		
		int �ݶ���� = 10;
		int ���̴���� = 5;
		int ȯŸ��� = 7;
		
		while( true ) { // ��ü �ڵ� �ݺ� 
			System.out.println("----- ���Ǳ� ���α׷� -----");
			System.out.println("�ݾ��� �־��ּ��� : ");
				// �ݾ� ����
				int �ݾ� = scan.nextInt();
				int ��ٱ��ϱݾ� = 0 ; 
				int �ݶ󱸸ż�  = 0 ;	
				int ���̴ٱ��ż� = 0 ;
				int ȯŸ���ż� = 0 ;
				
			while( true ) { // ���� �ڵ� �ݺ� 		
				System.out.println("1. �ݶ�[500��] 2.���̴�[600��] 3.ȯŸ[700��] 4.����");
					// �޴� ���� ����
					int ���� = scan.nextInt();
					if ( ���� == 1 ) { 
						System.out.println(" �ݶ� ���Ű��� : "); int ���ż� = scan.nextInt();
						
						if( ���ż� > �ݶ���� ) System.out.println(" ��� �����մϴ� ");
						else if( (���ż�*500) > �ݾ�  ) System.out.println(" �ݾ��� �����մϴ� ");
						else {
							int �ݶ󰡰� = ���ż� * 500;
								int temp  = ��ٱ��ϱݾ� + �ݶ󰡰�;
							if(  temp > �ݾ�  ) System.out.println(" �ݾ� ���� ");
							else {
								System.out.println(" ��ٱ��� �߰� �߽��ϴ� ");
								��ٱ��ϱݾ� += �ݶ󰡰�;
								�ݶ󱸸ż� += ���ż�;
							}
						}
					}
					if ( ���� == 2 ) {
						System.out.println(" ���̴� ���Ű��� : "); int ���ż� = scan.nextInt();
						
						if( ���ż� > ���̴���� ) System.out.println(" ��� �����մϴ� ");
						else if( (���ż�*600) > �ݾ�  ) System.out.println(" �ݾ��� �����մϴ� ");
						else {
							int  ���̴ٰ��� = ���ż� * 600;
							int temp  = ��ٱ��ϱݾ� +  ���̴ٰ���;
							if(  temp > �ݾ�  ) System.out.println(" �ݾ� ���� ");
							else {
								System.out.println(" ��ٱ��� �߰� �߽��ϴ� ");
								��ٱ��ϱݾ� +=  ���̴ٰ���;
								���̴ٱ��ż� += ���ż�;
							}
						}
					}
					if ( ���� == 3 ) {
						System.out.println(" ȯŸ ���Ű��� : "); int ���ż� = scan.nextInt();
						
						if( ���ż� > ȯŸ��� ) System.out.println(" ��� �����մϴ� ");
						else if( (���ż�*700) > �ݾ�  ) System.out.println(" �ݾ��� �����մϴ� ");
						else {
								int ȯŸ���� = ���ż� * 700;
								int temp  = ��ٱ��ϱݾ� + ȯŸ����;
							if(  temp > �ݾ�  ) System.out.println(" �ݾ� ���� ");
							else {
								System.out.println(" ��ٱ��� �߰� �߽��ϴ� ");
								��ٱ��ϱݾ� += ȯŸ����;
								ȯŸ���ż� += ���ż�;
							}
						}
					}
					if ( ���� == 4 ) {
						System.out.println("------->��ٱ��� ");
						if( �ݶ󱸸ż� !=0 ) System.out.println(" �ݶ� : "  + �ݶ󱸸ż� + " �� �ݾ� : " + ( �ݶ󱸸ż�*500) );
						if( ���̴ٱ��ż� !=0 ) System.out.println(" ���̴� : "  + ���̴ٱ��ż� + " �� �ݾ� : " + ( ���̴ٱ��ż�*600) );
						if( ȯŸ���ż� !=0 ) System.out.println(" ȯŸ : "  + ȯŸ���ż� + " �� �ݾ� : " + ( ȯŸ���ż�*700) );
						
						System.out.println(" �� �ݾ� : " + ��ٱ��ϱݾ� );
							// ������ ��� ���� 
							�ݶ���� -= �ݶ󱸸ż�; 
							���̴���� -= ���̴ٱ��ż�; 
							ȯŸ��� -= ȯŸ���ż�; 
							
						System.out.println(" �ܵ� : " + ( �ݾ� - ��ٱ��ϱݾ� ));
						
						break; // �ݺ��� Ż��
					}
			
			
			
			}
		
		
		
		
		}
		
	
		
		
		
	}
	
	
}

