package icehs.science.chapter08;

public class ScoreArrayTest {

	public static void main(String[] args) {
		int[] scores = {93, 87, 90};
		String[] subjects = {"����", "����", "����"};
		double avg = 0;
		int sum = 0;
		
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
			System.out.println(subjects[i]+ " : " + scores[i]);
		}
		avg = (double)sum / scores.length;
		
		
				
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);

	}

}
