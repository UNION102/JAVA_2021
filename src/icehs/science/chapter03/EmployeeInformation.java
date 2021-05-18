package icehs.science.chapter03;

public class EmployeeInformation {
	public static void main(String[] args) {
		String name = "Jerry";
		String enterYear = "2004";
		
		int intEnterYear = Integer.parseInt(enterYear);
		int thisYear = 2021;
		int empYear = thisYear - intEnterYear;
		
		System.out.println(intEnterYear);
		System.out.println(thisYear);
		System.out.println(empYear);
	}
}
