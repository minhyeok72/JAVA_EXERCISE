package icehs.science.chapter06;

public class StudentTest {

	public static void main(String[] args) {
		Student hong = new Student();
		hong.stuName = "ȫ�浿";
		hong.stuId = "S001";
		hong.korScore = 94;
		hong.engScore = 80;
		hong.mathScore = 89;
		
		hong.printStudentInfo();
		
		hong.changeStudentId("STU0001");
		System.out.println("�й� ����");
		hong.printStudentInfo();

	}

}
