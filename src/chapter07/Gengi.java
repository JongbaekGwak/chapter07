package chapter07;

public class Gengi extends Character {
	@Override
	public void move() {
		System.out.println("겐지가 이중 점프로 이동 합니다.");
	}

	@Override
	public void stop() {
		System.out.println("겐지가 벽타기를 멈춥니다.");
	}

	@Override
	public void attack() {
		System.out.println("겐지가 수리검으로 공격 합니다.");
	}

	@Override
	public void skill() {
		System.out.println("겐지가 질풍참 스킬을 사용 합니다.");
	}

	@Override
	public void specialSkill() {
		System.out.println("겐지가 궁극기를 용검을 사용합니다.");
	}
}