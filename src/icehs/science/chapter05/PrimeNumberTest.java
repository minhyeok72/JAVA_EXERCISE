package icehs.science.chapter05;

public class PrimeNumberTest {

	public static void main(String[] args) {
		int number = 21;
		if(number == 2) {
			System.out.println("2�� �Ҽ��Դϴ�.");
		}
		for(int i = 2; i < number; i++) {
			if(i == number) {
				System.out.println(number + "��(��) �Ҽ��Դϴ�.");
			}else if(number % i == 0){
				System.out.println(number + "��(��) �Ҽ��� �ƴմϴ�.");
				break;
			}
		}

	}

}
