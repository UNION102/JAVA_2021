package icehs.science.chapter05;

public class ConditionIfElseEx {
	public static void main(String[] args) {
		
		int age = 15;
		
		if(age >= 19) {
			System.out.println("�����Դϴ�.");
			System.out.println("�����ϼ���.");
		} else if (age >= 13) {
			System.out.println("û�ҳ��Դϴ�.");
			System.out.println("���ݸ� ��ٷ�������.");
		} else {
			System.out.println("����Դϴ�!");
			System.out.println("������ ������.");
		}
	}
}