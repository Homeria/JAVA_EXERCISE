package icehs.science.chapter08;

public class StringTest {

	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		String str4 = new String("abc");
	
		if(str1==str2) {
			System.out.println("같다");
		}else {
			System.out.println("같지않다");
		}
		
		//str1은 heap의 "abc"이고, str2는 str1이 가리키는 heap의  "abc"이다. 그러므로 str1 = str2이다.
		
		if(str3==str4) {
			System.out.println("같다");
		}else {
			System.out.println("같지않다");
		}
		
		//str3, str4는 new로 객채를 새로 만들었기 때문에 str3 != str4이다.
		
		if(str1==str3) {
			System.out.println("같다");
		}else {
			System.out.println("같지않다");
		}
		
		//str1 != str3이다.
		
		if(str1.equals(str3)) {
			System.out.println("같다");
		}else {
			System.out.println("같지않다");
		}
		
		//equals는 객채 비교가 아니라 글자 비교이다. str1 = "abc", str3 = "abc"이기 때문에 equals에서는 같다.
		
		
		
	}

}
