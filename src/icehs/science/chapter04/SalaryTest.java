package icehs.science.chapter04;

public class SalaryTest {
	public static void main(String[] args) {
		int annualSalary = 1000000 * 12;
		int annualTax = annualSalary * 10 /100;
		int annualBonus = annualSalary * 1 / 12 * 20 / 100 * 4;
		int annualBonusTax = annualBonus * 55 / 1000;
		System.out.println("���� : " + annualSalary);
		System.out.println("���� ���� : " + (annualSalary - annualTax));
		System.out.println("���ʽ� : " + annualBonus);
		System.out.println("���� ���ʽ� : " + (annualBonus - annualBonusTax));
		System.out.println("���޾� : " + (annualSalary + annualBonus - annualTax - annualBonusTax));
	}
}
