package day22;

import java.util.Arrays;

public class day22_4_���ϵ�ī�����׸� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���ϵ�ī�� ���׸�: ���� Ŭ������ ����
		 
		�ڽ�<���> ����ڽ�= new �ڽ�<>("�Ϲ��ΰ���",5);
			����ڽ�.add(new ���("�Ϲ���"));
			����ڽ�.add(new ������("������"));
			����ڽ�.add(new �л�("�л�"));
			����ڽ�.add(new ����л�("����л�"));

		�ڽ�<������> �������ڽ�= new �ڽ�<>("�����ΰ���", 5);
			
		
			�������ڽ�.add(new ������("������"));
			
//			�������ڽ�.add(new ���("�Ϲ���")); // ����Ŭ������ ����
//			�������ڽ�.add(new �л�("�л�")); //�ƿ� �ٸ�Ŭ������ ����
//			�������ڽ�.add(new ����л�("����л�")); //''
	
			
		�ڽ�<�л�> �л��ڽ�=new �ڽ�<>("�л�����", 5);	
				
		
			�л��ڽ�.add(new �л�("�л�"));
			�л��ڽ�.add(new ����л�("����л�"));

//			�л��ڽ�.add(new ���("�Ϲ���")); //�ȵ�.
//			�л��ڽ�.add(new ������("������"));
		�ڽ�<����л�> ����л��ڽ�=new �ڽ�("������",5);	
			
			�ڽ����(�л��ڽ�);
			�ڽ����(�������ڽ�);
			�ڽ����(����ڽ�);
			
			�л��ڽ����(����л��ڽ� ); //extends : �л�->����л� ����. ����л��� ����
			
			�������ڽ����(����ڽ�); //super ���ָ� extends �ݴ�� ��� ����ģ���� ��������
	}
	
	
	public static void �ڽ����(�ڽ�<?> course) {
		System.out.println(course.getName()+"������ : "+Arrays.toString(course.get���()));
	}
	
	public static void �л��ڽ����(�ڽ�<? extends �л�> course) {
		
		System.out.println(course.getName()+"������ : "+Arrays.toString(course.get���()));

	}
	
	
	public static void �������ڽ����(�ڽ�<? super ������> course) {
		
		System.out.println(course.getName()+"������ : "+Arrays.toString(course.get���()));

		
	}
	

}
