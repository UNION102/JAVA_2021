package icehs.science.chapter06;

public class Student {
	String name;
	String stdID;
	int korScore;
	int engScore;
	int mathScore;
	
	double calculateAverge() {
		int sum = korScore + engScore + mathScore;
		double average = (double)sum/3; // (변환된 자료형)변수= 변한 자료형의 변수
		return average; //double형이므로 return값이 존재하며, double이어야한다.
	}
	
	void changeStudentID(String newStdID) {
		stdID = newStdID;
	}
	
	void printStudentInfo() {
		System.out.println("성명: " + this.name); //this.은 코딩 할 때 만들어진 변수 및 내장된 변수 목록을 띄워줌.
		System.out.println("학번: " + this.stdID);
		System.out.println("국어: " + this.korScore);
		System.out.println("영어: " + this.engScore);
		System.out.println("수학: " + this.mathScore);
		System.out.println("평균: " + calculateAverge()); //method의 출력값을 가져오는 법
	}
	
	
}
