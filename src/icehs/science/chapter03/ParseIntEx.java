package icehs.science.chapter03;

public class ParseIntEx {
	public static void main(String[] args) {
		String hund = "100";
		int intHund = Integer.parseInt(hund);
		intHund += 1;
		System.out.println(intHund);	//100+1->101 (���� ���ϱ� ���ڴ� ����)
		
		String hund1 = hund + 1;
		System.out.println(hund1);	//100+1->1001(���ڿ� ���ϱ� ���ڴ� ���ڿ�)
	}
}
