package icehs.science.chapter04;

public class SalaryTest {

	public static void main(String[] args) {
		int monthSalary = 1000000;
		int bonus = monthSalary * 2 / 10 * 4;
		int yearSalary = monthSalary * 12;
		int bonusAfterTax = bonus - bonus * 55 / 1000;
		int yearSalaryAfterTax = yearSalary - yearSalary * 1 / 10;
		int totalSalary = yearSalaryAfterTax + bonusAfterTax;
		
		System.out.println("연봉 : " + yearSalary + ", 세후 연봉 : " + yearSalaryAfterTax);
		System.out.println("보너스 : " + bonus + ", 세후 보너스 : " + bonusAfterTax);
		System.out.println("지급액 : " + totalSalary);

	}

}
