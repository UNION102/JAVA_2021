package icehs.science.chapter04;

public class CalculatorTest {
	public static void main(String[] args) {
		int firstNum = 20;
		int secondNum = 7;
		int addResult = firstNum + secondNum;
		int substractResult = firstNum - secondNum;
		int multipleResult = firstNum * secondNum;
		int divResult = firstNum / secondNum;
		int remainResult = firstNum % secondNum;
		
		System.out.println("������� : " + addResult);
		System.out.println("������� : " + substractResult);
		System.out.println("������� : " + multipleResult);
		System.out.println("��������� : " + divResult);
		System.out.println("��������� : " + remainResult);
	}
}
