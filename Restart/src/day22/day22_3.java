package day22;

public class day22_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		box2<Integer> ����1=����.<Integer>�޼ҵ�(100); //���°�/��ȯ�� �����ϸ� <Integer>�޼ҵ� Integer ��������
		
		int ��=����1.get();
		System.out.println(��);
		
		//���׸� ����: �����������ʴ� �ڷ������� ��ü����.
		
		box2<String> ����2=����.�޼ҵ�("���缮");
		
		String name=����2.get();
		
		System.out.println(name);
		
	}

}
