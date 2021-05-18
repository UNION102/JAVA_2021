package icehs.science.chapter05;

public class NumberCheckTest {
	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 3;
		int result = num1 * num2;
		
		if(result < 10) {
			System.out.println(num1 + "*" + num2 + " : 한자리 수입니다.");
		} else if (result < 100) {
			System.out.println(num1 + "*" + num2 + " : 두 자리 수입니다.");
		} else if (result >= 100) {
			System.out.println(num1 + "*" + num2 + " : 세 자리 수 이상입니다.");
		} else {
			System.out.println("음수는 확인하지 않습니다.");
		}
		
		int num3 = 4;
		int num4 = 5;
		int result1 = num3 * num4;
		
		if(result1 < 10) {
			System.out.println(num3 + "*" + num4 + " : 한자리 수입니다.");
		} else if (result1 < 100) {
			System.out.println(num3 + "*" + num4 + " : 두 자리 수입니다.");
		} else if (result1 >= 100) {
			System.out.println(num3 + "*" + num4 + " : 세 자리 수 이상입니다.");
		} else {
			System.out.println("음수는 확인하지 않습니다.");
		}
		
		int num5 = 23;
		int num6 = 96;
		int result2 = num5 * num6;
		
		if(result2 < 10) {
			System.out.println(num5 + "*" + num6 + " : 한자리 수입니다.");
		} else if (result2 < 100) {
			System.out.println(num5 + "*" + num6 + " : 두 자리 수입니다.");
		} else if (result2 >= 100) {
			System.out.println(num5 + "*" + num6 + " : 세 자리 수 이상입니다.");
		} else {
			System.out.println("음수는 확인하지 않습니다.");
		}
		
		int num7 = -3;
		int result3 = num3 * num7;
		
		if(result3 < 10) {
			System.out.println(num3 + "*" + num7 + " : 한자리 수입니다.");
		} else if (result3 < 100) {
			System.out.println(num3 + "*" + num7 + " : 두 자리 수입니다.");
		} else if (result3 >= 100) {
			System.out.println(num3 + "*" + num7 + " : 세 자리 수 이상입니다.");
		} else {
			System.out.println("음수는 확인하지 않습니다.");
		}
	}
}
