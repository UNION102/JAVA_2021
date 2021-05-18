package icehs.science.chapter03;

public class StringVariableEx {
	public static void main(String[] args) {
		String name = "Jerry";
		String mathScore = "96";
		int englishScore = 82;
		
		int parseMathScore = Integer.parseInt(mathScore);
		
		System.out.println("name : " + name);
		System.out.println("math score : " + mathScore);
		System.out.println("english score : " + englishScore);
		System.out.println("--------");
		System.out.println(mathScore + englishScore);
		System.out.println(parseMathScore + englishScore);
	}
}
