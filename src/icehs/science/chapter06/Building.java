package icehs.science.chapter06;

public class Building {
	String name;
	String address; // 4번 순으로 수행
	int totalFloor;
	
	void moveElevator() {
		System.out.println(this.totalFloor + "층 까지 엘리베이터를 운행합니다.");
	}
	void changeAddress(String newAddress) { //1번
		this.address = newAddress; //3번 = 2번
	}
	
	void printBuildingInfo() { 
		System.out.println("빌딩명: " + name);
		System.out.println("주소: " + address);
		System.out.println("층 수: " + totalFloor);
	}
}
