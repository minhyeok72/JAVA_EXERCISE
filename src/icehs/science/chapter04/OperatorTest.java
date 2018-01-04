package icehs.science.chapter04;

public class OperatorTest {

	public static void main(String[] args) {
		int number = 64;
		boolean result1 = number % 2 == 0;
		boolean result2 = number % 3 == 0;
		boolean result3 = (number % 2 == 0) && (number % 7 == 0);
		boolean result4 = (number % 2 == 0) || (number % 7 == 0);
		
		System.out.println("짝수입니까? : " + result1);
		System.out.println("3의 배수입니까? : " + result2);
		System.out.println("2의 배수이면서 7의 배수입니까? : " + result3);
		System.out.println("2의 배수이거나 7의 배수입니까? : " + result4);
		
	}

}
