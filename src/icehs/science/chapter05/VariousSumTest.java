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
		System.out.println("1부터 1000까지의 합 : " + totalSum);
		System.out.println("1부터 1000까지 짝수들의 합 : " + evenSum);
		System.out.println("1부터 1000까지 홀수들의 합 : " + oddSum);
	}

}
