package chapter07;

public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();

		for (int i = 0; i <= 5; i++) {
			int problemLocation = car.run();

			switch (problemLocation) {
			case 1:
				System.out.println("앞 왼쪽 HankookTire로 교체");
//				frontLeftTire 는 부모 클래스인 Tire 클래스 타입인 객체임
//				frontLeftTire 객체에 자식 클래스인 HankookTire 객체를 대입
//				다형성에 의해서 부모 클래스 타입의 객체에 자식 클래스 타입의 객체가 대입이 가능함
//				HankookTire 클래스 타입의 객체가 부모 클래스인 Tire 클래스 타입으로 자동 타입 변환
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞 오른쪽 KumhoTire로 교체");
				car.frontRightTire = new KumhoTire("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤 왼쪽 HankookTire로 교체");
				car.backLeftTire = new HankookTire("앞오른쪽", 14);
				break;
			case 4:
				System.out.println("뒤 오른쪽 KumhoTire로 교체");
				car.backRightTire = new KumhoTire("뒤오른쪽", 17);
				break;
			}
			System.out.println("-------------------------");
		}

	}

}
