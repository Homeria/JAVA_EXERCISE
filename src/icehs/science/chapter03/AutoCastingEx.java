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
		
		//int -> long -> double�� ���� �ƹ� ������ ����.
		//������ �� ���� ũ�⿡ ���� �ս��� �߻��Ѵ�. ���� double�� int�� ���� �� �ִٸ� �ս��� �߻����� �ʴ´�.
		//�������� ������ ���� ()�� ����. �̷��� Ȱ���� Casting�̶� �Ѵ�.
		
		
	}

}
