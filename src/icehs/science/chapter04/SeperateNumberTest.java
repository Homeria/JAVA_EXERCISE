package icehs.science.chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 456;
		int hundNo = number / 100;
		int decNo = (number % 100) / 10;
		int loneNo = (number % 100) % 10;
		
		System.out.println("백의 자리 수 : " + hundNo);
		System.out.println("십의 자리 수 : " + decNo);
		System.out.println("일의 자리 수 : " + loneNo);
		
	}

}
