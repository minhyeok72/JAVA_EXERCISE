package icehs.science.chapter08;

public class ArrayDataEx {

	public static void main(String[] args) {
		int[] lottoNumbers = new int[0];
		String [] names = {"ȫ�浿", "ȫ���", "����ġ"};
		
		lottoNumbers[0] = 23;
		lottoNumbers[1] = 31;
		lottoNumbers[2] = 2;
		lottoNumbers[3] = 26;
		lottoNumbers[4] = 17;
		lottoNumbers[5] = 8;
//		lottoNumbers[6] = 12;
		
		System.out.println("�迭�� ���� : " + lottoNumbers.length);
		System.out.println("�迭�� ���� : " + names.length);
		
		System.out.println(lottoNumbers[3]);
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);

	}

}
