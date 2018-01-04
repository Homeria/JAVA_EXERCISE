package icehs.science.chapter04;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1 = 20;
		int number2 = 7;
		
		//첫번째 방법 - 결과값을 자주 사용하지 않을 때 변수를 선언하지 않는 것이 좋음
		System.out.println("덧셈 결과 : " + (number1 + number2));
		System.out.println("뺄셈 결과 : " + (number1 - number2));
		System.out.println("곱셈 결과 : " + (number1 * number2));
		System.out.println("나눗셈 결과 : " + (number1 / number2));
		System.out.println("나머지 결과 : " + (number1 % number2));
		
		
		//두번째 방법 - 결과값을 자주 쓸 때 변수를 선언하는 것이 좋음
//		int addition = number1 + number2;
//		int subtraction = number1 - number2;
//		int multiplication = number1 * number2;
//		int division = number1 / number2;
//		int remainder = number1 % number2;
//		
//		System.out.println("덧셈 : " + addition);
//		System.out.println("뺄셈 : " + subtraction);
//		System.out.println("곱셈 : " + multiplication);
//		System.out.println("나눗셈 : " + division);
//		System.out.println("나머지 : " + remainder);
		
	}

}
