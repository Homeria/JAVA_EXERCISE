package icehs.science.chapter05;

public class VariousSumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int totalSum = 0;
		int oddSum = 0;
		int evenSum = 0;
		
		for (int i = 1 ; i <= 1000; i++) {
			if ((i % 2) == 0) {
				evenSum += i;
			}
			if ((i % 2) != 0) {
				oddSum += i;
			}
		}
		totalSum = oddSum + evenSum;
		System.out.println("1���� 1000������ �� : " + totalSum);
		System.out.println("1���� 1000���� ¦������ �� : " + evenSum);
		System.out.println("1���� 1000���� Ȧ������ �� : " + oddSum);
	}

}
