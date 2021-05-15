package chapter07;

public class McCree extends Character {
	@Override
	public void move() {
		System.out.println("맥크리가 걸어서 이동 합니다.");
	}

	@Override
	public void stop() {
		System.out.println("맥크리가 이동을 멈춥니다.");
	}

	@Override
	public void attack() {
		System.out.println("맥크리가 피스키퍼로 공격 합니다.");
	}

	@Override
	public void skill() {
		System.out.println("맥크리가 섬광탄 스킬을 사용 합니다.");
	}

	@Override
	public void specialSkill() {
		System.out.println("맥크리가 궁극기를 황야의 무법자를 사용합니다.");
	}
}
