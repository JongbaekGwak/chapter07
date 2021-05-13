package chapter07;

//	필드 : 이름, 휴대폰 번호, 이메일 주소, sns
//	메서드 : outputAllInfo, outputEmail, outputSns, outputPhoneNumber
public class AddressBook extends PhoneBook {
//	String name;
//	String phone;
	String email;
	String sns;

	public AddressBook() {

	}

	public AddressBook(String name, String phone, String email, String sns) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.sns = sns;
	}
//	public void outputPhoneNumber() {
//		System.out.println(name + "의 휴대폰 번호 : " + phone);
//	}

	public void outputEmail() {
		System.out.println(name + "의 이메일 : " + email);
	}

	public void outputSns() {
		System.out.println(name + "의 sns : " + sns);
	}

	public void outputAllInfo() {
		outputPhoneNumber();
		outputEmail();
		outputSns();
	}
}
