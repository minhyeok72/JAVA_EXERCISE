package icehs.science.chapter05;

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		int stuNo = 0;
		int totalScore = 0;
		double avg = 0;
		
		System.out.print("반의 학생 수는? : ");
		stuNo = getUserInput();
		for(int i = 1; i <= stuNo; i++) {
			System.out.print(i + "번 점수 : ");
			totalScore += getUserInput(); 
		}
		avg = (double)totalScore / stuNo;
		
		System.out.println("==================");
		System.out.println(stuNo + "명의 총점 : " + totalScore + "점");
		System.out.println(stuNo + "명의 평균 : " + avg + "점");
		System.out.println("==================");
	}
	public static int getUserInput() {   
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;
    }
}
