package icehs.science.chapter05;

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		int stuNo = 0;
		int totalScore = 0;
		double avg = 0;
		
		System.out.print("���� �л� ����? : ");
		stuNo = getUserInput();
		for(int i = 1; i <= stuNo; i++) {
			System.out.print(i + "�� ���� : ");
			totalScore += getUserInput(); 
		}
		avg = (double)totalScore / stuNo;
		
		System.out.println("==================");
		System.out.println(stuNo + "���� ���� : " + totalScore + "��");
		System.out.println(stuNo + "���� ��� : " + avg + "��");
		System.out.println("==================");
	}
	public static int getUserInput() {   
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;
    }
}
