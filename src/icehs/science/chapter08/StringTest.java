package icehs.science.chapter08;

public class StringTest {

	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		String str4 = new String("abc");
	
		if(str1==str2) {
			System.out.println("����");
		}else {
			System.out.println("�����ʴ�");
		}
		
		//str1�� heap�� "abc"�̰�, str2�� str1�� ����Ű�� heap��  "abc"�̴�. �׷��Ƿ� str1 = str2�̴�.
		
		if(str3==str4) {
			System.out.println("����");
		}else {
			System.out.println("�����ʴ�");
		}
		
		//str3, str4�� new�� ��ä�� ���� ������� ������ str3 != str4�̴�.
		
		if(str1==str3) {
			System.out.println("����");
		}else {
			System.out.println("�����ʴ�");
		}
		
		//str1 != str3�̴�.
		
		if(str1.equals(str3)) {
			System.out.println("����");
		}else {
			System.out.println("�����ʴ�");
		}
		
		//equals�� ��ä �񱳰� �ƴ϶� ���� ���̴�. str1 = "abc", str3 = "abc"�̱� ������ equals������ ����.
		
		
		
	}

}
