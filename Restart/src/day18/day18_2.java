package day18;

import java.awt.Toolkit;

public class day18_2 {
	
	public static void main(String[] args) {
		
		
		
		
	
		//������ : �ڵ� �о��ִ� ����
			//main �޼ҵ忡 main ������ ����
		
			//��Ƽ������ : ���� �ڵ带 ���� ó��
			//�ڵ� ����ó��
				//��ǻ������ => ����ó�� X ������� ó��
		
//		��Ƽ������ ����
//		1.implements Runnable -> run �ޤǵ� @override
//		2. extends Thread => run �޼ҵ� @override
//		3. new Thread(new Runnable() {�޼ҵ� @override});
//		
		
		
		//���� 1 ���Ͻ�����
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println("==========================����1 ��");
		
		//����2 ��Ƽ������
		Runnable �Ҹ� = new �Ҹ�������();
		Thread ��Ƽ������1=new Thread(�Ҹ�);
		
		��Ƽ������1.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("==========================����2 ��");

		
		Thread ��Ƽ������2=new �Ҹ�������2();
		
		��Ƽ������2.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println("==========================����3 ��");

		// ���� 4
		
//		Thread ��Ƽ������3= new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				
//				for(int i=0; i<5; i++) {
//					System.out.println("��");
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					
//				}
//				
//				
//				
//			}
//		}); 
//			
//		
		
		
		//����	1. ��ȭ���ེ���� =>��ȭ���� 5�����
		//	  	2. ���� ���ེ���� =>���ǽ��� 5�����
		//    	3. ���� ���ེ���� =>���Ͻ��� 5�����
		
	}

}
