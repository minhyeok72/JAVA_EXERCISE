package icehs.science.chapter05;

public class VariousSumTest {

	public static void main(String[] args) {
		int total = 0;
		int oddTotal = 0; //홀수 합
		int evenTotal = 0; //짝수 합
		
		for(int i = 0; i <= 1000; i++) {
			total += i;
			if(i%2 == 0) {
				evenTotal += i;
			}
			else {
				oddTotal += i;
			}
		}
		System.out.println("1부터 1000까지의 합 : " + total);
		System.out.println("1부터 1000까지 짝수들의 합 : " + evenTotal);
		System.out.println("1부터 1000까지 홀수들의 합 : " + oddTotal);
		
	}

}
