package icehs.science.chapter05;

public class PrimeNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 255;
		if(number == 2) {
			System.out.println(number + "�� �Ҽ��Դϴ�.");
		}
		for(int i = 2; i < number; i++) {
			if((number % i) == 0) {
				System.out.println(number + "�� �Ҽ��� �ƴմϴ�."); 
			}else {
				System.out.println(number + "�� �Ҽ��Դϴ�."); 
			}
		}
		
	}

}
