package icehs.science.chapter03;

public class AutoCastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number = 1000000000000000000.0;
		long longNumber = (long)number;
		int doubleNumber = (int)longNumber;
		
		System.out.println(number);
		System.out.println(longNumber);
		System.out.println(doubleNumber);
		
		//int -> long -> double일 때는 아무 문제도 없다.
		//역순일 때 값의 크기에 따라 손실이 발생한다. 만약 double이 int안 들어올 수 있다면 손실이 발생하지 않는다.
		//역순으로 진행할 때는 ()를 쓴다. 이러한 활동을 Casting이라 한다.
		
		
	}

}
