package icehs.science.chapter03;

public class TypeCasting {
	public static void main(String[] args) {
		long billWealth = 70000L;
		System.out.println("Original Value : " + billWealth);
		
		double doubleBillWealth = billWealth;
		System.out.println("double������ ����ȯ : "  + doubleBillWealth);
		
		int intBillWealth = (int)billWealth;
		System.out.println("int������ ��������ȯ : " + intBillWealth);
	}
}