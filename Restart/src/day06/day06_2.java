package day06;

public class day06_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//day01: ���
		//day02: �Է�
		//day03: ����/�ڷ���
		//day04: ������/���
		//day05: �ݺ���
		
		//�迭: Ư������[�ε���]�� ������� ����� ����
		
		//�迭 �������: ���� �������� ���ÿ� �����ϱ����ؼ� ���.
		//����->�޸��Ҵ�
		//�迭 -> ���������� -> �������� �޸��Ҵ�
		//�ε��� : ������ �迭�� ����Ǵ� ����
		// ****0������ ���� ~~~~
		
		
		int ����1;
		
		int ����2;
		
		int ����3;
		
		//�迭 ����
		int[] �迭����= new int[3]; //int*3 ==> 12����Ʈ �迭
		//�迭 ȣ��
		
		System.out.println(�迭����[0]); //�迭 ȣ�� ==>������ ���� �ȳ־�Z���� 0���γ���.
		System.out.println(�迭����[1]);
		System.out.println(�迭����[2]);
	//	System.out.println(�迭����[3]); ==> �ֿܼ��� ������.
		
		
		�迭����[0]=10;
		�迭����[1]=20;
		�迭����[2]=30;
		
		System.out.println(�迭����.length);
		System.out.println(�迭����); //�ּҰ�����
		System.out.println(�迭����.toString()); //�굵 �Ȱ��� �ּҰ�
		System.out.println(�迭����[0]); //�迭 ȣ��
		System.out.println(�迭����[1]);
		System.out.println(�迭����[2]);
		
		//1���� �迭 : int[] �迭��= new int[]
		//2���� �迭 : int[][] �迭��= new int[��][��]
 		
		int [][] �迭����2= new int [2][2]; //2��2duf
		
		�迭����2[0][0]=80;
		
		�迭����2[0][1]=90;
		
		�迭����2[1][0]=100;
		
		�迭����2[1][1]=110;
		
		System.out.println(�迭����2.length); //�� ����
		System.out.println(�迭����2[0].length); //�� ����
		
		System.out.println(�迭����2[0][0]);
		System.out.println(�迭����2[1][0]);
		
		
		System.out.println(�迭����2[0]); //�ּҰ�
		System.out.println(�迭����2[1]); //�ּҰ�
		
	//	System.out.println(�迭����2[3]); //����
		
		
		
		 //ƽ���� �����
		
		
		
		
		
		
		
	}

}
