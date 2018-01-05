package icehs.science.chapter05;

public class SumAndAverageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		double avg = 0;
		int j = 500;
		for (int i = 1; i <= j; i++) {
			sum += i;
		}
		avg = (double)sum / j;
		System.out.println("ÇÕ°è : " + sum);
		System.out.println("Æò±Õ : " + avg);
	}

}
