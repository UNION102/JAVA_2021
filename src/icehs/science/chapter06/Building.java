package icehs.science.chapter06;

public class Building {
	String name;
	String address; // 4�� ������ ����
	int totalFloor;
	
	void moveElevator() {
		System.out.println(this.totalFloor + "�� ���� ���������͸� �����մϴ�.");
	}
	void changeAddress(String newAddress) { //1��
		this.address = newAddress; //3�� = 2��
	}
	
	void printBuildingInfo() { 
		System.out.println("������: " + name);
		System.out.println("�ּ�: " + address);
		System.out.println("�� ��: " + totalFloor);
	}
}
