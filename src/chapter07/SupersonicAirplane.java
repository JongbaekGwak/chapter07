package chapter07;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1; // 상수 / 객체 생성없이 클래스명으로 접근 가능
	public static final int SUPERSONIC = 2; // 상수

	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		} else {
//			super 키워드가 부모 클래스의 멤버를 호출하는 키워드
//			부모 클래스의 멤버인 fly() 메서드 호출
			super.fly();
		}
	}
}
