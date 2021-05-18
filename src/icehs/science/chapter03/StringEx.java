package icehs.science.chapter03;

public class StringEx {
	public static void main(String[] args) {
		String name = "Park I Hyeon";
		String name2 = new String("Science high school");
		String name3 = new String("Park I Hyeon");
		String name4 = "Park I Hyeon";
		String name5 = new String("Park I Hyeon");
		System.out.println(name == name3);
		System.out.println(name == name4);
		System.out.println(name3 == name5);
		if(name.equals(name5)) {
			System.out.println("name == name5가 name5가 나옵니다.");//if의 차이점
		}
	}
}
