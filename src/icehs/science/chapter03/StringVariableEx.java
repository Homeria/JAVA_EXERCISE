package icehs.science.chapter03;

public class StringVariableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "ȫ�浿";
		String mathScore = "96";
		int intMathScore = Integer.parseInt(mathScore);
		int engScore = 82;
		
		System.out.println("�̸� : " + name);
		System.out.println("���� ���� : " + intMathScore);
		System.out.println("���� ���� : " + engScore);
		
		System.out.println("�հ� ���� : " + (intMathScore + engScore));
		
	}

}
