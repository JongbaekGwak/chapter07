package chapter07;

//	필드 : 이름, 휴대폰 번호
//	메서드 : outputPhoneNumber
public class PhoneBook {
	String name;
	String phone;

	public void outputPhoneNumber() {
		if (isPhoneNumber()) {
			System.out.println(name + "의 전화번호 : " + phone);
		} else {
			System.out.println(name + "의 전화번호가 없습니다. ");
		}

	}

//	접근 제한자 private 을 사용했으므로 외부 호출 불가 / 객체 내부에서만 사용됨
//	상속도 되지 않음
	private boolean isPhoneNumber() {
		if (phone.equals("") || phone.equals(null)) {
			return false;
		} else {
			return true;
		}
	}
}
