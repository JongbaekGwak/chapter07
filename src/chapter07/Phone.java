package chapter07;

//	class 키워드앞에 abstract 키워드가 들어가면 추상 키워드가 됨
//	추상 클래스는 객채화 할 수 없음
//	해당 추상 클래스를 상속하는 자식 클래스를 생성하여
public abstract class Phone {
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}
