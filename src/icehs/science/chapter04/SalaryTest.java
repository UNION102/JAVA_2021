package icehs.science.chapter04;

public class SalaryTest {
	public static void main(String[] args) {
		int annualSalary = 1000000 * 12;
		int annualTax = annualSalary * 10 /100;
		int annualBonus = annualSalary * 1 / 12 * 20 / 100 * 4;
		int annualBonusTax = annualBonus * 55 / 1000;
		System.out.println("연봉 : " + annualSalary);
		System.out.println("세후 연봉 : " + (annualSalary - annualTax));
		System.out.println("보너스 : " + annualBonus);
		System.out.println("세후 보너스 : " + (annualBonus - annualBonusTax));
		System.out.println("지급액 : " + (annualSalary + annualBonus - annualTax - annualBonusTax));
	}
}
