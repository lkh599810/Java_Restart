package day22;

public class day22_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���׸�
		
		box ����=new box();
		
		����.setObject("����ڽ�");
		String name=(String)����.getObject();
		System.out.println(name);
		
		
		
		����.setObject(new apple());
		apple apple=(apple)����.getObject();
		System.out.println(apple);
	
		/////////////////////////////////////////////////
		
		box2<String> ����2=new box2<>();
		����2.set("����ڽ�");
		String name2=����2.get();
		System.out.println(name2);
		
	
		box2<Integer> ����3= new box2<>();
		����3.set(10);
		
		int ��= ����3.get();
		System.out.println(��);
	
		box2<apple> ����4= new box2<>();
	
		����4.set(new apple());
		
		System.out.println(����4.get());
		
		
		//////////////////////////////////
		
		//��Ƽ ���׸�
		
		��ǰ<�ڷ�����, String> ��ǰ1= new ��ǰ<>();
		��ǰ1.setKind(new �ڷ�����());
		��ǰ1.setModel("����Ʈ �ڷ�����");
		
		System.out.println("��ǰ 1 : "+��ǰ1.getKind()+��ǰ1.getModel());
		
		��ǰ<�ڵ���,String> ��ǰ2= new ��ǰ<>();
		
		��ǰ2.setKind(new �ڵ���());
		��ǰ2.setModel("����");
		
		
		System.out.println("��ǰ 2 : "+��ǰ2.getKind()+��ǰ2.getModel());
		
	}

}
