package day06;

public class day06_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*swicth case : if���� ���� ������ ���Ƽ� �� ���� ������ �ӵ��� �� ����*/
		
		int ����=80; int ����=90; int ����=30;
		
		int ���=(����+����+����)/3;
		
		//switch������ >,< ������ ������.
		
		switch (���/10) {
		case 9: System.out.println("�ֿ��");
			
			break;

		case 7: System.out.println("����");
			break;
			
		default: System.out.println("����");
			break;
		}
		
		//=================================================================
		
		
		//while : ���ѹݺ�
		
		int i=0;
		int sum=0;
		
		while( i<5) {
			
			i++;
			sum +=i;
			
			System.out.println(sum);
		}
		
		
		int j=0;
		while(true) {
			
			j++;
			if(j==3) break;
		}
		

	}

}
