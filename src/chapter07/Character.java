package chapter07;

public class Character {
//	게임의 캐릭터가 할 수 있는 행동을 규격화 하여 지정함 
	public void move() {
		System.out.println("이동 합니다.");
	}

	public void stop() {
		System.out.println("멈춥니다.");
	}

	public void attack() {
		System.out.println("공격 합니다.");
	}

	public void skill() {
		System.out.println("스킬을 사용 합니다.");
	}

	public void specialSkill() {
		System.out.println("궁극기를 사용합니다.");
	}
}
