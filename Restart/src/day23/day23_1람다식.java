package day23;

public class day23_1���ٽ� {

	public static void main(String[] args) {
	
		//���ٽ� : �̸��� ���� �͸��Լ�. ->pubic static ������ ����.
		//�Լ��� �ܼ�ȭ.
		//��Ƽ�����忡�� ���̾�.
		//(�μ�) -> {�����ڵ�; return;}; or ()->�����ڵ� ;
		
		�Լ��������̽� fi; //�������̽� ��ü
		
		
		
		fi=()->{String str="�޼ҵ����1";
			
		System.out.println(str); //�߻�޼ҵ� ����
		
		};
		
		fi.�޼ҵ�(); //����
		
		fi=() ->{System.out.println("�޼ҵ����2");};
		
		fi.�޼ҵ�();
		
		fi=() ->{System.out.println("�޼ҵ����3");};
		fi.�޼ҵ�();
		
		
		
		�Լ��������̽�2 fi2;
		
		fi2= (x)-> {
			int ���=x*5;
			System.out.println("���: "+���);
		};
		fi2.�޼ҵ�(3);
	
		fi2=(x)->{System.out.println(x*5);};
		fi2.�޼ҵ�(3);
	
		//�μ� o ��ȯ o
		�Լ��������̽�3 fi3;
		
		fi3=(x,y) ->{
			int ���=x+y;
			return ���;
		};
		
		System.out.println(fi3.�޼ҵ�(3, 5));
	
		fi3=(x,y)->{return x+y;};
		System.out.println(fi3.�޼ҵ�(3, 5));
		
		fi3=(x,y)->x+y;
		System.out.println(fi3.�޼ҵ�(3, 5));
		
		fi3=(x,y)->sum(x,y); //�ٸ��Լ� ���
		System.out.println(fi3.�޼ҵ�(3, 5));
		
		
		
		
		
		
		
		
		
	
	
	}
	
	
	public static int sum(int x, int y) {
		return (x+y);
	}
}
