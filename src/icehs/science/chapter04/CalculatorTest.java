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
		
		System.out.println("µ¡¼À°á°ú : " + addResult);
		System.out.println("»¬¼À°á°ú : " + substractResult);
		System.out.println("°ö¼À°á°ú : " + multipleResult);
		System.out.println("³ª´°¼À°á°ú : " + divResult);
		System.out.println("³ª¸ÓÁö°á°ú : " + remainResult);
	}
}
