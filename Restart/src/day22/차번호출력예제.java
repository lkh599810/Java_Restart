package day22;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ����ȣ��¿��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. ����ȣ �������� 0000~9999 ������ ������ 10�� ����
		// ���� 10�� ����
		//Ȧ��/¦�� ������ ���
		
		Random random = new Random();
		
		String [] ������ȣ= new String [10];
		
		//���� ����
		
		for(int i=0; i<10; i++) {
			
			
				//random.nextInt : int����
				//random.nextInt(10000) : 0~9999
			
				//��������� ����, �ڸ��� �޲ٱ⸦ ���ϰ��� ��)123 =>0123
			
			������ȣ[i]= String.format("%04d", random.nextInt(10000));
				//String������ �ٲٰ�, format�� ���ָ� ��
			
		}
		
		ArrayList<String> Ȧ������ = new ArrayList<>();
		ArrayList<String> ¦������ = new ArrayList<>();
		
		//�迭���
		for(int i=0; i<10; i++) {
			
			String ����ȣ=������ȣ[i].substring(3);
			int ����ȣ_int=Integer.parseInt(����ȣ);
			
			if(����ȣ_int%2==0) {
				¦������.add(������ȣ[i]);
			}else {
				Ȧ������.add(������ȣ[i]);
			}
			
			
			
		}
		
		//¦ Ȧ �� ���
		System.out.println("Ȧ��");
		for(String temp: Ȧ������) {
			
			System.out.println(temp);
		}
		System.out.println("¦��");
		for(String temp: ¦������) {
			
			System.out.println(temp);
		}
		
	}

}
