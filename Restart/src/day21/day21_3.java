package day21;

public class day21_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//���ڿ� �ڸ���
		
		String �ֹε�Ϲ�ȣ ="981015-1011111";
		
		String ���ڸ� =�ֹε�Ϲ�ȣ.substring(0,6);
		
		System.out.println(���ڸ�);
		
		String ���ڸ�= �ֹε�Ϲ�ȣ.substring(7);
		
		System.out.println(���ڸ�);
		
		
		//���ڿ� �и� split
		
		String [] �迭=�ֹε�Ϲ�ȣ.split("-"); // -�������� �ڸ�
		System.out.println(�迭[0]);
		System.out.println(�迭[1]);
		
		String ��������="Java Programming";
		System.out.println(��������.toLowerCase());
		System.out.println(��������.toUpperCase());
		
		//���ڿ� -> ���ڿ� // ���ڿ� -> ���ڿ�
		
		String ����= String.valueOf(10);//int->String
		
		System.out.println(����);
		
		String ����2=String.valueOf(true); //boolean->String
		
		//if(����2)System.out.println("��"); ==> ���� valueof(true)�� ���� �ƴ�.
		
		String ����3=String.valueOf(10.5);// double->String
		System.out.println(����3);
		
		int ����=Integer.parseInt(����); //String->int
		System.out.println(����);
		
		boolean ��=Boolean.parseBoolean(����2); //String =>boolean
		System.out.println(��);
		
		double �Ǽ�=Double.parseDouble(����3); //String => double;
		System.out.println(�Ǽ�);
		
		
		
	}

}
