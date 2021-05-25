package icehs.science.chapter06;

public class Account {
	String accName;// ���������
	String accNumber;
	int balance; //�ܾ�
	
	void deposit(int money) {//����޼ҵ��
		if(money < 0) {
			System.out.println("[Error] �ݾ��� ������ �Է��� �� �����ϴ�.");
		}else {
			balance += money;
		}
		this.printBalance();
	}
	
	int withdraw(int money) {
		if(money<0) {
			System.out.println("[Error] �ݾ��� ������ �Է��� �� �����ϴ�.");
		}else if(money > balance) {
			System.out.println("[Error] �ܾ��� �����մϴ�.");
		}else {
			balance -= money;
			return money;
		}
		this.printBalance();
		return 0;
	}
	
	void printAccountInfo() {
		System.out.println("����: " + accNumber + "(������: " + accName + ")");
		System.out.println("�ܾ�: " + this.balance);
	}
	
	void printBalance() {
		System.out.println("�ܾ�: " + this.balance);
	}
}
