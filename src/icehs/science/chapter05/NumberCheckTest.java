package icehs.science.chapter05;

public class NumberCheckTest {
	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 3;
		int result = num1 * num2;
		
		if(result < 10) {
			System.out.println(num1 + "*" + num2 + " : ���ڸ� ���Դϴ�.");
		} else if (result < 100) {
			System.out.println(num1 + "*" + num2 + " : �� �ڸ� ���Դϴ�.");
		} else if (result >= 100) {
			System.out.println(num1 + "*" + num2 + " : �� �ڸ� �� �̻��Դϴ�.");
		} else {
			System.out.println("������ Ȯ������ �ʽ��ϴ�.");
		}
		
		int num3 = 4;
		int num4 = 5;
		int result1 = num3 * num4;
		
		if(result1 < 10) {
			System.out.println(num3 + "*" + num4 + " : ���ڸ� ���Դϴ�.");
		} else if (result1 < 100) {
			System.out.println(num3 + "*" + num4 + " : �� �ڸ� ���Դϴ�.");
		} else if (result1 >= 100) {
			System.out.println(num3 + "*" + num4 + " : �� �ڸ� �� �̻��Դϴ�.");
		} else {
			System.out.println("������ Ȯ������ �ʽ��ϴ�.");
		}
		
		int num5 = 23;
		int num6 = 96;
		int result2 = num5 * num6;
		
		if(result2 < 10) {
			System.out.println(num5 + "*" + num6 + " : ���ڸ� ���Դϴ�.");
		} else if (result2 < 100) {
			System.out.println(num5 + "*" + num6 + " : �� �ڸ� ���Դϴ�.");
		} else if (result2 >= 100) {
			System.out.println(num5 + "*" + num6 + " : �� �ڸ� �� �̻��Դϴ�.");
		} else {
			System.out.println("������ Ȯ������ �ʽ��ϴ�.");
		}
		
		int num7 = -3;
		int result3 = num3 * num7;
		
		if(result3 < 10) {
			System.out.println(num3 + "*" + num7 + " : ���ڸ� ���Դϴ�.");
		} else if (result3 < 100) {
			System.out.println(num3 + "*" + num7 + " : �� �ڸ� ���Դϴ�.");
		} else if (result3 >= 100) {
			System.out.println(num3 + "*" + num7 + " : �� �ڸ� �� �̻��Դϴ�.");
		} else {
			System.out.println("������ Ȯ������ �ʽ��ϴ�.");
		}
	}
}
