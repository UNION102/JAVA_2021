package icehs.science.chapter06;

public class Account {
	String accName;// 멤버변수들
	String accNumber;
	int balance; //잔액
	
	void deposit(int money) {//멤버메소드들
		if(money < 0) {
			System.out.println("[Error] 금액은 음수를 입력할 수 없습니다.");
		}else {
			balance += money;
		}
		this.printBalance();
	}
	
	int withdraw(int money) {
		if(money<0) {
			System.out.println("[Error] 금액은 음수를 입력할 수 없습니다.");
		}else if(money > balance) {
			System.out.println("[Error] 잔액이 부족합니다.");
		}else {
			balance -= money;
			return money;
		}
		this.printBalance();
		return 0;
	}
	
	void printAccountInfo() {
		System.out.println("계좌: " + accNumber + "(예금주: " + accName + ")");
		System.out.println("잔액: " + this.balance);
	}
	
	void printBalance() {
		System.out.println("잔액: " + this.balance);
	}
}
