package icehs.science.chapter05;

public class VariousSumTest {

	public static void main(String[] args) {
		int total = 0;
		int oddTotal = 0; //Ȧ�� ��
		int evenTotal = 0; //¦�� ��
		
		for(int i = 0; i <= 1000; i++) {
			total += i;
			if(i%2 == 0) {
				evenTotal += i;
			}
			else {
				oddTotal += i;
			}
		}
		System.out.println("1���� 1000������ �� : " + total);
		System.out.println("1���� 1000���� ¦������ �� : " + evenTotal);
		System.out.println("1���� 1000���� Ȧ������ �� : " + oddTotal);
		
	}

}
