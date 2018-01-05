package icehs.science.chapter05;

public class NumberCheckTest {

	public static void main(String[] args) {
		int number1 = 25;
		int number2 = 7;
		int result = number1 * number2;
		
		if(result < 0){
			System.out.println(number1 + " * " + number2 + " : " + "음수는 확인하지 않습니다.");
		}else if(result < 10) {
			System.out.println(number1 + " * " + number2 + " : " + "한 자리 수입니다.");
		}else if(result < 100) {
			System.out.println(number1 + " * " + number2 + " : " + "두 자리 수입니다.");
		}else {
			System.out.println(number1 + " * " + number2 + " : " + "세 자리 수 이상입니다.");
		}

	}

}
