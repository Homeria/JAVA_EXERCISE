package icehs.science.chapter08;

public class StudentArrayTest {

	public static void main(String[] args) {
		
		Student[] student = new Student[3];
		student[0] = new Student("강감찬", "STU0001", "010-1234-5678");
		student[1] = new Student("이순신", "STU0002", "010-9234-8678");
		student[2] = new Student("김유신", "STU0003", "010-5234-7678");
		
		for(int i = 0; i < student.length;  i++) {
			System.out.println(student[i].getName() + "(" + student[i].getId() + ") / 전화번호 : " + student[i].getPhone());
		}
		
	
		
	}

}
