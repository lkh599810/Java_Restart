package day06;

public class day06_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*swicth case : if보다 논리적 제약이 많아서 잘 쓰지 않지만 속도는 더 빠름*/
		
		int 국어=80; int 수학=90; int 영어=30;
		
		int 평균=(국어+영어+수학)/3;
		
		//switch문에는 >,< 연산자 사용못함.
		
		switch (평균/10) {
		case 9: System.out.println("최우수");
			
			break;

		case 7: System.out.println("수료");
			break;
			
		default: System.out.println("낙제");
			break;
		}
		
		//=================================================================
		
		
		//while : 무한반복
		
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
