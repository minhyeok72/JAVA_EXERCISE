package icehs.science.chapter04;

public class OperatorTest {

	public static void main(String[] args) {
		int number = 64;
		boolean result1 = number % 2 == 0;
		boolean result2 = number % 3 == 0;
		boolean result3 = (number % 2 == 0) && (number % 7 == 0);
		boolean result4 = (number % 2 == 0) || (number % 7 == 0);
		
		System.out.println("¦���Դϱ�? : " + result1);
		System.out.println("3�� ����Դϱ�? : " + result2);
		System.out.println("2�� ����̸鼭 7�� ����Դϱ�? : " + result3);
		System.out.println("2�� ����̰ų� 7�� ����Դϱ�? : " + result4);
		
	}

}
