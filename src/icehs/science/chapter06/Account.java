package icehs.science.chapter06;

public class Account {

	String accName;
	String accNo;
	int balance; //�ܾ�
	
	void deposit(int money) {
		if (money < 0) {
			System.out.println("[����] �ݾ��� ������ �Է��� �� �����ϴ�.");
		} else {
			balance += money;
		}
		System.out.println(money + "���� �Ա��մϴ�.");
		System.out.println("�ܾ� : " + balance + " ��  ");
	}
	
	
	void withdraw(int money) {
		if(money < 0) {
			System.out.println("[����] �ݾ��� ������ �Է��� �� �����ϴ�.");
		} else if (balance < money) {
			System.out.println("[����] �ܾ��� �����մϴ�.");
		} else {
			balance -= money;
		}
			System.out.println(money + "���� ����մϴ�.");

			System.out.println("�ܾ� : " + balance + " ��  ");
		}
	
	
	void printAccountInfo() {
		System.out.println("���� " + accNo + "(������ : " + accName + ")");
		System.out.println("�ܾ� : " + balance + "��");
	}
	
}
