package icehs.science.chapter05;

import java.util.Scanner;

public class DutchCalculator {
	
	public static int getUserInput() {
        
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int totalSum = 0;
		int memNo = 0;
		
		System.out.print("������ �������� ����Ǿ�����? : ");
		int timeNo = getUserInput();
		System.out.println("==================");
		
		for(int i = 1;  i <= timeNo; i++) {
			System.out.print(i + "�� ��� : ");
			totalSum += getUserInput();
		}
		System.out.println("�� ��� : " + totalSum + "�� �Դϴ�.");
		System.out.println("==================");
		
		System.out.print("������ �ο����� �Է��ϼ��� : ");
		memNo = getUserInput();
		int avgMoney = totalSum / memNo;
		
		System.out.println("==================");
		for(int i = 1; i <= memNo; i++) {
			if(i == memNo) {
				System.out.println(i + " = " + totalSum);
			} else {
				System.out.println(i + " : " + avgMoney);
				totalSum -= avgMoney;
			}
		}
		
		
		
		
	}
	

}