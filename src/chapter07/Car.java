package chapter07;

public class Car {
//	Tire 클래스로 앞 뒤 좌 우 4개의 Tire 객체 생성
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);

	Tire tires[] = { new Tire("앞왼쪽", 6), new Tire("앞오른쪽", 2), new Tire("뒤왼쪽", 3), new Tire("뒤오른쪽", 4), };

	int run() {
		for (int i = 0; i < tires.length; i++) {
			if (tires[i].roll() == false) {
				stop();
				return i + 1;
			}
		}
		return 0;
	}

//	Tire tires2[] = new Tire[4];
//	tires2[0]=new Tire("앞왼쪽",6);
//	tires2[1]=new Tire("앞오른쪽",2);
//	tires2[2]=new Tire("뒤왼쪽",3);
//	tires2[3]=new Tire("뒤오른쪽",4);

//	int run() {
//		System.out.println("[자동차가 달립니다]");
//		if (frontLeftTire.roll() == false) {
//			stop();
//			return 1; // 타이어의 위치 / 1.앞 왼쪽, 2.앞 오른쪽, 3.뒤 왼쪽, 4.뒤 오른쪽
//		}
//		if (frontRightTire.roll() == false) {
//			stop();
//			return 2;
//		}
//		if (backLeftTire.roll() == false) {
//			stop();
//			return 3;
//		}
//		if (backRightTire.roll() == false) {
//			stop();
//			return 4;
//		}
//		return 0;
//	}

	void stop() {
		System.out.println("[자동타가 멈춥니다]");
	}
}
