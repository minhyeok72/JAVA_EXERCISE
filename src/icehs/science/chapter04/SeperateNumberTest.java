package icehs.science.chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		int number = 456;
		int hundNo = number / 100;
		int tenNo = number % 100 / 10;
		int oneNo = number % 10;
				
		System.out.println("���� �ڸ� �� : " + hundNo);
		System.out.println("���� �ڸ� �� : " + tenNo);
		System.out.println("���� �ڸ� �� : " + oneNo);

	}

}
