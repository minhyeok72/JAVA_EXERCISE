package icehs.science.chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		int number = 456;
		int hundNo = number / 100;
		int tenNo = number % 100 / 10;
		int oneNo = number % 10;
				
		System.out.println("백의 자리 수 : " + hundNo);
		System.out.println("십의 자리 수 : " + tenNo);
		System.out.println("일의 자리 수 : " + oneNo);

	}

}
