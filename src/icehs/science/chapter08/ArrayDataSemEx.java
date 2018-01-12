package icehs.science.chapter08;

public class ArrayDataSemEx {

	public static void main(String[] args) {
		int numbers [] = {98, 34, 79, 31, 59, 83, 17, 94, 82, 23};
		int sum = 0;
		
		System.out.print("배열의 내용 : ");
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		System.out.println("합계 : " + sum);
	}

}
