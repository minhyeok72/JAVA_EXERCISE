package icehs.science.chapter05;

import java.util.Scanner;

public class DutchCalculator {

	public static void main(String[] args) {
		int totalSum = 0;
		
		System.out.print("������ �� ������ ����Ǿ�����? : ");
		int timeNo = getUserInput();
		System.out.println("==================");
		System.out.println("�� �������� �� ����� �Է��ϼ���.");
		for(int i = 1; i <= timeNo; i++) {
			System.out.print(i + "�� ��� : ");
			totalSum += getUserInput();
		}
		System.out.println("�� ����� " + totalSum + "�� �Դϴ�.");
		System.out.println("==================");
		System.out.print("������ �ο����� �Է��ϼ��� : ");
		int memNo = getUserInput();
		int avg = totalSum / memNo;
		System.out.println("==================");
		System.out.println("��ġ���� �ݾ���?");
		
		for(int j = 1; j <= memNo; j++) {
			if(j == memNo) {
				System.out.println(j + " : " + totalSum + "��");
			}else {
				System.out.println(j + " : " + avg + "��");
				totalSum -= avg;
			}
			
		}

	}
	public static int getUserInput() {   
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;
    }

}
