package icehs.science.chapter03;

public class StringVariableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "홍길동";
		String mathScore = "96";
		int intMathScore = Integer.parseInt(mathScore);
		int engScore = 82;
		
		System.out.println("이름 : " + name);
		System.out.println("수학 점수 : " + intMathScore);
		System.out.println("영어 점수 : " + engScore);
		
		System.out.println("합계 점수 : " + (intMathScore + engScore));
		
	}

}
