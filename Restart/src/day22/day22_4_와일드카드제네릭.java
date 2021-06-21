package day22;

import java.util.Arrays;

public class day22_4_와일드카드제네릭 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//와일드카드 제네릭: 여러 클래스를 구분
		 
		코스<사람> 사람코스= new 코스<>("일반인과정",5);
			사람코스.add(new 사람("일반인"));
			사람코스.add(new 직장인("직장인"));
			사람코스.add(new 학생("학생"));
			사람코스.add(new 고등학생("고등학생"));

		코스<직장인> 직장인코스= new 코스<>("직장인과정", 5);
			
		
			직장인코스.add(new 직장인("직장인"));
			
//			직장인코스.add(new 사람("일반인")); // 상위클래스라 못들어감
//			직장인코스.add(new 학생("학생")); //아예 다른클래스라 못들어감
//			직장인코스.add(new 고등학생("고등학생")); //''
	
			
		코스<학생> 학생코스=new 코스<>("학생과정", 5);	
				
		
			학생코스.add(new 학생("학생"));
			학생코스.add(new 고등학생("고등학생"));

//			학생코스.add(new 사람("일반인")); //안됨.
//			학생코스.add(new 직장인("직장인"));
		코스<고등학생> 고등학생코스=new 코스("고등과정",5);	
			
			코스등록(학생코스);
			코스등록(직장인코스);
			코스등록(사람코스);
			
			학생코스등록(고등학생코스 ); //extends : 학생->고등학생 가능. 고등학생은 내가
			
			직장인코스등록(사람코스); //super 써주면 extends 반대로 상속 받은친구도 쓸수있음
	}
	
	
	public static void 코스등록(코스<?> course) {
		System.out.println(course.getName()+"수강생 : "+Arrays.toString(course.get목록()));
	}
	
	public static void 학생코스등록(코스<? extends 학생> course) {
		
		System.out.println(course.getName()+"수강생 : "+Arrays.toString(course.get목록()));

	}
	
	
	public static void 직장인코스등록(코스<? super 직장인> course) {
		
		System.out.println(course.getName()+"수강생 : "+Arrays.toString(course.get목록()));

		
	}
	

}
