package icehs.science.chapter06;

public class Student {
	String name;
	String stdID;
	int korScore;
	int engScore;
	int mathScore;
	
	double calculateAverge() {
		int sum = korScore + engScore + mathScore;
		double average = (double)sum/3; // (��ȯ�� �ڷ���)����= ���� �ڷ����� ����
		return average; //double���̹Ƿ� return���� �����ϸ�, double�̾���Ѵ�.
	}
	
	void changeStudentID(String newStdID) {
		stdID = newStdID;
	}
	
	void printStudentInfo() {
		System.out.println("����: " + this.name); //this.�� �ڵ� �� �� ������� ���� �� ����� ���� ����� �����.
		System.out.println("�й�: " + this.stdID);
		System.out.println("����: " + this.korScore);
		System.out.println("����: " + this.engScore);
		System.out.println("����: " + this.mathScore);
		System.out.println("���: " + calculateAverge()); //method�� ��°��� �������� ��
	}
	
	
}
