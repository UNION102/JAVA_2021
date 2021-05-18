package icehs.science.chapter03;

public class StatisticsCastingTest {
	public static void main(String[] args) {
		double lottoProbabillity = 0.0000001235;
		long population = 697373833L;
		
		int intLottoProbabillity = (int)lottoProbabillity;
		int intPopulation = (int)population;
		
		System.out.println("probabillity of lotto : " + lottoProbabillity);
		System.out.println("convertion to int probabillity of lotto : " + intLottoProbabillity);
		
		System.out.println("population of world : " + population);
		System.out.println("convertion to int population of world : " + intPopulation);
		
	}
}
