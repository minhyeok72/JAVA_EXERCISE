package icehs.science.chapter08;

public class ArrayTest {

	public static void main(String[] args) {
		int [] arr = new int[6];
		arr[0] = 5;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[5]);
		
		for(int i = 0; i < 6; i++) {
			arr[i] = i;
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.println(arr[i]);
		}
	}

}
