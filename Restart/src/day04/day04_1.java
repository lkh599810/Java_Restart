package day04;

import java.util.Random;
import java.util.Scanner;

public class day04_1 {
public static void main(String[] args) {
		
		// if : ��� [ T , F => �񱳿����� ]
		
		// ���� 80�� �̻��̸� �հ� 
		int ���� = 90;
		if( ���� >= 80 ) System.out.println("�հ�");
		// ���� 80�� �̻��̸� �հ� �ƴϸ� ���հ� 
		if( ���� >= 80 ) System.out.println("�հ�");
		else System.out.println("���հ�");
		// ���� 80�� �̻��̸� �հ� 70�� �̻� ���� �ƴϸ� ���հ� 
		if( ���� >= 80 ) System.out.println("�հ�");
		else if( ���� >=70 ) System.out.println("����");
		else System.out.println("���հ�");
		// ���� 80�� �̻� �̸鼭 �����̸� A�� �����̸� B�� ������ 70���̻��̸� C�� 
		String ���� = "����";
		if( ���� >= 80 ) {
			if( ����.equals("����") ) System.out.println("A��");
			else System.out.println("B��");
		}else System.out.println("C��");
		
		// ����1 : ���������� ���� 
			// 1. �� ����ڿ��� �� �Է� �ޱ� 
			// 2. ���ؼ� �̱�� �� �Ǵ� [ if ]
			// 3. �̱� ����� ��� 

		int ���Ӽ� = 0 ; // while �ȿ��� Ȥ�� �ۿ��� ����Ұ�� ������ġ ; 
		int �÷��̾�1�¸��� = 0 ; 
		int �÷��̾�2�¸��� = 0 ;
		
	while(true) {  // ���� �ݺ� => ��� �ݺ��ϱ� 
		
		System.out.println("���� ���� �� [ ������=end ] ����");
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ù��° �÷��̾� ���� : ");
		String �÷��̾�1 = scan.next();
		int �÷��̾�1�� = 3 ;
			if( �÷��̾�1.equals("����") ) �÷��̾�1�� = 0 ;  // ���� �ʱ�ȭ 
			else if( �÷��̾�1.equals("����") ) �÷��̾�1�� = 1 ; // ���� �ʱ�ȭ 
			else if( �÷��̾�1.equals("��") ) �÷��̾�1�� = 2 ; // ���� �ʱ�ȭ
			else if( �÷��̾�1.equals("end") ) break; // �ݺ��� Ż��
			else System.out.println("�߸� �Է��߽��ϴ�"); // ���� �ʱ�ȭ X
			
//		System.out.print("�ι�° �÷��̾� ���� : ");
//		String �÷��̾�2 = scan.next();
//		int �÷��̾�2�� = 3;
//			if( �÷��̾�2.equals("����") ) �÷��̾�2�� = 0 ;
//			else if( �÷��̾�2.equals("����") ) �÷��̾�2�� = 1 ;
//			else if( �÷��̾�2.equals("��") ) �÷��̾�2�� = 2 ;
//			else System.out.println("�߸� �Է��߽��ϴ�");
			
		// ��ǻ�� ������ �����ؼ� ���� 
		Random random = new Random(); // ���� ��ü 
		int �÷��̾�2�� = random.nextInt(3);  // 0 ~ 2 ������ ���� �߻�
		// ��ǻ�Ͱ� ���� �� 
		if( �÷��̾�2�� == 0 ) System.out.println("��ǻ�ʹ� ���� �½��ϴ� ");
		if( �÷��̾�2�� == 1 ) System.out.println("��ǻ�ʹ� ���� �½��ϴ� ");
		if( �÷��̾�2�� == 2 ) System.out.println("��ǻ�ʹ� �� �½��ϴ� ");
		
			// �¸� �Ǵ�
			if( �÷��̾�1�� == 0 ) { // ��1 => �����϶� �Ǵ� 
				if( �÷��̾�2�� == 2 ) {
					�÷��̾�1�¸���++;
					System.out.println("�÷��̾�1 �¸�");
				}
				else if( �÷��̾�2�� == 1 ) {
					�÷��̾�2�¸���++;
					System.out.println("�÷��̾�2 �¸�");
				}
				else System.out.println(" ���º� ");
			}
			else if( �÷��̾�1�� == 1 ) { // ���� �϶� �Ǵ� 
				if( �÷��̾�2�� == 0 ) {
					�÷��̾�1�¸���++;
					System.out.println("�÷��̾�1 �¸�");
				}
				else if( �÷��̾�2�� == 2 ) {
					�÷��̾�2�¸���++;
					System.out.println("�÷��̾�2 �¸�");
				}
				else System.out.println("���º�");
			}
			else if( �÷��̾�1�� == 2 ) { // �� �϶� �Ǵ� 
				if( �÷��̾�2�� == 1) {
					�÷��̾�1�¸���++;
					System.out.println("�÷��̾�1 �¸�");
				}
				else if( �÷��̾�2�� == 0 ) {
					�÷��̾�2�¸���++;
					System.out.println("�÷��̾�2 �¸�");
				}
				else System.out.println("���º�");
			}
			else { // �Ѹ��̶� ���� 3�̸� [ �߸� �Է������� ] 
				System.out.println("�߸� �Էµ� ���� �ֽ��ϴ� [ �ٽ� ] ");
				���Ӽ�--;
			}
		���Ӽ�++;	
		} // w end
	
	System.out.println(" ����� ���Ӽ� : " + ���Ӽ� );
	
	// �����¸� �Ǵ� 
	if( �÷��̾�1�¸��� > �÷��̾�2�¸��� ) System.out.println(" �����¸� : �÷��̾�1 " + "["+�÷��̾�1�¸���+"]");
	else if( �÷��̾�1�¸��� < �÷��̾�2�¸��� )  System.out.println(" �����¸� : ��ǻ�� "+"["+�÷��̾�1�¸���+"]");
	else System.out.println(" ���º� ");
	
	
	}
	
	
	
}
